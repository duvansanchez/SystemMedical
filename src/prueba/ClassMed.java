/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author Duvan
 */
public class ClassMed extends DataBase{
     
    private int numero_citas;
    private String area_encargada;
    private int num_consultorio;
    private String med_disp; //Medico Disponible
    
    ArrayList<ArrayList<Object>> datosMedOft = new ArrayList<ArrayList<Object>> ();
    ArrayList<ArrayList<Object>> datosMedOdon = new ArrayList<ArrayList<Object>> ();
    ArrayList<ArrayList> medDis = new ArrayList <ArrayList> (); //Matriz de medicos disponibles 
    
    
    int mesic;
    
    public ClassMed() {
        }     
    public ClassMed(String nombre,int identificacion, int edad, String sexo, int numDecitas, String areaEncargada, int numConsultorio) {
        super(nombre, identificacion, edad, sexo);
        this.numero_citas = numDecitas;
        this.area_encargada = areaEncargada;
        this.num_consultorio = numConsultorio;
    }

    ArrayList <Object> datosVec = new ArrayList <Object> ();
    
    public void  agregarDatosMed (String nombre,int identificacion, int edad, String sexo, int numDeCitas, String areaEncargada, int numConsultorio){
        
        ArrayList <Object> datosVec = new ArrayList <Object> (); //Sobreescribir el array con elementos 0
        
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setSexo(sexo);
        this.numero_citas = numDeCitas;
        this.area_encargada = areaEncargada;
        this.num_consultorio = numConsultorio;
                       
        datosVec.add(nombre);
        datosVec.add(identificacion);
        datosVec.add(edad);
        datosVec.add(sexo);
        datosVec.add(numDeCitas);
        datosVec.add(areaEncargada);
        datosVec.add(numConsultorio);
        
        if (areaEncargada.equals("Odontologia")){
            datosMedOdon.add(datosVec);   
        } else if (areaEncargada.equals("Oftamologia")){
            datosMedOft.add(datosVec);        
        }
        
    } 
           int conta = 10;
    public void asignarCita () {
        if (area_encargada.equals("Odontologia")) {
            check(datosMedOdon);
        } else if (area_encargada.equals("Oftamologia")){
            check(datosMedOft);
        }               
    }
   
    ArrayList vecMedDis = new ArrayList ();
    public void check (ArrayList<ArrayList<Object>> data){                
        for (int i = 0;  i < data.size(); i++){
                int numCitas = (Integer)data.get(i).get(4);
                if (numCitas < 5){ 
                    ArrayList vecMedDis = new ArrayList ();
                    
                    vecMedDis.add(data.get(i).get(0));
                    vecMedDis.add(String.valueOf(i));
                    medDis.add(vecMedDis);
                    
                }   
        }
        
       //Sacar medico disponible de manera aleatoria 
       int min = 0;

       int numAle = (int)Math.floor(Math.random()*(medDis.size()-1-min+1)+min);
       if (conta == numAle){
           while (conta == numAle){
               int num_Ale = (int)Math.floor(Math.random()*(medDis.size()-1-min+1)+min);
               conta = num_Ale;
           }
       }
       numAle = conta;
       System.out.println(numAle);       
       this.med_disp = String.valueOf(medDis.get(numAle).get(0)); 
       //datosMedOdon.get(mesic).set(4,+1);
    }
    
    public void mostrar (){
        //System.out.println(datosMedOft.size());
//        for (int i = 0; i < datosMedOdon.size(); i++){
//            for (int j = 0; j < datosMedOdon.get(i).size(); j++){
//            }
//      }
        //System.out.println(medDis.get(1));
        
        System.out.println(med_disp);
        
             
    } 
    
    public int getNumero_citas() {
        return numero_citas;
    }
    public void setNumero_citas(int numero_citas) {
        this.numero_citas = numero_citas;
    }

    public String getArea_encargada() {
        return area_encargada;
    }
    public void setArea_encargada(String area_encargada) {
        this.area_encargada = area_encargada;
    }

    public int getNumConsultorio() {
        return num_consultorio;
    }
    public void setNumConsultorio(int numConsultorio) {
        this.num_consultorio = numConsultorio;
    }
    
    public static void main(String[] args) {
      int min = 0;
      int max = 2;
      
      //Generate random int value from 50 to 100 
      System.out.println("Random value in int from "+min+" to "+max+ ":");
      
     
    
    }
    
    
/*
LECCIONES APRENDIDAS DURANTE EL PROCESO DE ESTE PROYECTO
    
--Posturas claves a la hora de solucionar un bug
   
    --Tener el codigo ordenado
        Contar con un codigo ordenado es clave a la hora de escribir codigo y solucionar bugs, hay que evitar comentarios innecesarios y siempre tratar 
        el codigo de una forma limpia esto evita ruido y agrega mas claridez a el momento de poder pensar y decidir 
    
--Estructuras de datos en java
        -- En java hay muchas clases para manejar estructuras de datos, cada una tiene sus funcionalidades en especifico pero hay cosas que por ahora no son entendibles
        en el metodo AgregarDatos tuve que usar la clase Vector y convertir ese vector en un array solo para poder limpiar luego de que el metodo finalizara, 
        ya que con clases como Collection,ArrayList se limpiaba primero el Array y finalmente no se agregaban los datos.
        
        -- En un array un objeto no puede estar acompañado de nada ni siquiera de otro objeto
        -- En un vector de la clase Vector un objeto solo puede estar acompañado de una cadena
    
--¿Por qué es obligatorio especificar el tipo de datos en Java?
Los tipos de datos son especialmente importantes en Java porque es un lenguaje fuertemente tipado . 
Esto significa que el compilador verifica el tipo de TODAS las operaciones para verificar la compatibilidad de tipos.
Las operaciones ilegales no serán compiladas. En la linea 43 se observa como esta definido como tipo Var la variable add esta misma cumpliendo
la funcion de agregar un "vector" a la matriz de arrays, sin la definicion de esta variable acompañado del tipo Var, esta ejecucion no fuera sido posible, 
esto por la sintaxis que maneja Java.    
    
-- En java no hay variables dinamicas ya que es un lenguaje de tipado fuerte    
-- Es de conocimiento que las clases abstractas son aquellas clases de las cual no se puede instanciar
y que sirve simplemente como base de otras clases que son clases concretas, un ejemplo de una clase concreta es esta.    
    
*/
    
    
}
