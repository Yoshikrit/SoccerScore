/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerscore;

/**
 *
 * @author acer
 */
public class Receiver implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("live result : " + ((SenderCenter)o).getData());
    }
}
