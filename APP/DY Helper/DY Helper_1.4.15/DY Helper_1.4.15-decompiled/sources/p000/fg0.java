package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0014ad f3923;

    /* JADX INFO: renamed from: ζ */
    public int f3924;

    /* JADX INFO: renamed from: η */
    public int f3925;

    /* JADX INFO: renamed from: θ */
    public int f3926;

    /* JADX INFO: renamed from: ι */
    public int f3927;

    /* JADX INFO: renamed from: κ */
    public int f3928;

    public fg0(p000.InterfaceC0014ad r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3923 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            ad r0 = r0.f3923
            m42 r0 = r0.mo2105()
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r7, p000.C0793sc r9) {
            r6 = this;
            r9.getClass()
        L3:
            int r7 = r6.f3927
            ad r8 = r6.f3923
            r0 = -1
            if (r7 != 0) goto L70
            int r7 = r6.f3928
            long r2 = (long) r7
            r8.skip(r2)
            r7 = 0
            r6.f3928 = r7
            int r7 = r6.f3925
            r7 = r7 & 4
            if (r7 == 0) goto L1b
            goto L7f
        L1b:
            int r7 = r6.f3926
            int r0 = p000.sd2.m5482(r8)
            r6.f3927 = r0
            r6.f3924 = r0
            byte r0 = r8.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6.f3925 = r1
            java.util.logging.Logger r1 = p000.gg0.f4361
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r2 = r1.isLoggable(r2)
            if (r2 == 0) goto L4d
            dd r2 = p000.vf0.f11255
            int r2 = r6.f3926
            int r3 = r6.f3924
            int r4 = r6.f3925
            r5 = 1
            java.lang.String r2 = p000.vf0.m6215(r5, r2, r3, r0, r4)
            r1.fine(r2)
        L4d:
            int r8 = r8.readInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r1
            r6.f3926 = r8
            r1 = 9
            r2 = 0
            if (r0 != r1) goto L66
            if (r8 != r7) goto L60
            goto L3
        L60:
            java.lang.String r6 = "TYPE_CONTINUATION streamId changed"
            p000.C1080.m7281(r6)
            return r2
        L66:
            java.lang.String r6 = " != TYPE_CONTINUATION"
            java.lang.String r6 = p000.lz1.m3686(r6, r0)
            p000.C1080.m7281(r6)
            return r2
        L70:
            long r2 = (long) r7
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)
            long r7 = r8.mo2106(r2, r9)
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 != 0) goto L80
        L7f:
            return r0
        L80:
            int r9 = r6.f3927
            int r0 = (int) r7
            int r9 = r9 - r0
            r6.f3927 = r9
            return r7
    }
}
