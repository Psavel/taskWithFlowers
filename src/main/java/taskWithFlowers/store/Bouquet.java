package taskWithFlowers.store;

import taskWithFlowers.logic.MethodForBouquet;
import taskWithFlowers.typesOfFlowers.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Bouquet {

    public static void main(String[] args) {

        System.out.println("For creation a new bouquet and getting it`s price, please:"+ //для создания нового букета и получения цены:
       "\ncreate instances of necessary flowers with their price" + //создайте экземляры необходимых цветов с ценой
                "\nthan add all created instances in the bouquet with method \"addd\"" +// затем добавьте все созданные экземпляры в букет
                "\nthan call method \"getQuantityAndPrice\" with input parameters: \"bouquet\" and \" flowersQuantity \" \n\n"); //вызовите метод
                //приложение выведет количество цветов в букете, стоимость и рекомендации по обрезке


        HashMap<String, Integer> flowersQuantity = new HashMap<String, Integer>();

        ArrayList<Flowers> bouquet = new ArrayList<Flowers>();

        Rose rose1 = new Rose(200);
        Rose rose2 = new Rose(300);
        Rose rose3 = new Rose(400);
        Rose rose4 = new Rose(500);
        Chrysanthemum chrysanthemum = new Chrysanthemum(1000);
        Lily lily = new Lily(1000);
        Violet violet1 = new Violet(100);
        Violet violet2 = new Violet(100);
        Chamomile chamomile = new Chamomile(350);

        MethodForBouquet.addd(bouquet,rose1,rose2,rose3, rose4,chamomile,chrysanthemum,lily,violet1,violet2);

        MethodForBouquet.getQuantityAndPrice(bouquet,flowersQuantity);



    }





}
