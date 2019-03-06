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
  public void testmqsizezero() //It does not matter what e is since mq is ""
  {
  	when(mq.size()).thenReturn(0);
    	assertEquals(-1,c.countNumberOfOccurrences("")); 
  }
  @Test
  public void testmqcontainsnotE() // mq is any string that does not contain hakki itself
  {
  	when(mq.size()).thenReturn(5);
    	when(mq.contains("hakki")).thenReturn(false);
    	assertEquals(0,c.countNumberOfOccurrences("hakki"));
  }
  @Test
  public void testmqreturnscounter() // mq and e are Raiden string itself and I assumed that getAt works as a substring
  {
  	when(mq.size()).thenReturn(6);
    	when(mq.contains("Raiden")).thenReturn(true);
    	when(mq.getAt(0)).thenReturn("Raiden");
    	when(mq.getAt(1)).thenReturn("aiden");
    	when(mq.getAt(2)).thenReturn("iden");
    	when(mq.getAt(3)).thenReturn("den");
    	when(mq.getAt(4)).thenReturn("en");
    	when(mq.getAt(5)).thenReturn("n");
    	assertEquals(1,c.countNumberOfOccurrences("Raiden"));
  }
}
