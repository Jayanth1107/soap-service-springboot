package com.jayanth.soapservicespringboot.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.jayanth.soapservicespringboot.service.UserService;
import com.jayanth.soapservicespringboot.sources.GetUserRequest;
import com.jayanth.soapservicespringboot.sources.GetUserResponse;

@Endpoint
public class UserEndpoint {
	
	@Autowired
	private UserService userService;
	
	@PayloadRoot(namespace="http://soap-example.org/soap-example",
			localPart="getUserRequest")
	@ResponsePayload
	public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
		GetUserResponse response = new GetUserResponse();
		response.setUser(userService.getUsers(request.getName()));
		return response;
	}

}
