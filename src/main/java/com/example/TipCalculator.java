package com.example;
import java.util.Scanner;
import java.text.DecimalFormat; //learned from https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        DecimalFormat df = new DecimalFormat("0.0#");
        double tip = cost * percent/100;
        double totalBillWithTip = cost + tip;
        double costPerPersonBeforeTip = cost / people;
        double tipPerPerson = tip / people;
        double totalCostPerPerson = totalBillWithTip / people;
        //DO NOT DELETE ANY OF THE CODE BELOW      
        
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + df.format(cost) + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + df.format(tip) + "\n" +
                       "Total Bill with tip: $" + df.format(totalBillWithTip) + "\n" +
                       "Per person cost before tip: $" + df.format(costPerPersonBeforeTip) + "\n" +
                       "Tip per person: $" + df.format(tipPerPerson) + "\n" +
                       "Total cost per person: $" + df.format(totalCostPerPerson) + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        DecimalFormat df = new DecimalFormat("0.0#");
        double tip = cost * percent/100;
        double totalBillWithTip = cost + tip;
        double costPerPersonBeforeTip = cost / people;
        double tipPerPerson = tip / people;
        double totalCostPerPerson = totalBillWithTip / people;      
        

        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String items = "";
        while (condition) {
            //enter your code here 
            System.out.println("Enter a item name, type -1 to end: ");
            input = scanner.nextLine();
            
            if (input.equals("-1")) {
                condition = false;
    
            } else {
                items += input + "\n";
            }
        }
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + df.format(cost) + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + df.format(tip) + "\n" +
                       "Total Bill with tip: $" + df.format(totalBillWithTip) + "\n" +
                       "Per person cost before tip: $" + df.format(costPerPersonBeforeTip) + "\n" +
                       "Tip per person: $" + df.format(tipPerPerson) + "\n" +
                       "Total cost per person: $" + df.format(totalCostPerPerson) + "\n" +
                       "-------------------------------\n"
                       + "Items ordered:\n" + items +
                       "-------------------------------\n";
        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
