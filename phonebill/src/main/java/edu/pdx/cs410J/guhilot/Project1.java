package edu.pdx.cs410J.guhilot;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;
import edu.pdx.cs410J.ParserException;

import java.io.IOException;

/**
 * The main class for the CS410J Phone Bill Project
 */
public class Project1 {

    public static void main(String[] args) throws ParserException, IOException {

        /**
         * Checks the length of command line arguments to provide message to user
         */

        if (args.length == 0) {
            System.err.println("No arguments!");
            System.exit(1);
        }

        if (args.length == 1 && (args[0].equals("-README") || args[0].equals("-readme"))) {
            readme();
        } else if (args.length < 7) {
            System.err.println("Missing command line arguments");
            System.exit(1);
        }

        if (args.length == 8 && args[7].equals("-textFile")) {
            System.out.println("Missing cmd line args/text file to read from");
            System.exit(1);
        } else if (args.length == 9 && args[7].equals("-textFile") && args[8].contains(".txt")) {
            TextParser parse = new TextParser(args[8], args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
            TextDumper dumper = new TextDumper(args[8]);
            AbstractPhoneBill parseBill = parse.parse();
            PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4], args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
            parseBill.addPhoneCall(call);
            System.out.println(parseBill.getPhoneCalls());
            dumper.dump(parseBill);
            System.exit(1);
        } else if (args.length == 10 && args[8].equals("-textFile") && args[9].contains(".txt")) {
            TextParser parse = new TextParser(args[9], args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
            TextDumper dumper = new TextDumper(args[9]);
            AbstractPhoneBill parseBill = parse.parse();
            PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4], args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
            parseBill.addPhoneCall(call);
            System.out.println(parseBill.getPhoneCalls());
            dumper.dump(parseBill);
            System.exit(1);
        } else if (args.length == 11 && args[9].equals("-textFile") && args[10].contains(".txt")) {
            TextParser parse = new TextParser(args[10], args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
            TextDumper dumper = new TextDumper(args[10]);
            AbstractPhoneBill parseBill = parse.parse();
            PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4], args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
            parseBill.addPhoneCall(call);
            System.out.println(parseBill.getPhoneCalls());
            dumper.dump(parseBill);
            System.exit(1);
        }

        if (args.length == 8 && args[7].equals("-print")) {
            PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4], args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
            PhoneBill bill = new PhoneBill(args[0]);

            bill.addPhoneCall(call);

            //if ((args[7].equals("-print") || args[7].equals("-PRINT"))) {
                call.printCaller();
                System.exit(1);
//            } else {
//                System.out.println("Missing command line arguments");
//            }
            System.exit(1);
        } else if (args.length == 8 && (args[7].equals("-README") || args[7].equals("-readme"))) {
            readme();
        }

        if (args.length == 9 && args[8].equals("-print")) {
            PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4], args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
            PhoneBill bill = new PhoneBill(args[0]);

            bill.addPhoneCall(call);

            //if ((args[8].equals("-print") || args[8].equals("-PRINT"))) {
                call.printCaller();
                System.exit(1);
//            } else {
//                System.out.println("Missing command line arguments");
//            }
            System.exit(1);
        } else if (args.length == 9 && (args[8].equals("-README") || args[8].equals("-readme"))) {
            readme();
        }

        if (args.length == 10 && args[9].equals("-print")) {
            PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4], args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
            PhoneBill bill = new PhoneBill(args[0]);

            bill.addPhoneCall(call);

            //if ((args[9].equals("-print") || args[9].equals("-PRINT"))) {
                call.printCaller();
                System.exit(1);
//            } else {
//                System.out.println("Missing command line arguments");
//            }
            System.exit(1);
        } else if (args.length == 10 && (args[9].equals("-README") || args[9].equals("-readme"))) {
            readme();
        }

        if (args.length == 11 && args[10].equals("-print")) {
            PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4], args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
            PhoneBill bill = new PhoneBill(args[0]);

            bill.addPhoneCall(call);

            //if ((args[10].equals("-print") || args[10].equals("-PRINT"))) {
                call.printCaller();
                System.exit(1);
//            } else {
//                System.out.println("Missing command line arguments");
//            }
            System.exit(1);
        } else if (args.length == 11 && (args[10].equals("-README") || args[10].equals("-readme"))) {
            readme();
        }

    }

    public static void readme() {
        System.out.println();
        System.out.println("Customer is the caller");
        System.out.println("Caller stores the customers phone number");
        System.out.println("Calee stores the recevers phone number");
        System.out.println("Start stores the Date of phone call");
        System.out.println("Stop stores the Date of phone call ended");
        System.out.println("timeStart stores the time of phone call started");
        System.out.println("timeEnd stores the time of phone call ended");
        System.out.println();
    }
}



























//      if (args.length == 0) {
//          System.err.println("No arguments!");
//          System.exit(1);
//      } else if (args.length == 1) {
//          System.err.println("Missing Caller number");
//          System.exit(1);
//      } else if (args.length == 2) {
//          System.err.println("Missing Calee number");
//          System.exit(1);
//      } else if (args.length == 3) {
//          System.err.println("Missing call Date");
//          System.exit(1);
//      } else if (args.length == 4) {
//          System.err.println("Missing call start time");
//          System.exit(1);
//      }else if (args.length == 5) {
//          System.err.println("Missing call Date");
//          System.exit(1);
//      }else if (args.length == 6) {
//          System.err.println("Missing call end time");
//          System.exit(1);
//      }else if (args.length == 7) {
//          System.err.println("Missing file");
//          System.exit(1);}
//       else if (args.length == 8) {
//          if(args[7].equals("-textFile"))
//          {
//              System.out.println("Missing file name to read from");
//              TextParser parse = new TextParser(args[8], args[0]);
//              TextDumper dumper = new TextDumper(args[8]);
//              AbstractPhoneBill parseBill = parse.parse();
//              PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//              parseBill.addPhoneCall(call);
//              System.out.println(parseBill.getPhoneCalls());
//              dumper.dump(parseBill);
//              //PhoneBill bill = new PhoneBill(args[0]);
//              //System.out.println(call.toString());
//              //System.out.println(parseBill.getPhoneCalls());
//              System.exit(0);
//          }
//          else if(args[7].equals("-print")){
//              PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//              PhoneBill bill = new PhoneBill(args[0]);
//
//              bill.addPhoneCall(call);
//
//              if ((args[7].equals("-print") || args[7].equals("-PRINT"))){
//                  call.printCaller();
//                  System.exit(1);
//              }
//              else{
//                  System.out.println("Missing command line arguments");
//              }
//              System.exit(1);
//          }
//          else if(args[7].equals("-README")||args[7].equals("-readme")){
//              readme();
//          }
//      }else if (args.length == 9) {
//          if(args[8].equals("-README") || args[8].equals("-readme"))
//          {
//              readme();
//          }
//          else if(args[8].equals("-print")){
//              PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//              PhoneBill bill = new PhoneBill(args[0]);
//
//              bill.addPhoneCall(call);
//
//              if ((args[8].equals("-print") || args[8].equals("-PRINT"))){
//                  call.printCaller();
//                  System.exit(1);
//              }
//              else{
//                  System.out.println("Missing command line arguments");
//              }
//          }
//          else if(args[7].equals("-textFile")){
//              TextParser parse = new TextParser(args[8], args[0]);
//              TextDumper dumper = new TextDumper(args[8]);
//              AbstractPhoneBill parseBill = parse.parse();
//              PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//              parseBill.addPhoneCall(call);
//              System.out.println(parseBill.getPhoneCalls());
//              dumper.dump(parseBill);
//              //PhoneBill bill = new PhoneBill(args[0]);
//              //System.out.println(call.toString());
//              //System.out.println(parseBill.getPhoneCalls());
//              System.exit(0);
//          }
//      }else if(args.length == 10){
//          if(args[9].equals("-README") || args[9].equals("-readme"))
//          {
//              readme();
//          }
//          else if(args[9].equals("-print")){
//              PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//              PhoneBill bill = new PhoneBill(args[0]);
//
//              bill.addPhoneCall(call);
//
//              if ((args[9].equals("-print") || args[9].equals("-PRINT"))){
//                  call.printCaller();
//                  System.exit(1);
//              }
//              else{
//                  System.out.println("Missing command line arguments");
//              }
//          }
//          else if(args[9].equals("-textFile")){
//              TextParser parse = new TextParser(args[10], args[0]);
//              TextDumper dumper = new TextDumper(args[10]);
//              AbstractPhoneBill parseBill = parse.parse();
//              PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//              parseBill.addPhoneCall(call);
//              System.out.println(parseBill.getPhoneCalls());
//              dumper.dump(parseBill);
//              //PhoneBill bill = new PhoneBill(args[0]);
//              //System.out.println(call.toString());
//              //System.out.println(parseBill.getPhoneCalls());
//              System.exit(0);
//          }
//      } else if (args.length > 11) {
//          System.err.println("Too many args");
//          System.exit(1);
//      } else {
//
//          PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//          PhoneBill bill = new PhoneBill(args[0]);
//
//          bill.addPhoneCall(call);
//
//          if ((args[9].equals("-print") || args[9].equals("-PRINT"))){
//              call.printCaller();
//              System.exit(1);
//          }
//          else{
//              readme();
//              //System.out.println("Missing command line arguments");
//              System.exit(1);
//          }
//      }
//  }



































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


//    /**
//     * Checks the length of command line arguments to provide message to user
//     */
//      if (args.length == 0) {
//            System.err.println("No arguments!");
//            System.exit(1);
//      } else if (args.length == 1) {
//            System.err.println("Missing Caller number");
//            System.exit(1);
//      } else if (args.length == 2) {
//            System.err.println("Missing Calee number");
//            System.exit(1);
//      } else if (args.length == 3) {
//            System.err.println("Missing call Date");
//            System.exit(1);
//      } else if (args.length == 4) {
//            System.err.println("Missing call start time");
//            System.exit(1);
//      }else if (args.length == 5) {
//            System.err.println("Missing call Date");
//            System.exit(1);
//      }else if (args.length == 6) {
//            System.err.println("Missing call end time");
//            System.exit(1);
//      }else if (args.length == 7) {
//            System.err.println("Missing print");
//            System.exit(1);
//      } else if (args.length == 8) {
//          if(args[7].equals("-README") || args[7].equals("-readme"))
//          {
//              readme();
//          }
//          else{
//              PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//              PhoneBill bill = new PhoneBill(args[0]);
//
//              bill.addPhoneCall(call);
//
//              if ((args[7].equals("-print") || args[7].equals("-PRINT"))){
//                  call.printCaller();
//                  System.exit(1);
//              }
//              else{
//                  System.out.println("Missing command line arguments");
//              }
//          }
//      } else if (args.length > 9) {
//            System.err.println("Too many args");
//            System.exit(1);
//      } else {
//
//        PhoneCall call = new PhoneCall(args[1], args[2], args[3], args[4],args[5], args[6]);// Refer to one of Dave's classes so that we can be sure it is on the classpath
//        PhoneBill bill = new PhoneBill(args[0]);
//
//        bill.addPhoneCall(call);
//
//        if ((args[8].equals("-print") || args[8].equals("-PRINT"))){
//                call.printCaller();
//                System.exit(1);
//        }
//        else{
//            readme();
//            //System.out.println("Missing command line arguments");
//            System.exit(1);
//          }
//      }
//  }
//
//  public static void readme(){
//    System.out.println();
//    System.out.println("Customer is the caller");
//    System.out.println("Caller stores the customers phone number");
//    System.out.println("Calee stores the recevers phone number");
//    System.out.println("Start stores the Date of phone call");
//    System.out.println("Stop stores the Date of phone call ended");
//    System.out.println("timeStart stores the time of phone call started");
//    System.out.println("timeEnd stores the time of phone call ended");
//    System.out.println();
//  }





