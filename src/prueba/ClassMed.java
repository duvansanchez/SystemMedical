/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Duvan
 */
public class ClassMed extends DataBase{
     
    DataBase objectData = new DataBase();
    
    private int numero_citas;
    private String area_encargada;
    private int num_consultorio;
    ArrayList<ArrayList<Object>> datosMedOft = new ArrayList<ArrayList<Object>> ();
    ArrayList<ArrayList<Object>> datosMedOdon = new ArrayList<ArrayList<Object>> ();
    ArrayList <Object> datosVec = new ArrayList <Object> ();
    ArrayList<Object> medDis = new ArrayList<Object> ();
    
    public ClassMed() {
        }     
    public ClassMed(String nombre,int identificacion, int edad, String sexo, int numDecitas, String areaEncargada, int numConsultorio) {
        super(nombre, identificacion, edad, sexo);
        this.numero_citas = numDecitas;
        this.area_encargada = areaEncargada;
        this.num_consultorio = numConsultorio;
    }

    public void agregarDatosMed (String nombre,int identificacion, int edad, String sexo, int numDeCitas, String areaEncargada, int numConsultorio){
        
        objectData.setNombre(nombre);
        objectData.setEdad(edad);
        objectData.setSexo(sexo);
        this.numero_citas = numDeCitas;
        this.area_encargada = areaEncargada;
        this.num_consultorio = numConsultorio;
                       
        datosVec.add(nombre);
        datosVec.add(identificacion);
        datosVec.add(edad);
        datosVec.add(sexo);
        datosVec.add(numDeCitas);
        datosVec.add(areaEncargada);
        
        for (Object e: datosVec){
            System.out.println("");
        }
        if (areaEncargada.equals("Odontologia")){
            var add = datosMedOdon.add(datosVec );
        } else if (areaEncargada.equals("Oftamologia")){
            var add = datosMedOft.add(datosVec);    
        }
        /*Collection<Object> c = datosVec;
        datosVec.removeAll(c);*/
        
   
    } 
    
    Object var; //Variable que va a contener la identificacion del medico disponible para la asignacion de la cita
    public void asignarCita () {
         //Array de medicos disponibles
        if (area_encargada.equals("Odontologia")) {
            check(datosMedOdon);
        }                
    }
     
    public void check (ArrayList<ArrayList<Object>> data){
        /*for (int i = 0; i < data.size(); i++){
                int numCitas = (Integer)data.get(i).get(4);
                if (numCitas < 5){ 
                    medDis.add(data.get(i).get(1));
                    //int numAle = (int)(Math.random()*medDis.size());
                    //System.out.println(medDis.get(medDis.size()));
                    System.out.println(data.get(0));
                    System.out.println(data.get(1));
                    //var = medDis.get(numAle);
                }  
        }*/
       System.out.println(datosMedOdon.get(0));
                   
    }
    
    public void mostrar (){
        //System.out.println(datosMedOft.size());
            System.out.println(datosMedOdon.get(0));
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
    
/*
LECCIONES APRENDIDAS DURANTE EL PROCESO DE ESTE PROYECTO
    
--Posturas claves a la hora de solucionar un bug
   
    --Tener el codigo ordenado
        Contar con un codigo ordenado es clave a la hora de solucionar bugs, hay que evitar comentarios innecesarios y siempre tratar el codigo de una forma limpia
        esto evita ruido y agrega mas claridez a el momento de poder pensar y decidir 
    
    
    
--¿Por qué es obligatorio especificar el tipo de datos en Java?
Los tipos de datos son especialmente importantes en Java porque es un lenguaje fuertemente tipado . 
Esto significa que el compilador verifica el tipo de TODAS las operaciones para verificar la compatibilidad de tipos.
Las operaciones ilegales no serán compiladas. En la linea 43 se observa como esta definido como tipo Var la variable add esta misma cumpliendo
la funcion de agregar un "vector" a la matriz de arrays, sin la definicion de esta variable acompañado del tipo Var esta ejecucion no fuera sido posible, 
esto por la sintaxis que maneja Java.    
    
*/
    
    
}
