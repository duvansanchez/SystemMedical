/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class DataBase {
    
   private String nombre;
   private int edad;
   private String sexo;
   private int identificacion;

    public DataBase() {
    }

    public DataBase(String nombre, int identificacion, int edad, String sexo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
}
