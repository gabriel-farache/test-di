package org.acme.security.keycloak.authorization;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/graphql2")
public class AdminResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String admin() {
    return "granted";
  }
}