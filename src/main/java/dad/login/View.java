package dad.login;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;

public class View {

	private Label userLabel = new Label("Usuario: ");
	private Label passwdLabel = new Label("Contraseña: ");
	private TextField userText = new TextField();
	private PasswordField passwdText = new PasswordField();
	private Button accessButton = new Button("Acceder");
	private Button cancelButton = new Button("Cancelar");
	private GridPane root = new GridPane();
	private HBox buttonsBox = new HBox();
	private CheckBox ldap = new CheckBox("Usar LDAP")	;

	public View() {

		userText.setPromptText("Usuario");
		passwdText.setPromptText("Contraseña");
		buttonsBox.setAlignment(Pos.CENTER);
		buttonsBox.getChildren().addAll(accessButton, cancelButton);
		buttonsBox.setSpacing(10);

		ldap.setAlignment(Pos.CENTER);

		root.addRow(0, userLabel, userText);
		root.addRow(1, passwdLabel, passwdText);
		root.addRow(2, ldap);
		root.addRow(3 ,buttonsBox);

		root.setPadding(new Insets(5));
		root.setHgap(15);
		root.setVgap(15);
		root.setGridLinesVisible(false);
		root.setAlignment(Pos.CENTER);


		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints() };
		root.getColumnConstraints().setAll(cols);


	}
	
	public CheckBox getldap() {
		return ldap;
	}

	public String getUser() {

		return userText.getText();
	}

	public String getPassword() {

		return passwdText.getText();
	}

	public Button getAccessButton() {
		return accessButton;
	}

	public GridPane getRoot() {
		return root;
	}

	public Button getCancelButton() {
		return cancelButton;
	}

}