public class Accessory implements BonusStats{
    protected String name;
    protected int bonusAtk;
    protected int bonusHp;
    protected int bonusDef;
    protected int weight;

// ------------------------------------------------------------------------------------------------

    public Accessory(String name, int bonusAtk,int bonusHp,int bonusDef,int weight){
        this.name = name;
        this.bonusAtk = bonusAtk;
        this.bonusHp = bonusHp;
        this.bonusDef = bonusDef;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addBonus(RPGCharacter character) {
        character.attack += bonusAtk;
        character.hp += bonusHp;
        character.defense += bonusDef;
        character.runSpeed -= weight;
    }

}
