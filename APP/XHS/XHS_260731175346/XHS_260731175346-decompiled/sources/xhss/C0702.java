package xhss;

/* JADX INFO: renamed from: xhss.ᛷᲀᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0702 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2368;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.ref.WeakReference f2369;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2370;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0797 f2371;

    public C0702(xhss.C0797 r1, int r2, int r3, java.lang.ref.WeakReference r4) {
            r0 = this;
            r0.<init>()
            r0.f2371 = r1
            r0.f2370 = r2
            r0.f2368 = r3
            r0.f2369 = r4
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1223(android.graphics.Typeface r3) {
            r2 = this;
            r0 = -1
            int r1 = r2.f2370
            if (r1 == r0) goto L12
            int r0 = r2.f2368
            r0 = r0 & 2
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.graphics.Typeface r3 = xhss.AbstractC0337.m682(r3, r1, r0)
        L12:
            xhss.ᛸᲀᛳᲁ r0 = r2.f2371
            boolean r1 = r0.f2604
            if (r1 == 0) goto L38
            r0.f2601 = r3
            java.lang.ref.WeakReference r2 = r2.f2369
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L38
            boolean r1 = r2.isAttachedToWindow()
            int r0 = r0.f2605
            if (r1 == 0) goto L35
            xhss.ᲈᲈᛶᛲ r1 = new xhss.ᲈᲈᛶᛲ
            r1.<init>(r2, r3, r0)
            r2.post(r1)
            return
        L35:
            r2.setTypeface(r3, r0)
        L38:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1224() {
            r1 = this;
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            xhss.ᛲᛵᛴᲇ r0 = new xhss.ᛲᛵᛴᲇ
            r0.<init>()
            r1.post(r0)
            return
    }
}
