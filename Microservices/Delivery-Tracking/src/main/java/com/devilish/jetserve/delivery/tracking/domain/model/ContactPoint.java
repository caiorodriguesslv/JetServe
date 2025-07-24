package com.devilish.jetserve.delivery.tracking.domain.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ContactPoint {

    private String zipCode;
    private String street;
    private String number;
    private String complement;
    private String phone;
}
