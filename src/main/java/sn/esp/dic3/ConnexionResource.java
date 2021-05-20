package sn.esp.dic3;

import org.json.JSONObject;
import org.json.JSONTokener;
import sn.esp.dic3.model.Commutateur;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;

/**
 * Root resource (exposed at "myresource" path)
 */

@Path("connection")
public class ConnexionResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response changerEtat(InputStream entity) {


        JSONTokener tokener = new JSONTokener(entity);
        JSONObject jsonObject = new JSONObject(tokener);
        // Traitement à faire transférer la requête avec le protocole RMI/Xml_RPC à la couche physique
        // jsonObject.getString("switchMac") // Recuperation adresse mac commutateur;
        // jsonObject.getString("laptopMac") // Recuperation adresse mac machine;
        // jsonObject.getString("portNumber") // Recuperation numéro de port;

        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("success", true);
        return Response.ok(jsonResponse.toString(), MediaType.APPLICATION_JSON).build();
    }
}
