package com.pluralsight;
import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        StringBuilder customerInformation = new StringBuilder();

        System.out.println("Enter Your First and Last Name: ");
        String fullName = myScanner.nextLine();
        customerInformation.append(fullName).append("\n");

        // Billing Address
        System.out.println("\nPlease provide your billing address information below.");
        System.out.print("Billing Street : ");
        String billingStreet = myScanner.nextLine();
        System.out.print("Billing City: ");
        String billingCity = myScanner.nextLine();
        System.out.print("Billing State: ");
        String billingState = myScanner.nextLine();
        System.out.print("Billing Zip: ");
        String billingZip = myScanner.nextLine();

// Append billing address to StringBuilder

        customerInformation.append("Billing Address : ");
        customerInformation.append(billingStreet).append(" ");
        customerInformation.append(billingCity).append(", ");
        customerInformation.append(billingState).append(" ");
        customerInformation.append(", ").append(billingZip);
        customerInformation.append("\n");

// Shipping Address
        System.out.println("\nPlease provide your shipping address information below.");
        System.out.print("\nShipping Street: ");
        String shippingStreet = myScanner.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = myScanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = myScanner.nextLine();
        System.out.print("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

// Append shipping address to StringBuilder
        customerInformation.append("/n").append("Shipping Address: ");
        customerInformation.append(shippingStreet).append(" ");
        customerInformation.append(shippingCity).append(", ");
        customerInformation.append(shippingState).append(" ");
        customerInformation.append(", ").append(shippingZip);
        customerInformation.append("\n");


 // convert to string
 String addressInformation = customerInformation.toString();

// Print
        System.out.println(addressInformation);
    }
}
