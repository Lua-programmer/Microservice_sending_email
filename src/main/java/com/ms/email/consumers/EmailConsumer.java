package com.ms.email.consumers;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import com.ms.email.services.impl.EmailImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailConsumer {

    private final EmailImpl service;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(EmailDto email){
        EmailModel model = new EmailModel();
        BeanUtils.copyProperties(email, model);
        service.sendEmail(model);
        System.out.println("Email status: " + model.getSendDateEmail().toString());
    }
}
