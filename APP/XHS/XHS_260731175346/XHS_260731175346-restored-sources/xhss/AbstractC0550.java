package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛳᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0550 {
    private static volatile android.view.Choreographer choreographer;

    static {
            xhss.ᛵᛷᲈᛲ r0 = new xhss.ᛵᛷᲈᛲ     // Catch: java.lang.Throwable -> Lf
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r1 = m978(r1)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            xhss.ᲈᛳᛱᲇ r1 = new xhss.ᲈᛳᛱᲇ
            r1.<init>(r0)
            r0 = r1
        L16:
            boolean r1 = r0 instanceof xhss.C1129
            if (r1 == 0) goto L1b
            r0 = 0
        L1b:
            xhss.ᛵᛷᲈᛲ r0 = (xhss.C0499) r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final android.os.Handler m978(android.os.Looper r3) {
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
