package maven_app;

import static org.junit.Assert.assertEquals;
//import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTest {


	@Test
	public void test() {

		List mockListObj = mock(List.class);
		
		when(mockListObj.size()).thenReturn(3);
		
		assertEquals(3,mockListObj.size());		
		
		}
	
}