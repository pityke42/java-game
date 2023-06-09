package service;

import data.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadService {
    private final String REVOLVER = "revolver";

    public List<Gun> loadGuns(String fileName) {
        List<Gun> guns = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine;
            boolean firstLine = true;
            while ((currentLine = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                } else {
                    String[] splittedLine = currentLine.split(";");
                    getProperGunInstance(guns, splittedLine);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file name not valid");
        } catch (IOException e) {
            System.out.println("any errors");
        }
        return guns;
    }

    public static void getProperGunInstance(List<Gun> guns, String[] splittedLine) {
        switch (splittedLine[0]) {
            case "handgun":
                Handgun handgun = Handgun.HandGunBuilder.builder().setModel(splittedLine[1]).setMagSize(Integer.parseInt(splittedLine[2])).setShootingRange(Integer.parseInt(splittedLine[3])).setDamage(Integer.parseInt(splittedLine[4])).setFireRate(Float.parseFloat(splittedLine[5])).setAccuracy(Integer.parseInt(splittedLine[6])).setReloadTime(Integer.parseInt(splittedLine[7])).create();
                handgun.setWeight(Integer.parseInt(splittedLine[13]));
                handgun.setId(Integer.parseInt(splittedLine[14]));
                guns.add(handgun);
                break;
            case "assault":
                Assault assault = new Assault();
                assault.setModel(splittedLine[1]);
                assault.setMagSize(Integer.parseInt(splittedLine[2]));
                assault.setShootingRange(Integer.parseInt(splittedLine[3]));
                assault.setDamage(Integer.parseInt(splittedLine[4]));
                assault.setFireRate(Float.parseFloat(splittedLine[5]));
                assault.setAccuracy(Integer.parseInt(splittedLine[6]));
                assault.setReloadTime(Integer.parseInt(splittedLine[7]));
                assault.setSilencer(Boolean.parseBoolean(splittedLine[10]));
                assault.setWeight(Integer.parseInt(splittedLine[13]));
                assault.setId(Integer.parseInt(splittedLine[14]));
                guns.add(assault);
                break;
            case "sniper":
                Sniper sniper = new Sniper();
                sniper.setModel(splittedLine[1]);
                sniper.setMagSize(Integer.parseInt(splittedLine[2]));
                sniper.setShootingRange(Integer.parseInt(splittedLine[3]));
                sniper.setDamage(Integer.parseInt(splittedLine[4]));
                sniper.setFireRate(Float.parseFloat(splittedLine[5]));
                sniper.setAccuracy(Integer.parseInt(splittedLine[6]));
                sniper.setReloadTime(Integer.parseInt(splittedLine[7]));
                sniper.setScoped(Boolean.parseBoolean(splittedLine[11]));
                sniper.setWeight(Integer.parseInt(splittedLine[13]));
                sniper.setId(Integer.parseInt(splittedLine[14]));
                guns.add(sniper);

                break;
            case "shotgun":
                Shotgun shotgun = new Shotgun();
                shotgun.setModel(splittedLine[1]);
                shotgun.setMagSize(Integer.parseInt(splittedLine[2]));
                shotgun.setShootingRange(Integer.parseInt(splittedLine[3]));
                shotgun.setDamage(Integer.parseInt(splittedLine[4]));
                shotgun.setFireRate(Float.parseFloat(splittedLine[5]));
                shotgun.setAccuracy(Integer.parseInt(splittedLine[6]));
                shotgun.setReloadTime(Integer.parseInt(splittedLine[7]));
                shotgun.setDoubleBarrel(Boolean.parseBoolean(splittedLine[8]));
                shotgun.setSpread(Integer.parseInt(splittedLine[9]));
                shotgun.setWeight(Integer.parseInt(splittedLine[13]));
                shotgun.setId(Integer.parseInt(splittedLine[14]));
                guns.add(shotgun);
                break;
            case "lmg":
                LMG lmg = LMG.LMGBuilder.builder().setModel(splittedLine[1]).setMagsize(Integer.parseInt(splittedLine[2])).setShootingRange(Integer.parseInt(splittedLine[3])).setDamage(Integer.parseInt(splittedLine[4])).setFireRate(Float.parseFloat(splittedLine[5])).setAccuracy(Integer.parseInt(splittedLine[6])).setReloadTime(Integer.parseInt(splittedLine[7])).setTTripod(Boolean.parseBoolean(splittedLine[12])).create();
                lmg.setWeight(Integer.parseInt(splittedLine[13]));
                lmg.setId(Integer.parseInt(splittedLine[14]));
                guns.add(lmg);
                break;


        }
    }

    public Gun getRevolver(List<Gun> guns) {
        for (Gun gun : guns) {
            if (gun.getModel().equals(REVOLVER)) {
                return gun;
            }
        }
        return null;
    }

    public List<List<Integer>> loadMap(String fileName) {
        List<List<Integer>> map = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine;
            List<Integer> line = new ArrayList<>();
            while ((currentLine = reader.readLine()) != null) {
                String[] splittedLine = currentLine.split(";");
                for(int i = 0; i < splittedLine.length; i++) {
                    try {
                        Integer currentField = Integer.valueOf(splittedLine[i]);
                        line.add(currentField);
                    } catch (NumberFormatException e) {
                        System.out.println("Field in x: " + (i + 1) + ", y: " + (map.size() + 1) + " is " + splittedLine[i]);
                    }
                }
                map.add(line);
                line = new ArrayList<>();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("file name not valid");
        } catch (IOException e) {
            System.out.println("any errors");
        }
        return map;
    }
    public Gun getGunById(List<Gun> guns, Integer id){
        for(Gun currentGun:guns){
            if(Integer.valueOf(currentGun.getId()).equals(id)){
                return currentGun;
            }
        }
        return null;
    }
}
//setting time to incrase stamina
