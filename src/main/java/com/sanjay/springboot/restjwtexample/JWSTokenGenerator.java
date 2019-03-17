package com.sanjay.springboot.restjwtexample;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JWSTokenGenerator {

    //https://github.com/jwtk/jjwt#overview

    public String getJWSToken(){
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        String jws = Jwts.builder().setSubject("Joe").signWith(key).compact();
        return jws;
    }

}
