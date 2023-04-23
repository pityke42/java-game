package data;

public class Character {
    private Gun usedGun;
    private int hp;
    private int lvl;
    private boolean bleed;
    private double speed;
    private int stamina;
    private int x;
    private int y;
    public Character(Gun usedGun, int hp, int lvl, boolean bleed, double speed, int stamina){
        this.usedGun = usedGun;
        this.hp = hp;
        this.lvl = lvl;
        this.bleed = bleed;
        this.speed = speed;
        this.stamina = stamina;
    }
    public int decreaseStamina(){
        this.stamina = this.stamina - this.usedGun.getWeight();
        return this.stamina;
    }


    public double decreaseSpeed(){
        this.speed = this.speed - this.usedGun.getWeight() * 0.3;
        return this.speed;
    }
    public void rest(){
        this.speed = 10;
        this.stamina = 100;
        this.hp = this.hp + 10;
        if(this.hp > 100){
            this.hp = 100;
        }
    }
    public int decreaseX(){
        return this.x--;
    }
    public int incraseX(){
        return this.x++;
    }
    public int decraseY(){
        return this.y--;
    }
    public int incraseY(){
        return this.y++;
    }
//    public void castGun(){
//        Handgun gun = (Handgun) this.usedGun;
//
//    }
    public void lvlUp(){
        this.lvl++;
    }

    public Gun getUsedGun() {
        return usedGun;
    }

    public void setUsedGun(Gun usedGun) {
        this.usedGun = usedGun;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public boolean isBleed() {
        return bleed;
    }

    public void setBleed(boolean bleed) {
        this.bleed = bleed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
