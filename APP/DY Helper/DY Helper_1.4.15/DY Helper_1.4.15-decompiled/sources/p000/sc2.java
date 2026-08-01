package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class sc2 {

    /* JADX INFO: renamed from: α */
    public static final p000.n11 f9834 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.qc2[] f9835 = null;

    static {
            n11 r0 = new n11
            r1 = 8
            r0.<init>(r1)
            pc2 r2 = p000.qc2.f8962
            r2.getClass()
            rc2 r2 = p000.pc2.f8498
            r3 = 1
            r0.m3942(r3, r2)
            rc2 r4 = p000.pc2.f8497
            r5 = 2
            r0.m3942(r5, r4)
            rc2 r6 = p000.pc2.f8493
            r7 = 4
            r0.m3942(r7, r6)
            rc2 r8 = p000.pc2.f8495
            r0.m3942(r1, r8)
            rc2 r9 = p000.pc2.f8499
            r10 = 16
            r0.m3942(r10, r9)
            rc2 r10 = p000.pc2.f8496
            r11 = 32
            r0.m3942(r11, r10)
            rc2 r11 = p000.pc2.f8500
            r12 = 64
            r0.m3942(r12, r11)
            rc2 r12 = p000.pc2.f8494
            r13 = 128(0x80, float:1.8E-43)
            r0.m3942(r13, r12)
            p000.sc2.f9834 = r0
            r0 = 9
            qc2[] r0 = new p000.qc2[r0]
            r13 = 0
            r0[r13] = r2
            r0[r3] = r4
            r0[r5] = r6
            r2 = 3
            r0[r2] = r11
            r0[r7] = r9
            r2 = 5
            r0[r2] = r10
            r2 = 6
            r0[r2] = r8
            rc2 r2 = p000.pc2.f8501
            r3 = 7
            r0[r3] = r2
            r0[r1] = r12
            p000.sc2.f9835 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m5467(p000.aw0 r6, p000.hm0 r7, long r8, int r10, int r11) {
            r0 = -1
            boolean r0 = p000.j81.m2914(r8, r0)
            if (r0 != 0) goto L41
            r0 = 48
            long r0 = r8 >>> r0
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = (float) r0
            r1 = 32
            long r4 = r8 >>> r1
            long r4 = r4 & r2
            int r1 = (int) r4
            float r1 = (float) r1
            r4 = 16
            long r4 = r8 >>> r4
            long r4 = r4 & r2
            int r4 = (int) r4
            int r10 = r10 - r4
            float r10 = (float) r10
            long r8 = r8 & r2
            int r8 = (int) r8
            int r11 = r11 - r8
            float r8 = (float) r11
            te0 r9 = r7.m2520()
            r6.m615(r9, r0)
            te0 r9 = r7.m2522()
            r6.m615(r9, r1)
            te0 r9 = r7.m2521()
            r6.m615(r9, r10)
            te0 r7 = r7.m2519()
            r6.m615(r7, r8)
        L41:
            return
    }
}
