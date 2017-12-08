package com.fastaoe.butterknife;

import android.app.Activity;
import android.view.View;

/**
 * Created by jinjin on 2017/12/8.
 * description:
 */

public class Utils {

    public static <T extends View> T findViewById(Activity activity, int resourceId) {
        return (T) activity.findViewById(resourceId);
    }
}
