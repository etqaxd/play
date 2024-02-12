class FootSoldier extends Army {
    public static int footsSize;
    public FootSoldier(int hpSoldiers, int attackTypeSoldier, int knightCost, int fsCost) {
        super(hpSoldiers, attackTypeSoldier, knightCost, fsCost);
        this.fsCost = 15;
        this.hpSoldier = 25;
        this.attackTypeSoldier = 35;
        this.footsSize = footsSize;
    }
}
