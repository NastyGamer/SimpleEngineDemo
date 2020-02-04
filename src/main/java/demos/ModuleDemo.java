package demos;

import simple.engine.Engine;
import simple.engine.modules.Module;
import simple.engine.util.ColorOut;
import simple.engine.util.GameConfig;

public class ModuleDemo {

    public static void main(String[] args) {
        Engine.initialize(
                //Initialize the engine with standard args, but with a custom module
                new GameConfig(),
                //Add a custom module to the engine and pass in the engine's config
                new HelloWorldModule(Engine.getConfig())
        );
        //Retrieve the module from the engine and run its method
        Engine.get(HelloWorldModule.class).sayHello();
    }

    public static class HelloWorldModule extends Module {

        public HelloWorldModule(GameConfig config) {
            super(config);
        }

        public void sayHello() {
            ColorOut.print(System.out, "Hello World", ColorOut.GREEN);
        }
    }

}
