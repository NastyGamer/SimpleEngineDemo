package demos;

import simple.engine.Engine;
import simple.engine.gui.WidgetPack;
import simple.engine.gui.components.Rectangle;
import simple.engine.gui.layouts.HorizontalLayoutManager;
import simple.engine.modules.FrameListener;
import simple.engine.util.GameConfig;
import simple.engine.util.GuiUtils;

import java.awt.*;

public class GuiDemo {

    public static void main(String[] args) {
        Engine.initialize(new GameConfig());
        //A WidgetPack holds a certain amount of widgets and lays them out using a LayoutManager
        WidgetPack widgetPack = new WidgetPack(
                new Rectangle(0, 0, 32, 32, GuiUtils.randomColor()),
                new Rectangle(0, 0, 32, 32, GuiUtils.randomColor()),
                new Rectangle(0, 0, 32, 32, GuiUtils.randomColor()),
                new Rectangle(0, 0, 32, 32, GuiUtils.randomColor()),
                new Rectangle(0, 0, 32, 32, GuiUtils.randomColor())
        );
        //Set the WidgetPack, activate it and lay it out
        Engine.guiModule.setWidgetPack(widgetPack);
        Engine.guiModule.setActive(true);
        widgetPack.layout(new HorizontalLayoutManager(20, HorizontalLayoutManager.LAYOUT_DIRECTION.RIGHT));
        Engine.graphicModule.addFrameListener(new FrameListener() {
            @Override
            public void onNextFrame(Graphics2D graphics2D) {
                Engine.guiModule.paint(graphics2D);
            }
        }, 0);
    }

}
