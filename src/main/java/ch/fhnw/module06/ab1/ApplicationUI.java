package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
    private Button button;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    private void layoutControls() {
        getChildren().add(button);
    }

    private void initializeControls() {
        button = new Button("I love you my dear");
    }


}
