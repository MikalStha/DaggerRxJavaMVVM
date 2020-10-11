package com.example.daggerrxjavamvvm.di;



import com.example.daggerrxjavamvvm.di.auth.AuthModule;
import com.example.daggerrxjavamvvm.di.auth.AuthScope;
import com.example.daggerrxjavamvvm.di.auth.AuthViewModelsModule;
import com.example.daggerrxjavamvvm.di.main.MainFragmentBuildersModule;
import com.example.daggerrxjavamvvm.di.main.MainModule;
import com.example.daggerrxjavamvvm.di.main.MainScope;
import com.example.daggerrxjavamvvm.di.main.MainViewModelsModule;
import com.example.daggerrxjavamvvm.ui.auth.AuthActivity;
import com.example.daggerrxjavamvvm.ui.main.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();


    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
