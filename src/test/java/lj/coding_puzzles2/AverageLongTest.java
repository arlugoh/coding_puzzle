package lj.coding_puzzles2;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AverageLongTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AverageLongTest( final String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AverageLongTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void test1()
    {
        Assert.assertEquals(naiveAverage(2L, 2L), AverageLong.average(2L, 2L));
        Assert.assertEquals(naiveAverage(1L, 3L), AverageLong.average(1L, 3L));
        Assert.assertEquals(naiveAverage(2L, 3L), AverageLong.average(2L, 3L));
        Assert.assertEquals(naiveAverage(-2L, -3L), AverageLong.average(-2L, -3L));
        Assert.assertEquals(naiveAverage(-2L, -2L), AverageLong.average(-2L, -2L));
        Assert.assertEquals(naiveAverage(1L, -2L), AverageLong.average(1L, -2L));
        Assert.assertEquals(naiveAverage(2L, -1L), AverageLong.average(2L, -1L));
        
        Assert.assertEquals(Long.MAX_VALUE, AverageLong.average(Long.MAX_VALUE, Long.MAX_VALUE));
        Assert.assertEquals(Long.MIN_VALUE, AverageLong.average(Long.MIN_VALUE, Long.MIN_VALUE));
    }
    
    public void test2()
    {
        Assert.assertEquals(naiveAverage(2L, 2L), AverageLong.average2(2L, 2L));
        Assert.assertEquals(naiveAverage(1L, 3L), AverageLong.average2(1L, 3L));
        Assert.assertEquals(naiveAverage(2L, 3L), AverageLong.average2(2L, 3L));
        Assert.assertEquals(naiveAverage(-2L, -3L), AverageLong.average2(-2L, -3L));
        Assert.assertEquals(naiveAverage(-2L, -2L), AverageLong.average2(-2L, -2L));
        Assert.assertEquals(naiveAverage(1L, -2L), AverageLong.average2(1L, -2L));
        Assert.assertEquals(naiveAverage(2L, -1L), AverageLong.average2(2L, -1L));
        
        Assert.assertEquals(Long.MAX_VALUE, AverageLong.average2(Long.MAX_VALUE, Long.MAX_VALUE));
        Assert.assertEquals(Long.MIN_VALUE, AverageLong.average2(Long.MIN_VALUE, Long.MIN_VALUE));
    }
    public static long naiveAverage(final long a, final long b){
        return (a+b)/2;
    }
}
