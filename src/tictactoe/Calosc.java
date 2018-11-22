package tictactoe;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

/**
 * Created by pwilkin on 15-Nov-18.
 */
public class Calosc {

    @FXML
    protected GridPane grid;

    protected ApplicationController controller;

    public ApplicationController getController() {
        return controller;
    }

    public void initialize() {
        try {
            controller = new ApplicationController();
            FXMLLoader ticTacToeLoader = new FXMLLoader(getClass().getResource("tictactoe.fxml"));
            Node plansza = ticTacToeLoader.load();
            Controller boardController = ticTacToeLoader.getController();
            boardController.setMainController(controller);
            FXMLLoader statsLoader = new FXMLLoader(getClass().getResource("stats.fxml"));
            Node statystyki = statsLoader.load();
            Stats statsController = statsLoader.getController();
            statsController.setMainController(controller);
            grid.add(plansza, 0, 0);
            grid.add(statystyki, 1, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
