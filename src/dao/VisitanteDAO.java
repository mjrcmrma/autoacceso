/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Datos.Bean;
import Datos.Visitante;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel
 */
public class VisitanteDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
//        throw new UnsupportedOperationException("Not supported yet.");
        Visitante visitante =  (Visitante) bean;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int a = 0;
        try {
            ps = conexion.prepareStatement(SQL.insertarVisitante, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, visitante.getNombre());
            ps.setString(2, visitante.getProcedencia());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            while(rs.next()){
                a = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VisitanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        Visitante visitor = new Visitante();
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conexion.prepareStatement(SQL.findVisitante);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            visitor.setNombre(rs.getString("NombreVisitante"));
            visitor.setProcedencia(rs.getString("Procedencia"));
        } catch (SQLException ex) {
            Logger.getLogger(VisitanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Bean) visitor;
    }    
}
