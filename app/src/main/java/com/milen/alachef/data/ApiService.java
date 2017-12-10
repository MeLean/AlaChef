package com.milen.alachef.data;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET(ApiEndpoints.RECIPES)
    Observable <Recipe> getAllPublishedRecipes();
}
