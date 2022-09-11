/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Duvan
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    Integer c = 0;
    
   private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
 
    



//        Array.add(39);
//        Array.add(59);
//        datosMedOft.add(Array);
//        //System.out.println(datosMedOft.get(0));
//        System.out.println(datosMedOft.get(0));
//        Collection<Integer> ce = Array;
//        Array.removeAll(ce);
//        System.out.println(Array.size());
        
        
        
        /*Array.add(42);
        Array.add(34);
        Collection<Integer> Sed = Array;
        Array.removeAll(Sed);
        System.out.println(datosMedOft.get(con));*/
       
        //System.out.println(Array.get(0));
        
        /*ArrayList <ArrayList<Object>> Matriz = new ArrayList <ArrayList<Object>> ();
        
        ArrayList <Object> Array = new ArrayList <Object> ();
        Array.add("Duvan");
        Array.add(0);
        Matriz.add(Array);
        
        ArrayList <Object> Array2 = new ArrayList <Object> ();
        Array2.add("Dernan");
        Array2.add(0);
         Matriz.add(Array2);
        
        ArrayList <Object> Array3 = new ArrayList <Object> ();
        Array3.add("Fernan");
        Array3.add(0);
        Matriz.add(Array3);
        
        ArrayList <Object> Array4 = new ArrayList <Object> ();
        Array4.add("Rodrigo");
        Array4.add(2);
        Matriz.add(Array4);

        ArrayList<Object> medDis = new ArrayList<Object> (); //Array de medicos disponibles
        Object var = ""; //Variable que va a contener el nombre del medico de la asignacion de la cita
        for (int i = 0; i < Matriz.size(); i++ ){
            int numCitas = (Integer)Matriz.get(i).get(1); 
            if (numCitas < 5){ 
                medDis.add(Matriz.get(i).get(0));
                //Numero ramdom
                int numAle = (int)(Math.random()*medDis.size());
                var = medDis.get(numAle);
            }            
        }*/

////        ClassPac objectPac = new ClassPac ();
        ClassMed objectMed = new ClassMed ();
        
        //objectMed.agregarDatosMed("Sebastian",22323323,28,"Mas",2,"Oftamologia",11);
        objectMed.agregarDatosMed("Duvan",243353535,17,"Mas",0,"Odontologia",10);
        objectMed.agregarDatosMed("Fernanda",34343435,23,"FEM",0,"Odontologia",20); 
        objectMed.agregarDatosMed("Sebas",22323323,28,"Mas",0,"Odontologia",13);
            
        objectMed.asignarCita();
        objectMed.asignarCita();
        objectMed.asignarCita();
        
        
        
        objectMed.mostrar();   

        

   }
        
}
