package com.milen.alachef.recipes;

import android.support.annotation.NonNull;

import com.milen.alachef.data.api.CallBackRecipes;
import com.milen.alachef.data.api_model.Recipe;

import java.util.List;

public class RecipePresenter implements RecipesContract.Presenter, CallBackRecipes {
    private RecipeRepository mRecipeRepository = null;
    private RecipesContract.View mViewContract = null;

    RecipePresenter(RecipesContract.View view, RecipeRepository repository) {
        mRecipeRepository = repository;
        mViewContract = view;
    }

    @Override
    public void loadPublishedRecipes(boolean forceUpdate) {
        mRecipeRepository.loadPublishedRecipes(this);
    }

    @Override
    public void openRecipeDetails(@NonNull Recipe requestedTask) {

    }

    @Override
    public void searchForRecipes(@NonNull String searchRequest) {

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void onSuccess(List<Recipe> recipes) {
        mViewContract.showRecipes(recipes);
    }

    @Override
    public void onError(Throwable e) {
        e.getStackTrace();
    }

}
