package taskWithFlowers.typesOfFlowers;

public class Rose extends Flowers implements Cuttable {

    public static String type = "rose";

    public Rose(double price){
        undercut();
        super.price=price;
        super.type=type;

    };

    public String undercut( ){
        System.out.println("Rose. Please, undercut this type of flowers on 15 sm.");
        return null;
    };
}
