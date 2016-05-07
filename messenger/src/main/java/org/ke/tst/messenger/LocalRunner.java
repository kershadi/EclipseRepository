package org.ke.tst.messenger;

import org.ke.tst.messenger.model.Profile;
import org.ke.tst.messenger.service.ProfileService;

public class LocalRunner {

	public static void main(String[] args) {
		ProfileService profileService = new ProfileService();
		
		System.out.println("Profile name: "+ profileService.getAllProfiles().get(0).getProfileName());
		Profile profile = new Profile("ksadr", "kamelia", "sadr");
		profileService.addProfile(profile);
		System.out.println("Profile name: "+ profileService.getAllProfiles().get(1).getProfileName());
		
		System.out.println("End!");
	}

}
