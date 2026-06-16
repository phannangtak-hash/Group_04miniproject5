import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private RadioButton AMS;

    @FXML
    private DatePicker BIRTHDATE;

    @FXML
    private RadioButton GIC;

    @FXML
    private RadioButton GTR;

    @FXML
    private CheckBox NETWORK;

    @FXML
    private CheckBox OOP;

    @FXML
    private CheckBox OS;

    @FXML
    private Button SUBMITBUTTON;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField TEXTFIEL1;

    @FXML
    void submit(ActionEvent event) {
        String name = TEXTFIEL1.getText();

        String dob = "N/A";
        if (BIRTHDATE != null && BIRTHDATE.getValue() != null) {
            dob = BIRTHDATE.getValue().toString();
        }

        String department = "N/A";
        if (AMS.isSelected()) {
            department = "AMS";
        }
        if (GIC.isSelected()) {
            department = "GIC";
        }
        if (GTR.isSelected()) {
            department = "GTR";
        }

        ArrayList<String> subjects = new ArrayList<>();
        if (NETWORK.isSelected()) {
            subjects.add("NETWORK");
        }
        if (OOP.isSelected()) {
            subjects.add("OOP");
        }
        if (OS.isSelected()) {
            subjects.add("OS");
        }

        String result = "Name: " + name + "\n"
                + "DOB: " + dob + "\n"
                + "Department: " + department + "\n"
                + "Subjects: " + subjects;
        resultLabel.setText(result);
    }

}
