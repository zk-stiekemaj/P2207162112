package net.stiekema.eu.demo.cors.controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class ResourceController {

    @GetMapping("/user")
    public String user(Principal principal) {
        return "response without CORS: " + principal.getName();
    }

    @GetMapping("/userWithCors")
    @CrossOrigin(origins = "http://localhost:4200")
    public String userWithCors(Principal principal) {
        return "response with CORS: " + principal.getName();
    }
}