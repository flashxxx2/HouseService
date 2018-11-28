package ru.itpark.comporator;


import ru.itpark.domain.House;

import java.util.Comparator;

public class HousesPriceAscComporator implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getPrice()- o2.getPrice();
    }
}
