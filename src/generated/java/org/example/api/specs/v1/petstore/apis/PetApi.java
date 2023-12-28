package org.example.api.specs.v1.petstore.apis;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/pets/hello")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface PetApi {

    @GET
    @Produces({ "text/plain" })
    Response getPetsGreeting();

}
