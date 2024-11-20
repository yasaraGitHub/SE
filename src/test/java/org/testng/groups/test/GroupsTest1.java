package org.testng.groups.test;

import org.testng.annotations.Test;

public class GroupsTest1 {


    @Test(groups = {"smoke", "reg"})
    public void testGT1_M1() {
        System.out.println("GT1-M1");
    }

    @Test(groups = {"reg"})
    public void testGT1_M2() {
        System.out.println("GT1-M2");
    }

    @Test(groups = {"smoke"})
    public void testGT1_M3() {
        System.out.println("GT1-M3");
    }

    @Test
    public void testGT1_M4() {
        System.out.println("GT1-M4");
    }

    @Test(groups = {"reg"})
    public void testGT1_M5() {
        System.out.println("GT1-M5");
    }


}
