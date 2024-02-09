import java.util.ArrayList;
import java.util.List;

class King {
    public static int hpKing = 500;
    public static int gold = 100;

    public static List<Army> armys = new ArrayList<>();


    public King(int hpKing, int gold) {
        this.hpKing = hpKing;
        this.gold = gold;
        this.armys = new ArrayList<>();
    }


}
