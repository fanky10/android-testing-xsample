package io.github.fanky10.android.utestingxsample;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by facundo.scoccia on 8/10/17.
 */

public class FormValidatorTest {

    private static final int PASSWORD_SIZE = 6;

    @Test
    public void testInvalidEmail() {
        assertFalse(FormValidator.isEmail(null));
        assertFalse(FormValidator.isEmail(""));
        assertFalse(FormValidator.isEmail("something"));
        assertFalse(FormValidator.isEmail("something@else"));
        assertFalse(FormValidator.isEmail("something@else.a"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(FormValidator.isEmail("some@thing.com"));
    }

    @Test
    public void testNotLongEnoughPassword(){
        assertFalse(FormValidator.isLongEnough(PASSWORD_SIZE, null));
        assertFalse(FormValidator.isLongEnough(PASSWORD_SIZE, ""));
        assertFalse(FormValidator.isLongEnough(PASSWORD_SIZE, "test"));
    }

    @Test
    public void testLongEnoughPassword(){
        assertTrue(FormValidator.isLongEnough(PASSWORD_SIZE, "123456"));
        assertTrue(FormValidator.isLongEnough(PASSWORD_SIZE, "1234567"));
    }
}
