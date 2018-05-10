package com.arthur.tu.base.baseutil.component;

import android.app.Activity;

import com.arthur.tu.base.baseutil.module.FragmentModule;
import com.arthur.tu.base.baseutil.scope.FragmentScope;

import dagger.Component;

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();

//    void inject(DiscoverFragment dailyFragment);
//
//    void inject(ClassificationFragment dailyFragment);
//
//    void inject(RecommendFragment recommendFragment);
//
//    void inject(MineFragment mineFragment);
//
//    void inject(CommentFragment commentFragment);

//    void inject(VideoIntroFragment videoIntroFragment);

}
