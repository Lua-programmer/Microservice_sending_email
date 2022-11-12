package com.ms.email.services.impl;

import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;
import com.ms.email.services.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailImpl implements EmailService {

    private final EmailRepository repository;


    @Override
    public void sendEmail(EmailModel emailModel) {

    }
}
