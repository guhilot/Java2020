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

//  @Test(expected = UnsupportedOperationException.class)
//  public void getStartTimeStringNeedsToBeImplemented() {
//    PhoneCall call = new PhoneCall( "999",  "555", "111", "222");
//    call.getStartTimeString();
//  }

  @Test
  public void initiallyAllPhoneCallsHaveTheSameCallee() {
    PhoneCall call = new PhoneCall("999", "888555", "111", "222");
    assertThat(call.getCallee(), containsString("88"));
  }

  @Test
  public void forProject1ItIsOkayIfGetStartTimeReturnsNull() {
    PhoneCall call = new PhoneCall("999", "555", "111", "222");
    assertThat(call.getStartTime(), is(nullValue()));
  }
  
}
