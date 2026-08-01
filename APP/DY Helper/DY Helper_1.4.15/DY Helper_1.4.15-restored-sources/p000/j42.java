package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j42 {

    /* JADX INFO: renamed from: α */
    public final p000.n11 f5315;

    /* JADX INFO: renamed from: β */
    public long f5316;

    /* JADX INFO: renamed from: γ */
    public long f5317;

    /* JADX INFO: renamed from: δ */
    public long f5318;

    /* JADX INFO: renamed from: ε */
    public long f5319;

    public j42() {
            r2 = this;
            r2.<init>()
            n11 r0 = p000.tm0.f10413
            n11 r0 = new n11
            r0.<init>()
            r2.f5315 = r0
            r0 = -1
            r2.f5316 = r0
            r0 = 0
            r2.f5317 = r0
            r2.f5318 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m2861(long r5, long r7, float[] r9, int r10, int r11) {
            r4 = this;
            long r0 = r4.f5317
            boolean r0 = p000.um0.m5938(r7, r0)
            r1 = 1
            if (r0 != 0) goto Ld
            r4.f5317 = r7
            r7 = r1
            goto Le
        Ld:
            r7 = 0
        Le:
            long r2 = r4.f5318
            boolean r8 = p000.um0.m5938(r5, r2)
            if (r8 != 0) goto L19
            r4.f5318 = r5
            r7 = r1
        L19:
            if (r9 == 0) goto L1c
            r7 = r1
        L1c:
            long r5 = (long) r10
            r8 = 32
            long r5 = r5 << r8
            long r8 = (long) r11
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r5 = r5 | r8
            long r8 = r4.f5319
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L31
            r4.f5319 = r5
            return r1
        L31:
            return r7
    }
}
