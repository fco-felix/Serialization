package br.edu.fapce.formulario;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrincipalController {

    @FXML
    private void irParaCadastros() throws IOException {
        App.setRoot("cadastro");
    }

    @FXML
    private void irParaListagem() throws IOException {
        App.setRoot("listagem");
    }

    @FXML
    private void bt_FinalizarOnAction() throws IOException {
    	App.salvarArquivo();
    	System.exit(0);
    }
}
