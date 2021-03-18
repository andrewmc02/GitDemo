package qaclickacademy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suitte()
    {
        return new TestSuite( AppTest.class );
        //new comment from person 2
        //and another comment after new branch Develop created
        
    }

    /**
     * Rigourous Test jkj:-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
