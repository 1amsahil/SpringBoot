package com.Eternity.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Value("28")
    private int age;

    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public void code()
    {
        System.out.println("\nCoding");
        com.compile();
    }
}
