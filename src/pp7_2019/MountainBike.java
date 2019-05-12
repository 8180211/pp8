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
import Enum.BikeTools;
import Enum.BrakeType;
import Enum.Suspension;
import Enum.Material;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de montanha
 * </p>
 */

public class MountainBike extends Bicycle{
    
    private final int MaxTools=20;
    private int NumberofTools=0;
    private int numberOfLights;
    private Suspension suspension;
    private BikeTools[] bikeTools;
    
    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     * 
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, Suspension suspension, int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, Material material, float price, int guarantee) {
        
        super(id, numberOfGears, mainColor, weelSize, brakes, material, price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        this.bikeTools = new BikeTools[MaxTools];
    }

    
    public int getNumberOfLights() {
        return numberOfLights;
    }
    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    
    public Suspension getSuspension() {
        return suspension;
    }
    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    
    public BikeTools[] getBikeTools() {
        return bikeTools;
    }
    public void setBikeTools(BikeTools[] bikeTools) {
        this.bikeTools = bikeTools;
    }
    
    
    
    
    public boolean addTools(BikeTools n){
      if(this.NumberofTools == this.MaxTools){
          return false;
      }
      else{
        bikeTools[this.NumberofTools] = n; 
        this.NumberofTools++;
        return true;
      }
       
  }
     
     
    public void removeTools(BikeTools n){
        int pos = -1;
        for(int i=0; i<this.NumberofTools; i++){
            if(this.bikeTools[i]==n){
                pos = i;
            }
        }
        for(int j=pos; j<this.NumberofTools-1;j++){
            this.bikeTools[j] = this.bikeTools[j+1];
        }
        this.NumberofTools--;
        this.bikeTools[this.NumberofTools] = null;
        
  }
    
    
       public boolean editTools(BikeTools n){
      if(this.NumberofTools == this.MaxTools){
          return false;
      }
      else{
        bikeTools[this.NumberofTools] = n; 
        return true;
        
      }
       
  }
    
  
    
    
  @Override
    public String toString() {
        String a = "";
        a+="MountainBike: ";
        a+="numberOfLights=" + this.numberOfLights + ", ";
        a+="suspension=" + this.suspension + ", ";
        a+="bikeTools=";
        for(int i=0; i<this.NumberofTools; i++){
            if(bikeTools[i] != null){
                a+=" " + bikeTools[i] + ",";
            }
        } a+=" ";
        a+= super.toString();
        a+="\n";
        return a;
    }   
}
