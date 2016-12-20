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
public class Supermercado {
    
    Integer Id_Super;
    String Nombre_Super;
    String Direccion_Super;
    String Localidad_Super;
    String Provincia_Super;
    Integer Telefono_Super;
    String Email_Super;

    public String getEmail_Super() {
        return Email_Super;
    }

    public void setEmail_Super(String Email_Super) {
        this.Email_Super = Email_Super;
    }

    public Integer getId_Super() {
        return Id_Super;
    }

    public void setId_Super(Integer Id_Super) {
        this.Id_Super = Id_Super;
    }

    public String getNombre_Super() {
        return Nombre_Super;
    }

    public void setNombre_Super(String Nombre_Super) {
        this.Nombre_Super = Nombre_Super;
    }

    public String getDireccion_Super() {
        return Direccion_Super;
    }

    public void setDireccion_Super(String Direccion_Super) {
        this.Direccion_Super = Direccion_Super;
    }

    public String getLocalidad_Super() {
        return Localidad_Super;
    }

    public void setLocalidad_Super(String Localidad_Super) {
        this.Localidad_Super = Localidad_Super;
    }

    public String getProvincia_Super() {
        return Provincia_Super;
    }

    public void setProvincia_Super(String Provincia_Super) {
        this.Provincia_Super = Provincia_Super;
    }

    public Integer getTelefono_Super() {
        return Telefono_Super;
    }

    public void setTelefono_Super(Integer Telefono_Super) {
        this.Telefono_Super = Telefono_Super;
    }    
}
