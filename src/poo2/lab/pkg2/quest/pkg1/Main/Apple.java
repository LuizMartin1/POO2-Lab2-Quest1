/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg1.Main;

/**
 *
 * @author Luiz Henrique
 */
public class Apple implements FabricanteCelular {
    
    @Override
    public Celular constroiCelular(String modelo){
       
        if(modelo.equals("iphoneX")){
            return new IphoneX();
        }
        return null;
    }
}
