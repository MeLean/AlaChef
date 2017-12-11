package com.milen.alachef.data.api;

import com.milen.alachef.data.api_model.Recipe;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET(ApiEndpoints.RECIPES)
    Observable <List<Recipe>> getAllPublishedRecipes();
}
