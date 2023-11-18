public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("Bomb" ,WeaponType.BOMB);
        Boss boss = new Boss("Big Boss", 1000, 100, weapon);
        System.out.println("Name: " + boss.getName() + " Health: " + boss.getHealth() + " Damage: " + boss.getDamage() +
                " Weapon name: " + weapon.getWeaponName() + " Weapon Type: " + weapon.getWeaponTYPE());
        System.out.println(boss.info());

        Weapon scelet = new Weapon("Pistol",WeaponType.PISTOL);
        Sceleton sceleton = new Sceleton("Sceleton big",300,20, scelet,10);
        System.out.println(sceleton.info());
        Sceleton sceleton2 = new Sceleton("Sceleton little",300,20, scelet,20);
        System.out.println(sceleton2.info());
    }
}