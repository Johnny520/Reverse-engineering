package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d21 extends p000.do1 implements p000.e80 {

    /* JADX INFO: renamed from: η */
    public p000.f90 f2850;

    /* JADX INFO: renamed from: θ */
    public p000.e21 f2851;

    /* JADX INFO: renamed from: ι */
    public long[] f2852;

    /* JADX INFO: renamed from: κ */
    public int f2853;

    /* JADX INFO: renamed from: λ */
    public int f2854;

    /* JADX INFO: renamed from: μ */
    public int f2855;

    /* JADX INFO: renamed from: ν */
    public int f2856;

    /* JADX INFO: renamed from: ξ */
    public long f2857;

    /* JADX INFO: renamed from: ο */
    public int f2858;

    /* JADX INFO: renamed from: π */
    public /* synthetic */ java.lang.Object f2859;

    /* JADX INFO: renamed from: ρ */
    public final /* synthetic */ p000.e21 f2860;

    /* JADX INFO: renamed from: σ */
    public final /* synthetic */ p000.f90 f2861;

    public d21(p000.e21 r1, p000.f90 r2, p000.InterfaceC0631op r3) {
            r0 = this;
            r0.f2860 = r1
            r0.f2861 = r2
            r0.<init>(r3)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ts1 r1 = (p000.ts1) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            d21 r0 = (p000.d21) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            d21 r0 = new d21
            e21 r1 = r2.f2860
            f90 r2 = r2.f2861
            r0.<init>(r1, r2, r3)
            r0.f2859 = r4
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            int r1 = r0.f2858
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.f2856
            int r5 = r0.f2855
            long r6 = r0.f2857
            int r8 = r0.f2854
            int r9 = r0.f2853
            long[] r10 = r0.f2852
            e21 r11 = r0.f2851
            f90 r12 = r0.f2850
            java.lang.Object r13 = r0.f2859
            ts1 r13 = (p000.ts1) r13
            p000.i81.m2649(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L2c:
            p000.i81.m2649(r21)
            java.lang.Object r1 = r0.f2859
            ts1 r1 = (p000.ts1) r1
            e21 r5 = r0.f2860
            c21 r6 = r5.f3379
            long[] r6 = r6.f1941
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            f90 r8 = r0.f2861
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f3829 = r2
            c21 r3 = r11.f3379
            java.lang.Object[] r3 = r3.f1942
            r2 = r3[r2]
            r0.f2859 = r13
            r0.f2850 = r12
            r0.f2851 = r11
            r0.f2852 = r10
            r0.f2853 = r9
            r0.f2854 = r8
            r0.f2857 = r6
            r0.f2855 = r5
            r0.f2856 = r1
            r0.f2858 = r4
            r13.m5740(r0, r2)
            cq r0 = p000.EnumC0184cq.f2716
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            s62 r0 = p000.s62.f9751
            return r0
    }
}
