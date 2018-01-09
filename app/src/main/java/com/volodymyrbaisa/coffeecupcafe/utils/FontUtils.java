package com.volodymyrbaisa.coffeecupcafe.utils;

import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by Bios on 1/9/2018.
 */

public class FontUtils {
    private FontUtils() {
        throw new IllegalAccessError("Utility class");
    }

    public static void setFont(TextView textView, String fontName) {
        if (textView != null) {
            textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
        }
    }
}
