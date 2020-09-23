package com.infotech.didemo.repos;

public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello- Primary Greeting Service!!!";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola- Servicio de saludo primario!!!";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo- Primärer Begrüßungsservice!!!";
    }
}
