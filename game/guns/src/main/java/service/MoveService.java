package service;

import com.mysql.cj.jdbc.exceptions.MySQLQueryInterruptedException;
import data.Character;

public class MoveService {
    public void moveCharacter(Character character, int x, int y) {
        if (character.getX() > x) {
            while (character.getX() > x) {
                character.decreaseX();
                System.out.println("Character is moving, now is in : " + character.getX() + " " + character.getY());
                int currentStamina = character.decreaseStamina();
                if (currentStamina <= 0) {
                    try {
                        System.out.println("You are exhausted. Resting...");
                        Thread.sleep(5000);
                        character.rest();
                    } catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }
        else if (character.getX() < x){
            while(character.getX() < x){
                character.incraseX();
                System.out.println("Character is moving, now is in : " + character.getX() + " " + character.getY());
                int currentStamina = character.decreaseStamina();
                if (currentStamina <= 0){
                    try {
                        System.out.println("You are exhausted. Resting...");
                        Thread.sleep(5000);
                        character.rest();
                    } catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }
        if (character.getY() > y){
            while(character.getY() > y){
                character.decraseY();
                System.out.println("Your character is moving, now is in : " + character.getX() + " " + character.getY());
                int currentStamina = character.decreaseStamina();
                if(currentStamina <= 0){
                    try {
                        System.out.println("You are exhausted. Resting...");
                        Thread.sleep(5000);
                        character.rest();
                    } catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }
        else if (character.getY() < y){
            while(character.getY() < y){
                character.incraseY();
                System.out.println("Your character is moving in : " + character.getX() + " " + character.getY());
                int currentStamina = character.decreaseStamina();
                if(currentStamina <= 0){
                    try {
                        System.out.println("You are exhausted. Resting...");
                        Thread.sleep(5000);
                        character.rest();
                    } catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }
    }
}
