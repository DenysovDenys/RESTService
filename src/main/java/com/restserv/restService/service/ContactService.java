package com.restserv.restService.service;

import com.restserv.restService.dto.ContactResponse;

public interface ContactService {
    ContactResponse getContacts(String nameFilter);
}
