import java.util.ArrayList;
import java.util.List;

public class RPGCharacter {
    protected String name;
    protected String job;
    protected int level;
    protected List<Accessory> accessories;
    protected int attack;
    protected int hp;
    protected int defense;
    protected double runSpeed;

// ------------------------------------------------------------------------------------------------

    public RPGCharacter(String name,String job,int attack,int hp,int defense,double runSpeed) {
        this.name = name;
        this.job = job;
        this.level = 1;
        this.accessories = new ArrayList<>();
        this.attack = attack;
        this.hp = hp;
        this.defense = defense;
        this.runSpeed = runSpeed;
    }

// ------------------------------------------------------------------------------------------------

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public void attack(RPGCharacter target) {
        int damageDealt = attack;
        System.out.println(name + " attacks " + target.getName() + " for " + damageDealt  + "damage!");
        target.takeDamage(damageDealt);
    }

    public void defend(RPGCharacter attacker) {
        int damageReduction = defense / 2;
        int damageTaken = Math.max(0, attacker.attack - damageReduction);
        System.out.println(name + " defends against " + attacker.getName() + "!");
        takeDamage(damageTaken);
    }

    public String getName() {
        return name;
    }
    public double getRunSpeed() {
        return runSpeed;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }
    public void equipAccessory(Accessory accessory) {
        accessories.add(accessory);
        accessory.addBonus(this);
    }
    public void levelUp() {
        level++;
        setHp(this.hp + 10 * level);
        setRunSpeed(this.runSpeed += this.runSpeed * (0.1 + 0.03 * level));
        System.out.printf("%s levels up to level %d!\n", name, level);
    }

// ------------------------------------------------------------------------------------------------

    public void displayInfo() {
        System.out.println("Character Information:");
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Level: " + level);
        System.out.println("Attack: " + attack);
        System.out.println("Hp: " + hp);
        System.out.println("Defense: " + defense);
        System.out.println("Run Speed: " + getRunSpeed());
        System.out.print("Accessories: ");
        for (Accessory accessory : accessories) {
            System.out.print(accessory.getName() + " ");
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------------");
    }


}


