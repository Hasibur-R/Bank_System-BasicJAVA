package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import java.awt.*;
import java.io.IOException;

public class display {
    @FXML
    public TextField accountNumber;
    @FXML
    public TextArea information;
    public void enter(ActionEvent event) throws IOException{
        String acn = accountNumber.getText();
        BankAccount bac= Main.def.display(acn);
        information.setText(bac+"");
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
