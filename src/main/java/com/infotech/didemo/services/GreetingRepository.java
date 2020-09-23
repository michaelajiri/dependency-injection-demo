package com.infotech.didemo.repos;

import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}