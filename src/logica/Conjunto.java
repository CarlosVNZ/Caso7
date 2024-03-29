/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Carlos Vega
 */
public class Conjunto {
  private ArrayList<String> caracteres;
  private ArrayList<String> numeros;
  private double succed;

  public Conjunto() {
    caracteres=new ArrayList<>();
    numeros= new ArrayList<>();
  }

  public ArrayList<String> getCaracteres() {
    return caracteres;
  }

  public ArrayList<String> getNumeros() {
    return numeros;
  }
  
  public double getSucced() {
    return succed;
  }
  
  
  public static Comparator<Conjunto> succedComparator = new Comparator<Conjunto>() {         
    @Override         
    public int compare(Conjunto conjunto1, Conjunto conjunto2) {             
      return (conjunto1.getSucced() < conjunto2.getSucced() ? -1 :                     
              (conjunto2.getSucced() == conjunto1.getSucced() ? 0 : 1));           
    }     
  }; 
  
  
}
