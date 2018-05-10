package com.arthur.tu.base.baseutil.module;


import com.arthur.tu.base.app.App;
import com.arthur.tu.base.model.DataManager;
import com.arthur.tu.base.model.db.DBHelper;
import com.arthur.tu.base.model.db.RealmHelper;
import com.arthur.tu.base.model.http.HttpHelper;
import com.arthur.tu.base.model.http.RetrofitHelper1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper1 retrofitHelper) {
        return retrofitHelper;
    }

    @Provides
    @Singleton
    DBHelper provideDBHelper(RealmHelper realmHelper) {
        return realmHelper;
    }


    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper, DBHelper DBHelper) {
        return new DataManager(httpHelper, DBHelper);
    }
}
