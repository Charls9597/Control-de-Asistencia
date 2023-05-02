package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con = null;

    public Connection conecta() {
        String db = "jdbc:mysql://localhost:3306/asistencia";
        String users = "root";
        String clave = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(db, users, clave);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        return con;
    }

    public static void main(String a[]) {
        Conexion cone = new Conexion();
        Connection con;
        con = cone.conecta();
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Se conecto a la base almacen");
        } else {
            JOptionPane.showMessageDialog(null, "No Se conecto a la base almacen");
        }
    }
}
