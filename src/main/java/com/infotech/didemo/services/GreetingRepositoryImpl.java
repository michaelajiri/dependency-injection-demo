package com.infotech.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service!!!";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola - Servicio de saludo primario!!!";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo - Primärer Begrüßungsservice!!!";
    }
}
