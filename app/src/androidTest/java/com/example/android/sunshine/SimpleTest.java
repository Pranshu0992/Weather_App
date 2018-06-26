
package com.example.android.sunshine;

import android.os.Build;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class SimpleTest {

    @Test
    public void testAndroidVersionGreaterThanGingerbread() {
        int currentAndroidVersion = Build.VERSION.SDK_INT;
        int gingerbread = Build.VERSION_CODES.GINGERBREAD;
        assertTrue(currentAndroidVersion > gingerbread);
    }
}