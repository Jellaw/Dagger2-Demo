package com.example.dagger2_demo.di.component;

import android.app.Application;
import android.content.Context;

import com.example.dagger2_demo.DemoApplication;
import com.example.dagger2_demo.data.DataManager;
import com.example.dagger2_demo.data.DbHelper;
import com.example.dagger2_demo.data.SharedPrefsHelper;
import com.example.dagger2_demo.di.ApplicationContext;
import com.example.dagger2_demo.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}