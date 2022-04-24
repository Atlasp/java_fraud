package com.spmicro.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {}
