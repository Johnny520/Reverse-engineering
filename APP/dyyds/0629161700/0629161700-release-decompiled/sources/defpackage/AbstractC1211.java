package defpackage;

/* JADX INFO: renamed from: ᛷᛱᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1211 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.reflect.Method f5457 = null;

    static {
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "computeFitSystemWindows"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1f
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1f
            defpackage.AbstractC1211.f5457 = r0     // Catch: java.lang.NoSuchMethodException -> L1f
            boolean r1 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L1f
            if (r1 != 0) goto L1e
            r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L1f
        L1e:
            return
        L1f:
            java.lang.String r0 = "ViewUtils"
            java.lang.String r1 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static boolean m2349(android.view.View r1) {
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }
}
