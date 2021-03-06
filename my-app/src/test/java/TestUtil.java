import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  private Util c;

  @Before
  public void setUp() { 
	c = new Util(); 
  }

  @Test
  public void testlengthone() // It does not matter the value is
  { 
	assertTrue(!c.compute(5));
  }
  @Test
  public void testlengtheven() // It does not matter what values are
  { 
	assertTrue(!c.compute(10,20,30,40));
  }
  @Test (expected = RuntimeException.class)
  public void testzeroinarray()  //It does not matter how long the array is 
  { 
	assertTrue(c.compute(0,12,123,23,56,78,100));
  }
  @Test
  public void testsumisdividableofoneelement() // Now length and values are important
  { 
	assertTrue(c.compute(3,10,2,5,7));
  }
  @Test
  public void testsumisnotdividableofoneelement() // Now length and values are important
  { 
	assertTrue(!c.compute(2,13,4));
  }
	
}
