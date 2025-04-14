//------------------------------------------------------
// Lab 4
// Written by: Mikolaj Kubowicz
// For SES350 Section ( (TuTh 1:30 - 3:00pm)) – Spring 2025
//--------------------------------------------------------






package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    //This is going to be happy path
    @Test
    void testgetArea() {
        Rectangle rec = new Rectangle(3,4);
        assertEquals(12, rec.getArea());
    }

    //Sad path zero dimensions
    @Test
    void testGetArea_ZeroLength() {
        Rectangle rec = new Rectangle(0,5.0);
        assertEquals(0, rec.getArea());
    }

    @Test
    void testGetArea_ZeroWidth() {
        Rectangle rec = new Rectangle(3.0, 0);
        assertEquals(0.0, rec.getArea());
    }



    //  Sad Path: Negative dimensions
    @Test
    void testGetArea_NegativeLength() {
        Rectangle rec = new Rectangle(-3.0, 4.0);
        assertEquals(-12.0, rec.getArea());
    }


    @Test
    void testGetArea_NegativeWidth() {
        Rectangle rec = new Rectangle(3.0, -4.0);
        assertEquals(-12.0, rec.getArea());
    }



    @Test
    void testGetArea_NegativeLengthAndWidth() {
        Rectangle rec = new Rectangle(-3.0, -4.0);
        assertEquals(12.0, rec.getArea());
    }
}