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
public class AddServiceImpl implements AddService {
    @Override
     public int add(int a, int b)
    {
        return a+b;
    }
     
     @Override
     public float subtract(float a, float b)
     {
         return a-b;
     }
     
     @Override
     public int divide(int a, int b)
     {
         return a/b;
     }
     
     @Override
     public String compare(String a, String b)
     {
         a="Oranges";
         b="Apples";
         
         if (a==b)
         {
             return "A is the same as B";
         }
         else
         {
             return "A is not the same as B";
         }
         
     }
     
     @Override
      public boolean trueTest(boolean a)
     {
         if (a=true)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
      
      public boolean falseTest(boolean a)
      {
          if(a=false)
          {
              return false;
          }
          else
          {
              return true;
          }
      }
      
      public String checkNull(String a)
      {
         return a;
      }
      
      public String checkNotNull(String a)
      {
          return a;
      }
    }
