package taskWithFlowers.typesOfFlowers;

public class Chrysanthemum extends Flowers implements Cuttable {

    public static String type = "chrysanthemum";

    public Chrysanthemum(double price) {
        undercut();
        super.price = price;
        super.type = type;
    }

        public String undercut( ){
            System.out.println("Chrysanthemum. Please, undercut this type of flowers on 10 sm.");
            return null;
        };



}
