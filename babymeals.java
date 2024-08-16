/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class babymeals {
    public static void main(String[] args) {
        double porridgeQuantity = 2.0; 
// 2 liters of porridge
        double milkQuantity = 2.0;     
// 2 liters of milk

        double porridgeCup = 0.25;    
        // Half a cup of porridge (0.25 liters)
        double milkCup = 0.5;          
// Full cup of milk (0.5 liters)

        int porridgeInterval = 45;    
        // 45 minutes after porridge
        int milkInterval = 30;         
// 30 minutes after milk

        int totalTime = 0;             
// Total time in minutes

        while (porridgeQuantity > 0 || milkQuantity > 0) {
            // Feed porridge if available
            if (porridgeQuantity > 0) {
                porridgeQuantity -= porridgeCup;
                totalTime += porridgeInterval;
            }

            // Feed milk if available
            if (milkQuantity > 0) {
                milkQuantity -= milkCup;
                totalTime += milkInterval;
            }
        }

        // Convert total time to hours and minutes
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        System.out.println("The total time it will take for the baby to finish both the porridge and milk is: " 
                            + hours + " hours and " + minutes + " minutes.");
    }
}

    

