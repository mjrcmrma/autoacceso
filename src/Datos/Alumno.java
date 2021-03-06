/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import dao.DAOFactory;
import dao.SQL;
import dao.AlumnoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAERON
 */
public class Alumno implements Bean {
    private String matricula;
    private String nombreAlumno;
    private String apPaterno;
    private String apMaterno;
    
    public Alumno(String matricula,String nombreAlumno, String apPaterno, String apMaterno){
        this.matricula = matricula;
        this.nombreAlumno = nombreAlumno;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public Alumno() {
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    /**
     * @return the nombreAlumno
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * @param nombreAlumno the nombreAlumno to set
     */
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    /**
     * @return the apPaterno
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * @param apPaterno the apPaterno to set
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    /**
     * @return the apMaterno
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * @param apMaterno the apMaterno to set
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

}
