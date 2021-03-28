package com.restserv.restService.service.impl;

import com.restserv.restService.dao.ContactRepository;
import com.restserv.restService.dto.ContactDto;
import com.restserv.restService.dto.ContactResponse;
import com.restserv.restService.model.Contact;
import com.restserv.restService.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public ContactResponse getContacts(String nameFilter) {
        Pattern pattern = Pattern.compile(nameFilter);
        List<Contact> contacts = contactRepository.findAll()
                .stream()
                .filter(e -> !pattern.matcher(e.getName()).find())
                .collect(Collectors.toList());
        return mapContacts(contacts);
    }

    private ContactResponse mapContacts(List<Contact> contacts) {
        List<ContactDto> contactDtos = new ArrayList<>();
        for (Contact contact : contacts) {
            ContactDto contactDto = new ContactDto();
            contactDto.setId(contact.getId());
            contactDto.setName(contact.getName());
            contactDtos.add(contactDto);
        }
        return new ContactResponse(contactDtos);
    }
}