package com.knockknock.jpa.domain.user;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;

    private String zipcode;

    private String city;
}
