package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Coneccion {

    Connection conectar;

    public Connection getConectar() {
        String url = "jdbc:mysql://localhost:3306/asistenciadb";
        String usuario = "root";
        String clave = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conectar;
    }
}
