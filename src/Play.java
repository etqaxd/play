import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Play {

    public static Scanner scanner = new Scanner(System.in);
    public void main(String[] args){
        mainMenu();
    }

    public void mainMenu(){
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
                case(4):
                    showArmy();
                    break;
                case(5):
                    battle();
                    break;
            }
        }
    }



    public static void showArmy(){
        System.out.println("Количество рыцарей: " + Knight.knightSize + "Количестов пехотинцев: " + FootSoldier.footsSize);
    }

    public static void kingStats(int hp, int gold){
        System.out.println("Статистика короля");
        System.out.println("Золото: " + gold);
        System.out.println("Здоровье: " + hp);

    }

    public static void recruitKnights(int hpSoldier, int attackTypeSoldier, int knightCost, int fsCost){
        if (King.gold > knightCost){
            King.gold = King.gold - knightCost;
            Knight.knightSize++;
            System.out.println("+1 knight");
        }
        if (King.gold < knightCost)  {
            System.out.println("Нехвататет золота для найма");
        }
    }

    public static void recruitfSoldiers(int hpSoldier, int attackTypeSoldier, int knightCost, int fsCost){
        if (King.gold > fsCost){
            King.gold = King.gold - fsCost;
            FootSoldier.footsSize++;
            System.out.println("+1 foot solider");
        }
        if (King.gold < fsCost)  {
            System.out.println("Нехвататет золота для найма");
        }
    }

    public void battle(){
        System.out.println("Врагов: " + Enemy.enemySize);
        int allHpAlly = Knight.hpSoldier + Knight.knightSize + FootSoldier.hpSoldier * FootSoldier.footsSize;
        int allDmgAlly = FootSoldier.attackTypeSoldier * FootSoldier.footsSize + Knight.attackTypeSoldier * Knight.knightSize;
        int allHpEnemy = Enemy.hpEnemy * Enemy.enemySize;
        int allDmgEnemy;
        }
    }



