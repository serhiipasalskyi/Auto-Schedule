package sample;

import javafx.scene.layout.Pane;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private Pane pane;

    public MyTimerTask(Pane pane){
        this.pane = pane;
    }

    @Override
    public void run(){
        hide();
    }

    private void hide(){
        pane.setVisible(false);
    }
}
