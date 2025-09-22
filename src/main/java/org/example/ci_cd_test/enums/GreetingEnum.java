package org.example.ci_cd_test.enums;

import lombok.Getter;

@Getter
public enum GreetingEnum {
    CI("ci", "Hi 👐, I'm Continuous Integration"),
    CD("cd", "Hi 👐, I'm Continuous Deployment");

    private String type;
    private String message;

    GreetingEnum(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public static GreetingEnum getGreetingEnum(String type) {
        for (GreetingEnum greetingEnum : GreetingEnum.values()) {
            if (greetingEnum.getType().equals(type)) {
                return greetingEnum;
            }
        }
        return null;
    }
}
