package edu.pdx.cs410J.guhilot;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.Collection;

public class PhoneBill extends AbstractPhoneBill {
    String customer;
    public PhoneBill(String name){
        customer = name;
    }
    @Override
    public String getCustomer() {
        return customer;
    }

    @Override
    public void addPhoneCall(AbstractPhoneCall abstractPhoneCall) {
        //System.out.println(abstractPhoneCall.getCallee() + customer + abstractPhoneCall.getCaller());
        System.out.println(abstractPhoneCall.toString());
    }

    @Override
    public Collection getPhoneCalls() {
        return null;
    }
}
