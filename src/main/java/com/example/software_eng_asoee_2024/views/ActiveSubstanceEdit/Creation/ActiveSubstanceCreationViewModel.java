package com.example.software_eng_asoee_2024.views.ActiveSubstanceEdit.Creation;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.software_eng_asoee_2024.memorydao.ActiveSubstanceDAOMemory;

public class ActiveSubstanceCreationViewModel extends ViewModel {
    private ActiveSubstanceCreationPresenter presenter;

    public ActiveSubstanceCreationViewModel(){
        presenter = new ActiveSubstanceCreationPresenter();
        presenter.setActiveSubstanceDAO(new ActiveSubstanceDAOMemory());
    }

    public ActiveSubstanceCreationPresenter getPresenter() {
        return presenter;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d("ActiveSubstanceCreation", "On Cleared");
    }
}
