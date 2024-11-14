package com.Eternity.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Autowired
    Laptop lap ;

    public void code()
    {
        System.out.println("\nCoding");
        lap.compile();
    }
}
