package com.google.android.material.color;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class ThemeUtils {
    private ThemeUtils() {
    }

    public static void applyThemeOverlay(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
        Resources.Theme windowDecorViewTheme;
        context.getTheme().applyStyle(i, true);
        if (!(context instanceof Activity) || (windowDecorViewTheme = getWindowDecorViewTheme((Activity) context)) == null) {
            return;
        }
        windowDecorViewTheme.applyStyle(i, true);
    }

    @InterfaceC6490
    private static Resources.Theme getWindowDecorViewTheme(@InterfaceC6391 Activity activity) {
        View viewPeekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
