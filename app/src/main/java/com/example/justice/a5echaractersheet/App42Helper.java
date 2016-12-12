package com.example.justice.a5echaractersheet;

/**
 * Created by Justice on 12/11/2016.
 */

import com.shephertz.app42.paas.sdk.android.App42API;
import com.shephertz.app42.paas.sdk.android.App42Response;
import com.shephertz.app42.paas.sdk.android.App42Exception;
import com.shephertz.app42.paas.sdk.android.App42BadParameterException;
import android.content.Context;

public class App42Helper {
    Context Android_Application_Context;

    public App42Helper(Context context){
        Android_Application_Context = context;

        App42API.initialize(Android_Application_Context,
                "b96b23dbfc68837e0048ed7af7e4120e8c7b85914eb498f444ca6b0c905d003f",
                "c4165b0524b15e753cd86ed8732839be274cdeed9da22746bfb1ec43f87af1ab")///////////////////////////////////////////////////
    }
}
