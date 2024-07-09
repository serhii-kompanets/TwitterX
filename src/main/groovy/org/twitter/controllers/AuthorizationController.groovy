package org.twitter.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.twitter.dtos.UserDto

@RestController
class AuthorizationController {
    @PostMapping("/signUp")
    String register(UserDto userDto) {
        "signUp: returned the JWT token"
    }

    @PostMapping("/login")
    String signin(String username, String password) {
        "signIn: returned the JWT token"
    }

    @PostMapping("/logout")
    void logout(UserDto userDto) {

    }
}
