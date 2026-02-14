package githubConnection.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cseDemoTest {

	cseDemo call = new cseDemo();
	
	@Test
	void test1() {
		int res = call.add(2, 3);
		assertEquals(5, res);
	}
	
//	@Test
//	void test2() {
//		int res = call.mul(2, 3);
//		assertEquals(6, res);
//	}
}
