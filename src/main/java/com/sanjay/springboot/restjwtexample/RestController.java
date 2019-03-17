package com.sanjay.springboot.restjwtexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private JWSTokenGenerator jwsTokenGenerator;

    @RequestMapping("/jwt")
    public String JWTGenerator(){
        return jwsTokenGenerator.getJWSToken();
    }
}
