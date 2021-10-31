package dad.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MVC extends Application {

	
	public void start(Stage primaryStage) {
		Controller controller = new Controller();
		Scene scene = new Scene(controller.getView(), 420, 250);
		primaryStage.setTitle("Iniciar sesión");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}