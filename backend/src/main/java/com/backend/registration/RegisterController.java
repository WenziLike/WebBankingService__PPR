package com.backend.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/register")
@AllArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @PostMapping
    public String register(@RequestBody RegisterRequest request) {
        return registerService.register(request);
    }
}
