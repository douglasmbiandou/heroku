package com.objis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        return "Objis, specialiste formation Spring!" ;
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
