/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

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
    
}
