package com.msp.construction.service;

import com.msp.construction.model.ContactMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.msp.construction.repository.ContactMessageRepository;

@Service
public class ContactService {

    private final ContactMessageRepository contactMessageRepository;

    @Autowired
    public ContactService(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    public void saveContactMessage(ContactMessage contactMessage) {
        contactMessageRepository.save(contactMessage);
    }
}