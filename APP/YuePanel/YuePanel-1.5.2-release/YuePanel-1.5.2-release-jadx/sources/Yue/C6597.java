package Yue;

import Yue.C3542;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥۣۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6597 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2163 = "\udfffd";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f2164 = "m";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final ThreadLocal<C6600<Rect, Rect>> f16966 = new ThreadLocal<>();

    /* JADX INFO: renamed from: Yue.ۥۣۡۦ$ۥ */
    @InterfaceC7113(23)
    public static class C1025 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m3059(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۦ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C1026 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3060(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3057(@InterfaceC6391 Paint paint, @InterfaceC6391 String str) {
        return C1025.m3059(paint, str);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C6600<Rect, Rect> m3058() {
        ThreadLocal<C6600<Rect, Rect>> threadLocal = f16966;
        C6600<Rect, Rect> c6600 = threadLocal.get();
        if (c6600 == null) {
            C6600<Rect, Rect> c66002 = new C6600<>(new Rect(), new Rect());
            threadLocal.set(c66002);
            return c66002;
        }
        c6600.f2165.setEmpty();
        c6600.f2166.setEmpty();
        return c6600;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m20935(@InterfaceC6391 Paint paint, @InterfaceC6490 EnumC3541 enumC3541) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1026.m3060(paint, enumC3541 != null ? C3542.C0177.m619(enumC3541) : null);
            return true;
        }
        if (enumC3541 == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeM618 = C3542.m618(enumC3541);
        paint.setXfermode(modeM618 != null ? new PorterDuffXfermode(modeM618) : null);
        return modeM618 != null;
    }
}
