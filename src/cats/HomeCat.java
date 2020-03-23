package cats;

public class HomeCat extends Cat implements Playable {
    private Master master;

    public HomeCat(){
        master = new Master();
    }

    public void layOnSofa(){
        System.out.println("I'm tired. Time to lay on sofa...");
        master.increaseMood();
    }

    public void spoilShoes(){
        System.out.println("Time to do some pee. Where are my master's shoes?...");
        master.decreaseMoney();
    }
    public void play(){
        System.out.println("Well, it's time to play...");
        master.increaseMood();
    }

    }
