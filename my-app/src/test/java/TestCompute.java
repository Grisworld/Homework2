import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class TestCompute {
  private Compute c;
  private MessageQueue mq;
  
  @Before
  public void initialize()
  {
	mq=mock(MessageQueue.class);
	c=new Compute(mq);
  }
  @Test
  public void testmqsizezero() //It does not matter what e is 
  {
  	when(mq.size()).thenReturn(0);
    	assertEquals(-1,c.countNumberOfOccurrences("")); 
    
    
  }
}
