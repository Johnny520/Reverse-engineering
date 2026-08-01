package p000;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1009y5 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f12456;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ int f12457;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.ref.WeakReference f12458;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ p000.C0201d6 f12459;

    public C1009y5(p000.C0201d6 r1, int r2, int r3, java.lang.ref.WeakReference r4) {
            r0 = this;
            r0.<init>()
            r0.f12459 = r1
            r0.f12456 = r2
            r0.f12457 = r3
            r0.f12458 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6834(int r3) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            fb0 r1 = new fb0
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m6835(android.graphics.Typeface r3) {
            r2 = this;
            r0 = -1
            int r1 = r2.f12456
            if (r1 == r0) goto L12
            int r0 = r2.f12457
            r0 = r0 & 2
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.graphics.Typeface r3 = p000.AbstractC0102c6.m1143(r3, r1, r0)
        L12:
            d6 r0 = r2.f12459
            boolean r1 = r0.f2919
            if (r1 == 0) goto L38
            r0.f2918 = r3
            java.lang.ref.WeakReference r2 = r2.f12458
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L38
            boolean r1 = r2.isAttachedToWindow()
            int r0 = r0.f2916
            if (r1 == 0) goto L35
            z5 r1 = new z5
            r1.<init>(r2, r3, r0)
            r2.post(r1)
            return
        L35:
            r2.setTypeface(r3, r0)
        L38:
            return
    }
}
