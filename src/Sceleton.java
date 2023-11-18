public class Sceleton  extends Boss{
    private int  numberArrows;

    public Sceleton(String name, int health, int damage, Weapon arsenalWeapon, int numberArrows) {
        super(name, health, damage, arsenalWeapon);
        this.numberArrows = numberArrows;
    }

    public int getNumberArrows() {
        return numberArrows;
    }

    public void setNumberArrows(int numberArrows) {
        this.numberArrows = numberArrows;
    }
    public String info(){
        return super.info() + this.numberArrows;
    }
}
