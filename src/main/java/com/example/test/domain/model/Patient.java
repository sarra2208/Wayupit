package com.example.test.domain.model;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class Patient {
    private String id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private String gender;
    private String mobile;
    private String email;

    public void setFirstname(String firstname) {
    }

    public void setLastname(String lastname) {
    }

    public void setBirthdate(LocalDate birthdate) {
    }

    public void setGender(String gender) {
    }

    public void setMobile(String mobile) {
    }

    public void setEmail(String email) {
    }
}
