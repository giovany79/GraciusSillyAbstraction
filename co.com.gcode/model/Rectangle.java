package co.com.gcode.model;

public class Rectangle extends Shape{
   
   private int width;
   private int height;
   
   public Rectangle(int width, int height){
     this.width = width;
     this.height = height;
   }
   public double calculateArea(){
     return width * height;
   } 

  public double calculatePerimeter(){
    return (width*2)+ (height*2) ;
  }
}