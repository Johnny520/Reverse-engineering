package p000;

import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

/* JADX INFO: renamed from: Q */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0688Q {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Typeface.CustomFallbackBuilder m1399c(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m1401e(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ FontFamily.Builder m1405i(Font font) {
        return new FontFamily.Builder(font);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1409m() {
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m1417u(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m1420x() {
    }
}
