package com.milen.alachef.recipes;

import android.support.annotation.NonNull;

import com.milen.alachef.interfaces.BasePresenter;
import com.milen.alachef.interfaces.BaseView;
import com.milen.alachef.data.Recipe;

import java.util.List;

public interface RecipesContract {

    interface View extends BaseView<Presenter> {

        void ToggleLoader();

        void showNoRecipes();

        void showRecipes(List<Recipe> tasks);

        void showSearchingMenu();

        void showCategoriesMenu();

    }

    interface Presenter extends BasePresenter {
        void loadPublishedRecipes(boolean forceUpdate);

        void openRecipeDetails(@NonNull Recipe requestedTask);

        void searchForRecipes(@NonNull String searchRequest);
    }
}
