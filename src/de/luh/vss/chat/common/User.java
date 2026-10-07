package de.luh.vss.chat.common;

import java.net.SocketAddress;

public class User {

	private final UserIdentifier userId;
	private final SocketAddress endpoint;

	public User(UserIdentifier userId, SocketAddress endpoint) {
		this.userId = userId;
		this.endpoint = endpoint;
	}

	public UserIdentifier getUserIdentifier() {
		return userId;
	}

	public SocketAddress getEndpoint() {
		return endpoint;
	}

	public record UserIdentifier(int id) {
		public static UserIdentifier BROADCAST = new UserIdentifier(0);
		
		public UserIdentifier(int id) {
			// Use your own user ID (ErgebnisPIN) exclusively to initiate and pass the tests; otherwise the actions will be performed for a different user.
			if (id < 0 || id > 9999)
				throw new IllegalArgumentException("wrong user ID");
			this.id = id;
		}

	}

}
