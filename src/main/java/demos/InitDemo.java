package demos;

import simple.engine.Engine;
import simple.engine.util.GameConfig;

public class InitDemo {

    public static void main(String[] args) {
        /*Initialize the Engine
        GameConfig gameConfig = new GameConfig();
        gameConfig.setWidth(800);
        gameConfig.setHeight(600);
        gameConfig.setFps(60);
        gameConfig.setFullscreen(false);
        Engine.initialize(gameConfig);*/
        //Alternatively with double-bracket-initialization
        Engine.initialize(new GameConfig() {{
            setWidth(800);
            setHeight(600);
            setFps(60);
            setFullscreen(false);
        }});
    }

}
