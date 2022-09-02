/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerscore;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class SoccerScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Receiver obj1 = new Receiver();
        Receiver obj2 = new Receiver();
        SenderCenter obj = new SenderCenter();
        SoccerScore s = new SoccerScore();//if Score is not static
        obj.register(obj1);
        obj.register(obj2);
        while(true){
            System.out.print("Enter Score : ");
            String gg = s.Score();
            //String gg = Score();//if Score is static
            if (!gg.equals("")){
                obj.setData(gg);
            }
            else{
               System.out.println("End");
               break;
            }
        }
    }
    
    public String Score(){
        Scanner sc = new Scanner(System.in);
        String gg = sc.nextLine();
        return gg;
    }
    
}
