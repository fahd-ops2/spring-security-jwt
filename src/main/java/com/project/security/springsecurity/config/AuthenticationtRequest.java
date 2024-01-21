package com.project.security.springsecurity.config;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class AuthenticationtRequest {

    private String email;
    private String password;
}
