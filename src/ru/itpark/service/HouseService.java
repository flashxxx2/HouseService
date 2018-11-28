package ru.itpark.service;


import ru.itpark.comporator.HousesPriceAscComporator;
import ru.itpark.comporator.HousesPriceDescComporator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

import java.util.Comparator;
import java.util.List;

public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public void add(House house) {
        repository.add(house);
    }

    public List<House> getAll() {
        return repository.getAll();
    }

    public List<House> getSorted(Comparator<House> comparator) {
        List<House> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

    public List<House> getFromPriceAsc(int min, int max) {
        List<House> result = repository.getHouseFromPrice(min, max);
        result.sort(new HousesPriceAscComporator());
        return result;
    }

    public List<House> getFromPriceDesc(int min, int max) {
        List<House> result = repository.getHouseFromPrice(min, max);
        result.sort(new HousesPriceDescComporator());
        return result;
    }

    public List<House> getHouseFromDistrict(List<String> districts) {
        return repository.getHouseFromDistrict(districts);
    }
}

