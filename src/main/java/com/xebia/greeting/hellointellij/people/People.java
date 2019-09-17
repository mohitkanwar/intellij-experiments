package com.xebia.greeting.hellointellij.people;

import java.util.Objects;

public class People {
    private int id;
    private String name;

    public People() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return getId() == people.getId() &&
                Objects.equals(getName(), people.getName());
    }
}
