package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xg {
    public static android.view.DisplayCutout a(android.graphics.Rect r1, java.util.List<android.graphics.Rect> r2) {
            android.view.DisplayCutout r0 = new android.view.DisplayCutout
            r0.<init>(r1, r2)
            return r0
    }

    public static java.util.List<android.graphics.Rect> b(android.view.DisplayCutout r0) {
            java.util.List r0 = r0.getBoundingRects()
            return r0
    }

    public static int c(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetBottom()
            return r0
    }

    public static int d(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetLeft()
            return r0
    }

    public static int e(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetRight()
            return r0
    }

    public static int f(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetTop()
            return r0
    }
}
