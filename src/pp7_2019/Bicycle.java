/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp7_2019;

import Enum.BrakeType;
import Enum.Material;

/**
 *
 * @author Marco Fernandes
 */
public class Bicycle {
    /**
     * Identificador numérico da bicicleta
     */  
    private int id;
    private int numberOfGears;
    private final String mainColor;
    private float weelSize;
    private BrakeType brakes;
    private Material material;
    private float price;
    private int guaranteeYears;

    /**
     * Método construtor para a criação de uma instância de
     * {@link Biclycle bicicleta}.
     * 
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guaranteeYears Anos de garantia da bicicleta
     */
    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize, BrakeType brakes, Material material, float price, int guaranteeYears) {
        this.setId(id);
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guaranteeYears=guaranteeYears;
    }


    
    
    public int getId() {
        return id;
    }
    public final void setId(int id) {
        this.id = id;
    }

    
    public int getNumberOfGears() {
        return numberOfGears;
    }
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    
    public float getWeelSize() {
        return weelSize;
    }
    public void setWeelSize(float weelSize) {
        this.weelSize = weelSize;
    }

    
    public BrakeType getBrakes() {
        return brakes;
    }
    public void setBrakes(BrakeType brakes) {
        this.brakes = brakes;
    }

    
    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }

    
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    
    public int getGuaranteeYears() {
        return guaranteeYears;
    }
    public void setGuaranteeYears(int guaranteeYears) {
        this.guaranteeYears = guaranteeYears;
    }

    @Override
    public String toString() {
        return   "id=" + id + ", numberOfGears=" + numberOfGears + ", mainColor=" + mainColor + ", weelSize=" + weelSize + ", brakes=" + brakes + ", material=" + material + ", price=" + price + ", guaranteeYears=" + guaranteeYears + '}';
    }
  
   
   
}  