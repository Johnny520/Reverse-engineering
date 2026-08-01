package defpackage;

/* JADX INFO: renamed from: ᛲᛸᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0344 {
    private static volatile android.view.Choreographer choreographer;

    static {
            ᛷᲁᛷᛵ r0 = new ᛷᲁᛷᛵ     // Catch: java.lang.Throwable -> Lf
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r1 = m1031(r1)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r0)
            r0 = r1
        L16:
            boolean r1 = r0 instanceof defpackage.C0723
            if (r1 == 0) goto L1b
            r0 = 0
        L1b:
            ᛷᲁᛷᛵ r0 = (defpackage.C1371) r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final android.os.Handler m1031(android.os.Looper r3) {
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            java.lang.String r2 = "createAsync"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object r3 = r0.invoke(r1, r3)
            android.os.Handler r3 = (android.os.Handler) r3
            return r3
    }
}
