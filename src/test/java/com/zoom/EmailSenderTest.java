package com.zoom;

import com.zoom.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailSenderTest {

    @Autowired
    private EmailService emailService;

    @Test
    void emailSendTest(){
        System.out.println("Sending email");
//        emailService.sendEmail("imimam8409@gmail.com","mail from imam","Hii Imam007");
    }
}
