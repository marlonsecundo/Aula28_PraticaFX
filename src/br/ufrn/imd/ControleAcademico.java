package br.ufrn.imd;

import java.io.IOException;

import br.ufrn.imd.controle.TelaAlunoController;
import br.ufrn.imd.controle.TelaPrincipalController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sun.applet.Main;

public class ControleAcademico extends Application {
	
	private Stage stage1;
	public BorderPane layout1;
	public BorderPane layoutAlu;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.stage1 = primaryStage;
		this.stage1.setTitle("Sistema de Controle Acadêmico");
		
		// Carrega a tela principal
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ControleAcademico.class.getResource("visao/TelaPrincipal.fxml"));
		layout1 = (BorderPane) loader.load();
		
		// Mostra a cena
		Scene scene = new Scene(layout1);
		stage1.setScene(scene);
		stage1.show();
		
		// Passando o controle
		TelaPrincipalController tpController = loader.getController();
		tpController.setMainApp(this);
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void iniciarTela() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ControleAcademico.class.getResource("visao/TelaAluno.fxml"));
		layoutAlu = (BorderPane) loader.load();
		
		layout1.setCenter(layoutAlu);
		TelaAlunoController controller = loader.getController();
		controller.setMainApp(this);
	}
}
