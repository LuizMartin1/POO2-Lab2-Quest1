/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg1.Main;

/**
 *
 * @author Luiz Henrique
 */
public class Samsung implements FabricanteCelular {
    
    @Override
    public Celular constroiCelular(String modelo){
       
        if(modelo.equals("galaxy8")){
            return new Galaxy8();
        }
        return null;
    }
}
