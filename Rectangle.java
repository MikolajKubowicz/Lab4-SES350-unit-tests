//------------------------------------------------------
// Lab 4
// Written by: Mikolaj Kubowicz
// For SES350 Section ( (TuTh 1:30 - 3:00pm)) – Spring 2025
//--------------------------------------------------------


package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rectangle {
   private double length;
   private double width;

   public Rectangle(double length, double width) {
       this.length = length;
       this.width = width;
   }


   public double getArea() {
       return length * width;
   }
}