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

import org.ke.tst.messenger.model.Message;
import org.ke.tst.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService messageService = new MessageService();
	
    @GET
    public List<Message> getMessages() {
    	return messageService.getAllMessages();       		
    }
    
    @POST
    public Message addMessages(Message message) {
    	return messageService.addMessage(message);
    }
    	
    @PUT
    @Path ("{MessageID}")
    public Message updateMessage(@PathParam("MessageID") long id, Message message){
    	message.setId(id);
    	return messageService.updateMessage(message);
    }
    
    @DELETE
    @Path ("{MessageID}")
    public void deleteMessage(@PathParam("MessageID") long id)
    {
    	messageService.removeMessage(id); 
    }
    
    
    @GET 
    @Path ("{MessageID}")
    public Message getMessage(@PathParam("MessageID") long id)
    {
    	return messageService.getMessage(id);
    }
}