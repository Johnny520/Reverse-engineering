package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vw0 implements p000.go1 {

    /* JADX INFO: renamed from: ε */
    public boolean f11451;

    /* JADX INFO: renamed from: ζ */
    public boolean f11452;

    /* JADX INFO: renamed from: η */
    public boolean f11453;

    /* JADX INFO: renamed from: θ */
    public final p000.b21 f11454;

    public vw0() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f11451 = r0
            b21 r0 = new b21
            r0.<init>()
            r1.f11454 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6282() {
            r14 = this;
            b21 r14 = r14.f11454
            java.lang.Object[] r0 = r14.f1429
            long[] r1 = r14.f1427
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L54
            r3 = 0
            r4 = r3
        Ld:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L49
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r11 = r10 instanceof p000.v11
            if (r11 == 0) goto L49
            v11 r10 = (p000.v11) r10
            java.lang.Object[] r11 = r10.f11064
            int r10 = r10.f11065
            r12 = r3
        L42:
            if (r12 >= r10) goto L49
            r13 = r11[r12]
            int r12 = r12 + 1
            goto L42
        L49:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4d:
            if (r7 != r8) goto L54
        L4f:
            if (r4 == r2) goto L54
            int r4 = r4 + 1
            goto Ld
        L54:
            r14.m689()
            return
    }
}
