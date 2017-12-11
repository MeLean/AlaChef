package com.milen.alachef.data.api;


import com.milen.alachef.data.api_model.Recipe;

import java.util.List;

public interface CallBackRecipes {
    void onSuccess(List<Recipe> recipes);
    void onError(Throwable e);
}
