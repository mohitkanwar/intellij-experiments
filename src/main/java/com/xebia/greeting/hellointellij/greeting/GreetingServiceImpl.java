package com.xebia.greeting.hellointellij.greeting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GreetingServiceImpl implements GreetingService {
    private static Map<String,String> locales;

    public GreetingServiceImpl() {
        locales = new HashMap<>();
        locales.put("en-US","Hello");
        locales.put("hi-IN","नमस्कार");
        locales.put("pa-IN","ਸਤ ਸ੍ਰੀ ਅਕਾਲ");
    }

    @Override
    public String getGreeting(String locale) {
        if (locale == null || locale.isEmpty()) {
            locale = "en-US";
        }
        return locales.get(locale);
    }
}
