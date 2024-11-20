package org.testng.groups.test;

import org.testng.annotations.Test;

public class GroupsTest3 {

    @Test(groups = {"smoke"})
    public void testGT3_M1() {
        System.out.println("GT3-M1");
    }

    @Test
    public void testGT3_M2() {
        System.out.println("GT3-M2");
    }

    @Test(groups = {"reg"})
    public void testGT3_M3() {
        System.out.println("GT3-M3");
    }

    @Test(groups = {"reg"})
    public void testGT3_M4() {
        System.out.println("GT3-M4");
    }

}
