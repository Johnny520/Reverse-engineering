package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends p000.of0 {

    /* JADX INFO: renamed from: ι */
    public long f9360;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.uf0 f9361;

    public rf0(p000.uf0 r1, p000.og0 r2, long r3) {
            r0 = this;
            r2.getClass()
            r0.f9361 = r1
            r0.<init>(r1, r2)
            r0.f9360 = r3
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L15
            vc0 r1 = p000.vc0.f11229
            r0.m4229(r1)
        L15:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            boolean r0 = r4.f8069
            if (r0 == 0) goto L5
            return
        L5:
            long r0 = r4.f9360
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2a
            java.util.TimeZone r0 = p000.ud2.f10709
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            r0 = 100
            boolean r0 = p000.ud2.m5848(r4, r0)     // Catch: java.io.IOException -> L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L2a
            uf0 r0 = r4.f9361
            a00 r0 = r0.f10740
            r0.mo3()
            vc0 r0 = p000.uf0.f10738
            r4.m4229(r0)
        L2a:
            r0 = 1
            r4.f8069 = r0
            return
    }

    @Override // p000.of0, p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r8, p000.C0793sc r10) {
            r7 = this;
            r10.getClass()
            boolean r8 = r7.f8069
            if (r8 != 0) goto L43
            long r8 = r7.f9360
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto L12
            return r3
        L12:
            r5 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r8, r5)
            long r8 = super.mo2106(r8, r10)
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 == 0) goto L2f
            long r2 = r7.f9360
            long r2 = r2 - r8
            r7.f9360 = r2
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L2e
            vc0 r10 = p000.vc0.f11229
            r7.m4229(r10)
        L2e:
            return r8
        L2f:
            uf0 r8 = r7.f9361
            a00 r8 = r8.f10740
            r8.mo3()
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r9 = "unexpected end of stream"
            r8.<init>(r9)
            vc0 r9 = p000.uf0.f10738
            r7.m4229(r9)
            throw r8
        L43:
            java.lang.String r7 = "closed"
            p000.C1080.m7279(r7)
            r7 = 0
            return r7
    }
}
