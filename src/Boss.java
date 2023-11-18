public class Boss extends  GameEntity{
    private  Weapon arsenalWeapon;


    public Boss(String name, int health, int damage, Weapon arsenalWeapon) {
        super(name, health, damage);
        this.arsenalWeapon = arsenalWeapon;
    }

    public Weapon getArsenalWeapon() {
        return arsenalWeapon;
    }

    public void setArsenalWeapon(Weapon arsenalWeapon) {
        this.arsenalWeapon = arsenalWeapon;
    }

    public String printInfo() {
        return super.info() + "Weapon :" + this.getArsenalWeapon();
    }

}
