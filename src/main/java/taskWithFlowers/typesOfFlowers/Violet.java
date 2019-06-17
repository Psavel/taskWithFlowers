package taskWithFlowers.typesOfFlowers;

public class Violet extends Flowers implements Cuttable {

    public static String type = "violet";

    public Violet(double price){
        undercut();
        super.price=price;
        super.type=type;

    };

    public String undercut( ){
        System.out.println("Violet. The undercut of this type of flowers isn`t necessary.");
        return null;
    };

}
