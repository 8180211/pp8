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
public class BicycleManagment {
   
    private static final int maxBike=20;
    private Bicycle[] Bikes;
    private int numberBike=0;

    /**
     * construtor do array de bikes
     */
    public BicycleManagment() {
        this.Bikes = new Bicycle[this.maxBike];

    }
    
     /**
      * gets e sets bike
      * @return 
      */   
    public Bicycle[] getBikes() {
        return Bikes;
    }
    public void setBikes(Bicycle[] Bikes) {
        this.Bikes = Bikes;
    }

    /**
     * gets e sets numberbike
     * @return 
     */
    public int getNumberBike() {
        return numberBike;
    }
    public void setNumberBike(int numberBike) {
        this.numberBike = numberBike;
    }
    
    
    
  /**
   * metodo para add bike ao array
   * @param b 
   */  
  public void addBike(Bicycle b){
      if(this.numberBike == this.maxBike){
          System.out.println("erro");
      }
      else{
        Bikes[this.numberBike] = b; 
        System.out.println("--objeto addicionado--");
        this.numberBike++;
        
      }
  }
  
  /**
   * metodo para retirar bike do array
   * @param b 
   */
 public void remBike(Bicycle b){
     for(int j=0;j<this.numberBike;j++){
         if(Bikes[j] == b){
             for(int h=j;h <(this.numberBike - j);h++){
                  this.Bikes[h]=this.Bikes[h+1];
             }
            System.out.println("--objeto removido--");
             this.numberBike--;
            
         }
     }
 }
    
/**
 * metodo para editar bicicletas
 * @param b
 * @param bike 
 */
  public void editBike(Bicycle b, Bicycle bike){
      for(int p=0;p<this.numberBike;p++){
         if(Bikes[p] == b){
            this.Bikes[p] = bike;
            System.out.println("--objeto " + b.getId() +  " alterado--");
            break;
         }
         else{
             System.out.println("--objeto nao existe--");
         }
             
  }
 
    }
  
    @Override
    public String toString() {
        String s = "";
        s+=this.numberBike + "\n";
        for(int i=0; i<this.numberBike; i++){
            if(Bikes[i] != null){
                s+=Bikes[i];
            }
        }
        return s;
    }

  
    
    
}

