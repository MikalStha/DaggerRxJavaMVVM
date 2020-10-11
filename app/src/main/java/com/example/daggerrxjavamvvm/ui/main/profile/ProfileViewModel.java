package com.example.daggerrxjavamvvm.ui.main.profile;

import android.util.Log;


import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.daggerrxjavamvvm.SessionManager;
import com.example.daggerrxjavamvvm.models.User;
import com.example.daggerrxjavamvvm.ui.auth.AuthResource;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "DaggerExample";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: viewmodel is ready...");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser(){
        return sessionManager.getAuthUser();
    }
}



















