package org.ke.tst.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ke.tst.messenger.database.DatabaseClass;
import org.ke.tst.messenger.model.Message;
import org.ke.tst.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService()
	{
		profiles.put("kershadi", new Profile("kershadi", "kouros", "ershadi"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName)
	{
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile)
	{
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile)
	{
		if (profile.getProfileName().isEmpty())
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(Profile profile)
	{
		return profiles.remove(profile.getProfileName());
	}
	
	public Profile removeProfile(String profileName)
	{
		return profiles.remove(profileName);
	}
}
