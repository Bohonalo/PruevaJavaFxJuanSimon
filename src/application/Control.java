package application;


import com.bohonalo.controles.ventana.OpcionesVentana;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * The Class Control.
 */
public class Control {
	
	/** The o. */
	OpcionesVentana o = new OpcionesVentana();
	
    /** The Anchor. */
    @FXML
    private AnchorPane Anchor;

    /**
     * Salir.
     *
     * @param event the event
     */
    @FXML
    void Salir(MouseEvent event) {
    	System.exit(0);
    }
    
    /**
     * Moverse.
     *
     * @param event the event
     */
    @FXML
    void Moverse(MouseEvent event) {
    	o.moverVentanaAnchor(Anchor);
    }
	
	 /**
 	 * Abrir.
 	 *
 	 * @param event the event
 	 */
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
