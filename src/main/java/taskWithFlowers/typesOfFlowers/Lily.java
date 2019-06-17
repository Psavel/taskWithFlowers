package taskWithFlowers.typesOfFlowers;

public class Lily extends Flowers implements Cuttable {

    public static String type = "lily";

    public Lily(double price) {
        undercut();
        super.price = price;
        super.type = type;
    }

    public String undercut( ){
        System.out.println("Lily. Please, undercut this type of flowers on 5 sm.");
        return null;
    };

}
