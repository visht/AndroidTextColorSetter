package com.sdktextcolor;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;

/**
 * Utility class that includes all utility functions
 */
public class Util {

    /**
     * Setting view color
     *
     * @param view  view instance
     * @param color color value
     * @param ctx   activity context
     */
    @SuppressWarnings("deprecation")
    public void setColor(View view, int color, Context ctx) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (view instanceof TextView)
                ((TextView) view).setTextColor(ctx.getResources().getColor(color, null));
        } else {
            ((TextView) view).setTextColor(ctx.getResources().getColor(color));
        }
    }

}
