/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

/**
 *
 * @author luis
 */
public class Cliente {
    
    Integer Id_Cliente;
    String Nombre_Cliente;
    String Apellido_Cliente;
    String Apodo_Cliente;
    String Super_Cliente;
    Integer Id_Super;
    String Email_Cliente;
    Integer NumTel_Cliente;

    public String getEmail_Cliente() {
        return Email_Cliente;
    }

    public void setEmail_Cliente(String Email_Cliente) {
        this.Email_Cliente = Email_Cliente;
    }

    public Integer getNumTel_Cliente() {
        return NumTel_Cliente;
    }

    public void setNumTel_Cliente(Integer NumTel_Cliente) {
        this.NumTel_Cliente = NumTel_Cliente;
    }

    public Integer getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(Integer Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getApellido_Cliente() {
        return Apellido_Cliente;
    }

    public void setApellido_Cliente(String Apellido_Cliente) {
        this.Apellido_Cliente = Apellido_Cliente;
    }

    public String getApodo_Cliente() {
        return Apodo_Cliente;
    }

    public void setApodo_Cliente(String Apodo_Cliente) {
        this.Apodo_Cliente = Apodo_Cliente;
    }

    public String getSuper_Cliente() {
        return Super_Cliente;
    }

    public void setSuper_Cliente(String Super_Cliente) {
        this.Super_Cliente = Super_Cliente;
    }

    public Integer getId_Super() {
        return Id_Super;
    }

    public void setId_Super(Integer Id_Super) {
        this.Id_Super = Id_Super;
    }    
}
