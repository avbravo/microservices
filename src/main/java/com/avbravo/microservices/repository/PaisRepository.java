/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservices.repository;

import com.avbravo.ejbjmoordb.mongodb.repository.Repository;
import com.avbravo.microservices.entity.Pais;
import com.avbravo.microservices.provider.MongoClientProvider;
import com.mongodb.MongoClient;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author avbravo
 */
@Stateless
public class PaisRepository extends Repository<Pais> {

    @Inject
    MongoClientProvider mongoClientProvider;

    @Override
    protected MongoClient getMongoClient() {
        return mongoClientProvider.getMongoClient();
    }

    public PaisRepository() {
        super(Pais.class, "store", "pais");
    }

    @Override
    public Object findById(String key, String value) {
        return search(key, value);
    }

    @Override
    public Object findById(String key, Integer value) {
        return search(key, value);
    }

}
