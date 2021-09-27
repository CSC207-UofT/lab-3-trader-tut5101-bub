/*
 * This file contains sample JUnit test cases for Car.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CarTest {
    Car h;

    @Before
    public void setUp() throws Exception {
        h = new Car();
    }


    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(200, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(210, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(190, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, h.getPrice());
    }

}