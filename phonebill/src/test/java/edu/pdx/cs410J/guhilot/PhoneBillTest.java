package edu.pdx.cs410J.guhilot;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class PhoneBillTest {

    /**
     * Tests to check customer name is not null
     */
    @Test
    public void getCustomer() {
        var name = "name";
        PhoneBill b = new PhoneBill(name);

        assertThat(b.getCustomer(), not(nullValue()));
        assertThat(b.getCustomer(), containsString(name));
    }

    /**
     * Getting phone calls for an empty Phone Bill works.
     */
    @Test
    public void getPhoneCalls() {
        var name = "name";
        PhoneBill b = new PhoneBill(name);

        var calls = b.getPhoneCalls();

        assertTrue(calls.isEmpty());
    }
}
