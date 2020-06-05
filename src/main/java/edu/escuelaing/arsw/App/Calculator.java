package edu.escuelaing.arsw.App;

import edu.escuelaing.arsw.model.Reader;
import java.util.List;

/**
 *
 * @author Andres Gonzalez
 */
public class Calculator {
    
    /**
     * Calcula la media dada una lista de Doubles
     * @param lis lista de Doubles
     * @return el valor de la media como tipo Double
     */
    public Double mean(List<Double> lis ){
        Double sum=0.0;
        for(int i=0;i<lis.size();i++){
            sum+=lis.get(i);
        }
        Double ans = sum/lis.size();
        return ans;
    } 
    
    /**
     * Calcula la desviación estandar de la lista dada
     * @param lis lista de Doubles
     * @return el valor de la desviación estandar como tipo Double
     */
    public Double standardDesviation(List<Double> lis){
        Double avr=mean(lis);
        Double sum=0.0;
        for(int i=0;i<lis.size();i++){
            sum+=Math.pow(lis.get(i)-avr,2);
        }
        Double res=Math.sqrt(sum/(lis.size()-1));
        return res;
    }
    
    
    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("incorrect arguments.");
        }else{
            Reader r = new Reader();
            Calculator cal = new Calculator();
            List l = r.readinList(r.read(args[0]));
            
            Double m = cal.mean(l);
            Double d = cal.standardDesviation(l);
            
            System.out.println("Mean = "+m);
            System.out.println("Standard Desviation = "+d);
        }
    }
}
