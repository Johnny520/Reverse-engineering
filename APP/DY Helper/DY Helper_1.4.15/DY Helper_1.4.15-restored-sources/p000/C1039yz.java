package p000;

/* JADX INFO: renamed from: yz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1039yz implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public final p000.rx1 f12878;

    /* JADX INFO: renamed from: ζ */
    public final long f12879;

    /* JADX INFO: renamed from: η */
    public final boolean f12880;

    /* JADX INFO: renamed from: θ */
    public long f12881;

    /* JADX INFO: renamed from: ι */
    public boolean f12882;

    /* JADX INFO: renamed from: κ */
    public boolean f12883;

    /* JADX INFO: renamed from: λ */
    public boolean f12884;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.C1076zz f12885;

    public C1039yz(p000.C1076zz r1, p000.rx1 r2, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r0.f12885 = r1
            r0.f12878 = r2
            r0.f12879 = r3
            r0.f12880 = r5
            r1 = 1
            r0.f12882 = r1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1b
            r1 = 0
            r0.m7050(r1)
        L1b:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f12884
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f12884 = r0
            r1.m7049()     // Catch: java.io.IOException -> L10
            r0 = 0
            r1.m7050(r0)     // Catch: java.io.IOException -> L10
            return
        L10:
            r0 = move-exception
            java.io.IOException r1 = r1.m7050(r0)
            r1.getClass()
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<yz> r1 = p000.C1039yz.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            rx1 r2 = r2.f12878
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            rx1 r0 = r0.f12878
            m42 r0 = r0.mo2105()
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r10, p000.C0793sc r12) {
            r9 = this;
            zz r10 = r9.f12885
            java.lang.String r11 = "expected "
            r12.getClass()
            boolean r0 = r9.f12884
            if (r0 != 0) goto L68
            rx1 r0 = r9.f12878     // Catch: java.io.IOException -> L1b
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.mo2106(r1, r12)     // Catch: java.io.IOException -> L1b
            boolean r12 = r9.f12882     // Catch: java.io.IOException -> L1b
            if (r12 == 0) goto L1d
            r12 = 0
            r9.f12882 = r12     // Catch: java.io.IOException -> L1b
            goto L1d
        L1b:
            r10 = move-exception
            goto L60
        L1d:
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 0
            if (r12 != 0) goto L28
            r9.m7050(r4)     // Catch: java.io.IOException -> L1b
            return r2
        L28:
            long r5 = r9.f12881     // Catch: java.io.IOException -> L1b
            long r5 = r5 + r0
            long r7 = r9.f12879
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 == 0) goto L50
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 > 0) goto L36
            goto L50
        L36:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.io.IOException -> L1b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1b
            r12.<init>(r11)     // Catch: java.io.IOException -> L1b
            r12.append(r7)     // Catch: java.io.IOException -> L1b
            java.lang.String r11 = " bytes but received "
            r12.append(r11)     // Catch: java.io.IOException -> L1b
            r12.append(r5)     // Catch: java.io.IOException -> L1b
            java.lang.String r11 = r12.toString()     // Catch: java.io.IOException -> L1b
            r10.<init>(r11)     // Catch: java.io.IOException -> L1b
            throw r10     // Catch: java.io.IOException -> L1b
        L50:
            r9.f12881 = r5     // Catch: java.io.IOException -> L1b
            java.lang.Object r10 = r10.f13382     // Catch: java.io.IOException -> L1b
            b00 r10 = (p000.b00) r10     // Catch: java.io.IOException -> L1b
            boolean r10 = r10.mo647()     // Catch: java.io.IOException -> L1b
            if (r10 == 0) goto L5f
            r9.m7050(r4)     // Catch: java.io.IOException -> L1b
        L5f:
            return r0
        L60:
            java.io.IOException r9 = r9.m7050(r10)
            r9.getClass()
            throw r9
        L68:
            java.lang.String r9 = "closed"
            p000.C1080.m7279(r9)
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: δ */
    public final void m7049() {
            r0 = this;
            rx1 r0 = r0.f12878
            r0.close()
            return
    }

    /* JADX INFO: renamed from: η */
    public final java.io.IOException m7050(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.f12883
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.f12883 = r0
            if (r3 != 0) goto L11
            boolean r0 = r2.f12882
            if (r0 == 0) goto L11
            r0 = 0
            r2.f12882 = r0
        L11:
            boolean r0 = r2.f12880
            r1 = 8
            zz r2 = r2.f12885
            java.io.IOException r2 = p000.C1076zz.m7252(r2, r0, r3, r1)
            return r2
    }
}
