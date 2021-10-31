package dad.login;

import dad.alerts.AlertaInicio;
import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;

public class Controller {

	private View view = new View();
	private Model model = new Model();

	public Controller() {

		view.getUser().textProperty().bindBidirectional(model.userProperty());

		view.getPassword().textProperty().bindBidirectional(model.passwdProperty());
		
		view.getldap().selectedProperty().bindBidirectional(model.ldapProperty());
		
		view.getAccessButton().setOnAction(e -> onAccederAction(e));

		view.getCancelButton().setOnAction(e -> Platform.exit());
		
		
	}

	private void onAccederAction(ActionEvent e) {
		AuthService ldap = model.isldap() ? new LdapAuthService() : new FileAuthService();

		try {
			if (ldap.login(model.getUserProperty(), model.getPasswdProperty()) == true ) {
				
				AlertaInicio.mostrarAlert(AlertType.INFORMATION, "Acceso permitido",
						"Las credenciales de acceso son válidas.");

			} else {
				AlertaInicio.mostrarAlert(AlertType.ERROR, "Acceso denegado",
						"El usuario y/o contraseña no son válidos.");
			}
		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	public View getView() {
		return view;
	}

}