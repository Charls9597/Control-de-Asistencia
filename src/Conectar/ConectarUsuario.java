package Conectar;

import java.util.ArrayList;
import modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConectarUsuario {

    Conexion cone = new Conexion();
    Connection con;

    public ArrayList recupera(ResultSet rs) {
        ArrayList<Usuario> ldat = new ArrayList();
        try {
            while (rs.next()) {
                int id = rs.getInt("id_usuario");
                String nombre1 = rs.getString("nombre1");
                String nombre2 = rs.getString("nombre2");
                String apPaterno = rs.getString("apPaterno");
                String apMaterno = rs.getString("apMaterno");
                String user = rs.getString("user");
                String pass = rs.getString("pass");
                int rol = rs.getInt("rol");

                Usuario duser = new Usuario(id,nombre1,nombre2,apPaterno,apMaterno, user, pass,rol);
                ldat.add(duser);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error:" + e.getMessage());
        }
        return ldat;
    }

    public ArrayList verifica(String us, String cla) {
        ArrayList<Usuario> ldat = new ArrayList();
        try {
            String sql = "select * from usuario where user='" + us + "' and pass='" + cla + "' ";
            con = cone.conecta();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            ldat = recupera(rs);
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error:" + e.getMessage());
        }
        return ldat;
    }
}
