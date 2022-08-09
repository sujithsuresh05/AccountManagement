package com.photoapp.accounts.manage.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountControllers {

    @GetMapping("/status/check")
    public String status() {
        return "Working";
    }

}
