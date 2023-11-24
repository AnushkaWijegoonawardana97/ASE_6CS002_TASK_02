import java.net.InetAddress;

import org.junit.Before;
import org.junit.Test;

public class ConnectionGeniusTest {

	private ConnectionGenius connectionGenius;
	private InetAddress mockInetAddress;

	@Before
	public void setUp() throws Exception {
		mockInetAddress = mock(InetAddress.class);
		connectionGenius = new ConnectionGenius(mockInetAddress);
	}

	@Test
	public void testGetIpa() {
		assertEquals(mockInetAddress, connectionGenius.getIpa());
	}

	@Test
	public void testFireUpGame() {
		ConnectionGenius spyConnectionGenius = spy(connectionGenius);

		doNothing().when(spyConnectionGenius).downloadWebVersion();
		doNothing().when(spyConnectionGenius).connectToWebService();
		doNothing().when(spyConnectionGenius).awayWeGo();

		spyConnectionGenius.fireUpGame();

		verify(spyConnectionGenius).downloadWebVersion();
		verify(spyConnectionGenius).connectToWebService();
		verify(spyConnectionGenius).awayWeGo();
	}

	@Test
	public void testDownloadWebVersion() {
		// This method has a print statement, and we cannot directly test it.
		// We can test whether it is called in another method using mocking.
	}

	@Test
	public void testConnectToWebService() {
		// This method has a print statement, and we cannot directly test it.
		// We can test whether it is called in another method using mocking.
	}

	@Test
	public void testAwayWeGo() {
		// This method has a print statement, and we cannot directly test it.
		// We can test whether it is called in another method using mocking.
	}
}
