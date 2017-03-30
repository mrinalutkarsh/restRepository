package com.mrinal.jersey.first.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;

public class RestTest {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		String response = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		String plainResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class).toString();
		//String xmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class).toString();
		String htmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class).toString();
		
		System.out.println("response: "+response);
		System.out.println("plainResponse: "+plainResponse);
		//System.out.println("xmlResponse: "+xmlResponse);
		System.out.println("htmlResponse: "+htmlResponse);
	}

	private static URI getBaseURI() {
		
		return UriBuilder.fromUri("http://localhost:9090/Project_REST").build();
	}
}
