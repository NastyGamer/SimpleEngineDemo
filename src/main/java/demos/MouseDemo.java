package demos;

import simple.engine.Engine;
import simple.engine.modules.MouseMoveListener;
import simple.engine.util.ColorOut;
import simple.engine.util.GameConfig;

import java.awt.*;

public class MouseDemo {

    public static void main(String[] args) {
        Engine.initialize(new GameConfig());
        Engine.mouseModule.addMouseMoveListener(new MouseMoveListener() {
            @Override
            public void onMouseMove(Point point) {
                ColorOut.print(System.out, String.format("Moved mouse to (%d, %d)", point.x, point.y), ColorOut.RED);
            }
        });
    }

}
