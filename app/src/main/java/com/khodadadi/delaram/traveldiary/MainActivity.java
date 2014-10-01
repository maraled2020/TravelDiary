package com.khodadadi.delaram.traveldiary;

import android.os.Bundle;
import android.view.View;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.inject.Inject;

import roboguice.activity.RoboActivity;

public class MainActivity extends RoboActivity implements View.OnClickListener {

    @Inject
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        requestQueue.add(new Request<Object>(Request.Method.GET,"https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&types=food&name=cruise&key=AIzaSyDCh8uQ1hyGD4OEp49L6aTyQEAmAZcgUCo", new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }) {
            @Override
            protected Response<Object> parseNetworkResponse(NetworkResponse networkResponse) {
                return null;
            }

            @Override
            protected void deliverResponse(Object o) {

            }
        });
    }
}
