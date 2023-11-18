public class Weapon {
    private String weaponName;
    private WeaponType weaponTYPE;

    public Weapon(String weaponName, WeaponType weaponTYPE) {
        this.weaponName = weaponName;
        this.weaponTYPE = weaponTYPE;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponType getWeaponTYPE() {
        return weaponTYPE;
    }

    public void setWeaponTYPE(WeaponType weaponTYPE) {
        this.weaponTYPE = weaponTYPE;
    }

}