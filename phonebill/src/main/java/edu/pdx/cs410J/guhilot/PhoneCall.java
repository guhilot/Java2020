package edu.pdx.cs410J.guhilot;

import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.regex.Pattern;

/**
 * The <code>PhoneCall</code> class extends the <code>AbstractPhoneCall</code> class which
 * creates a phone call with the caller's phone number, callee's phone number, start time of the call, and end time of
 * the call. It also implements the <code>Comparable</code> interface so we it can be used to compare two different phone
 * calls for sorting.
 * Vikram Guhilot
 */

import static java.time.format.DateTimeFormatter.ofPattern;

public class PhoneCall extends AbstractPhoneCall {
  /**
   * Stores the caller's phone number in the format xxx-xxx-xxxx.
   */
  private String Caller;
  /**
   * Stores the callee's phone number in the format xxx-xxx-xxxx.
   */
  private String Callee;
  /**
   * Stores the start date and time of the phone call in the format MM/dd/yyyy hh:mm (am/pm).
   */
  private String Start;
  /**
   * Stores the end date and time of the phone call in the format MM/dd/yyyy hh:mm (am/pm).
   */
  private String Stop;

  public static final Pattern NumPattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");


  public PhoneCall(String callerNum, String calleeNum, String start, String stop){
    this.Caller = validateNumber(callerNum);
    this.Callee = validateNumber(calleeNum);
    this.Start = start;
    this.Stop = stop;
  }

  private String validateNumber(String input){
    var matcher = NumPattern.matcher(input);

    if (!matcher.matches()) {
      //throw new ParserException("Invalid phone number: " + input);
      System.out.println("Invalid phone number: " + input);
    }

    return input;
  }

  @Override
  public String getCaller()
  {
    return Caller;
    //throw new UnsupportedOperationException("This method is not implemented yet");
  }

  @Override
  public String getCallee()
  {
    return Callee;
    //return "This method is not implemented yet";
  }

  @Override
  public String getStartTimeString()
  {
    return Start;
  }

  @Override
  public String getEndTimeString()
  {
    return Stop;
  }

  public void printCaller()
  {
    System.out.println(toString());
  }
}
