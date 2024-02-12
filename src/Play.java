import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class play {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        while (true) {
            System.out.println("Основное меню");
            System.out.println("1 - Статистика короля");
            System.out.println("2 - нанять рыцарей");
            System.out.println("3 - нанять пехоту");
            System.out.println("4 - вывести количество войск");
            System.out.println("5 - отправить войска на битву");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case (1):
                    kingStats(King.hpKing, King.gold);
                    break;

                case (2):
                    recruitKnights(Knight.knightCost, Knight.hpSoldier, Knight.fsCost, Knight.attackTypeSoldier);
                    break;

                case(3):
                    recruitfSoldiers(Knight.knightCost, Knight.hpSoldier, Knight.fsCost, Knight.attackTypeSoldier);
                    break;
            }
        }
    }

    public static void kingStats(int hp, int gold){
        System.out.println("Статистика короля");
        System.out.println("Золото: " + gold);
        System.out.println("Здоровье: " + hp);

    }

    public static void recruitKnights(int hpSoldier, int attackTypeSoldier, int knightCost, int fsCost){
        if (King.gold > knightCost){
            King.gold = King.gold - knightCost;
            Knight knight = new Knight(hpSoldier,attackTypeSoldier,knightCost,fsCost);
            King.armys.add(knight);
            System.out.println("+1 knight");
        }
        if (King.gold < knightCost)  {
            System.out.println("Нехвататет золота для найма");
        }
    }

    public static void recruitfSoldiers(int hpSoldier, int attackTypeSoldier, int knightCost, int fsCost){
        if (King.gold > fsCost){
            King.gold = King.gold - fsCost;
            FootSoldier footsoldier = new FootSoldier(hpSoldier,attackTypeSoldier,knightCost,fsCost);
            King.armys.add(footsoldier);
            System.out.println("+1 foot solider");
        }
        if (King.gold < fsCost)  {
            System.out.println("Нехвататет золота для найма");
        }
    }

}


