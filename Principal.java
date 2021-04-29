
/**
 * Write a description of class Principal here.
 *
 * @rivegav
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Estimado usuario, por favor ingrese la cantidad de pisos");
        int pisos = scan.nextInt();
        System.out.println("Estimado usuario, por favor ingrese la cantidad de espacios");
        int espacios = scan.nextInt();
        
        Vehiculo.vehiculo = new Vehiculo [pisos][espacios];
        Sensor.sensores = new Sensor [pisos][espacios];
        
        
        for(int i = 0; i < pisos; i++){
            for(int j = 0; j < espacios; j++){
                Sensor.sensores[i][j] = new Sensor();
            }
        }
        
        Vehiculo.size = (espacios * pisos); 
        
         System.out.println("Escriba una opción para proseguir: ");
        System.out.println("Pulse 0, para salir del sistema");
        System.out.println("Pulse 1, para ver los sensores libres");
        System.out.println("Pulse 2, si desea parquear un vehiculo sin asegurarlo");
        System.out.println("Pulse 3, si desea parquear un vehiculo con aseguramiento");
        System.out.println("Pulse 4, para ver cuales vehiculos estan parqueados");
        System.out.println("Pulse 5, para ver cuantos vehiculos hay en el establecimiento");
        System.out.println("Pulse 6, para verificar el estado de un lugar en especifico");
        System.out.println("Pulse 7, para mostrar el estado de los sensores");
        System.out.println("Pulse 8, para filtar los vehiculos por color");
        System.out.println("Pulse 9, para mostrar vehiculos por valor comercial");
        int num = scan.nextInt();
        /**
         * Not finished faltan los casos y la repeticion del menu
         * Faltan multiples variables
         */
    }
}
                
        
        
        
       
       
        

