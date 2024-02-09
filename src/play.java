import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class play {
    int choice;
    Scanner scanner;
    public void mainMenu(){
        System.out.println("Основное меню");
        System.out.println("1 - Статистика короля");
        System.out.println("2 - нанять войска");
        System.out.println("3 - вывести количество войск");
        System.out.println("4 - отправить войска на битву");
        scanner.nextInt();

        do{
            switch(choice){
                case(1):
                    kingStats(King.hpKing, King.gold);
            }
        }while (choice != 0);
    }

    public void kingStats(int hp, int gold){
        System.out.println("Статистика короля");
        System.out.println("Золото: " + gold);
        System.out.println("Здоровье: " + hp);
    }
}

class King {
    public static int hpKing;
    public static int gold;

    private List<Army> armys;


    public King(int hp, int gold){
        this.hpKing = hpKing;
        this.gold = gold;
        this.armys = new ArrayList<>();
    }



    public void recruitKnights(int hpSoldier, int attackTypeSoldier, int cost){
     if (gold > cost){
         gold = gold - cost;
         Knight knight = new Knight(hpSoldier, attackTypeSoldier, cost);
         armys.add(knight);
     }
     if (gold < cost)  {
         System.out.println("Нехвататет золота для найма");
        }
    }

    public void recruitfSoldiers(int hpSoldier, int attackTypeSoldier, int cost){
        if (gold > cost){
            gold = gold - cost;
            FootSoldier footsoldier = new FootSoldier(hpSoldier, attackTypeSoldier, cost);
            armys.add(footsoldier);
        }
        if (gold < cost)  {
            System.out.println("Нехвататет золота для найма");
        }
    }
}

class Army{
    protected int hpSoldier;
    protected int attackTypeSoldier;
    protected int cost;

    public Army(int hpSoldier, int attackTypeSoldier, int cost){
        this.hpSoldier = hpSoldier;
        this.attackTypeSoldier = attackTypeSoldier;
        this.cost = cost;
    }
}
class Knight extends Army{
 public Knight(int hpSoldier, int attackTypeSoldier, int cost){
     super(hpSoldier,attackTypeSoldier,cost);

 }
}

class FootSoldier extends Army{
   public FootSoldier(int hpSoldiers, int attackTypeSoldier, int cost){
       super(hpSoldiers, attackTypeSoldier,cost);
   }
}

class Enemy{
    private int hpEnemy;
    private int damageEnemy;
    private double goldReward;

    public Enemy(int hpEnemy, int damageEnemy, double goldReward){
        this.hpEnemy = hpEnemy;
        this.damageEnemy = damageEnemy;
        this.goldReward = goldReward;
    }
}