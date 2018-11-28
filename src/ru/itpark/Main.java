package ru.itpark;


import ru.itpark.comporator.HousesPriceAscComporator;
import ru.itpark.comporator.HousesPriceDescComporator;
import ru.itpark.domain.House;
import ru.itpark.service.HouseService;
import ru.itpark.repository.HouseRepository;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService(new HouseRepository());
        service.add(new House (1,2600,"Sovietskiy",134,3));
        service.add(new House(2,22600,"Poselok",32,1));
        service.add(new House (3,121600,"Vahitovskiy",28,1));
        service.add(new House (4,2123600,"Aviastroy",343,5));
        service.add(new House (5,45643,"Privolgskiy",56,2));


        System.out.println("По уменьшению цены" +service.getSorted(new HousesPriceDescComporator()));
        System.out.println("По увеличению цены" +service.getSorted(new HousesPriceAscComporator()));
        System.out.println("Диапазон 1"+service.getFromPriceDesc(12660,23000));
        System.out.println("Диапазон 2" +service.getFromPriceAsc(1500000,30000000));

        ArrayList<String> districts = new ArrayList<>();
        districts.add("Aviastroy");
        districts.add("Privolgskiy");


        System.out.println("Выбор района"+ service.getHouseFromDistrict(districts));


    }
}
