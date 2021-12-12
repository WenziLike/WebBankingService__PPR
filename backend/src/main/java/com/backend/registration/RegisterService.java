package com.backend.registration;

import com.backend.user.UserEntity;
import com.backend.user.UserRole;
import com.backend.user.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegisterService {

    private final UserServiceImpl userService;
    private final EmailValidator emailValidator;

    public String register(RegisterRequest request) {
        boolean isValidEmail = emailValidator
                .test(request.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("Email not valid");
        }

        String user = userService.signUp(
                new UserEntity(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getPhoneNumber(),
                        request.getEmail(),
                        request.getIdPerson(),
                        request.getNationality(),
                        request.getAddress(),
                        request.getSity(),
                        request.getPassword(),
                        request.getConfirmPassword(),
                        UserRole.USER
                )
        );
        return user;
    }
}
