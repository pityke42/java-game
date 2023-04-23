package data;

public class Sniper extends Gun{
    private boolean scoped;

    public boolean isScoped() {
        return scoped;
    }

    public void setScoped(boolean scoped) {
        this.scoped = scoped;
    }
    @Override
    public GunType getType(){
        return GunType.SNIPER;
    }
}
