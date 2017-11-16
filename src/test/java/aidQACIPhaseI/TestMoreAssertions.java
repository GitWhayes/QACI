package aidQACIPhaseI;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import org.hamcrest.junit.ErrorCollector;
import org.junit.Rule;

import static org.hamcrest.Matchers.*;


public class TestMoreAssertions {

   
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	
//	private String result;

	@Test
	public void testAssertions() {
		
	System.out.println("\nTesting More Assertions test case.");
    //test data
    String str1 = new String ("abc");
    String str2 = new String ("abc");
    String str3 = null;
    String str4 = "abc";
    String str5 = "WDH";
		
    int val1 = 50;
    int val2 = 6;

    String[] expectedArray = {"one", "two", "three"};
    String[] resultArray =  {"one", "three", "three"};

    System.out.println("\nCheck that two objects are equal");
    assertEquals(str1, str2);

    System.out.println("\nCheck that a condition is true");
    assertTrue (val1 < val2);

    //Check that a condition is false
    assertFalse(val1 > val2);

    //Check that an object isn't null
    assertNotNull(str1);

    //Check that an object is null
    assertNull(str3);

    //Check if two object references point to the same object
    assertSame(str4,str5);

    //Check if two object references not point to the same object
    assertNotSame(str1,str3);

    //Check whether two arrays are equal to each other.
    assertArrayEquals(expectedArray, resultArray);
	
	}
	
    @Test
    public void testGetTheStringArray() {
        System.out.println("\nIn Get the String Array method");
        String[] whArray = {"Harmony", "Unity", "Freddy", "Janae", "Markus", "Wanda"};
        String[] expectedArray = {"one", "two", "three"};

       System.out.println("Expected " + expectedArray[2] + " whArray[5] " + whArray.toString());
        assertArrayEquals(expectedArray, whArray);

    }
    

    @Test
    public void calculatedValueShouldEqualExpected() throws Exception {
    	System.out.println("\nIn calculatedValueShouldEqualExpected");
    	int otherval2;
		int otherval1;
		otherval1 = 8;
		otherval2 = 14;
    	try {
 			assertTrue(otherval1 > otherval2);

        } catch (Throwable t) {
           //collector.addError(t);
           //collector.toString();
           
        	System.out.println(t);
          //  System.out.println(collector.toString());
			fail("This test failed message - WH");
          //  assertEquals(otherval1 + " is less than " + otherval2, t.getMessage());
        }
    }
}
