package com.google.android.material.resources;

import Yue.C6132;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public static Typeface maybeCopyWithFontWeightAdjustment(@InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface) {
        return maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6490
    public static Typeface maybeCopyWithFontWeightAdjustment(@InterfaceC6391 Configuration configuration, @InterfaceC6391 Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C6132.m18838(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
