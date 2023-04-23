package data;

public abstract class Gun {
    //dtos
    //alt + insert fast getter and setter
    protected String model;
    protected int magSize;
    protected int shootingRange;
    protected int damage;
    protected  float fireRate;
    protected int accuracy;
    protected int reloadTime;
    protected int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMagSize() {
        return magSize;
    }

    public void setMagSize(int magSize) {
        this.magSize = magSize;
    }

    public int getShootingRange() {
        return shootingRange;
    }

    public void setShootingRange(int shootingRange) {
        this.shootingRange = shootingRange;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getFireRate() {
        return fireRate;
    }

    public void setFireRate(float fireRate) {
        this.fireRate = fireRate;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    abstract GunType getType();
    @Override
    public String toString(){
        return this.model + " " + this.getType();
    }
}
