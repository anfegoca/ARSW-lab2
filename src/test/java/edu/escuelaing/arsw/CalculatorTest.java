package edu.escuelaing.arsw;


import edu.escuelaing.arsw.App.Calculator;
import edu.escuelaing.arsw.model.Reader;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
   
{
    private final Calculator cal = new Calculator();
    private final Reader rea = new Reader();
    private final String file1 = "prueba1.txt";
    private final String file2 = "prueba2.txt";

    @Test
    public void meanFile1(){
        List<Double> data = rea.readinList(rea.read(file1));
        Double mean = cal.mean(data);
        assertEquals(550.6, mean, 0.01);
        
    }
    @Test
    public void meanFile2(){
        List<Double> data = rea.readinList(rea.read(file2));
        Double mean = cal.mean(data);
        assertEquals(60.32, mean, 0.01);
    }
    @Test
    public void standardDesviationFile1(){
        List<Double> data = rea.readinList(rea.read(file1));
        Double mean = cal.standardDesviation(data);
        assertEquals(572.03, mean, 0.01);
    }
    @Test
    public void standardDesviationFile2(){
        List<Double> data = rea.readinList(rea.read(file2));
        Double mean = cal.standardDesviation(data);
        assertEquals(62.26, mean, 0.01);
    }
    @Test
    public void AppFile1(){
        try{
            String[] args = {file1};
            Calculator.main(args);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    @Test
    public void AppFile2(){
        try{
            String[] args = {file2};
            Calculator.main(args);
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
    
    
    
}
