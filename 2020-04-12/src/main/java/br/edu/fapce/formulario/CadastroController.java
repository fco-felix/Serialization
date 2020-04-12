package br.edu.fapce.formulario;

import br.edu.fapce.model.Cadastro;
import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastroController {
	
	@FXML
	private TextField tf_Nome;
	@FXML
	private TextField tf_CPF;
	@FXML
	private TextField tf_Nascimento;
	@FXML
	private TextField tf_Mae;
	@FXML
	private Button bt_Enviar;
	@FXML
	private Button bt_Listagem;
	@FXML
	private Button bt_Menu;
	
	@FXML
	public void bt_EnviarOnAction () {
		if (!tf_Nome.getText().isBlank()) {
			Cadastro cadastro = new Cadastro(tf_Nome.getText(), tf_CPF.getText(), tf_Nascimento.getText(), tf_Mae.getText());
	
			App.incluirCadastro(cadastro);
	
			tf_Nome.clear();
			tf_CPF.clear();
			tf_Nascimento.clear();
			tf_Mae.clear();
		} else {
			JOptionPane.showMessageDialog(null,
				    "Nome não pode ser deixado em branco.",
				    "Alerta",
				    JOptionPane.WARNING_MESSAGE);		}
		tf_Nome.requestFocus();
	}

	@FXML
	public void bt_ListagemOnAction () throws IOException {
        App.setRoot("listagem");
	}

	@FXML
	public void bt_MenuOnAction () throws IOException {
        App.setRoot("principal");
	}
}
