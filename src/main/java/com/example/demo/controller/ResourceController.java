package com.example.demo.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ResourceService;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/resource")
@RequiredArgsConstructor
@Slf4j
public class ResourceController {

    private final ResourceService resourceService;

    // GETメソッド（リソース取得）
    // @GetMapping("/{resourceName}")
    public ResponseEntity<Map<String, Object>> getResource(@PathVariable String resourceName,
        @AuthenticationPrincipal OidcUser principal) {

        log.debug("ResourceController getResource");
        if (principal != null) {
            log.debug("Authenticated user: {}", principal.getFullName());
        } else {
            log.debug("No authenticated user found");
        }
        Optional<Map<String, Object>> resourceData = resourceService.getResourceData(resourceName);

        return resourceData
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(Map.of("error", "Resource not found")));
    }

    // POSTメソッド（リソース作成）
    @PostMapping("/{resourceName}")
    public ResponseEntity<Map<String, Object>> createResource(
            @PathVariable String resourceName,
            @RequestBody Map<String, Object> requestData,
            @AuthenticationPrincipal OidcUser principal) {

        log.debug("ResourceController createResource");
        if (principal != null) {
            log.debug("Authenticated user: {}", principal.getFullName());
        } else {
            log.debug("No authenticated user found");
        }
        boolean success = resourceService.createResource(resourceName, requestData);

        if (success) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(Map.of("message", "Resource created successfully"));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "Resource creation failed"));
        }
    }
}
