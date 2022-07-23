module com.sgn.sgn_bot {
    requires javafx.controls;
    requires javafx.fxml;
    requires net.dv8tion.jda;
    requires dotenv.java;
    requires org.jetbrains.annotations;


    opens com.sgn.sgn_bot to javafx.fxml;
    exports com.sgn.sgn_bot;
}