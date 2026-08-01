package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb0 {
    public static final java.lang.reflect.Method a = null;
    public static final boolean b = false;

    static {
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 27
            r3 = 1
            if (r1 < r2) goto Lb
            r1 = r3
            goto Lc
        Lb:
            r1 = 0
        Lc:
            defpackage.cb0.b = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "computeFitSystemWindows"
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0}     // Catch: java.lang.NoSuchMethodException -> L26
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L26
            defpackage.cb0.a = r0     // Catch: java.lang.NoSuchMethodException -> L26
            boolean r1 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L26
            if (r1 != 0) goto L25
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L26
        L25:
            return
        L26:
            java.lang.String r0 = "ViewUtils"
            java.lang.String r1 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r0, r1)
            return
    }

    public static boolean a(android.view.View r1) {
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r1 = defpackage.t90.d(r1)
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }
}
