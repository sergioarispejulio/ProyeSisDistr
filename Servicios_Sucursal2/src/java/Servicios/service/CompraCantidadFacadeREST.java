/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.service;

import Servicios.CompraCantidad;
import Servicios.CompraCantidadPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author SergioArispe
 */
@Stateless
@Path("servicios.compracantidad")
public class CompraCantidadFacadeREST extends AbstractFacade<CompraCantidad> {
    @PersistenceContext(unitName = "Servicios_Sucursal2PU")
    private EntityManager em;

    private CompraCantidadPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;compraNro=compraNroValue;productoNro=productoNroValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Servicios.CompraCantidadPK key = new Servicios.CompraCantidadPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> compraNro = map.get("compraNro");
        if (compraNro != null && !compraNro.isEmpty()) {
            key.setCompraNro(new java.lang.Integer(compraNro.get(0)));
        }
        java.util.List<String> productoNro = map.get("productoNro");
        if (productoNro != null && !productoNro.isEmpty()) {
            key.setProductoNro(new java.lang.Integer(productoNro.get(0)));
        }
        return key;
    }

    public CompraCantidadFacadeREST() {
        super(CompraCantidad.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(CompraCantidad entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(CompraCantidad entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Servicios.CompraCantidadPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public CompraCantidad find(@PathParam("id") PathSegment id) {
        Servicios.CompraCantidadPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<CompraCantidad> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<CompraCantidad> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
