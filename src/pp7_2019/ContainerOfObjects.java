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
public class ContainerOfObjects {
    
    
    private final int DEFAULT_SIZE = 100;
    private Object objects[];
    
    
   /**
    * Contrutor que permite a instanciaçao da classe tendo por 
    * base um vetor de elemetos recebido
    * @param objects lista de objetos sem tamanho fixo
    */ 
    public ContainerOfObjects(Object[] objects){
        this.objects = objects;
    }
    
    
    /**
     * Contrutor que permite a instanciaçao da classe tendo por
     * um valor por defeito(100)
     */
     public ContainerOfObjects(){
        this.objects = new Object[DEFAULT_SIZE];
    }
     
     
     /**
      * Construtor que permite a instanciaçao da classa definido
      * um valor maximo d eelementos 
      * @param maxSize numeor maximo de elementos permitidos no vetor 
      */
      public ContainerOfObjects(int maxSize){
        this.objects = new Object[maxSize];
    }
      
      
      /**
       * Metodo responsavel por inserir um Object objeto na coleçao de ContainerOfobjects 
       * @param newObject objeto a inserir no vetor
       * @return valor booleano que sinaliza o sucesso/insucesso da operaçao
       */
      protected boolean addObject(Object newObject){
          
      }
     
      
      /**
       * Metodo responsavel por remover um objeto do vetor de ContainerOfobject 
       * @param position indice corrspondente ao elemneto a eleminar 
       * @return Objeto eleminado
       */
      protected Object remObject(int position){
          
      }
     
      
      /**
       * metodo responsavel por susbtituir um vetor de CountainerObjets
       * @param position indice correspondente ao elemento a modificar
       * @param newObject novo objeto a colocar no vetor
       * @return valor booleano que sinaliza o sucesso/insucesso da operaçao
       */
      protected boolean setObject(int position, Object newObject){
          
      }
     
     /**
      * metodo responsavel por encontar um objet no vetor de ContainerOfOjects
      * @param obj
      * @return 
      */
    protected boolean findObject(Object obj){
        
    }
}
