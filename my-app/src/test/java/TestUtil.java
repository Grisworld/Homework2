import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { 
	c = new Util(); 
  }

  @Test
  public void testlengthone() 
  { 
	assertTrue(!c.compute(5));
  }
  @Test
  public void testlengtheven() 
  { 
	assertTrue(!c.compute(10,20,30,40));
  }
  @Test (expected = RuntimeException.class)
  public void testzeroinarray()  //It does not matter how long the array is 
  { 
	assertTrue(c.compute(0,12,123,23,56,78,100));
  }
  
}
