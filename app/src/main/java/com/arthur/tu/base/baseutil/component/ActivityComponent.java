package com.arthur.tu.base.baseutil.component;

import android.app.Activity;

import com.arthur.tu.base.baseutil.module.ActivityModule;
import com.arthur.tu.base.baseutil.scope.ActivityScope;
//import com.zcy.ghost.vivideo.ui.activitys.CollectionActivity;
//import com.zcy.ghost.vivideo.ui.activitys.HistoryActivity;
//import com.zcy.ghost.vivideo.ui.activitys.SearchActivity;
//import com.zcy.ghost.vivideo.ui.activitys.VideoInfoActivity;
//import com.zcy.ghost.vivideo.ui.activitys.VideoListActivity;
import com.arthur.tu.base.ui.activitys.WelcomeActivity;
//import com.zcy.ghost.vivideo.ui.activitys.WelfareActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {
    Activity getActivity();

//    void inject(VideoInfoActivity videoInfoActivity);

    void inject(WelcomeActivity welcomeActivity);

//    void inject(CollectionActivity collectionActivity);

//    void inject(HistoryActivity historyActivity);

//    void inject(SearchActivity searchActivity);

//    void inject(VideoListActivity videoListActivity);

//    void inject(WelfareActivity welfareActivity);

}
