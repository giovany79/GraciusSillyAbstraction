package co.com.gcode.model;

public class Rectangle{
   private int width;
   private int height;
   
   public Rectangle(int width, int height){
     this.width = width;
     this.height = height;
   }
   public int calculateArea(){
     return width * height;
   } 

   public int calculateArea(int width, int height){
     return width * height; 
   }
}