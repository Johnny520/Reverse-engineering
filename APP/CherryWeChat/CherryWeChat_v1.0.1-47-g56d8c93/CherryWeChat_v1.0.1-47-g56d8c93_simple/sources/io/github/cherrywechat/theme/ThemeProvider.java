package io.github.cherrywechat.theme;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeProvider {
    public ThemeProvider() {
    }

    public static final native boolean extractThemeFiles(String r0);

    public static final native Drawable getDrawable(Resources r0, String r1);

    public static final native Drawable getDrawableForSize(Resources r0, String r1, int r2, int r3);

    public static final native boolean installTheme(String r0, HashMap<String, Integer> r1, HashMap<String, String> r2);
}
