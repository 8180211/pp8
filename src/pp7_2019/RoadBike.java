/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp7_2019;

/**
 *
 * @author Marco Fernandes
 */
import Enum.BrakeType;
import Enum.FrameSize;
import Enum.HandleBelt;
import Enum.Material;

/**
 *
 * @author Marco Fernandes
 */
public class RoadBike extends Bicycle{
    
  private HandleBelt handlebelt;
  private FrameSize frameSize; 
  private String txt;
  
    
      
    
    public RoadBike(HandleBelt handlebelt, FrameSize frameSize, String txt, int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, Material material, float price, int guaranteeYears) {
       
        super(id, numberOfGears, mainColor, weelSize, brakes.H, material.carbono, price, guaranteeYears);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.txt = txt; 
        
    }

    public HandleBelt getHandlebelt() {
        return handlebelt;
    }

    public void setHandlebelt(HandleBelt handlebelt) {
        this.handlebelt = handlebelt;
    }

    public FrameSize getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(FrameSize frameSize) {
        this.frameSize = frameSize;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    
    @Override
    public String toString() {
        String s = "";
        s+="RoadBike: ";
        s+="Fitas=" + this.handlebelt + ", ";
        s+="Frame=" + this.frameSize + ", ";
        s+="txt=" + this.txt + ", ";
        s+= super.toString();
        s+="\n";
        return s;
    }

    
    
    

    }
    
    
    
    