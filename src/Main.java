public class Main {

    public static void main(String[] args) {

        // Create characters
        Warrior warrior = new Warrior("Ohm");
        Tank tank = new Tank("Korn");

        // Create accessories
        Accessory sword = new Accessory("Sword of Ton", 5, 0, 0, 5);
        Accessory ring = new Accessory("Ring of Korn", 0, 5, 0, 2);
        Accessory shield = new Accessory("Shield of Ohm", 0, 0, 5, 10);
            // Accessory แต่ละอันจะเพิ่ม stat ที่แตกต่างกัน รวมไปถึงน้ำหนักที่ส่งผลต่อความเร็วของตัวละคร

        // First display
        warrior.displayInfo();
        tank.displayInfo();

        // Equip accessories
        warrior.equipAccessory(sword);
        tank.equipAccessory(shield);

        // Second display
        warrior.displayInfo();
        tank.displayInfo();

        // Level up
        warrior.levelUp();
        tank.levelUp();

        // Third display
        warrior.displayInfo();
        tank.displayInfo();

        // Attack
        warrior.attack(tank);
        tank.defend(warrior);

        // Fourth display
        tank.displayInfo();

    }
}
//อ้างอิง: แลปนี้ได้ใช่ CHATGPT ในการช่วยเหลือบางส่วน
