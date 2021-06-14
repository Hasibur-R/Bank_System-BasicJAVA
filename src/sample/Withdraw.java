package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
public class Withdraw {
    @FXML
    public TextField acNum;
    @FXML
    public TextField doubleAmount;

    public void enter(ActionEvent event) throws InsufficientBalanceException{
        String acn = (acNum.getText());
        double amount = Double.parseDouble(doubleAmount.getText());
        Main.def.withdraw(acn,amount);
    }

    public void cancel(ActionEvent event) throws IOException
    {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
