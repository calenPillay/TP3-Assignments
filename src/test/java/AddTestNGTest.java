/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.AddService;
import service.AddServiceImpl;

/**
 *
 * @author Calen
 */
public class AddTestNGTest {
   
    //private static AddService addService;
    private static  AddService service;

     
    @Test//Integer test
    public void testAdd() throws Exception{
    int total = service.add(3,5);
    Assert.assertEquals(total, 8, "Sum Of The Two Numbers is: "+total);
    }
    
    @Test //Floating point assertion test
    public void testSubtract() throws Exception{
    float total =service.subtract(5,3);
    Assert.assertEquals(total, 2,2, "The difference of the two numbers is:"+total);
    }
    
    @Test//Asserting object equality test
    public void testDivide() throws Exception{
        int total = service.divide(9, 3);
        Assert.assertEquals(total, 3,"The two numbers divided is"+total);
    }
    
    @Test //Asserting comparison test
    public void testCompare() throws Exception{
        service.compare("Apples", "Oranges");
        String g="Donkey";
        Assert.assertNotSame(g, service);
        Assert.assertSame(service, service);
    }
    
    @Test //Asserting the true test
    public void testTrue()throws Exception{
        service.trueTest(true);
        boolean a=true;
        Assert.assertTrue(a);
    }
    
    @Test //Asserting false test
    public void testFalse()throws Exception{
        service.falseTest(false);
        boolean a=false;
        Assert.assertFalse(a);
    }
    
    @Test //Checking if an answer is NULL
    public void testNullCheck() throws Exception{
       String a=  service.checkNull(null);
        Assert.assertNull(a);
    }
    
    @Test //Checking if an answer is not null
    public void testNotNullCheck() throws Exception{
        String a=service.checkNotNull("Dog");
        Assert.assertNotNull(a);
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
     service= new AddServiceImpl();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
