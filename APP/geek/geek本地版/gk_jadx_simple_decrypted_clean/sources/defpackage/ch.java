package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class ch {
    public static void a(Drawable r0, Resources.Theme r1) {
        r0.applyTheme(r1);
    }

    public static boolean b(Drawable r0) {
        return r0.canApplyTheme();
    }

    public static ColorFilter c(Drawable r0) {
        return r0.getColorFilter();
    }

    public static void d(Drawable r0, Resources r1, XmlPullParser r2, AttributeSet r3, Resources.Theme r4) {
        r0.inflate(r1, r2, r3, r4);
    }

    public static void e(Drawable r0, float r1, float r2) {
        r0.setHotspot(r1, r2);
    }

    public static void f(Drawable r0, int r1, int r2, int r3, int r4) {
        r0.setHotspotBounds(r1, r2, r3, r4);
    }

    public static void g(Drawable r0, int r1) {
        r0.setTint(r1);
    }

    public static void h(Drawable r0, ColorStateList r1) {
        r0.setTintList(r1);
    }

    public static void i(Drawable r0, PorterDuff.Mode r1) {
        r0.setTintMode(r1);
    }
}
