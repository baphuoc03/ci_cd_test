package org.example.ci_cd_test.controller;

import lombok.RequiredArgsConstructor;
import org.example.ci_cd_test.service.MainService;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
@RequestMapping("/main")
public class MainController {

    private final MainService mainService;
    private final Environment env;

    @GetMapping("greeting")
    public ResponseEntity getGreeting(@RequestParam String type) {
        return ResponseEntity.ok(mainService.getGreeting(type));
    }

    @GetMapping("environment")
    public ResponseEntity getEnvironment() {
        return ResponseEntity.ok(env.getProperty("value"));
    }

}
