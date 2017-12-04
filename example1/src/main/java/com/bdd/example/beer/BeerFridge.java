package com.bdd.example.beer;

import java.util.HashSet;
import java.util.Set;

public class BeerFridge {

    private Integer fridge = 0;
    
    public void pushBeer(final Integer beer) {
        fridge += beer;
    }

    public int size() {
        return fridge;
    }

    public Integer drink (final Integer beer) {
        return fridge -= beer;
    }
}
