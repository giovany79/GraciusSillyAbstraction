package co.com.gcode.model;

import java.lang.Math.*;

public class Circle extends Shape{

  private int radius;
   
   public Circle(){

   }

   public Circle(int radius){
     this.radius = radius;
   }
   
   public double calculateArea(){
     return Math.PI * radius * radius;
   } 
   
   public double calculatePerimeter(){
     return 2 * Math.PI * radius;
   } 

   public void setRadius(int radius){
     this.radius = radius;
   }
}