package com.validity.utils;

import com.validity.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointUtilsTest {
    private static User master, dup, test;

    @Before
    public void build() {
        master = new User.UserBuilder()
                .withUserId(0)
                .withFirstName("asd")
                .withLastName("asd")
                .withCompany("asd")
                .withEmail("asd@asd.com")
                .withAddressOne("asd")
                .withAddressTwo("asd")
                .withCity("")
                .withStateShort("asd")
                .withStateLong("asd")
                .withZipCode(12345)
                .withPhoneNumber("")
                .build();

        dup = new User.UserBuilder()
                .withUserId(1)
                .withFirstName("asddd")
                .withLastName("asd")
                .withCompany("asd")
                .withEmail("asd@asd.com")
                .withAddressOne("asd")
                .withAddressTwo("asd")
                .withCity("")
                .withStateShort("asd")
                .withStateLong("asd")
                .withZipCode(12345)
                .withPhoneNumber("")
                .build();

        test = new User.UserBuilder()
                .withUserId(0)
                .withFirstName("")
                .withLastName("")
                .withCompany("")
                .withEmail("")
                .withAddressOne("")
                .withAddressTwo("")
                .withCity("")
                .withStateShort("")
                .withStateLong("")
                .withZipCode(0)
                .withPhoneNumber("")
                .build();
    }

    @Test
    public void computeScore() {
        PointUtils.computeScore(dup, master);
        assertEquals(2, dup.getDupScore());
    }

    @Test
    public void fullnessCalc() {

        PointUtils.fullnessCalc(test);
        assertEquals(0, test.getFullness());

        test.setCity("asd");
        PointUtils.fullnessCalc(test);
        assertEquals(1, test.getFullness());

    }

    @Test
    public void rate() {
        PointUtils.rate(99, 100);
    }
}