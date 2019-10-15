package br.ufrn.imd.controle;

import java.io.IOException;

import javax.swing.JOptionPane;

import br.ufrn.imd.ControleAcademico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaAlunoController {

    @FXML
    private Button btPesquisar;
    
    @FXML
    private TextField txtPesquisa;
    
	private ControleAcademico main;
    
    public void setMainApp(ControleAcademico controleAcademico) {
		this.main = controleAcademico;
	}

    @FXML
    void clicarBtPesquisar(ActionEvent event) {
    	String texto = txtPesquisa.getText();
    	try {
			enviarMensagem(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	private void enviarMensagem(String texto) throws IOException {
	    JOptionPane.showMessageDialog(null, "Procurando por " + texto + " ....");
		System.exit(0);
	}
}