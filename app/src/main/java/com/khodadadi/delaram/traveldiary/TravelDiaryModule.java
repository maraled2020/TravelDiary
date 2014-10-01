package com.khodadadi.delaram.traveldiary;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.google.gson.Gson;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;
import com.khodadadi.delaram.traveldiary.injection.RequestProvider;
import com.squareup.otto.Bus;

/**
 * Created by hostova1 on 30/09/2014.
 */
public class TravelDiaryModule implements Module {

    private Context context;

    public TravelDiaryModule(Context context) {
        this.context = context;
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(Bus.class).in(Singleton.class);

        binder.bind(Gson.class).in(Singleton.class);

        binder.bind(RequestQueue.class)
                .toProvider(new RequestProvider()).in(Singleton.class);

    }
}
