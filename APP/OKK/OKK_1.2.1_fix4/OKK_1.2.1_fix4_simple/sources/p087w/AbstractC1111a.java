package p087w;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: w.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1111a {
    /* JADX INFO: renamed from: a */
    public static void m2619a(Drawable r02, Resources.Theme r1) {
        r02.applyTheme(r1);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2620b(Drawable r02) {
        return r02.canApplyTheme();
    }

    /* JADX INFO: renamed from: c */
    public static ColorFilter m2621c(Drawable r02) {
        return r02.getColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public static void m2622d(Drawable r02, Resources r1, XmlPullParser r2, AttributeSet r3, Resources.Theme r4) throws XmlPullParserException, IOException {
        r02.inflate(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: e */
    public static void m2623e(Drawable r02, float r1, float r2) {
        r02.setHotspot(r1, r2);
    }

    /* JADX INFO: renamed from: f */
    public static void m2624f(Drawable r02, int r1, int r2, int r3, int r4) {
        r02.setHotspotBounds(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: g */
    public static void m2625g(Drawable r02, int r1) {
        r02.setTint(r1);
    }

    /* JADX INFO: renamed from: h */
    public static void m2626h(Drawable r02, ColorStateList r1) {
        r02.setTintList(r1);
    }

    /* JADX INFO: renamed from: i */
    public static void m2627i(Drawable r02, PorterDuff.Mode r1) {
        r02.setTintMode(r1);
    }
}
