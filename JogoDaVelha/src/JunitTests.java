import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTests {
	
	@Test
	public void JunitMethod(){
		System.out.print("Executing Junit");
		assertEquals(2,1+3);
	}

}
