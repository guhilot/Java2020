package edu.pdx.cs410J.guhilot;

/**
 * The main class for the CS410J Phone Bill Project
 */
public class Project1 {

  public static void main(String[] args) {

    /**
     * Checks the length of command line arguments to provide message to user
     */
      if (args.length == 0) {
            System.err.println("No arguments!");
            System.exit(1);
      } else if (args.length == 1) {
            System.err.println("Missing Caller number");
            System.exit(1);
      } else if (args.length == 2) {
            System.err.println("Missing Calee number");
            System.exit(1);
      } else if (args.length == 3) {
            System.err.println("Missing call Date");
            System.exit(1);
      } else if (args.length == 4) {
            System.err.println("Missing call start time");
            System.exit(1);
      }else if (args.length == 5) {
            System.err.println("Missing call Date");
            System.exit(1);
      }else if (args.length == 6) {
            System.err.println("Missing call end time");
            System.exit(1);
      }else if (args.length == 7) {
            System.err.println("Missing print");
            System.exit(1);
//      } else if (args.length == 8) {
//            System.err.println("Missing -ReadMe");
//            System.exit(1);
        //
        // INSERT 1 here
        //
      } else if (args.length > 9) {
            System.err.println("Too many args");
            System.exit(1);
      } else {

        PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
        PhoneBill bill = new PhoneBill(args[0]);

        bill.addPhoneCall(call);

        if ((args[7].equals("-print") || args[7].equals("-PRINT"))) {
          //readme();
          call.printCaller();
          System.exit(1);
        } else {
          System.out.println("Missing command line arguments");
        }
      }
  }
    //
    // 2 insert here
    //
}

































/*
Commented code to be used later
 */

// 1
//    else if(args.length == 6){
//      System.err.println("Missing README");
//      System.exit(1);
//    }
//    else if(args.length == 7){
//        PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//        PhoneBill bill = new PhoneBill(args[0]);
//
//        bill.addPhoneCall(call);
//
//        if (args[5].equals("-print")) {
//          readme();
//         call.printCaller();
//         System.exit(1);
//        }
//        else{
//          System.out.println("Missing command line arguments");
//          System.exit(1);
//        }
//    }

// 2
//  public static void readme(){
//    System.out.println();
//    System.out.println("Enter arguments if following format Name, Caller_number, Calee_number, date_callstart_time, date_callend_time, -print flag, -readme flag");
//    System.out.println("Eg: java -jar target/phonebill-Summer2020.jar Vikram 503-449-7833 234-234-2345 \"01/01/2020 01:00 AM\" \"01/01/2020 02:00 AM\" -print ");
//  }



