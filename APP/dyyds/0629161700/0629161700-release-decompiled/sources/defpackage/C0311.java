package defpackage;

/* JADX INFO: renamed from: ᛲᛶᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0311 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final android.os.Handler f1641 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.app.Application f1642;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f1643;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            defpackage.C0311.f1641 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.app.Activity m986() {
            ᛴᛵᛸᛴ r0 = defpackage.C0676.m1522()
            android.app.Activity r0 = r0.f3261
            ᛴᛵᛸᛴ r1 = defpackage.C0676.m1522()
            android.app.Activity r1 = r1.f3260
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
            ᛴᛵᛸᛴ r1 = defpackage.C0676.m1522()
            long r1 = r1.f3259
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
