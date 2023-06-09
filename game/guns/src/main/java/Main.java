import data.Gun;
import data.Sniper;
import repository.GunRepository;
import service.LoadService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public <T extends Gun> T generic(T input) {
        ((Sniper) input).setScoped(false);
        return input;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        LoadService service = new LoadService();
//        List<Gun> guns = service.loadGuns("src/main/resources/guns.txt");
////        guns.forEach(gun ->{
////            System.out.println(gun.toString());
////        });
////        Character hero = new Character(service.getRevolver(guns), 100, 1, false, 10,100);
////        hero.setX(0);
////        hero.setY(0);
////        MoveService move = new MoveService();
////        move.moveCharacter(hero, -109, 0);
////        move.moveCharacter(hero, 0, 109);
////        System.out.println(hero.getStamina());
//        List<List<Integer>> map = service.loadMap("src/main/resources/map.txt");
//        for (int y = 0; y < map.size(); y++) {
//            List<Integer> currentLine = map.get(y);
//            for (int x = 0; x < currentLine.size(); x++) {
//                if(Integer.valueOf(1).equals(currentLine.get(x))){
//                    System.out.print(". ");
//                }
//                else if (Integer.valueOf(2).equals(currentLine.get(x))) {
//                    System.out.print("x ");
//                }
//                else if(Integer.valueOf(3).equals(currentLine.get(x))){
//                    System.out.print("ammo");
//                }
//                else if(Integer.valueOf(4).equals(currentLine.get(x))){
//                    System.out.print("armor");
//                }
//                else {
//                    System.out.print(service.getGunById(guns, currentLine.get(x)).getModel() + " ");
//                }
//            }
//            System.out.print("\n");
//        }
        Class.forName("com.mysql.jdbc.Driver");
        GunRepository gunRepo = new GunRepository();
        List<Gun> allGuns = gunRepo.getAllGuns();
        allGuns.get(0).getModel();
        System.out.println(allGuns.get(0).getModel());
    }
}

// die, if(die){lvl-, gun-,
//out of ammo
// ammo types
//shoes, shoes types more movement speed, lower stamina loss
//shield, shield types, reducing damage, less weigth -> lower stamina loss, damage reduction, more weigth -> more damage reduction, more stamina loss
//character repository method ->character in data base insert