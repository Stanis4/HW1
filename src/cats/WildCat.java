package cats;

public class WildCat extends Cat implements  Playable {


    public void hatePeople() {
        System.out.println( "I hate people!");
    }

    public void saveWorld() {
        System.out.println( "I am the one who will save the world!");
    }
    
    public void play() {
        System.out.println( "Time to play");
    }
}
