package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: eh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0187eh {
    /* JADX INFO: renamed from: a */
    public static void m988a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m989b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX INFO: renamed from: c */
    public static ColorFilter m990c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public static void m991d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: e */
    public static void m992e(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* JADX INFO: renamed from: f */
    public static void m993f(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static void m994g(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* JADX INFO: renamed from: h */
    public static void m995h(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: i */
    public static void m996i(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
