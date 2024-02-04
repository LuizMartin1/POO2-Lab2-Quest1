/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg1.Main;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        //SINGLETON
        FabricanteCelular apple = FabricanteCelularSingleton.getInstance("apple");
        
        //FABRICA
        Celular iphone = apple.constroiCelular("iphoneX");
        
        //USANDO O CELULAR
        iphone.fazLigacao();
        iphone.tiraFoto();
        System.out.println("Ok IphoneX!");
        
        //SINGLETON
        FabricanteCelular samsung = FabricanteCelularSingleton.getInstance("samsung");
        
        //FABRICA
        Celular galaxy = samsung.constroiCelular("galaxy8");
        
        //USANDO O CELULAR
        galaxy.fazLigacao();
        galaxy.tiraFoto();
        System.out.println("Ok Galaxy8");
    }
    
}
