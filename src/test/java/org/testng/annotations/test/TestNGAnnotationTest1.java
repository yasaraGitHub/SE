package org.testng.annotations.test;


import org.testng.annotations.Test;

public class TestNGAnnotationTest1 {


    public static void main(String[] args)
    {
        System.out.println("Print 1");
        TestNGAnnotationTest1 x = new TestNGAnnotationTest1();
        x.print();
    }

    public void print()
    {
        System.out.println("Print 2");
    }

    @Test
    public void print2()
    {
        System.out.println("Print 3");
    }

}
