package com.milen.alachef.recipes;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.milen.alachef.R;
import com.milen.alachef.data.api.CallBackRecipes;
import com.milen.alachef.data.api_model.Recipe;

import java.util.List;

public class RecipeFragment extends Fragment implements RecipesContract.View {
    public static final String TAG = "RecipeFragment_tag";
    private RecipesContract.Presenter mPresenter;


    public RecipeFragment() {
        // Required empty public constructor
    }

    public static RecipeFragment newInstance() {
        return new RecipeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mPresenter.loadPublishedRecipes(true);
        return inflater.inflate(R.layout.fragment_recipe, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.loadPublishedRecipes(false);
    }

    public void setPresenter(@NonNull RecipesContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void ToggleLoader() {

    }

    @Override
    public void showNoRecipes() {

    }

    @Override
    public void showRecipes(List<Recipe> recipes) {
        if(getView() != null){
            TextView textView = getView().findViewById(R.id.tw);
            StringBuilder result = new StringBuilder();
            for (Recipe recipe : recipes){
                result.append(recipe.getTitle()).append("\n");
            }

            textView.setText(result.toString());
        }
    }

    @Override
    public void showSearchingMenu() {

    }

    @Override
    public void showCategoriesMenu() {

    }
}
