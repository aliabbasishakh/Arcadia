class ElvenGuardsman extends NormalMonster{

    public ElvenGuardsman(int num){
        this.type="11";
        this.attackPoint=500;
        this.healthPoint=1500;
        this.magicPoint=5;
        defender=true;
        nimble=false;
        name="Elven Guardsman";
        this.kind = "Elf";
        this.numberInDeck=num;

    }
}