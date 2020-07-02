package edu.pdx.cs410J.guhilot;

/**
 * The main class for the CS410J Phone Bill Project
 */
public class Project1 {

  public static void main(String[] args) {

    if (args.length == 0) {
      System.err.println("No arguments!");
      System.exit(1);
    }

    if(args.length <= 5)
    {
      System.out.println("Missing command line arguments");
    }
    else
    {
      PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
      PhoneBill bill = new PhoneBill(args[0]);

      bill.addPhoneCall(call);

      if (args[5].equals("-print")) {
        call.printCaller();
      }
      else{
        System.out.println("Missing command line arguments");
      }
    }


    //System.out.println(bill.getPhoneCalls());
    System.exit(1);
  }

}

