package application;


import com.bohonalo.controles.ventana.OpcionesVentana;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Control {
	
	OpcionesVentana o = new OpcionesVentana();
	
    @FXML
    private AnchorPane Anchor;

    @FXML
    void Salir(MouseEvent event) {
    	System.exit(0);
    }
    @FXML
    void Moverse(MouseEvent event) {
    	o.moverVentanaAnchor(Anchor);
    }
	
	 @FXML
	    void Abrir(MouseEvent event) {
		 try {
	           FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/FreeSolo.fxml"));
	           AnchorPane ventanaDos = (AnchorPane) loader.load();           
	           Stage ventana = new Stage();
	           ventana.initStyle(StageStyle.TRANSPARENT);
	           Scene scene = new Scene(ventanaDos);
	           ventana.setScene(scene);
	           ventana.show();
	           

	       } catch (Exception e) {
	           //tratar la excepción
	       }
			
	    }

}
