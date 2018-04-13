package com.polytech;

import org.apache.tomcat.util.buf.B2CConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AppRunner {

    public static void main(String[] args) {

        //String pwd = new BCryptPasswordEncoder().encode("zeros");
        SpringApplication.run(AppRunner.class, args);
    }
}
