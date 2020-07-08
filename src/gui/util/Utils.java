package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	  public static Stage currentStage(ActionEvent event) {// acessar o Stage aonde o controller que recebeu o evento estar.
		  return (Stage) ((Node) event.getSource()).getScene().getWindow();
	  }
	
	  public static Integer tryParsetoInt(String str) {//Passar String para integer
		try {
			return Integer.parseInt(str);
		}catch(NumberFormatException e) {
			return null;
		}
	}	  
}