 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrongo
 */
public class Fibonacci {
    public static void main(String args[]){
         int n1=0,n2=1,n3,i,count=13;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2; 
 if(n3<=100){
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3; 
  }  
 }    
  
}}  
