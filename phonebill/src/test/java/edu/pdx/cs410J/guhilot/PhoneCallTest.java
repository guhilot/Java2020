package edu.pdx.cs410J.guhilot;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the {@link PhoneCall} class.
 *
 * You'll need to update these unit tests as you build out you program.
 */
public class PhoneCallTest {


  //(expected = UnsupportedOperationException.class)
  @Test(expected = UnsupportedOperationException.class)
  public void getStartTimeStringNeedsToBeImplemented() {
    PhoneCall call = new PhoneCall("503-449-7833", "345-876-3456", "", "222");
    call.getStartTimeString();
  }

  @Test
  public void getCallerNeedsToBeImplemented(){
    PhoneCall call = new PhoneCall("503-449-7833", "345-876-3456", "111", "222");
    assertThat(call.getCaller(), not(nullValue()));
  }

  @Test
  public void getCalleeNeedsToBeImplemented(){
    PhoneCall call = new PhoneCall("503-449-7833", "345-876-3456", "111", "222");
    assertThat(call.getCallee(), not(nullValue()));
  }

  @Test
  public void invalidCallerNumber(){
    PhoneCall call = new PhoneCall("ABCD", "345-876-3456", "111", "222");
    assertThat(call.getCaller(), not(nullValue()));
  }

  @Test
  public void invalidCaleeNumber(){
    PhoneCall call = new PhoneCall("503-449-7833", "ABCD", "111", "222");
    assertThat(call.getCallee(), not(nullValue()));
  }

  @Test
  public void initiallyAllPhoneCallsHaveTheSameCallee() {
    PhoneCall call = new PhoneCall("503-449-7833", "345-876-3456", "111", "222");
    assertThat(call.getCallee(), containsString("34"));
  }

  @Test
  public void forProject1ItIsOkayIfGetStartTimeReturnsNull() {
    PhoneCall call = new PhoneCall("503-449-7833", "345-876-3456", "111", "222");
    assertThat(call.getStartTime(), is(nullValue()));
  }
  
}
