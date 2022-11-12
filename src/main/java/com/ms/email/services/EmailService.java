package com.ms.email.services;

import com.ms.email.models.EmailModel;

public interface EmailService {

    void sendEmail(EmailModel emailModel);
}
