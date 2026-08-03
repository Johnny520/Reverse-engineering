package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: a.w5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0893w5 {

    /* JADX INFO: renamed from: a.w5$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m2169a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m2170b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* JADX INFO: renamed from: c */
        public static ColorFilter m2171c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* JADX INFO: renamed from: d */
        public static void m2172d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* JADX INFO: renamed from: e */
        public static void m2173e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* JADX INFO: renamed from: f */
        public static void m2174f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* JADX INFO: renamed from: g */
        public static void m2175g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* JADX INFO: renamed from: h */
        public static void m2176h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* JADX INFO: renamed from: i */
        public static void m2177i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: a.w5$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static int m2178a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m2179b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2168a(Drawable drawable, int i) {
        a.m2175g(drawable, i);
    }
}
