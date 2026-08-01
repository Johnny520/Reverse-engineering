package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements p000.qx0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4430;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.qx0 f4431;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ p000.kq0 f4432;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ int f4433;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.qx0 f4434;

    public /* synthetic */ gq0(p000.qx0 r1, p000.kq0 r2, int r3, p000.qx0 r4, int r5) {
            r0 = this;
            r0.f4430 = r5
            r0.f4432 = r2
            r0.f4433 = r3
            r0.f4434 = r4
            r0.f4431 = r1
            r0.<init>()
            return
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: α */
    public final void mo1622() {
            r18 = this;
            r0 = r18
            int r1 = r0.f4430
            switch(r1) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            int r1 = r0.f4433
            kq0 r2 = r0.f4432
            r2.f6082 = r1
            qx0 r0 = r0.f4434
            r0.mo1622()
            yp0 r0 = r2.f6080
            yp0 r0 = r0.f12750
            if (r0 != 0) goto L1d
            int r0 = r2.f6082
            r2.m3405(r0)
        L1d:
            return
        L1e:
            int r1 = r0.f4433
            kq0 r2 = r0.f4432
            r2.f6083 = r1
            qx0 r0 = r0.f4434
            r0.mo1622()
            k21 r0 = r2.f6091
            b21 r1 = r2.f6090
            long[] r3 = r1.f1427
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La0
            r6 = 0
        L35:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9b
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L4f:
            if (r11 >= r9) goto L98
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8f
            int r12 = r6 << 3
            int r12 = r12 + r11
            java.lang.Object[] r13 = r1.f1428
            r13 = r13[r12]
            java.lang.Object[] r14 = r1.f1429
            r14 = r14[r12]
            f12 r14 = (p000.f12) r14
            int r15 = r0.m3134(r13)
            if (r15 < 0) goto L71
            int r5 = r2.f6083
            if (r15 < r5) goto L8f
        L71:
            if (r15 < 0) goto L7e
            java.lang.Object r5 = p000.jx0.f5632
            r16 = r10
            java.lang.Object[] r10 = r0.f5716
            r17 = r10[r15]
            r10[r15] = r5
            goto L80
        L7e:
            r16 = r10
        L80:
            b21 r5 = r2.f6088
            boolean r5 = r5.m690(r13)
            if (r5 == 0) goto L8b
            r14.mo1993()
        L8b:
            r1.m700(r12)
            goto L91
        L8f:
            r16 = r10
        L91:
            long r7 = r7 >> r16
            int r11 = r11 + 1
            r10 = r16
            goto L4f
        L98:
            r5 = r10
            if (r9 != r5) goto La0
        L9b:
            if (r6 == r4) goto La0
            int r6 = r6 + 1
            goto L35
        La0:
            int r0 = r2.f6082
            r2.m3405(r0)
            return
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: β */
    public final int mo1623() {
            r1 = this;
            int r0 = r1.f4430
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            qx0 r1 = r1.f4431
            int r1 = r1.mo1623()
            return r1
        Lc:
            qx0 r1 = r1.f4431
            int r1 = r1.mo1623()
            return r1
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: γ */
    public final java.util.Map mo1624() {
            r1 = this;
            int r0 = r1.f4430
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            qx0 r1 = r1.f4431
            java.util.Map r1 = r1.mo1624()
            return r1
        Lc:
            qx0 r1 = r1.f4431
            java.util.Map r1 = r1.mo1624()
            return r1
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: δ */
    public final p000.a80 mo1625() {
            r1 = this;
            int r0 = r1.f4430
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            qx0 r1 = r1.f4431
            a80 r1 = r1.mo1625()
            return r1
        Lc:
            qx0 r1 = r1.f4431
            a80 r1 = r1.mo1625()
            return r1
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: ε */
    public final int mo1626() {
            r1 = this;
            int r0 = r1.f4430
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            qx0 r1 = r1.f4431
            int r1 = r1.mo1626()
            return r1
        Lc:
            qx0 r1 = r1.f4431
            int r1 = r1.mo1626()
            return r1
    }
}
