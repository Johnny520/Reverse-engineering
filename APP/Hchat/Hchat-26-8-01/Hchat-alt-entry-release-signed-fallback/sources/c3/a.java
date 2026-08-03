package c3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static android.os.Handler a(android.os.Looper r0) {
            android.os.Handler r0 = android.os.Handler.createAsync(r0)
            return r0
    }

    public static java.util.List b(android.view.DisplayCutout r0) {
            java.util.List r0 = r0.getBoundingRects()
            return r0
    }

    public static int c(java.lang.Object r0) {
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r0 = r0.getResId()
            return r0
    }

    public static int d(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetBottom()
            return r0
    }

    public static int e(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetLeft()
            return r0
    }

    public static int f(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetRight()
            return r0
    }

    public static int g(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetTop()
            return r0
    }
}
