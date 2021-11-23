package com.dceta.alertsmap;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class InitialDataLoader {

    @Transactional
    private void doSomething() {
        System.out.println("Hi");
    }
}
