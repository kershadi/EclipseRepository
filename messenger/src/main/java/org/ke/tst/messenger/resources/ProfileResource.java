package org.ke.tst.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ke.tst.messenger.model.Profile;
import org.ke.tst.messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	ProfileService profileService = new ProfileService();
	
    @GET
    public List<Profile> getProfiles() {
    	return profileService.getAllProfiles();       		
    }
    
    @POST
    public Profile addProfiles(Profile profile) {
    	return profileService.addProfile(profile);
    }
    	
    @PUT
    @Path ("/{ProfileName}")
    public Profile updateProfile(@PathParam("ProfileName") String profileName, Profile profile){
    	profile.setProfileName(profileName);
    	return profileService.updateProfile(profile);
    }
    
    @DELETE
    @Path ("/{ProfileName}")
    public void deleteMessage(@PathParam("ProfileName") String profileName)
    {
    	profileService.removeProfile(profileName); 
    }
    
    
    @GET 
    @Path ("/{ProfileName}")
    public Profile getProfile(@PathParam("ProfileName") String profileName)
    {
    	return profileService.getProfile(profileName);
    }
}
