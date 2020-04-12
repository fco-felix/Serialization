package br.edu.fapce.formulario;

import br.edu.fapce.model.Cadastro;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListagemController implements Initializable {

	@FXML private TableView <Cadastro> tv_Tabela;
	@FXML private TableColumn <Cadastro, String> Nome;
	@FXML private TableColumn <Cadastro, String> CPF;
	@FXML private TableColumn <Cadastro, String> Nascimento;
	@FXML private TableColumn <Cadastro, String> Mae;

	@FXML private Button bt_Menu;
	@FXML private Button bt_Cadastro;
	
	@FXML
    private void bt_MenuOnAction() throws IOException {
        App.setRoot("principal");
    }

	@FXML
	private void bt_CadastroOnAction() throws IOException {
		App.setRoot("cadastro");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		App.listarCadastros();
		
//		tc_Nome.setCellValueFactory(new PropertyValueFactory<Cadastro, String>("Nome"));
//		tc_CPF.setCellValueFactory(new PropertyValueFactory<Cadastro, String>("Cpf"));
//		tc_Nascimento.setCellValueFactory(new PropertyValueFactory<Cadastro, String>("Nascimento"));
//		tc_Mae.setCellValueFactory(new PropertyValueFactory<Cadastro, String>("Mae"));

//		ObservableList<Cadastro> obsCadastro = FXCollections.observableArrayList();
//		obsCadastro.add( new Cadastro("ana","ana cpf","ana nascimento","ana mae"));
//		obsCadastro.add( new Cadastro("beatriz","ana cpf","ana nascimento","ana mae"));
//		obsCadastro.add( new Cadastro("carlos","ana cpf","ana nascimento","ana mae"));
//		obsCadastro.add( new Cadastro("daniel","ana cpf","ana nascimento","ana mae"));
//        tv_Tabela.setItems(obsCadastro);
        
	}
}