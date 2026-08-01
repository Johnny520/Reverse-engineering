package p087s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0962a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2136a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m2137b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ColorFilter m2138c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2139d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2140e(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m2141f(Drawable drawable, int i2, int i3, int i4, int i5) {
        drawable.setHotspotBounds(i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2142g(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2143h(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2144i(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
