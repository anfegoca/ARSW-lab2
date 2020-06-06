package edu.escuelaing.arsw;


import edu.escuelaing.arsw.App.Calculator;
import edu.escuelaing.arsw.model.Reader;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


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
    public void AppFile1(){
        try{
            String[] args = {file1};
            Calculator.main(args);
            assertTrue(true);
        }catch(Exception e){
            System.out.println(e);
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
