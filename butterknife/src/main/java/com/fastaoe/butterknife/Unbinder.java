package com.fastaoe.butterknife;

import android.support.annotation.UiThread;

/**
 * Created by jinjin on 2017/12/7.
 * description:
 */

public interface Unbinder {
    @UiThread
    void unbind();

    Unbinder EMPTY = new Unbinder() {
        @Override
        public void unbind() {
        }
    };
}
