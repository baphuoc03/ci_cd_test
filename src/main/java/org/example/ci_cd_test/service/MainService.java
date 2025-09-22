package org.example.ci_cd_test.service;

import org.example.ci_cd_test.enums.GreetingEnum;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MainService {

    public String getGreeting(String type) {
        GreetingEnum greetingEnum = GreetingEnum.getGreetingEnum(type);

        if(Objects.isNull(greetingEnum)) {
            return "Invalid type";
        }

        return greetingEnum.getMessage();
    }

}
