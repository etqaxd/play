class Knight extends Army {
    public static int knightSize;
    public Knight(int hpSoldier, int attackTypeSoldier, int knightCost, int fsCost) {
        super(hpSoldier, attackTypeSoldier, knightCost, fsCost);
        this.knightCost = 30;
        this.hpSoldier = 45;
        this.attackTypeSoldier = 25;
        this.knightSize = knightSize;
    }
}
