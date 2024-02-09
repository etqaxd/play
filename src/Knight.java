class Knight extends Army {
    public Knight(int hpSoldier, int attackTypeSoldier, int knightCost, int fsCost) {
        super(hpSoldier, attackTypeSoldier, knightCost, fsCost);
        this.knightCost = 30;
        this.hpSoldier = 45;
    }
}
