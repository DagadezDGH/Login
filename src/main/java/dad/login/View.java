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

public class View extends GridPane{

	private Label userLabel = new Label("Usuario: ");
	private Label passwdLabel = new Label("Contraseña: ");
	private TextField userText = new TextField();
	private PasswordField passwdText = new PasswordField();
	private Button accessButton = new Button("Acceder");
	private Button cancelButton = new Button("Cancelar");
//	private GridPane root = new GridPane();
	private HBox buttonsBox = new HBox();
	private CheckBox ldap = new CheckBox("Usar LDAP")	;

	public View() {

		userText.setPromptText("Usuario");
		userLabel.setAlignment(Pos.BASELINE_LEFT);
		passwdText.setPromptText("Contraseña");
		passwdLabel.setAlignment(Pos.BASELINE_LEFT);
		buttonsBox.setAlignment(Pos.CENTER);
		buttonsBox.getChildren().addAll(accessButton, cancelButton);
		buttonsBox.setSpacing(10);
		
		ldap.setAlignment(Pos.CENTER);

		addRow(0, userLabel, userText);
		addRow(1, passwdLabel, passwdText);
		addRow(2, ldap);
		addRow(3 ,buttonsBox);

		setPadding(new Insets(5));
		setHgap(15);
		setVgap(15);
		setGridLinesVisible(false);
		setAlignment(Pos.CENTER);

		RowConstraints [] rows = {
				new RowConstraints(),new RowConstraints(), new RowConstraints(), new RowConstraints()
		};


		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints() };
		getColumnConstraints().setAll(cols);
		
		cols[0].setHalignment(HPos.CENTER);
		cols[0].setFillWidth(false);
		
		setColumnSpan(ldap, REMAINING);
		setColumnSpan(buttonsBox, REMAINING);
		setAlignment(Pos.CENTER);

		setAlignment(Pos.CENTER);

	}
	
	public CheckBox getldap() {
		return ldap;
	}

	public TextField getUser() {

		return userText;
	}

	public PasswordField getPassword() {

		return passwdText;
	}

	public Button getAccessButton() {
		return accessButton;
	}

//	public GridPane getRoot() {
//		return root;
//	}

	public Button getCancelButton() {
		return cancelButton;
	}

}