
package controller;

import obs.Observer;


public class ControlRoom {
    private Observer[] obsArray = new Observer[50];
    private int nextIndex=0;
    
    public void setArea(boolean areaClear){
        for (int i = 0; i < nextIndex; i++) {
            Observer ob=obsArray[i];
            ob.areaClear(areaClear);
        }
    }
    
    public void addObserver(Observer obs){
        obsArray[nextIndex] = obs;
        nextIndex++;
    }
    
    public void setMsg(String msg){
        for (int i = 0; i < nextIndex; i++) {
            Observer ob = obsArray[i];
            ob.getMsg(msg);
        }
    }
}
