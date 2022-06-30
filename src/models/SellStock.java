/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import Repositorios.Order;

/**
 *
 * @author LEONARDO
 */
public class SellStock implements Order {

     private final Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

     @Override
   public void execute() {
      abcStock.sell();
   }
    
    
    
}
