/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.Random;

/**
 *
 * @author Olman
 */
public class Metodos {
     
  public Pais[] arrayPais = new Pais[10];
  
   public double PuntosRandom(){
        Double min = 1.00;
        Double max = 3000.00;      
        Random rand = new Random();
        Double puntos = min + (max - min) * rand.nextDouble();
        puntos = Math.round(puntos * 100.00)/100.00;
        return puntos;
    }
    
    public void datosPais(){
       
       arrayPais[0] = new Pais ("EEUU",PuntosRandom());
       arrayPais[1] = new Pais ("Suecia",PuntosRandom());
       arrayPais[2] = new Pais ("Francia",PuntosRandom());
       arrayPais[3] = new Pais ("Alemania",PuntosRandom());
       arrayPais[4] = new Pais ("Holanda",PuntosRandom());
       arrayPais[5] = new Pais ("Canadá",PuntosRandom());
       arrayPais[6] = new Pais ("España",PuntosRandom());
       arrayPais[7] = new Pais ("Inglaterra",PuntosRandom());
       arrayPais[8] = new Pais ("Brasil",PuntosRandom());
       arrayPais[9] = new Pais ("Costa Rica",PuntosRandom());
       
        
      
       
    }
    
    public void QuickSort(Pais aPais[],int primero, int ultimo){
       
       int i = primero;
       int j = ultimo;
       double pivote = aPais[(primero + ultimo)/2].getPuntos(); //Divide el areglo a la mitad.
       
       do{
          //Mover lo indices  
          while(aPais[i].getPuntos() > pivote){
              i++;
          }
          while(aPais[j].getPuntos() < pivote){
              j--;
          }
          
          if(i<=j){
              Pais auxPais = aPais[i];
              aPais[i] = aPais[j];
              aPais[j] = auxPais;
              i++;
              j--;
          }
          
       }while(i<=j);
        //Recursividad
       if(primero < j){
           QuickSort(aPais, primero, j);
       }
       if(i < ultimo){
           QuickSort(aPais, i, ultimo);
       }
        
    }
    
    
  
    
   
}
