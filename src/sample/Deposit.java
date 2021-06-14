package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
public class Deposit {
    @FXML
    public TextField acNum;
    @FXML
    public TextField dAmount;
    public void enter(ActionEvent event) throws IOException{
        String acn = (acNum.getText());
        double amount = Double.parseDouble(dAmount.getText());
        Main.def.deposit(acn,amount);
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
