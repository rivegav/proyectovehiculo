public class Sensor
{
   public static Sensor[][] sensores;
    private int status;
    
    public Sensor(int s){
        this.status =  s;
    }
    
    public int getStatus(){
        return status;
    }
    
    public void setStatus(int s){
        this.status = s;
    }
    
    public String toString(){
        String status = "";
        if(status == 1){
            status = "Estado 1. El lugar está ocupado";
        }
        else if(status == 0){
            status = "Estado 0. El lugar está ocupado";
        }
        return status;
    }
    
}
