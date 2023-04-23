package data;

public class LMG extends Gun{


    private boolean tripod;

    public LMG(LMGBuilder builder){
        this.model = builder.model;
        this.accuracy = builder.accuracy;
        this.damage = builder.damage;
        this.fireRate = builder.fireRate;
        this.magSize = builder.magSize;
        this.reloadTime = builder.reloadTime;
        this.shootingRange = builder.shootingRange;
        this.tripod = builder.tripod;
    }
    public void setTripod(boolean tripod) {
        this.tripod = tripod;
    }
    public static class LMGBuilder {
        private String model;
        private int magSize;
        private int shootingRange;
        private int damage;
        private float fireRate;
        private int accuracy;
        private int reloadTime;
        private boolean tripod;
        public static LMGBuilder builder(){ return new LMGBuilder();}
        public LMGBuilder setModel(String model){
            this.model = model;
            return this;
        }

       public LMGBuilder setMagsize(int magSize){
            this.magSize = magSize;
            return this;
       }
       public LMGBuilder setShootingRange(int shootingRange){
            this.shootingRange = shootingRange;
            return this;
       }
       public LMGBuilder setDamage(int damage){
            this.damage = damage;
            return this;
       }
       public LMGBuilder setFireRate(float fireRate){
            this.fireRate = fireRate;
            return this;
       }
       public LMGBuilder setAccuracy(int accuracy){
            this.accuracy = accuracy;
            return this;
       }
       public LMGBuilder setReloadTime(int reloadTime){
            this.reloadTime = reloadTime;
            return this;
       }
       public LMGBuilder setTTripod(boolean tripod){
            this.tripod = tripod;
            return this;
       }
       public LMG create(){return new LMG(this);}
    }

    @Override
    public GunType getType(){
            return GunType.LMG;
    }

}
