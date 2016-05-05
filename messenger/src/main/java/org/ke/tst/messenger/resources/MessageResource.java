package org.ke.tst.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ke.tst.messenger.model.Message;
import org.ke.tst.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
    	return messageService.getAllMessages();       		
    }
    
    @GET 
    @Path ("{MessageID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("MessageID") long id)
    {
    	return messageService.getMessage(id);
    }
}