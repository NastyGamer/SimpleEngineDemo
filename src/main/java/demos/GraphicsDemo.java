package demos;

import simple.engine.Engine;
import simple.engine.modules.FrameListener;
import simple.engine.util.GameConfig;
import simple.engine.util.GuiUtils;

import java.awt.*;

public class GraphicsDemo {

    public static void main(String[] args) {
        Engine.initialize(new GameConfig());
        //Adds a FrameListener. A FrameListener's onNextFrame-method is called every frame with the
        //buffer's Graphics2D. The AffineTransform is also reset between every FrameListener.
        //Therefore you can simple draw on the given Graphics2D.
        //The second argument is the layer to draw onto, so certain elements, such as GUIs can
        //be drawn over other elements.
        Engine.graphicModule.addFrameListener(new FrameListener() {
            @Override
            public void onNextFrame(Graphics2D graphics2D) {
                graphics2D.setColor(GuiUtils.randomColor());
                graphics2D.fillRect(0, 0, 256, 256);
            }
        }, 0);
    }

}
