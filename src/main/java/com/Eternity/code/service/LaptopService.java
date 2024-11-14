package com.Eternity.code.service;

import com.Eternity.code.model.Laptop;
import com.Eternity.code.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo repo;

    public void addLaptop(Laptop lap)
    {
        repo.save(lap);
    }
    public boolean forGaming(Laptop lap)
    {
        return true;
    }
}
