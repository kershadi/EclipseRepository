package org.ke.tst.messenger.database;

import java.util.HashMap;
import org.ke.tst.messenger.model.*;
import java.util.Map;

import org.eclipse.persistence.tools.profiler.Profile;
import org.ke.tst.messenger.model.Message;
import org.ke.tst.messenger.model.*;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, org.ke.tst.messenger.model.Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, org.ke.tst.messenger.model.Profile> getProfiles(){
		return profiles;
	}

}
