package com.irozon.library;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by dell on 2/28/2017.
 */

public class HideKey {
    private Context activityContext;

    private HideKey(Context context) {
        activityContext = context;
        View rootView = ((Activity) activityContext).getWindow().getDecorView().findViewById(android.R.id.content);
        setupUI(rootView);
    }

    private HideKey(Context context, View view) {
        activityContext = context;
        setupUI(view);
    }

    public static void initialize(Context context) {
        new HideKey(context);
    }

    public static void initialize(Context context, View view) {
        new HideKey(context, view);
    }

    private void setupUI(View obj) {
        if (!(obj instanceof EditText)) {
            obj.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    hideSoftKeyboard();
                    return false;
                }
            });
        }
        if (obj instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) obj).getChildCount(); i++) {
                View innerView = ((ViewGroup) obj).getChildAt(i);
                setupUI(innerView);
            }
        }
    }

    private void hideSoftKeyboard() {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activityContext
                    .getSystemService(Activity.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(
                    ((Activity) activityContext).getCurrentFocus().getWindowToken(), 0);

        } catch (Exception e) {

        }
    }
}