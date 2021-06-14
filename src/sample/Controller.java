package sample;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
public class Controller {
    public void AccountAdd(ActionEvent event) throws IOException {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddAccount.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void display(ActionEvent event) throws IOException {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("display.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void deposit(ActionEvent event) throws IOException {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Deposit.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void withdraw(ActionEvent event) throws IOException {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("withdraw.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void list(ActionEvent event) throws IOException {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
        s.hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("list.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
