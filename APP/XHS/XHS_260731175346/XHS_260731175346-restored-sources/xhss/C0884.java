package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0884 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final android.os.Handler f2841 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f2842;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public android.app.Application f2843;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            xhss.C0884.f2841 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static android.app.Activity m1444() {
            xhss.ᛴᛴᛲᛸ r0 = xhss.C0354.m711()
            android.app.Activity r0 = r0.f1310
            xhss.ᛴᛴᛲᛸ r1 = xhss.C0354.m711()
            android.app.Activity r1 = r1.f1312
            if (r1 == 0) goto L3b
            if (r0 != 0) goto L11
            goto L3b
        L11:
            if (r1 == r0) goto L14
            goto L3b
        L14:
            boolean r1 = r0.isFinishing()
            if (r1 == 0) goto L1b
            goto L3b
        L1b:
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L22
            goto L3b
        L22:
            xhss.ᛴᛴᛲᛸ r1 = xhss.C0354.m711()
            long r1 = r1.f1311
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 36
            if (r3 < r4) goto L3a
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r1 = 200(0xc8, double:9.9E-322)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L3a
            goto L3b
        L3a:
            return r0
        L3b:
            r0 = 0
            return r0
    }
}
