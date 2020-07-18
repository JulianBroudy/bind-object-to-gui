package com.broudy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

  @FXML
  private Label manipulatedLBL;

  @FXML
  private Button primaryButton;

  @FXML
  private TextField manipulatedTF;

  @FXML
  private Button manipulateWatchmanBTN;

  private int i = 0;

  @FXML
  private void initialize() {
    List<String> texts = new ArrayList<>();
    texts.add("Hey! It works... Click again...");
    texts.add("Again...");
    texts.add("And again...");
    texts.add("Wohooo");
    texts.add("Yipeeeeeee!");
    texts.add("Notice: ...");
    texts.add("The text is changed in Watchman class but these change as well...");

    Watchman watchman = new Watchman();
    manipulatedTF.textProperty().bind(watchman.manipulatedTextProperty());
    manipulatedLBL.textProperty().bind(watchman.manipulatedTextProperty());

    //    This is another acceptable way of assigning actions to buttons, etc.
    manipulateWatchmanBTN.setOnAction(click -> {
      watchman.setManipulatedText(texts.get(i++));
      // This is just to reset the text
      if (i >= texts.size()) {
        i = 0;
      }
    });
  }

  @FXML
  private void switchToSecondary() throws IOException {
    App.setRoot("secondary");
  }
}
