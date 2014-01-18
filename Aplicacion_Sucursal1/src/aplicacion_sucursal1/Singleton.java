/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_sucursal1;

import java.util.ArrayList;

/**
 *
 * @author SergioArispe
 */
public class Singleton {
    private static Singleton singleton=null;

    
          private static ArrayList<Producto> todo = new ArrayList<Producto>();
	  private Singleton(){}

	  public static Singleton getSingleton(){
	   if(singleton==null){
	    singleton=new Singleton();
	   }
	   return singleton;
	  }
          
          public ArrayList<Producto> darlistaproducto()
          {
              return todo;
          }
          public void obtenerlistaproducto(ArrayList<Producto> a)
          {
              todo=a;
          }
}
