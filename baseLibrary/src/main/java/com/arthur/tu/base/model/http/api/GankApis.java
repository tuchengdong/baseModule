package com.arthur.tu.base.model.http.api;


import com.arthur.tu.base.model.bean.GankHttpResponse;
import com.arthur.tu.base.model.bean.GankItemBean;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GankApis {

    String HOST = "http://gank.io/api/";

    /**
     * 福利列表
     */
    @GET("data/福利/{num}/{page}")
    Observable<GankHttpResponse<List<GankItemBean>>> getGirlList(@Path("num") int num, @Path("page") int page);

}
