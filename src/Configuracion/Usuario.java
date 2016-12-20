/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

/**
 *
 * @author luis
 */
public class Usuario {

    private Integer Indentificador;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Poblacion;
    private String Provincia;
    private String FechaNac;
    private String Email;
    private Integer NumTel;
    private Integer CodPostal;
    private String Contrasena;
    private String Cargo;
    private String Pais;

    public Integer getIndentificador() {
        return Indentificador;
    }

    public void setIndentificador(Integer Indentificador) {
        this.Indentificador = Indentificador;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Integer getNumTel() {
        return NumTel;
    }

    public void setNumTel(Integer NumTel) {
        this.NumTel = NumTel;
    }

    public Integer getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(Integer CodPostal) {
        this.CodPostal = CodPostal;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
}
