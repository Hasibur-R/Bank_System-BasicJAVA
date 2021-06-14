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

public class SavAccount {
    @FXML
    public TextField name;
    @FXML
    public TextField amount;
    @FXML
    public TextField maxWithdraw;
    public void enter(ActionEvent event) throws IOException{
        String Name  = name.getText();
        double amt = Double.parseDouble(amount.getText());
        double maxAmt = Double.parseDouble(maxWithdraw.getText());
        String Number = Main.def.addAccount(Name, amt, maxAmt);
        JOptionPane.showMessageDialog(null,"Saving Account Created\nYour Account Number : "+Number);
    }

    public void cancel(ActionEvent event) throws IOException
    {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddAccount.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void ok(ActionEvent event) throws IOException
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
