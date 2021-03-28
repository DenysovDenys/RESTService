package com.restserv.restService.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ContactResponse {
    private List<ContactDto> contacts;

    public ContactResponse(List<ContactDto> contacts) {
        this.contacts = contacts;
    }
}
