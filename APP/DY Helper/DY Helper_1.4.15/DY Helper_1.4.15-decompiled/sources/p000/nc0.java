package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends kotlinx.coroutines.AbstractC0479 implements p000.InterfaceC0845tr {

    /* JADX INFO: renamed from: η */
    public final android.os.Handler f7513;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f7514;

    /* JADX INFO: renamed from: ι */
    public final boolean f7515;

    /* JADX INFO: renamed from: κ */
    public final p000.nc0 f7516;

    public nc0(android.os.Handler r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public nc0(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.f7513 = r2
            r1.f7514 = r3
            r1.f7515 = r4
            if (r4 == 0) goto Ld
            r4 = r1
            goto L13
        Ld:
            nc0 r4 = new nc0
            r0 = 1
            r4.<init>(r2, r3, r0)
        L13:
            r1.f7516 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.nc0
            if (r0 == 0) goto L14
            nc0 r3 = (p000.nc0) r3
            android.os.Handler r0 = r3.f7513
            android.os.Handler r1 = r2.f7513
            if (r0 != r1) goto L14
            boolean r3 = r3.f7515
            boolean r2 = r2.f7515
            if (r3 != r2) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.f7513
            int r0 = java.lang.System.identityHashCode(r0)
            boolean r1 = r1.f7515
            if (r1 == 0) goto Ld
            r1 = 1231(0x4cf, float:1.725E-42)
            goto Lf
        Ld:
            r1 = 1237(0x4d5, float:1.733E-42)
        Lf:
            r1 = r1 ^ r0
            return r1
    }

    @Override // kotlinx.coroutines.AbstractC0479
    public final java.lang.String toString() {
            r2 = this;
            jr r0 = p000.AbstractC0524lt.f6767
            nc0 r0 = p000.qw0.f9151
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            goto L14
        L9:
            r1 = 0
            nc0 r0 = r0.f7516     // Catch: java.lang.UnsupportedOperationException -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r2 != r0) goto L13
            java.lang.String r0 = "Dispatchers.Main.immediate"
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L2b
            java.lang.String r0 = r2.f7514
            if (r0 != 0) goto L20
            android.os.Handler r0 = r2.f7513
            java.lang.String r0 = r0.toString()
        L20:
            boolean r2 = r2.f7515
            if (r2 == 0) goto L2b
            java.lang.String r2 = ".immediate"
            java.lang.String r2 = p000.AbstractC0602nx.m4129(r0, r2)
            r0 = r2
        L2b:
            return r0
    }

    @Override // p000.InterfaceC0845tr
    /* JADX INFO: renamed from: δ */
    public final void mo3401(long r5, p000.C0015ae r7) {
            r4 = this;
            ｓ r0 = new ｓ
            r1 = 3
            r2 = 0
            r0.<init>(r1, r7, r4, r2)
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L11
            r5 = r1
        L11:
            android.os.Handler r1 = r4.f7513
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L24
            wa r5 = new wa
            r6 = 18
            r5.<init>(r4, r6, r0)
            r7.m89(r5)
            return
        L24:
            up r5 = r7.f197
            r4.m4019(r5, r0)
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: ρ */
    public final void mo1950(p000.InterfaceC0880up r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.f7513
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.m4019(r2, r3)
        Lb:
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: σ */
    public final boolean mo3392(p000.InterfaceC0880up r1) {
            r0 = this;
            boolean r1 = r0.f7515
            if (r1 == 0) goto L17
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Handler r0 = r0.f7513
            android.os.Looper r0 = r0.getLooper()
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public final void m4019(p000.InterfaceC0880up r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' was closed"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            xn0 r3 = p000.xn0.f12226
            sp r3 = r4.mo1785(r3)
            fo0 r3 = (p000.fo0) r3
            if (r3 == 0) goto L25
            r3.mo2180(r0)
        L25:
            jr r3 = p000.AbstractC0524lt.f6767
            er r3 = p000.ExecutorC0258er.f3647
            r3.mo1950(r4, r5)
            return
    }
}
