package com.coolweather.app.util;


/**
 * Created by 张泽晗 on 2016/7/25.
 * 回调服务返回的结果
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
