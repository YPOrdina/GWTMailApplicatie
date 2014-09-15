package nl.ordina.yp.gwtmailapp.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>MailService</code>.
 */
public interface MailServiceAsync {
	void mailServer(String message, String sender, String recipient, AsyncCallback<String> callback) throws IllegalArgumentException;
}
