package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onBtSumAction() {
		
		Locale.setDefault(Locale.US);
		try {
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
	    double sum = number1 + number2;
		labelResult.setText(String.format("%.2f",sum));
		}
		catch(NumberFormatException e){
			Alerts.showArlert("ERRO", "parse error", e.getMessage(), AlertType.ERROR);
		}
		
	}
	
}
