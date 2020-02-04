package demos;

import simple.engine.Engine;
import simple.engine.util.ColorOut;
import simple.engine.util.GameConfig;
import simple.engine.util.Logger;

public class TimingDemo {

    public static void main(String[] args) {
        Engine.initialize(new GameConfig());
        //Disable the Fps logger
        Logger.disableLevel("fps");
        ColorOut.print(System.out, "Waiting 5 seconds...", ColorOut.GREEN);
        Engine.timingModule.schedule(() -> ColorOut.print(System.out, "5 Seconds have elapsed", ColorOut.CYAN), 5000);
        ColorOut.print(System.out, "Waiting 5 seconds... and repeating it 10 times", ColorOut.GREEN);
        Engine.timingModule.scheduleMultiple(() -> ColorOut.print(System.out, "5 Seconds have elapsed", ColorOut.CYAN), 0, 5000, 10);
    }

}
