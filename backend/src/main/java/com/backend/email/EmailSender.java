package com.backend.email;

public interface EmailSender {
    void send(String to, String email);
}
