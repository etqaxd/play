class FootSoldier extends Army {
    public FootSoldier(int hpSoldiers, int attackTypeSoldier, int knightCost, int fsCost) {
        super(hpSoldiers, attackTypeSoldier, knightCost, fsCost);
        this.fsCost = 15;
        this.hpSoldier = 25;
    }
}
