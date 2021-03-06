/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservices.entity;

import com.avbravo.ejbjmoordb.anotations.Embedded;
import com.avbravo.ejbjmoordb.pojos.UserInfo;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class Pais {
    private String idpais;
    private String pais;
     @Embedded
    private List<UserInfo> userInfo;

    public List<UserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<UserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
