package br.ufrn.imd.controle;

import java.io.IOException;

import br.ufrn.imd.ControleAcademico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class TelaPrincipalController {

	private ControleAcademico main;
	
    @FXML
    private MenuItem mnItemAlunos;
    
    public void setMainApp(ControleAcademico controleAcademico) {
		this.main = controleAcademico;
	}

    @FXML
    void abrirTelaAlunos(ActionEvent event) {
    	try {
			main.iniciarTela();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
