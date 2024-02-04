/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg1.Main;

/**
 *
 * @author Luiz Henrique
 */
public class FabricanteCelularSingleton {
    
    private static FabricanteCelular apple;
    private static FabricanteCelular samsung;
    
    public static FabricanteCelular getInstance(String tipo){
        
        if(tipo.equals("apple")){
            if(apple==null){
                apple = new Apple();
                return apple;
            }
        }else{
            if(samsung==null){
                samsung = new Samsung();
                return samsung;
            }
        }
        return null;
    }
}
