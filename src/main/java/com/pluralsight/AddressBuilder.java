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
        System.out.print("Billing Street: ");
        String billingStreet = myScanner.nextLine();
        System.out.print("Billing City: ");
        String billingCity = myScanner.nextLine();
        System.out.print("Billing State: ");
        String billingState = myScanner.nextLine();
        System.out.print("Billing Zip: ");
        String billingZip = myScanner.nextLine();

// Append billing address to StringBuilder
        customerInformation.append("Billing Address: ")
                .append(billingStreet).append(" ")
                .append(billingCity).append(", ")
                .append(billingState).append(" ")
                .append(billingZip)
                .append("\n");

// Shipping Address
        System.out.print("Shipping Street: ");
        String shippingStreet = myScanner.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = myScanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = myScanner.nextLine();
        System.out.print("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

// Append shipping address to StringBuilder
        customerInformation.append("Shipping Address: ")
                .append(shippingStreet).append(" ")
                .append(shippingCity).append(", ")
                .append(shippingState).append(" ")
                .append(shippingZip)
                .append("\n");

// Print all info
        System.out.println("\nCustomer Information:");
        System.out.println(customerInformation.toString());
    }
}
