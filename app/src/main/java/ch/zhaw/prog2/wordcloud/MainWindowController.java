package ch.zhaw.prog2.wordcloud;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Label lableTitle;

    @FXML
    private TextArea textHistory;

    @FXML
    private TextField textInput;

    @FXML
    void addText(ActionEvent event) {
        textHistory.appendText(textInput.getText() + System.lineSeparator());
    }

    @FXML
    void deleteInput(ActionEvent event) {
        textInput.clear();
    }

    public void initialize(){
        lableTitle.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                lableTitle.setText(newValue);
            }
        });

    }

}
