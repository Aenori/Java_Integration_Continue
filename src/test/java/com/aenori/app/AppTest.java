package com.aenori.app;

import static org.junit.Assert.assertTrue;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldAddMatrix()
    {
    	RealMatrix m1 = new Array2DRowRealMatrix(new double[][] {{1, 2}, {3, 4}});
    	RealMatrix m2 = new Array2DRowRealMatrix(new double[][] {{2, 3}, {-1, -2}});
    	
    	RealMatrix m3 = new Array2DRowRealMatrix(new double[][] {{3, 5}, {2, 2}});
    	
    	assertTrue(m3.subtract(App.addRealMatrix(m1, m2)).getNorm() < 1e-7);
    }
}
