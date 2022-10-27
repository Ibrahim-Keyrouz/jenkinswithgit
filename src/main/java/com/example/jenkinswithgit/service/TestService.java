package com.example.jenkinswithgit.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String justSaySthg(String msg){
        return "A service got the msg : "+msg;
    }



}
