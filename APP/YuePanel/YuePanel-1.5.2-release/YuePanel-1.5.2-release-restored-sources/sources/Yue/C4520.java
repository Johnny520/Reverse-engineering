package Yue;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4520 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f941 = "DrawableCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static Method f942;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f9634;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Method f9635;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean f9636;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۥ$ۥ */
    @InterfaceC7113(21)
    public static class C0424 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m1448(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m1449(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static ColorFilter m13240(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m13241(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m13242(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m13243(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m13244(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m13245(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static void m13246(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۥ$ۥ۟ */
    @InterfaceC7113(23)
    public static class C0425 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m1450(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m1451(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m1446(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Resources.Theme theme) {
        C0424.m1448(drawable, theme);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m1447(@InterfaceC6391 Drawable drawable) {
        return C0424.m1449(drawable);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m13224(@InterfaceC6391 Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m13225(@InterfaceC6391 Drawable drawable) {
        return drawable.getAlpha();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static ColorFilter m13226(@InterfaceC6391 Drawable drawable) {
        return C0424.m13240(drawable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m13227(@InterfaceC6391 Drawable drawable) {
        return C0425.m1450(drawable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m13228(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        C0424.m13241(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m13229(@InterfaceC6391 Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m13230(@InterfaceC6391 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m13231(@InterfaceC6391 Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m13232(@InterfaceC6391 Drawable drawable, float f, float f2) {
        C0424.m13242(drawable, f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m13233(@InterfaceC6391 Drawable drawable, int i, int i2, int i3, int i4) {
        C0424.m13243(drawable, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m13234(@InterfaceC6391 Drawable drawable, int i) {
        return C0425.m1451(drawable, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m13235(@InterfaceC6391 Drawable drawable, @InterfaceC3897 int i) {
        C0424.m13244(drawable, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m13236(@InterfaceC6391 Drawable drawable, @InterfaceC6490 ColorStateList colorStateList) {
        C0424.m13245(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m13237(@InterfaceC6391 Drawable drawable, @InterfaceC6490 PorterDuff.Mode mode) {
        C0424.m13246(drawable, mode);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static <T extends Drawable> T m13238(@InterfaceC6391 Drawable drawable) {
        return drawable instanceof InterfaceC8534 ? (T) ((InterfaceC8534) drawable).mo4522() : drawable;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static Drawable m13239(@InterfaceC6391 Drawable drawable) {
        return drawable;
    }
}
