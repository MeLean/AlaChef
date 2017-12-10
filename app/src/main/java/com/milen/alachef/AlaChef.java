package com.milen.alachef;

import android.app.Application;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class AlaChef extends Application {
    private Retrofit mRetrofit;
    @Override
    public void onCreate() {
        super.onCreate();


    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }

    private void setRetrofit(Retrofit mRetrofit) {
        this.mRetrofit = mRetrofit;
    }
}
