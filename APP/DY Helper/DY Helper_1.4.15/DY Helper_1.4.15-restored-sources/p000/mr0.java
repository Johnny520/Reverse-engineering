package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 extends p000.m92 {

    /* JADX INFO: renamed from: β */
    public final p000.n11 f7254;

    public mr0() {
            r1 = this;
            r1.<init>()
            n11 r0 = p000.tm0.f10413
            n11 r0 = new n11
            r0.<init>()
            r1.f7254 = r0
            return
    }

    @Override // p000.m92
    /* JADX INFO: renamed from: β */
    public final void mo1853() {
            r15 = this;
            n11 r15 = r15.f7254
            int[] r0 = r15.f9963
            java.lang.Object[] r1 = r15.f9964
            long[] r15 = r15.f9962
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L6e
            r3 = 0
            r4 = r3
        Lf:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L69
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L29:
            if (r9 >= r7) goto L67
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L63
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r1[r10]
            v11 r10 = (p000.v11) r10
            java.lang.Object[] r11 = r10.f11064
            int r10 = r10.f11065
            r12 = r3
        L42:
            if (r12 >= r10) goto L63
            r13 = r11[r12]
            lr0 r13 = (p000.lr0) r13
            be r14 = r13.f6751
            if (r14 == 0) goto L4f
            r14.cancel()
        L4f:
            r14 = 0
            r13.f6751 = r14
            n r13 = r13.f6748
            java.lang.Object r13 = r13.f7336
            vw0 r13 = (p000.vw0) r13
            r14 = 1
            r13.f11452 = r14
            r13.f11451 = r3
            r13.m6282()
            int r12 = r12 + 1
            goto L42
        L63:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L29
        L67:
            if (r7 != r8) goto L6e
        L69:
            if (r4 == r2) goto L6e
            int r4 = r4 + 1
            goto Lf
        L6e:
            return
    }
}
