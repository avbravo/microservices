/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservices;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author avbravo
 */
@ApplicationPath("rest")
public class ApplicationConfiguration extends Application{
      @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(com.avbravo.microservices.PaisResources.class);
        resources.add(com.avbravo.microservices.HolaMundoResource.class);
        resources.add(com.avbravo.microservices.TamanoResource.class);
             return resources;
    }
}
