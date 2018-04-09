package com.bobbbaich.fb.bot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    @GetMapping("/isAuth")
    public String isAuth() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return String.valueOf(authentication != null);
    }
}