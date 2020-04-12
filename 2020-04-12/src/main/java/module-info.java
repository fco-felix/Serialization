module br.edu.fapce.formulario {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires javafx.base;

    opens br.edu.fapce.formulario to javafx.fxml;
    exports br.edu.fapce.formulario;
}