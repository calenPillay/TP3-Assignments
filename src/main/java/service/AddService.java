/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

/**
 *
 * @author Calen
 */
public interface AddService 
{
    int add(int a,int b);//testing for integer assertions
    float subtract (float a, float b);//Testing for floating point assertions
    int divide (int a, int b);//Asserting object equality
    String compare (String a, String b);//Asserting Object Identity
    boolean trueTest(boolean a);//Asserting truth test
    boolean falseTest(boolean a);//Asserting falsity test
    public String checkNull(String a);//Asserting Null test
    public String checkNotNull(String a);//Asserting NotNull Test
    
}
