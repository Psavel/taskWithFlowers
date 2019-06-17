package taskWithFlowers.typesOfFlowers;

public class Chamomile extends Flowers implements Cuttable {

    public static String type = "chamomile";

    public Chamomile(double price){
        undercut();
        super.price=price;
        super.type=type;

    };

    public String undercut( ){
        System.out.println("Chamomile. The undercut of this type of flowers isn`t necessary.");
        return null;
    };

}
