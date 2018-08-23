/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservices.repository;

import com.avbravo.ejbjmoordb.mongodb.repository.Repository;
import com.avbravo.microservices.entity.Tamano;
import com.avbravo.microservices.provider.MongoClientProvider;
import com.mongodb.MongoClient;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author avbravo
 */
@Stateless
public class TamanoRepository extends Repository<Tamano>{
  @EJB
MongoClientProvider MongoClientProvider;

    public TamanoRepository() {
        super(Tamano.class, "store","tamano");
    }

    @Override
    protected MongoClient getMongoClient() {
     return MongoClientProvider.getMongoClient();
    }

    @Override
    public Object findById(String key, String value) {
       return search(key,value); 
    }
    @Override
    public Object findById(String key, Integer value) {
        return search(key,value);
    }
  
}
