package com.backend.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegisterRequest {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String email;
    private final String idPerson;
    private final String nationality;
    private final String address;
    private final String sity;
    private final String password;
    private final String confirmPassword;
}
