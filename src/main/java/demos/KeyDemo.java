package demos;

import simple.engine.Engine;
import simple.engine.util.ColorOut;
import simple.engine.util.GameConfig;

import java.awt.event.KeyEvent;

public class KeyDemo {

    public static void main(String[] args) {
        Engine.initialize(new GameConfig());
        //Register a key to a function
        Engine.keyModule.addKeyListener(KeyEvent.VK_SPACE, () -> ColorOut.print(System.out, "Spacebar pressed", ColorOut.CYAN));
    }

}
