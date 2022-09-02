/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerscore;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
public class SenderCenter implements Source {
    private final ArrayList<MyObserver> list;
    private String Data;
    
    public SenderCenter(){
        this.list = new ArrayList<MyObserver>();
    }
    public void setData(String aData){
        Data = aData;
        notifyObserver();
    }
    public String getData(){
        return Data;
    }
    @Override
    public void register(MyObserver observer){
        list.add(observer);
    }
    @Override
    public void notifyObserver(){
        for(int i = 0 ; i < list.size(); i++){
            list.get(i).update(this);
        }
    }

}
