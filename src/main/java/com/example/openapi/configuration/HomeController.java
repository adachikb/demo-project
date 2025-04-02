package com.example.openapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

/**
 * Home redirection to OpenAPI api documentation
 */
@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String index() {
        log.debug("HomeController index()");
        return "redirect:swagger-ui.html";
    }

}