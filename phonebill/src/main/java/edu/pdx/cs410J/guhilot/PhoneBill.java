package edu.pdx.cs410J.guhilot;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PhoneBill extends AbstractPhoneBill {

    String customer;
    List<AbstractPhoneCall> calls = new ArrayList<>();


    public PhoneBill(String name){
        this.customer = name;
    }
    @Override
    public String getCustomer()
    {
        return this.customer;
    }



    @Override
    public void addPhoneCall(AbstractPhoneCall abstractPhoneCall)
    {
        this.calls.add(abstractPhoneCall);
    }


    @Override
    public Collection getPhoneCalls() {
        return this.calls;
    }
}

