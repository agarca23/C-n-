import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class test {
	
	int n,i;
	
	@Before
	public void setUp(){
		n=0;
		i=3;
	}

	@Test
	public void test_n0() {
		assertEquals(1.0,main.iterSol(n),0.1);

	}
	
	@Test
	public void test_n3(){
		assertEquals(9.6,main.recurSol(i),0.1);
	}

}
