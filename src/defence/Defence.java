package defence;

import controller.ControlRoom;
import obs.Observer;
import view.Helicopter;
import view.MainController;
import view.Submarine;
import view.Tank;

public class Defence {

    
    public static void main(String[] args) {
        ControlRoom controlroom=new ControlRoom();
        controlroom.addObserver(new MainController(controlroom));
        controlroom.addObserver(new Helicopter(controlroom));
        controlroom.addObserver(new Submarine(controlroom));
        controlroom.addObserver(new Tank(controlroom));
        //controlroom.addObserver(new MainController(controlroom));
        //.addObserver(new Helicopter(controlroom));
    }

    
    
}
