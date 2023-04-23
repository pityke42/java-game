package data;

public class Handgun extends Gun{
    Handgun(HandGunBuilder builder){
        this.model = builder.model;
        this.accuracy = builder.accuracy;
        this.damage = builder.damage;
        this.fireRate = builder.fireRate;
        this.magSize = builder.magSize;
        this.reloadTime = builder.reloadTime;
        this.shootingRange = builder.shootingRange;
    }
    public static class HandGunBuilder {
        private String model;
        private int magSize;
        private int shootingRange;
        private int damage;
        private  float fireRate;
        private int accuracy;
        private int reloadTime;
        public static HandGunBuilder builder(){
            return new HandGunBuilder();
        }
        public HandGunBuilder setModel(String model){
            this.model = model;
            return this;
        }
        public HandGunBuilder setMagSize(int magSize){
            this.magSize = magSize;
            return this;
        }
        public HandGunBuilder setShootingRange(int shootingRange){
            this.shootingRange = shootingRange;
            return this;
        }
        public HandGunBuilder setDamage(int damage){
            this.damage = damage;
            return this;
        }
        public HandGunBuilder setFireRate(float fireRate){
            this.fireRate = fireRate;
            return this;
        }
        public HandGunBuilder setAccuracy(int accuracy){
            this.accuracy = accuracy;
            return this;
        }
        public HandGunBuilder setReloadTime(int reloadTime){
            this.reloadTime = reloadTime;
            return this;
        }
        public Handgun create(){
            return new Handgun(this);
        }
    }
    @Override
    public GunType getType(){
        return GunType.HANDGUN;
    }
}