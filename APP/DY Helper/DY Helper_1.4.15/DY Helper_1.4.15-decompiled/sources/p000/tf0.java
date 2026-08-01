package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tf0 extends p000.of0 {

    /* JADX INFO: renamed from: ι */
    public boolean f10352;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f8069
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.f10352
            if (r0 != 0) goto Le
            vc0 r0 = p000.uf0.f10738
            r1.m4229(r0)
        Le:
            r0 = 1
            r1.f8069 = r0
            return
    }

    @Override // p000.of0, p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r3, p000.C0793sc r5) {
            r2 = this;
            r5.getClass()
            boolean r3 = r2.f8069
            if (r3 != 0) goto L22
            boolean r3 = r2.f10352
            r0 = -1
            if (r3 == 0) goto Le
            return r0
        Le:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = super.mo2106(r3, r5)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L21
            r3 = 1
            r2.f10352 = r3
            vc0 r3 = p000.vc0.f11229
            r2.m4229(r3)
            return r0
        L21:
            return r3
        L22:
            java.lang.String r2 = "closed"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }
}
