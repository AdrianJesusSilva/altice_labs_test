package test.altice.labs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import test.altice.labs.logic.LabSeqLogic;
import test.altice.labs.model.OutPut;

@Path("/labseq")
public class LabSeqResource {

    @GET
    @Path("/{index:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getValue(Integer index){
        ObjectMapper om = new ObjectMapper();
        OutPut output = LabSeqLogic.getValueByIndex(index);
        String body = "";
        try {
            body = om.writeValueAsString(output);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return Response.ok(body).build();
    }

}
