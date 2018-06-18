package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;



@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    @Test
    public void test() throws Exception {
        MainActivityFragment fragment = new  MainActivityFragment();
        fragment.check = true;
        new EndpointAsyncTask(fragment).execute();
        Thread.sleep(11000);
        assertTrue( fragment.content != null);
    }
}
