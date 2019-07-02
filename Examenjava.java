package examenjavalina;
import java.util.*;
public class Examenjavalina {
     public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<Float> velocidad = new ArrayList<Float>();
        ArrayList<Float> tiempo = new ArrayList<Float>();
        int opc = 1, mt=0;
        float set=0;
        
        while (opc != 0) {           
            System.out.print("Digite el nombre del estudiante: ");
            nombre.add(leer.next());
            System.out.print("Digite la velocidad del estudiante(0 para salir):");
            opc = leer.nextInt();
            if(opc != 0){
                velocidad.add((float) opc);
                tiempo.add(100 / velocidad.get(velocidad.size()-1));
                set = set + tiempo.get(tiempo.size()-1);
            }
        }
        
       set = set / tiempo.size();
        
        int i=0, cont=0;
        for(; i<velocidad.size(); i++){
            
            if(velocidad.get(i)>velocidad.get(mt)){
                mt = i;
            }
            if(tiempo.get(i)>set){
                cont++;
            }
            
            System.out.println(nombre.get(i) + " " + velocidad.get(i) + " " + tiempo.get(i));
        } 
        
        System.out.println("Alumno mas veloz: " + nombre.get(mt) + "  "+"Tiempo: " + tiempo.get(mt) +"  "+"Velocidad: " + velocidad.get(mt));
        System.out.println("Promedio: " + set);
        System.out.println("Estudiantes por encima del promedio: " + cont);
    }
    
}
