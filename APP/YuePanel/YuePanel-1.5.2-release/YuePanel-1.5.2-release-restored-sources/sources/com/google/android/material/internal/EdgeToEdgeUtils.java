package com.google.android.material.internal;

import Yue.C3913;
import Yue.C8273;
import Yue.C8436;
import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void applyEdgeToEdge(@InterfaceC6391 Window window, boolean z) {
        applyEdgeToEdge(window, z, null, null);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C3913.m11173(MaterialColors.getColor(context, R.attr.navigationBarColor, C8273.f24692), 128);
        }
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, C8273.f24692);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, C8273.f24692);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z) {
        return MaterialColors.isColorLight(i) || (i == 0 && z);
    }

    public static void setLightNavigationBar(@InterfaceC6391 Window window, boolean z) {
        C8436.m4422(window, window.getDecorView()).m28369(z);
    }

    public static void setLightStatusBar(@InterfaceC6391 Window window, boolean z) {
        C8436.m4422(window, window.getDecorView()).m28370(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void applyEdgeToEdge(@InterfaceC6391 Window window, boolean z, @InterfaceC3897 @InterfaceC6490 Integer num, @InterfaceC3897 @InterfaceC6490 Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, C8273.f24692);
            if (z2) {
                num = Integer.valueOf(color);
            }
            if (z3) {
                num2 = Integer.valueOf(color);
            }
        }
        C8436.m28223(window, !z);
        int statusBarColor = getStatusBarColor(window.getContext(), z);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }
}
