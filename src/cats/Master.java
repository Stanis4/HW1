package cats;

public class Master {

   int money;
   int mood;

   Master(){
       money =1000;
       mood = 10;
   }

   public Master(int money, int mood){
       this.money = money;
       this.mood = mood;
   }

  /* public void getMood(){
       if (mood<5){
           System.out.println("@Master is angry");
       }else if (mood>7){
           System.out.println("@Master is happy about that");
       } else
           System.out.println("@Master's mood is OK");
   }*/

   public void increaseMood(){
       mood +=2;
       if (mood >=20){
           mood=20;
       }
       System.out.println("@Master's mood is " + mood + " out of 20");
       //getMood();
   }

   public void decreaseMoney(){
       money -=10;
       if (money <=0){
           System.out.println("@Master is out of money");
       } else
           System.out.println("@Shoes have been spoiled. Remaining Master's money: "+ money + "$.");
   }

}
