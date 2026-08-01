package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc0 {
    public static final java.lang.reflect.Field a = null;
    public static final java.lang.reflect.Field b = null;
    public static final java.lang.reflect.Field c = null;
    public static final boolean d = false;

    static {
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "mAttachInfo"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
            defpackage.hc0.a = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
            java.lang.String r0 = "android.view.View$AttachInfo"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
            java.lang.String r2 = "mStableInsets"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
            defpackage.hc0.b = r2     // Catch: java.lang.ReflectiveOperationException -> L2d
            r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
            java.lang.String r2 = "mContentInsets"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
            defpackage.hc0.c = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
            r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
            defpackage.hc0.d = r1     // Catch: java.lang.ReflectiveOperationException -> L2d
            return
        L2d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to get visible insets from AttachInfo "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "WindowInsetsCompat"
            android.util.Log.w(r2, r1, r0)
            return
    }
}
