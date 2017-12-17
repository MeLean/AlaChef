package com.milen.alachef.recipes;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.milen.alachef.R;
import com.milen.alachef.data.api_model.Recipe;
import com.milen.alachef.dialogs.OkDialogShower;
import com.milen.alachef.youtube.VideoActivity;

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
        View view = inflater.inflate(R.layout.fragment_recipe, container, false);
        mPresenter.loadPublishedRecipes(true);
        view.findViewById(R.id.btn_play_video).setOnClickListener(
                v -> startActivity(new Intent(getActivity(), VideoActivity.class))
        );
        return view;
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
    public void onUnknownError(String errorMessage) {
        OkDialogShower.showDialog(getContext(), getString(R.string.an_error), errorMessage);
    }

    @Override
    public void onTimeout() {
        OkDialogShower.showDialog(getContext(), getString(R.string.an_error), getString(R.string.timeout_error));
    }

    @Override
    public void onNetworkError() {
        OkDialogShower.showDialog(getContext(), getString(R.string.an_error), getString(R.string.network_error));
    }

    @Override
    public void ToggleLoader() {
        // TODO: 16/12/2017
    }

    @Override
    public void showNoRecipes() {
        // TODO: 16/12/2017
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
