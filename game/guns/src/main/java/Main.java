import data.Assault;
import data.Character;
import data.Gun;
import data.Handgun;
import data.Sniper;
import service.LoadService;
import service.MoveService;

import java.util.List;

public class Main {
    public <T extends Gun> T generic(T input){
        ((Sniper)input).setScoped(false);
        return input;
    }
    public static void main(String[] args){
        LoadService service = new LoadService();
        List<Gun> guns = service.loadGuns("src/main/resources/guns.txt");
        guns.forEach(gun ->{
            System.out.println(gun.toString());
        });
        Character hero = new Character(service.getRevolver(guns), 100, 1, false, 10,100);
        hero.setX(0);
        hero.setY(0);
        MoveService move = new MoveService();
        move.moveCharacter(hero, -109, 0);
        move.moveCharacter(hero, 0, 109);
        System.out.println(hero.getStamina());
    }
}
// die, if(die){lvl-, gun-,
//out of ammo
// ammo types
//shoes, shoes types more movement speed, lower stamina loss
//shield, shield types, reducing damage, less weigth -> lower stamina loss, damage reduction, more weigth -> more damage reduction, more stamina loss