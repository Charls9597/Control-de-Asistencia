package Conectar;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Materia;

public class ConectarMateria {

    Conexion cone = new Conexion();
    Connection con;

    public ArrayList recupera(ResultSet rs) {
        ArrayList<Materia> ldat = new ArrayList();
        try {
            while (rs.next()) {
                int id = rs.getInt("id_materia");
                String nombre = rs.getString("nombre");
                Materia mat = new Materia(id, nombre);
                ldat.add(mat);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }
        return ldat;
    }

    public ArrayList listado() {
        ArrayList<Materia> ldat = new ArrayList();
        String sql = "SELECT * FROM materia";
        try {
            con = cone.conecta();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            ldat = recupera(rs);
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }
        return ldat;
    }
}
