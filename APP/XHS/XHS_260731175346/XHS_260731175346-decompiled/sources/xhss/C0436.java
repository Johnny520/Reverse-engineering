package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛱᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0436 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public long f1556;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long f1557;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C1011 f1558;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public android.os.Handler f1559;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int f1560;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public float f1561;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f1562;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public float f1563;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f1564;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public android.view.animation.Interpolator f1565;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public int f1566;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0436 m817(float r3, float r4) {
            xhss.ᛵᛱᛲᛶ r0 = new xhss.ᛵᛱᛲᛶ
            r0.<init>()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f1559 = r1
            r1 = 0
            r0.f1564 = r1
            r0.f1560 = r1
            r0.f1562 = r1
            r1 = 16
            r0.f1566 = r1
            r0.f1563 = r3
            r0.f1561 = r4
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m818() {
            r3 = this;
            boolean r0 = r3.f1564
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f1564 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r3.f1557 = r0
            java.lang.Thread r0 = new java.lang.Thread
            xhss.ᛴᲈᲀᲇ r1 = new xhss.ᛴᲈᲀᲇ
            r2 = 1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }
}
