package io.github.cherrywechat.theme;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeProvider {
    public static final native boolean extractThemeFiles(String str);

    public static final native Drawable getDrawable(Resources resources, String str);

    public static final native Drawable getDrawableForSize(Resources resources, String str, int i, int i2);

    public static final native boolean installTheme(String str, HashMap<String, Integer> map, HashMap<String, String> map2);
}
