package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends BorderPane {
    private TextArea textarea;
    private Button buttonTop;
    private Button buttonRight;
    private Button buttonBottom;
    private Button buttonLeft;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
        setPadding(new Insets(10));
    }

    private void layoutControls() {
        setCenter(textarea);
        setTop(buttonTop);
        setRight(buttonRight);
        setBottom(buttonBottom);
        setLeft(buttonLeft);
    }

    private void initializeControls() {
        textarea = new TextArea("");
        buttonTop = new Button("top");
        buttonTop.setMaxWidth(400);
        buttonRight = new Button("right");
        setMargin(buttonRight, new Insets(5));
        buttonBottom = new Button("bottom");
        buttonBottom.setMaxWidth(400);
        buttonLeft = new Button("left");
        setMargin(buttonLeft, new Insets(5));
    }
}
