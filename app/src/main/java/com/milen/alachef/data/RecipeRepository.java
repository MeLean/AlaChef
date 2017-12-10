package com.milen.alachef.data;


import android.content.Context;
import android.support.annotation.Nullable;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;

public class RecipeRepository {
    @Nullable
    private static RecipeRepository INSTANCE = null;
    private static ApiService mApiService = null;


    public static RecipeRepository getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new RecipeRepository();
            int cacheSize = 10 * 1024 * 1024; // 10 MB
            Cache cache = new Cache(context.getCacheDir(), cacheSize);

            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .cache(cache)
                    .build();
            //todo change
            String BASE_URL =
                    "https://api.backendless.com/FC4BAD70-B62A-8B21-FFF6-320A81C98E00/23B91B91-BB8E-4E47-FF2F-A07500C54000/data/";
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create());
            mApiService = builder.build().create(ApiService.class);
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }


    public void getPublishedRecipes(Callback<Recipe> callback ){
        Observable recipesObservable = mApiService.getAllPublishedRecipes();

        recipesObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Recipe>() {
                               @Override
                               public void onCompleted() {

                               }

                               @Override
                               public void onError(Throwable e) {

                               }

                               @Override
                               public void onNext(Recipe recipe) {

                               }
                           }
                   );
    }

}

