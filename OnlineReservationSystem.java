//Online Reservation System

/**********************************************
*Programmer              	: Sakshi Baglane
*Program name           	: OnlineReservationSystem.java
*Task Number                : 01
************************************************/

import java.util.Scanner;

public class OnlineReservationSystem 
{

    // Initialize variables for user login
    static String username = "Sakshi";
    static String password = "2608";

    // Initialize variables for reservation form
    static int trainNumber;
    static char trainName;
    static char classType;
    static String from;
    static String to;
    static String dateOfJourney;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Login form
        System.out.println("*******************************************");
        System.out.println("");
        System.out.println("         ONLINE RESRVATION SYSTEM          ");
        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("");
        System.out.print("             Username :");
        String inputUsername = sc.nextLine();
        System.out.print("             Password :");
        String inputPassword = sc.nextLine();
        System.out.println("");

        if (inputUsername.equals(username) && inputPassword.equals(password)) 
        {
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");

            System.out.println("          Login successfully...            ");
        } 
        else 
        {
            System.out.println("");
            System.out.println("        Invalid login credentials...        ");
            System.out.println("");

            return;
        }

        // Reservation system
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("Please fill the details for your reservation :");
        System.out.println("");

        System.out.print("Train number: ");
        trainNumber = sc.nextInt();

        System.out.println("");
        System.out.print("Train name: ");
        trainName = sc.next().charAt(0);

        System.out.println("");
        System.out.print("Class type: ");
        classType = sc.next().charAt(1);

        System.out.println("");
        System.out.print("From: ");
        from = sc.next();

        System.out.println("");
        System.out.print("To: ");
        to = sc.next();

        System.out.println("");
        System.out.print("Date of journey: ");
        dateOfJourney = sc.next();
        System.out.println("");

        // Print ticket
        System.out.println("*******************************************");
        System.out.println("");
        System.out.println("             TICKET DETAILS                ");
        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("");
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Class Type: " + classType);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("");

        // Cancellation form
        System.out.println("Enter PNR number to cancel a reservation: ");
        String pnrNumber = sc.next();
        System.out.println("");
        System.out.println("Do you want to cancel this ticket (OK/Cancel): ");
        String confirmation = sc.next();
        if (confirmation.equalsIgnoreCase("OK")) 
        {
            System.out.println("");
            System.out.println("Reservation cancelled successfully...");
        } 
        else 
        {
            System.out.println("Reservation not cancelled...");
        }

        sc.close();
    }
}
