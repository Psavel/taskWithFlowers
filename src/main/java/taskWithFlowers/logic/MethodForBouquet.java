package taskWithFlowers.logic;

import taskWithFlowers.typesOfFlowers.Flowers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodForBouquet {

    public static void addd(ArrayList<Flowers> totalList, Flowers...flower){//метод добавления цветов в коллекцию
    for( Flowers i:flower )
        totalList.add(i);

    }

    public static void getQuantityAndPrice(List<Flowers> totalList, HashMap<String,Integer> mapForPriceAndQuantity ){
        System.out.println("This bouquet contains: "); //метод вывода всей интересующей информации

        for (int i = 0; i < totalList.size(); i++) {
            Flowers flower = totalList.get(i);

            if (!mapForPriceAndQuantity.containsKey(flower.type)) {
                mapForPriceAndQuantity.put(flower.type, 1);
            } else {
                mapForPriceAndQuantity.put(flower.type, mapForPriceAndQuantity.get(flower.type)+1);
            }

        }
        for (Map.Entry<String, Integer> entry : mapForPriceAndQuantity.entrySet()) {
            System.out.println(  entry.getKey()+" - " +  + entry.getValue()+" flower(s)");
        }

        double sum = 0;
        for (Flowers i : totalList) {
            sum += i.price;}
        System.out.println("The bouquet`s total price is: "+sum);

    }

}
