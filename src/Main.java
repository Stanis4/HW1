import cats.HomeCat;
import cats.Master;
import cats.WildCat;

public class Main {

    public static void main(String[] args) {
        HomeCat cat1 = new HomeCat();
        cat1.name = "Tima";
        cat1.breed = "American Bobtail";
        System.out.println(cat1.name+" "+ cat1.breed+" thinks: ");
        cat1.layOnSofa();
        cat1.spoilShoes();
        System.out.println();


        HomeCat cat2 = new HomeCat();
        cat2.name = "Bob";
        cat2.breed = "Marlie";
        System.out.println(cat2.name+" "+ cat2.breed+" thinks: ");
        cat2.layOnSofa();
        cat2.play();
        System.out.println();


        WildCat wildCat1 = new WildCat();
        wildCat1.name = "Rodger";
        wildCat1.breed = "Tiger";
        System.out.println(wildCat1.name+" "+ wildCat1.breed+" thinks: ");
        wildCat1.hatePeople();
        System.out.println();


        WildCat wildCat2 = new WildCat();
        wildCat2.name = "Simba";
        wildCat2.breed = "Lion";
        System.out.println(wildCat2.name+" "+ wildCat2.breed+" says: ");
        wildCat2.saveWorld();
        System.out.println();
    }
}
