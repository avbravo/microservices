package com.avbravo.microservices.entity;

import com.avbravo.ejbjmoordb.anotations.Embedded;
import com.avbravo.ejbjmoordb.anotations.Id;
import com.avbravo.ejbjmoordb.pojos.UserInfo;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tamano {

    @Id
    private Integer idtamano;
    private String descripcion;
    private String activo;

    @Embedded
    private List<UserInfo> userInfo;

    public Tamano() {
    }

    @Override
    public String toString() {
        return descripcion;
    }

    public Tamano(Integer idtamano, String descripcion, String activo) {
        this.idtamano = idtamano;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdtamano() {
        return idtamano;
    }

    public void setIdtamano(Integer idtamano) {
        this.idtamano = idtamano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public List<UserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<UserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    
    
  
}
