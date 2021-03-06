package types.concrete;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import types.TypeTests;

public class AttendeeTest extends TypeTests<Attendee> {

    @Test
    public void twoProfilesCanBeCompared() throws Exception {
        assertThat(Attendee.is("A").compareTo(Attendee.is("B")), is(lessThan(0)));
        assertThat(Attendee.is("B").compareTo(Attendee.is("A")), is(greaterThan(0)));
    }

    @Override
    protected Attendee fromString(String s) {
        return Attendee.is(s);
    }

    @Override
    protected Attendee nullValue() {
        return Attendee.NULL;
    }
}
