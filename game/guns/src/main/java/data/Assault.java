package data;

public class Assault extends Gun{
    private boolean silencer;

    public boolean isSilencer() {
        return silencer;
    }

    public void setSilencer(boolean silencer) {
        this.silencer = silencer;
    }
    @Override
    public GunType getType(){
        return GunType.ASSAULT;
    }

}
