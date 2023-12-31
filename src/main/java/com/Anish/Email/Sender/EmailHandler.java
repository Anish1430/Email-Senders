package com.Anish.Email.Sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailHandler {
    @Autowired
    private JavaMailSender javaEmailSender;


    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        javaEmailSender.send(message);
    }
}
