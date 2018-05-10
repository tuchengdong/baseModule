package com.arthur.tu.base.baseutil.component;


import com.arthur.tu.base.app.App;
import com.arthur.tu.base.baseutil.module.AppModule;
import com.arthur.tu.base.baseutil.module.HttpModule;
import com.arthur.tu.base.model.DataManager;
import com.arthur.tu.base.model.db.RealmHelper;
import com.arthur.tu.base.model.http.RetrofitHelper1;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    App getContext();  // 提供App的Context

    DataManager getDataManager(); //数据中心

    RetrofitHelper1 retrofitHelper();  //提供http的帮助类

    RealmHelper realmHelper();    //提供数据库帮助类

}
