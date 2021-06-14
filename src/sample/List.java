package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class List {
    @FXML
    public TextArea view;
    int i=0;
    public void viewList(int i){
        BankAccount bac =Main.def.display(i);
        if(bac!=null){
            view.setText(bac+" ");
        }
        else
            view.setText("No Accounts to show!");
    }
    public void start(ActionEvent event) throws IOException{
        viewList(0);
    }
    public void next(ActionEvent event) throws IOException{
        if (i<Main.def.accounts.size()-1) {
            i++;
            viewList(i);
        }
        else
            view.setText("No Accounts to show!");

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
