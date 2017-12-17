package com.milen.alachef.recipes;

import android.support.annotation.NonNull;

import com.milen.alachef.data.api_model.Recipe;

import java.util.List;

public class RecipePresenter implements RecipesContract.Presenter {
    private RecipeRepository mRecipeRepository = null;
    private RecipesContract.View mViewContract = null;

    RecipePresenter(RecipesContract.View view, RecipeRepository repository) {
        mRecipeRepository = repository;
        mViewContract = view;
    }

    @Override
    public void loadPublishedRecipes(boolean forceUpdate) {
        mRecipeRepository.loadPublishedRecipes(mViewContract);
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
}
