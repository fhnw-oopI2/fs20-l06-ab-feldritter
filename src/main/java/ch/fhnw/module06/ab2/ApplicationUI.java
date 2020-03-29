package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
    private Label label;
    private TextField textfield;
    private TextArea textarea;
    private Button button;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    private void layoutControls() {
        getChildren().add(label);
        getChildren().add(textfield);
        getChildren().add(textarea);
        getChildren().add(button);
    }

    private void initializeControls() {
        label = new Label("ein Label");
        textfield = new TextField("text field");
        textarea = new TextArea("text area");
        button = new Button("ein Button");
        setPadding(new Insets(10));
    }
}
