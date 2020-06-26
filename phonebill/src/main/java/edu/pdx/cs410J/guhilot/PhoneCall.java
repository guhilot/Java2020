package edu.pdx.cs410J.guhilot;

import edu.pdx.cs410J.AbstractPhoneCall;

public class PhoneCall extends AbstractPhoneCall {
  String Caller;
  String Callee;
  String Start;
  String Stop;
  public PhoneCall(String callerNum, String calleeNum, String start, String stop)
  {
    Caller = callerNum;
    Callee = calleeNum;
    Start = start;
    Stop = stop;
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
    //throw new UnsupportedOperationException("This method is not implemented yet");
  }

  @Override
  public String getEndTimeString()

  {
    return Stop;
    //throw new UnsupportedOperationException("This method is not implemented yet");
  }
}
