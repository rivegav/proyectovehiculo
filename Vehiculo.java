
public class Vehiculo
{
    public static Vehiculo[][] vehiculo;
    public static int size = 0;
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
        
}
