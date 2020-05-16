package com.hca.mho.bragg.bragg01;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VendingMachine {

    private Soda pepsi = new Soda("Pepsi", 10);
    private Soda coke = new Soda("Coke", 20);
    private Soda drPepper = new Soda("Dr Pepper", 15);

    private List<Soda> sodas = Arrays.asList(pepsi, coke, drPepper);

    public Soda buySoda(String name) {
        if (name != null) {
            Soda soda = sodas.
                    stream()
                    .filter((s) -> s.getName().toLowerCase().equals(name))
                    .findFirst()
                    .orElse(null);
            return soda;
        }
        return null;
    }
}
