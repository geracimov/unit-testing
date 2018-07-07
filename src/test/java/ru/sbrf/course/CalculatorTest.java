package ru.sbrf.course;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@Category({SlowTests.class, FastTests.class})
@RunWith(Parameterized.class)
public class CalculatorTest {

    @Parameter
    public int a;

    @Parameter(1)
    public int b;

    @Parameter(2)
    public int expected;

    private Calculator calculator = new Calculator();


    @Parameters(name = "{index}: testMult[{0}, {1}] = {2}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {5, 2, 10},
                {1, 1, 1},
                {2, 1, 2}
        });
    }

    @Parameters(name = "{index}: testAdd({0}, {1}, {2})")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 2, 7},
                {1, 1, 2},
                {2, 1, 3}
        });
    }

    @Test
    public void testAdd() throws Exception {
        System.out.println("+++++++++++++++++");
        assertEquals(expected, calculator.add(a, b));
    }

    @Test
    public void testMult() throws Exception {
        System.out.println("-----------------");
        assertEquals(expected, calculator.mult(a, b));
    }

    private int aa;
    private int bb;
    private int ee;

    public void testAdd( int a, int b, int e ) {
        aa = a;
        bb = b;
        ee = e;
    }


}
