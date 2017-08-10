package io.github.fanky10.android.utestingxsample;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by facundo.scoccia on 8/10/17.
 */

public class FormValidatorTest {
    @Test
    public void testInvalidEmail() {
        assertFalse(FormValidator.isEmail(null));
        assertFalse(FormValidator.isEmail(""));
        assertFalse(FormValidator.isEmail("something"));
        assertFalse(FormValidator.isEmail("something@else"));
        assertFalse(FormValidator.isEmail("something@else"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(FormValidator.isEmail("some@thing.com"));
    }
}
