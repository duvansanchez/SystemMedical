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
public class ClassPac extends DataBase{

DataBase objetoData = new DataBase ();        
ArrayList<ArrayList<Object>> datosPac = new ArrayList<ArrayList<Object>> ();
ArrayList<Object> datosVec = new ArrayList<Object> ();   //Definir Array sin un tipo en especifico 
private int peso;
private int altura;
private String tipoCita;

public ClassPac(){
    
}
public ClassPac(String nombre,int identificacion, int edad, String sexo, int peso, int altura, String tipoCita) {
    super(nombre,identificacion,edad, sexo);
    this.peso = peso;
    this.altura = altura;
    this.tipoCita = tipoCita;
}

public void agregarDatos (String nombre,int identificacion ,int edad, String sexo, int peso, int altura, String tipoCita){   
    ClassPac objectClass = new ClassPac (nombre,identificacion,edad,sexo,peso,altura,tipoCita); 
    datosVec.add(nombre +" "+edad+" "+sexo+" "+peso+" "+altura+" "+tipoCita);  
    datosPac.add(datosVec);
}
public void mostrar (){
    /*for(int i = 0; i < datosPac.size(); i++){
            for (int j = 0; j < datosPac.get(i).size(); j++){
                System.out.println(datosPac.get(i).get(j));
            }
        }*/
}


public int getPeso() {
    return peso;
}
public void setPeso(int peso) {
    this.peso = peso;
}

public int getAltura() {
    return altura;
}
public void setAltura(int altura) {
    this.altura = altura;
}

public String getTipoCita() {
    return tipoCita;
}
public void setTipoCita(String tipoCita) {
    this.tipoCita = tipoCita;
}
   

}
