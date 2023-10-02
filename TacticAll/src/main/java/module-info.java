module br.edu.fesa.tacticall {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.fesa.tacticall to javafx.fxml;
    exports br.edu.fesa.tacticall;
}
