package com.broudy;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Watchman {

  private StringProperty manipulatedText;

  public Watchman() {
    this.manipulatedText = new SimpleStringProperty("howdy!");
  }

  public String getManipulatedText() {
    return manipulatedText.get();
  }

  public StringProperty manipulatedTextProperty() {
    return manipulatedText;
  }

  public void setManipulatedText(String manipulatedText) {
    this.manipulatedText.set(manipulatedText);
  }

}
