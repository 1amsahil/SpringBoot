package com.Eternity.code.repository;


import com.Eternity.code.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {

    public void save(Laptop lap)
    {
        System.out.println("\nSaving to Database");
    }
}
