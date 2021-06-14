package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.io.IOException;

public class AddAccount {
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

    public void savingAccount(ActionEvent event) throws IOException
    {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SavAccount.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void currentAcount(ActionEvent event) throws IOException
    {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CurAccount.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
