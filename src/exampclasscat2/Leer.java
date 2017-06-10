package exampclasscat2;
import java.io.*;
public class Leer {
    public static String dato(){
        String sdato="";
        try{
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            sdato=bf.readLine();
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        return sdato;
    }

    
    public static short datoShort(){
        try{
            return Short.parseShort(dato());
        }catch (NumberFormatException e){
            return Short.MIN_VALUE;
        }
    }
    public static int datoInt(){
        try{
            return Integer.parseInt(dato());
        }catch (NumberFormatException e){
            return Integer.MIN_VALUE;
        }
    }

}
