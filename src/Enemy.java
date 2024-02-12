import java.util.Random;

class Enemy {
    static Random random = new Random();
    public static int hpEnemy = random.nextInt(50) + 25;
    private static int damageEnemy = random.nextInt(35) + 15;
    private static double goldReward = random.nextInt(110) + 50;

    public static int enemySize = random.nextInt(10) + 1;


    public Enemy(int hpEnemy, int damageEnemy, double goldReward, int enemySize) {
        this.hpEnemy = hpEnemy;
        this.damageEnemy = damageEnemy;
        this.goldReward = goldReward;
        this.enemySize = enemySize;
    }
}
