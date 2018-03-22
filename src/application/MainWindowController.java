package application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/*
 * 
 * @author A.I.
 * 
 */

public class MainWindowController implements Initializable {
	
		Float data = 0f;
		int operation = -1;
	
	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;
	    
	    @FXML
	    private TextField display;

	    @FXML
	    private Button seven;

	    @FXML
	    private Button four;

	    @FXML
	    private Button one;

	    @FXML
	    private Button zero;

	    @FXML
	    private Button eight;

	    @FXML
	    private Button five;

	    @FXML
	    private Button two;

	    @FXML
	    private Button nine;

	    @FXML
	    private Button six;

	    @FXML
	    private Button three;

	    @FXML
	    private Button clear;

	    @FXML
	    private Button plus;

	    @FXML
	    private Button minus;

	    @FXML
	    private Button multi;

	    @FXML
	    private Button divide;

	    @FXML
	    private Button equal;

	    @FXML
	    void handleButtonAction(ActionEvent event) {
	    
	    		if(event.getSource() == one) {
	    			display.setText(display.getText() + "1");
	    		} else if(event.getSource() == two) {
	    			display.setText(display.getText() + "2");
	    		} else if(event.getSource() == three) {
	    			display.setText(display.getText() + "3");
	    		} else if(event.getSource() == four) {
	    			display.setText(display.getText() + "4");
	    		} else if(event.getSource() == five) {
	    			display.setText(display.getText() + "5");
	    		} else if(event.getSource() == six) {
	    			display.setText(display.getText() + "6");
	    		} else if(event.getSource() == seven) {
	    			display.setText(display.getText() + "7");
	    		} else if(event.getSource() == eight) {
	    			display.setText(display.getText() + "8");
	    		} else if(event.getSource() == nine) {
	    			display.setText(display.getText() + "9");
	    		} else if(event.getSource() == zero) {
	    			display.setText(display.getText() + "0");
	    		} else if(event.getSource() == clear) {
	    			display.setText("");
	    		} else if(event.getSource() == plus) {
	    			data = Float.parseFloat(display.getText());
	    			operation = 1; //addition
	    			display.setText("");
	    		} else if(event.getSource() == minus) {
	    			data = Float.parseFloat(display.getText());
	    			operation = 2; //subtract
	    			display.setText("");
	    		} else if(event.getSource() == multi) {
	    			data = Float.parseFloat(display.getText());
	    			operation = 3; //multiplication
	    			display.setText("");
	    		} else if(event.getSource() == divide) {
	    			data = Float.parseFloat(display.getText());
	    			operation = 4; //divide
	    			display.setText("");
	    		} else if(event.getSource() == equal) {
	    			Float secondOperand = Float.parseFloat(display.getText());
	    			switch(operation) {
	    			
	    			case 1: float ans = data + secondOperand;
	    					display.setText(String.valueOf(ans));
	    					break;
	    					
	    			case 2: ans = data - secondOperand;
	    					display.setText(String.valueOf(ans));
	    					break;
	    					
	    			case 3: ans = data * secondOperand;
	    					display.setText(String.valueOf(ans));
	    					break;
	    					
	    			case 4: ans = 0f;
	    					try {
	    						ans = data / secondOperand;
	    					} catch(Exception e) {
	    						display.setText("Error");}
	    					display.setText(String.valueOf(ans));
	    					break;
	    					
	    			}

	    		}
	    		
	    }
   
       //@Override
	    public void initialize(URL url, ResourceBundle rb) {
	    	 //TODO
	    }

}
