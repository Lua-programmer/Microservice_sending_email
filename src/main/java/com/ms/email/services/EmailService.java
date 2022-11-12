package com.ms.email.services;

import com.ms.email.models.EmailModel;

public interface EmailService {

    EmailModel sendEmail(EmailModel emailModel);
}
