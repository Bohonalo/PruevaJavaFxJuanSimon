package application;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Control {
	
	 @FXML
	    void Abrir(MouseEvent event) {
		 try {
	           FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/FreeSolo.fxml"));
	           AnchorPane ventanaDos = (AnchorPane) loader.load();
	           Stage ventana = new Stage();
	           Scene scene = new Scene(ventanaDos);
	           ventana.setScene(scene);
	           ventana.show();

	       } catch (Exception e) {
	           //tratar la excepción
	       }
		 System.out.println("pepe");
			
	    }

}
