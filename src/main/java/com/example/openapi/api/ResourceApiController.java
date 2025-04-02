package com.example.openapi.api;

import com.example.openapi.model.ContractInfoResponse;
import com.example.demo.service.ResourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-31T17:27:52.100692693+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
@Controller
@RequestMapping("${openapi.contractInfo.base-path:/api}")
public class ResourceApiController implements ResourceApi {

    private final NativeWebRequest request;
    private final ResourceService resourceService;

    @Autowired
    public ResourceApiController(NativeWebRequest request, ResourceService resourceService) {
        this.request = request;
        this.resourceService = resourceService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ContractInfoResponse> resourceContractinfoGet() {
        // 修正: 正しいサービスインスタンスを使用
        ContractInfoResponse response = resourceService.getContractInfo();
        if (response == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(response);
    }
}