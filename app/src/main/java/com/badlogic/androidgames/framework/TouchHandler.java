package com.badlogic.androidgames.framework;

import android.view.View;

import java.util.List;

/**
 * Created by J_westendarp on 4/7/2015.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
