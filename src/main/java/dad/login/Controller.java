package dad.login;

import dad.alerts.AlertaInicio;
import dad.login.auth.FileAuthService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;

public class Controller {

	private View view = new View();
	private Model model = new Model();

	public Controller() {
		view.getAccessButton().setOnAction(e -> onAccederAction(e));

		view.getCancelButton().setOnAction(e -> Platform.exit());
		
		
	}

	private void onAccederAction(ActionEvent e) {

	}

	public View getView() {
		return view;
	}

}