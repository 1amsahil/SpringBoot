package com.Eternity.code;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer {
    public void compile()
    {
        System.out.println("Compiling via Laptop");
    }
}
