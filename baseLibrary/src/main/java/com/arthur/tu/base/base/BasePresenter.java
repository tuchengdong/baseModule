package com.arthur.tu.base.base;

public interface BasePresenter<T extends BaseView> {
    void attachView(T view);

    void detachView();
}
