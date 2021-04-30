
public class Vehiculo
{
    public static Vehiculo[][] vehiculo;
    public static int size;
    public static int quantity = 0;
    private String brand;
    private String color;
    private String placa;
    private int value;
    
    public Vehiculo(){
    }
    
    public Vehiculo(String p, String b, String c, int v){
        this(p, b, c, 30000000);
    }
    
    public Vehiculo(String p, String b, String c, int v){
        size++;
        this.placa = p;
        this.brand = b;
        this.color = c;
        this.value = v;
    }
    public void setPlaca(String p){
        this.placa = p;
    }
    public void setBrand(String b){
        this.brand = b;
    } 
    public void setColor(String c){
        this.Color = c;
    }
    public void setValue(int v){
        this.value = v;
    }
    public String getPlaca(){
        return this.placa;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public int getValue(){
        return this.value; 
    }
    public static int getsize(){
        return s; 
    }
    
     public String toString(){
             return "Placa: " + this.placa +". Marca: " +this.brand+ ". Color: " +this.color+ ". Valor: "+ this.value;
         }
     
         public static String toStringVehiculos(){ 
             String h="";
             for (int i=0;i<vehiculo.length ;i++) {
                 for(int j=0;j<vehiculo[i].length;j++) {
                     if(vehiculo[i][j]!=null){
                         h+="Placa: "+ vehiculo[i][j].placa+ ". Marca: "+vehiculo[i][j].brand+ ". Color: "+vehiculo[i][j].color+ ". Valor: " +vehiculo[i][j].value+"\n";
                        }else{
                         continue;
                     }
                }
            }
             return h;
             }
         public static int quantityVehiculos(){
             return quantity;
         }
         public static String vehiculosColor(String c){
             String text="";
             
             for(int i=0; i< vehiculo.length;i++){
                 for(int j=0;j<vehiculo[i].length;j++) {
                     if((Sensor.sensores[i][j].getEstado()==1)&&(vehiculo[i][j].color.equalsIgnoreCase(c))){
                         text+=vehiculo[i][j].toString()+". Piso: "+i+". Espacio: "+j+"\n";
                     }
                 }
             }
             return text;
         }
         public static Vehiculo[] ordenadosValor(Vehiculo[][] ref){
             Vehiculo[]A = new Vehiculo[Vehiculo.quantity];
             Vehiculo aux = new Vehiculo();
             int c=0;
             for (int i=0; i<ref.length;i++) {
                 for(int j=0;j<ref[0].length;j++) {
                     if(Vehiculo.vehiculo[i][j]!=null) {
                         A[c] = ref[i][j];
                         c++;
                     }                     
                 }         
             }
             for (int i = 0; i < A.length - 1; i++) {
                 for (int j = 0; j < A.length - i - 1; j++) {
                     if (A[j + 1].getValue() < A[j].getValue()) {
                         aux = A[j + 1];
                         A[j + 1] = A[j];
                         A[j] = aux;
                        }
                    }
                }
             
             return A;
         }
    }

}
