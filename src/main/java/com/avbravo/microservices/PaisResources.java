/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservices;

import com.avbravo.microservices.entity.Pais;
import com.avbravo.microservices.repository.PaisRepository;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
@Stateless
@Path("pais")
public class PaisResources {

    @Inject
    PaisRepository paisRepository;

    @GET
    @Path("{idpais}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Pais find(@PathParam("idpais") String idpais) {
        Pais pais = new Pais();
        try {
            List<Pais> list = paisRepository.findBy(new Document("idpais",idpais));
            if(!list.isEmpty()){
                pais= list.get(0);
                
            }
     
        } catch (Exception e) {
            System.out.println("Error find() " + e.getLocalizedMessage());
        }
        return pais;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }
}
