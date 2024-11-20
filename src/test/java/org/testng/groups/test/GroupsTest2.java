package org.testng.groups.test;

import org.testng.annotations.Test;

public class GroupsTest2 {

    @Test(groups = {"reg"})
    public void testGT2_M1() {
        System.out.println("GT2-M1");
    }

    @Test(groups = {"smoke"})
    public void testGT2_M2() {
        System.out.println("GT2-M2");
    }

    @Test(groups = {"smoke","reg"})
    public void testGT2_M3() {
        System.out.println("GT2-M3");
    }

}
