package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2069;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f2070;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f2071;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f2072;

    public /* synthetic */ cd1(p000.bl1 r2, int r3, p000.u11 r4) {
            r1 = this;
            r0 = 1
            r1.f2069 = r0
            r1.<init>()
            r1.f2071 = r2
            r1.f2070 = r3
            r1.f2072 = r4
            return
    }

    public /* synthetic */ cd1(p000.dc1 r2, p000.dc1 r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f2069 = r0
            r1.<init>()
            r1.f2071 = r2
            r1.f2072 = r3
            r1.f2070 = r4
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f2069
            switch(r1) {
                case 0: goto Lb4;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f2071
            bl1 r1 = (p000.bl1) r1
            java.lang.Object r2 = r0.f2072
            u11 r2 = (p000.u11) r2
            r3 = r18
            tn r3 = (p000.InterfaceC0841tn) r3
            int r4 = r1.f1781
            int r0 = r0.f2070
            if (r4 != r0) goto Lb1
            u11 r4 = r1.f1782
            boolean r4 = p000.ln0.m3626(r2, r4)
            if (r4 == 0) goto Lb1
            boolean r4 = r3 instanceof p000.C1064zn
            if (r4 == 0) goto Lb1
            long[] r4 = r2.f10555
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto Lb1
            r7 = 0
        L2d:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto La7
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L47:
            if (r12 >= r10) goto La1
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L94
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r2.f10556
            r14 = r14[r13]
            int[] r15 = r2.f10557
            r15 = r15[r13]
            if (r15 == r0) goto L61
            r15 = 1
            goto L62
        L61:
            r15 = 0
        L62:
            if (r15 == 0) goto L8a
            r6 = r3
            zn r6 = (p000.C1064zn) r6
            r18 = r11
            b21 r11 = r6.f13182
            p000.i81.m2673(r11, r14, r1)
            r16 = r0
            boolean r0 = r14 instanceof p000.C0296fs
            if (r0 == 0) goto L8e
            r0 = r14
            fs r0 = (p000.C0296fs) r0
            boolean r11 = r11.m691(r0)
            if (r11 != 0) goto L82
            b21 r6 = r6.f13185
            p000.i81.m2674(r6, r0)
        L82:
            b21 r0 = r1.f1783
            if (r0 == 0) goto L8e
            r0.m699(r14)
            goto L8e
        L8a:
            r16 = r0
            r18 = r11
        L8e:
            if (r15 == 0) goto L98
            r2.m5778(r13)
            goto L98
        L94:
            r16 = r0
            r18 = r11
        L98:
            long r8 = r8 >> r18
            int r12 = r12 + 1
            r11 = r18
            r0 = r16
            goto L47
        La1:
            r16 = r0
            r0 = r11
            if (r10 != r0) goto Lb1
            goto La9
        La7:
            r16 = r0
        La9:
            if (r7 == r5) goto Lb1
            int r7 = r7 + 1
            r0 = r16
            goto L2d
        Lb1:
            s62 r0 = p000.s62.f9751
            return r0
        Lb4:
            java.lang.Object r1 = r0.f2071
            dc1 r1 = (p000.dc1) r1
            java.lang.Object r2 = r0.f2072
            dc1 r2 = (p000.dc1) r2
            r3 = r18
            be1 r3 = (p000.be1) r3
            r3.getClass()
            int r3 = r3.ordinal()
            if (r3 == 0) goto Lfa
            r1 = 1
            java.lang.String r4 = " 块"
            if (r3 == r1) goto Lf5
            r1 = 2
            if (r3 == r1) goto Lf0
            r1 = 3
            if (r3 == r1) goto Le7
            r1 = 4
            if (r3 != r1) goto Le2
            java.lang.String r1 = "失败 "
            java.lang.String r2 = " 项"
            int r0 = r0.f2070
        Ldd:
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
            goto L101
        Le2:
            p000.C1080.m7272()
            r0 = 0
            goto L101
        Le7:
            int r0 = r2.f3080
            java.lang.String r1 = "浇水 "
        Leb:
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r4)
            goto L101
        Lf0:
            int r0 = r2.f3079
            java.lang.String r1 = "种地 "
            goto Leb
        Lf5:
            int r0 = r2.f3078
            java.lang.String r1 = "收菜 "
            goto Leb
        Lfa:
            int r0 = r1.f3076
            java.lang.String r1 = "刷新 "
            java.lang.String r2 = " 个营地"
            goto Ldd
        L101:
            return r0
    }
}
