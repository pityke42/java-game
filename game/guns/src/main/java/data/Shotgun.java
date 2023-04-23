package data;

public class Shotgun extends Gun{
    private boolean doubleBarrel;
    private int spread;

    public boolean isDoubleBarrel() {
        return doubleBarrel;
    }

    public void setDoubleBarrel(boolean doubleBarrel) {
        this.doubleBarrel = doubleBarrel;
    }

    public int getSpread() {
        return spread;
    }

    public void setSpread(int spread) {
        this.spread = spread;
    }
    @Override
    public GunType getType(){
        return GunType.SHOTGUN;
    }

}
