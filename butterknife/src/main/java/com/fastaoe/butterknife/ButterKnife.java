package com.fastaoe.butterknife;

import android.app.Activity;

import java.lang.reflect.Constructor;

/**
 * Created by jinjin on 2017/12/7.
 * description:
 */

public class ButterKnife {

    public static Unbinder bind(Activity activity) {
        try {
            Class<? extends Unbinder> bindClazz = (Class<? extends Unbinder>)
                    Class.forName(activity.getClass().getName() + "_ViewBinding");
            // 构造函数
            Constructor<? extends Unbinder> bindConstructor = bindClazz.getDeclaredConstructor(activity.getClass());

            Unbinder unbinder = bindConstructor.newInstance(activity);
            return unbinder;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Unbinder.EMPTY;
    }
}
