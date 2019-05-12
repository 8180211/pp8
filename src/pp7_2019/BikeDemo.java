/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp7_2019;

import Enum.BikeTools;
import Enum.BrakeType;
import Enum.FrameSize;
import Enum.HandleBelt;
import Enum.Material;
import Enum.Suspension;
/**
 *
 * @author Marco Fernandes
 */
public class BikeDemo {
    
    public static void main(String[] args) {
        
      RoadBike r1 = new RoadBike(HandleBelt.amarela, FrameSize.M, "Gosto", 1, 3, "blue", 35, BrakeType.H, Material.carbono, 235, 2);
      RoadBike r2 = new RoadBike( HandleBelt.laranjas, FrameSize.M, "Gosto", 2, 4, "red", 45, BrakeType.H, Material.carbono, 225, 5);
      MountainBike r3 = new MountainBike(12, Suspension.Dupla, 21, 34, "red", 12, BrakeType.P, Material.aluminio, 315, 5);
      MountainBike r4 = new MountainBike(13, Suspension.Dupla, 22, 34, "red", 12, BrakeType.P, Material.aluminio, 315, 5);
        
      BicycleManagment lista1 = new BicycleManagment();
        
 /** 
  * add objeto 1
  */
        lista1.addBike(r1);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
            
 /** 
  * add objeto 2
  */   
        lista1.addBike(r2);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
           
 /** 
  * add tools no objeto 3
  */    
        r3.addTools(BikeTools.Pneu);
        r3.addTools(BikeTools.Agua);
        r3.addTools(BikeTools.Chaves);
               
 /** 
  * remove tools do objeto 3
  */
        r3.removeTools(BikeTools.Pneu);
       
          
 /** 
  * add objeto 3
  */     
        lista1.addBike(r3);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
      
           
 /** 
  * remove objeto 3
  */
        lista1.remBike(r3);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
  /**
   * 
   */      
        lista1.editBike(r2,r4);
        System.out.println(lista1.toString());
        System.out.println("--------------------");
        
        
        
        
    }             
}
