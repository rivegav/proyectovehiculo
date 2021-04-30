
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
        
        while(num!=0){
             case 1:
                            System.out.println(Sensor.sensorLibre());
                            break;
                        case 2:
                            System.out.println("Ingrese el piso y el espacio que desea parquear su vehiculo en: ");
                            int piso=scan.nextInt();
                            int espacio= scan.nextInt();
                            if(Vehiculo.cantidad<=Vehiculo.getSize()){
                                if(Sensor.sensores[piso][espacio].getStatus()==0){
                                    System.out.println("Ingrese por favor placa, marca y color");
                                    String placa = scan.next();
                                    String brand = scan.next();
                                    String color = scan.next();
                                    
                                    Vehiculo.vehiculo[piso][espacio] = new Vehiculo(placa, brand,color);
                                    Sensor.sensores[piso][espacio].setStatus(1);
                                    
                                    System.out.println(Vehiculo.vehiculo[piso][espacio]);
                                } else {
                                    System.out.println("El lugar está ocupado. Por favor elija otro espacio.");
                                }
                            } else {
                                System.out.println("El estacionamiento está lleno.");                        
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese el piso y el espacio que desea parquear su vehiculo en: ");                         
                            piso = scan.nextInt();
                            espacio = scan.nextInt();
                                
                            if(Vehiculo.cantidad<=Vehiculo.getTamaño()){
                                 if(Sensor.sensores[piso][espacio].getEstado()==0){
                                      System.out.println("Ingrese por favor placa, marca, color y valor comercial del vehículo.");
                                      String placa = scan.next();
                                      String brand = scan.next();
                                      String color = scan.next();
                                      int value = scan.nextInt();
                                        
                                      Vehiculo.vehiculo[piso][espacio]= new Vehiculo (placa, brand ,color,value);
                                      Sensor.sensores[piso][espacio].setStatus(1);
                                        
                                      System.out.println(Vehiculo.vehiculo[piso][espacio]);
                                } else {
                                    System.out.println("Lugar Ocupado. Por favor elija otro espacio.");
                                    }
                                } else {
                                    System.out.println("El estacionamiento está lleno.");
                            }
                            break;
                        case 4:
                            System.out.println(Vehiculo.toStringVehiculos());
                            break;
                        case 5:
                            System.out.println("Hay " +Vehiculo.size+ " vehículo(s) estacionado(s).");
                            break;
                        case 6:
                            System.out.println("Ingrese el piso y el espacio que desea verificar: ");
                            piso=scan.nextInt();
                            espacio= scan.nextInt();
                            if(Sensor.sensores[piso][espacio].getStatus()==0){
                                System.out.println("Estado: "+Sensor.sensores[piso][espacio].getStatus()+" (LIBRE)");
                            } else {
                                System.out.println("Estado: "+Sensor.sensores[piso][espacio].getStatus()+" (OCUPADO)");
                            }
                            break;
                        case 7:
                            System.out.println(Sensor.sensoresStatus());
                            break;
                            
                        case 8:
                            System.out.println("Ingrese el color a mostrar:");
                            String color = scan.next();
                            System.out.println(Vehiculo.vehiculosColor(color));
                            break;
                        case 9:
                            Vehiculo[] arr = Vehiculo.ordenadosValue(Vehiculo.vehiculo);
                            for(int i=0;i<Vehiculo.size;i++){
                                System.out.println(arr[i]);
                            }
                            break;
                        default:
                            System.out.println("Comando inválido. Por favor intente de nuevo");
                            break;
            }
                      System.out.println("Escriba una opción: ");
                      System.out.println("0. Salir del sitema.");
                      System.out.println("1. Sensores libres.");
                      System.out.println("2. Registrar parqueo de vehículo.");
                      System.out.println("3. Registrar parqueo de vehículo con valor comercial.");
                      System.out.println("4. Listar información vehículos que están parqueados.");
                      System.out.println("5. Mostrar cantidad vehículos que se han parqueado.");
                      System.out.println("6. Verificar estado de un lugar en el estacionamiento.");
                      System.out.println("7. Mostrar estado de sensores.");
                      System.out.println("8. Filtrar por color."); 
                      System.out.println("9. Mostrar vehículos por valor comercial.");
                      num = scan.nextInt();
        }
                System.out.println("Cerrando terminal...");
    }
}
      
                  

        
       
       
        

