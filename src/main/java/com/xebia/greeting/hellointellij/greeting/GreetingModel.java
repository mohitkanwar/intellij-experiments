package com.xebia.greeting.hellointellij.greeting;

import java.util.Objects;

public class GreetingModel {
    private String greeting;
    private String name;

    public GreetingModel(String greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GreetingModel)) return false;
        GreetingModel that = (GreetingModel) o;
        return Objects.equals(getGreeting(), that.getGreeting()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGreeting(), getName());
    }
}
