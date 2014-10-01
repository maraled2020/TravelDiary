package com.khodadadi.delaram.traveldiary.injection;

import android.app.Application;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.inject.Inject;
import com.google.inject.Provider;

import roboguice.inject.ContextSingleton;

/**
 * Created by hostova1 on 01/10/2014.
 */
public class RequestProvider implements Provider<RequestQueue> {


    @Inject
    private Application context;


    @Override
    public RequestQueue get() {
        return Volley.newRequestQueue(context);
    }
}
