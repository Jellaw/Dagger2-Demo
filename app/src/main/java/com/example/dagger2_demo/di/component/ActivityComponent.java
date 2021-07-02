package com.example.dagger2_demo.di.component;

import com.example.dagger2_demo.MainActivity;
import com.example.dagger2_demo.di.PerActivity;
import com.example.dagger2_demo.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
