package com.xebia.greeting.hellointellij.fizzbuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzzModel {
    private List<String> entries = new ArrayList<>();

    public List<String> getEntries() {
        return entries;
    }

    public void addEntry(String entry) {
        this.entries.add(entry);
    }
}
