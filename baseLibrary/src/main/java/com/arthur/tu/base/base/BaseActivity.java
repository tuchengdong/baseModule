package com.arthur.tu.base.base;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.arthur.tu.base.R;
import com.arthur.tu.base.app.App;
import com.arthur.tu.base.utils.PreUtils;
import com.arthur.tu.base.utils.ScreenUtil;

import me.yokeyword.fragmentation.SupportActivity;

//for test
public abstract class BaseActivity extends SupportActivity {

    protected Activity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();

        setContentView(getLayout());
        getIntentData();
        mContext = this;
        initView();
        initEvent();
    }

    protected void init() {
        setTranslucentStatus(true);
        App.getInstance().registerActivity(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setTitleHeight(getRootView(this));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getInstance().unregisterActivity(this);
    }

    /**
     * 设置沉浸式
     *
     * @param on
     */
    protected void setTranslucentStatus(boolean on) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window win = getWindow();
            WindowManager.LayoutParams winParams = win.getAttributes();
            final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
            if (on) {
                winParams.flags |= bits;
            } else {
                winParams.flags &= ~bits;
            }
            win.setAttributes(winParams);
        }
    }

    private void setTitleHeight(View view) {
//        if (view != null) {
//            ColorRelativeLayout title = (ColorRelativeLayout) view.findViewById(R.id.title);
//            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
//                if (title != null) {
//                    ViewGroup.LayoutParams lp = title.getLayoutParams();
//                    lp.height = ScreenUtil.dip2px(this, 48);
//                    title.setLayoutParams(lp);
//                    title.setPadding(0, 0, 0, 0);
//                }
//            }
//        }
    }

    protected static View getRootView(Activity context) {
        return ((ViewGroup) context.findViewById(android.R.id.content)).getChildAt(0);
    }

    protected abstract int getLayout();

    protected void initView() {
    }

    protected void initEvent() {
    }

    protected void getIntentData() {
    }
}
