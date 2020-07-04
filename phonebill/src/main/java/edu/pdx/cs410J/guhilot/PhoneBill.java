package edu.pdx.cs410J.guhilot;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class extends the AbstractPhoneBill superclass and implement all its methods
 */

public class PhoneBill extends AbstractPhoneBill {

    /**
     * customer is the caller
     */
    String customer;

    /**
     * List of calls made
     */
    List<AbstractPhoneCall> calls = new ArrayList<>();

    /**
     * Phone bill constructor
     */
    public PhoneBill(String name){
        this.customer = name;
    }


    /**
     * This method is used to retrieve the name of the caller
     * @return This returns the name of the caller
     */
    @Override
    public String getCustomer()
    {
        return this.customer;
    }


    /**
     * This method is used to add the phone call to the phone bill
     * @param abstractPhoneCall The object of the class AbstractPhoneCall
     */
    @Override
    public void addPhoneCall(AbstractPhoneCall abstractPhoneCall)
    {
        this.calls.add(abstractPhoneCall);
    }

    /**
     * This method is used to retrieve the calls added to the bill
     * @return This returns a list of calls that have been added to the bill
     */
    @Override
    public Collection getPhoneCalls() {
        return this.calls;
    }
}

