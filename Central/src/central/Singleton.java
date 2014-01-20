/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SergioArispe
 */
public class Singleton {
    private static Singleton singleton=null;

	  private Singleton(){}

	  public static Singleton getSingleton(){
	   if(singleton==null){
	    singleton=new Singleton();
	   }
	   return singleton;
	  }
          
          public void eliminarProducto_Sucursal1(int nro)
          {
              Sucursal1_Producto client=new Sucursal1_Producto();
              client.remove(Integer.toString(nro));
          }
          public void eliminarProducto_Sucursal2(int nro)
          {
              Sucursal2_Producto client=new Sucursal2_Producto();
              client.remove(Integer.toString(nro));
          }
          public void eliminarProducto_Sucursal3(int nro)
          {
              Sucursal3_Producto client=new Sucursal3_Producto();
              client.remove(Integer.toString(nro));
          }
          
          public void eliminarUsuario_Sucursal1(int ci)
          {
              Sucursal1_Usuario client=new Sucursal1_Usuario();
              client.remove(Integer.toString(ci));
          }
          public void eliminarUsuario_Sucursal2(int ci)
          {
              Sucursal2_Usuario client=new Sucursal2_Usuario();
              client.remove(Integer.toString(ci));
          }
          public void eliminarUsuario_Sucursal3(int ci)
          {
              Sucursal3_Usuario client=new Sucursal3_Usuario();
              client.remove(Integer.toString(ci));
          }
    
          public void modificarUsuario_Sucursal1(Usuario nue)
          {
              Sucursal1_Usuario client=new Sucursal1_Usuario();
              client.edit_XML(nue);
          }
          public void modificarUsuario_Sucursal2(Usuario nue)
          {
              Sucursal2_Usuario client=new Sucursal2_Usuario();
              client.edit_XML(nue);
          }
          public void modificarUsuario_Sucursal3(Usuario nue)
          {
              Sucursal3_Usuario client=new Sucursal3_Usuario();
              client.edit_XML(nue);
          }
          
          public void modificarProducto_Sucursal1(Producto nue)
          {
              Sucursal1_Producto client=new Sucursal1_Producto();
              client.edit_XML(nue);
          }
          public void modificarProducto_Sucursal2(Producto nue)
          {
              Sucursal2_Producto client=new Sucursal2_Producto();
              client.edit_XML(nue);
          }
          public void modificarProducto_Sucursal3(Producto nue)
          {
              Sucursal3_Producto client=new Sucursal3_Producto();
              client.edit_XML(nue);
          }
          
          public void ponerProducto_Sucursal1(Producto nue)
          {
              Sucursal1_Producto client=new Sucursal1_Producto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Producto>> genericType = new GenericType<List<Producto>>() {};
              // Returns an ArrayList of Players from the web service
              List<Producto> data= new ArrayList<Producto>();
              data=(response.getEntity(genericType));
              client.create_JSON(nue);
          }
          public void ponerProducto_Sucursal2(Producto nue)
          {
              Sucursal2_Producto client=new Sucursal2_Producto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Producto>> genericType = new GenericType<List<Producto>>() {};
              // Returns an ArrayList of Players from the web service
              List<Producto> data= new ArrayList<Producto>();
              data=(response.getEntity(genericType));
              client.create_XML(nue);
          }
          public void ponerProducto_Sucursal3(Producto nue)
          {
              Sucursal3_Producto client=new Sucursal3_Producto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Producto>> genericType = new GenericType<List<Producto>>() {};
              // Returns an ArrayList of Players from the web service
              List<Producto> data= new ArrayList<Producto>();
              data=(response.getEntity(genericType));
              client.create_XML(nue);
          }
          
          public void ponerUsuario_Sucursal1(Usuario nue)
          {
              Sucursal1_Usuario client=new Sucursal1_Usuario();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Usuario>> genericType = new GenericType<List<Usuario>>() {};
              // Returns an ArrayList of Players from the web service
              List<Usuario> data= new ArrayList<Usuario>();
              data=(response.getEntity(genericType));
              client.create_XML(nue);
          }
          public void ponerUsuario_Sucursal2(Usuario nue)
          {
              Sucursal2_Usuario client=new Sucursal2_Usuario();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Usuario>> genericType = new GenericType<List<Usuario>>() {};
              // Returns an ArrayList of Players from the web service
              List<Usuario> data= new ArrayList<Usuario>();
              data=(response.getEntity(genericType));
              client.create_XML(nue);
          }
          public void ponerUsuario_Sucursal3(Usuario nue)
          {
              Sucursal3_Usuario client=new Sucursal3_Usuario();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Usuario>> genericType = new GenericType<List<Usuario>>() {};
              // Returns an ArrayList of Players from the web service
              List<Usuario> data= new ArrayList<Usuario>();
              data=(response.getEntity(genericType));
              client.create_XML(nue);
          }
          
          public List<Usuario> ObtenerUsuario_Sucursal1(Usuario nue)
          {
              Sucursal1_Usuario client=new Sucursal1_Usuario();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Usuario>> genericType = new GenericType<List<Usuario>>() {};
              // Returns an ArrayList of Players from the web service
              List<Usuario> data= new ArrayList<Usuario>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<Usuario> ObtenerUsuario_Sucursal2(Usuario nue)
          {
              Sucursal2_Usuario client=new Sucursal2_Usuario();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Usuario>> genericType = new GenericType<List<Usuario>>() {};
              // Returns an ArrayList of Players from the web service
              List<Usuario> data= new ArrayList<Usuario>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<Usuario> ObtenerUsuario_Sucursal3(Usuario nue)
          {
              Sucursal3_Usuario client=new Sucursal3_Usuario();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Usuario>> genericType = new GenericType<List<Usuario>>() {};
              // Returns an ArrayList of Players from the web service
              List<Usuario> data= new ArrayList<Usuario>();
              data=(response.getEntity(genericType));
              return data;
          }
          
          
          public List<Producto> ObtenerProducto_Sucursal1(Usuario nue)
          {
              Sucursal1_Producto client=new Sucursal1_Producto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Producto>> genericType = new GenericType<List<Producto>>() {};
              // Returns an ArrayList of Players from the web service
              List<Producto> data= new ArrayList<Producto>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<Producto> ObtenerProducto_Sucursal2(Usuario nue)
          {
              Sucursal2_Producto client=new Sucursal2_Producto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Producto>> genericType = new GenericType<List<Producto>>() {};
              // Returns an ArrayList of Players from the web service
              List<Producto> data= new ArrayList<Producto>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<Producto> ObtenerProducto_Sucursal3(Usuario nue)
          {
              Sucursal3_Producto client=new Sucursal3_Producto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Producto>> genericType = new GenericType<List<Producto>>() {};
              // Returns an ArrayList of Players from the web service
              List<Producto> data= new ArrayList<Producto>();
              data=(response.getEntity(genericType));
              return data;
          }
          
          public List<CompraCantidad> ObtenerCompraProducto_Sucursal1()
          {
              Sucursal1_CompraProducto client=new Sucursal1_CompraProducto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<CompraCantidad>> genericType = new GenericType<List<CompraCantidad>>() {};
              // Returns an ArrayList of Players from the web service
              List<CompraCantidad> data= new ArrayList<CompraCantidad>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<CompraCantidad> ObtenerCompraProducto_Sucursal2()
          {
              Sucursal2_CompraProducto client=new Sucursal2_CompraProducto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<CompraCantidad>> genericType = new GenericType<List<CompraCantidad>>() {};
              // Returns an ArrayList of Players from the web service
              List<CompraCantidad> data= new ArrayList<CompraCantidad>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<CompraCantidad> ObtenerCompraProducto_Sucursal3()
          {
              Sucursal3_CompraProducto client=new Sucursal3_CompraProducto();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<CompraCantidad>> genericType = new GenericType<List<CompraCantidad>>() {};
              // Returns an ArrayList of Players from the web service
              List<CompraCantidad> data= new ArrayList<CompraCantidad>();
              data=(response.getEntity(genericType));
              return data;
          }
          
          public List<Compra> ObtenerCompra_Sucursal1()
          {
              Sucursal1_Compra client=new Sucursal1_Compra();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Compra>> genericType = new GenericType<List<Compra>>() {};
              // Returns an ArrayList of Players from the web service
              List<Compra> data= new ArrayList<Compra>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<Compra> ObtenerCompra_Sucursal2()
          {
              Sucursal2_Compra client=new Sucursal2_Compra();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Compra>> genericType = new GenericType<List<Compra>>() {};
              // Returns an ArrayList of Players from the web service
              List<Compra> data= new ArrayList<Compra>();
              data=(response.getEntity(genericType));
              return data;
          }
          public List<Compra> ObtenerCompra_Sucursal3()
          {
              Sucursal3_Compra client=new Sucursal3_Compra();
              ClientResponse response= client.findAll_XML(ClientResponse.class);
              GenericType<List<Compra>> genericType = new GenericType<List<Compra>>() {};
              // Returns an ArrayList of Players from the web service
              List<Compra> data= new ArrayList<Compra>();
              data=(response.getEntity(genericType));
              return data;
          }
          
}
