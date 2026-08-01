package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class oc0 {
    private static volatile android.view.Choreographer choreographer;

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ int f8027 = 0;

    static {
            nc0 r0 = new nc0     // Catch: java.lang.Throwable -> Le
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Le
            android.os.Handler r1 = m4217(r1)     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L15:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L1a
            r0 = 0
        L1a:
            nc0 r0 = (p000.nc0) r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler m4217(android.os.Looper r3) {
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            java.lang.String r2 = "createAsync"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object r3 = r0.invoke(r1, r3)
            r3.getClass()
            android.os.Handler r3 = (android.os.Handler) r3
            return r3
    }
}
