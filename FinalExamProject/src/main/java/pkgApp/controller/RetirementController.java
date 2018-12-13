package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	
	@FXML
	private Label lblSaveEachMonth;
	
	@FXML
	private Label lblNeedToSave;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualRetWorking;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtReqIncome;
	
	@FXML
	private TextField txtAnnualRetRetired;
	
	@FXML
	private TextField txtMonthlySSI;

	
	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	/** Clear all the text inputs
	 * 
	 * @param event
	 */
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		System.out.println("Clear pressed");
		txtYearsToWork.setText("");
		txtAnnualRetWorking.setText("");
		txtYearsRetired.setText("");
		txtReqIncome.setText("");
		txtAnnualRetRetired.setText("");
		txtMonthlySSI.setText("");
		lblSaveEachMonth.setText("");
		lblNeedToSave.setText("");
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
	}
	
}
