package base;

import java.net.InetAddress;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class ConnectionGenius {

	private InetAddress ipa;

	public ConnectionGenius(InetAddress ipa) {
		this.ipa = ipa;
	}

	public InetAddress getIpa() {
		return ipa;
	}

	public void fireUpGame() {
		downloadWebVersion();
		connectToWebService();
		awayWeGo();
	}

	public void downloadWebVersion() {
		printMessage("Getting specialised web version.");
		printMessage("Wait a couple of moments");
	}

	public void connectToWebService() {
		printMessage("Connecting");
	}

	public void awayWeGo() {
		printMessage("Ready to play");
	}

	private void printMessage(String message) {
		System.out.println(message);
	}

}
