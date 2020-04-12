package br.edu.fapce.formulario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.edu.fapce.model.Cadastro;

/**
 * JavaFX App
 */
public class App extends Application {
	private static Scene scene;
	private static ArrayList<Cadastro> listaCadastros = new ArrayList<>();

	@Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("principal"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
    	carregarArquivo();
    	launch();
    	salvarArquivo();
    }

    private static void carregarArquivo() {
    	File arq = new File("arquivo.ser");
        System.out.println("Verificando arquivo...");
	    if (arq.exists() ) {
	    	try
	        {
	            FileInputStream arquivo = new FileInputStream(arq);
	            ObjectInputStream ois = new ObjectInputStream(arquivo);
	            listaCadastros = (ArrayList) ois.readObject();
	            ois.close();
	            arquivo.close();
	            System.out.println("Arquivo carregado.");
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	            return;
	        } 
	        catch (ClassNotFoundException c) 
	        {
	            System.out.println("Classe não encontrada!");
	            c.printStackTrace();
	            return;
	        }
		} else {
	        System.out.println("Arquivo inexistente.");
		}
    }

    public static void salvarArquivo() {
        System.out.println("Salvando arquivo...");
		if (!listaCadastros.isEmpty() ) {
	    	try
	        {
	            FileOutputStream arquivo = new FileOutputStream("arquivo.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(arquivo);
	            oos.writeObject(listaCadastros);
	            oos.close();
	            arquivo.close();
	            System.out.println("Arquivo salvo.");
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
		}
    }

    public static void incluirCadastro(Cadastro cadastro) {
    	listaCadastros.add(cadastro);
    }

    public static void listarCadastros() {
    	for (Cadastro registro : listaCadastros) {
    		System.out.println("Registro : "+registro.getNome() );
    	}
    }
}