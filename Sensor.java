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
    
   public static String sensorLibre(){
        String available = "";
        for(int i=0;i<sensores.length;i++){
            for(int j=0;j<sensores[0].length;j++){
                if(sensores[i][j].getStatus()==0){
                    availabre += "En el piso "+i+", espacio "+j+" hay un lugar libre";
                }
            }
        }
        return available;
    }
    public static String sensoresStatus(){
        String available = "";
        for(int i=0;i<sensores.length;i++){
            for(int j=0;j<sensores[0].length;j++){
                available += "Piso: "+i+". Espacio: "+j+". "+Sensor.sensores[i][j].toString()+"\n";
            }
        }
        return available;
    }
   
}
