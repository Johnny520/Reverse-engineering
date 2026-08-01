package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 {

    /* JADX INFO: renamed from: α */
    public final p000.C0793sc f7108;

    /* JADX INFO: renamed from: β */
    public int f7109;

    /* JADX INFO: renamed from: γ */
    public boolean f7110;

    /* JADX INFO: renamed from: δ */
    public int f7111;

    /* JADX INFO: renamed from: ε */
    public p000.tc0[] f7112;

    /* JADX INFO: renamed from: ζ */
    public int f7113;

    /* JADX INFO: renamed from: η */
    public int f7114;

    /* JADX INFO: renamed from: θ */
    public int f7115;

    public mf0(p000.C0793sc r1) {
            r0 = this;
            r0.<init>()
            r0.f7108 = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f7109 = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r0.f7111 = r1
            r1 = 8
            tc0[] r1 = new p000.tc0[r1]
            r0.f7112 = r1
            r1 = 7
            r0.f7113 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m3817(int r5) {
            r4 = this;
            if (r5 <= 0) goto L4d
            tc0[] r0 = r4.f7112
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 0
        L8:
            int r2 = r4.f7113
            if (r0 < r2) goto L31
            if (r5 <= 0) goto L31
            tc0[] r2 = r4.f7112
            r2 = r2[r0]
            r2.getClass()
            int r2 = r2.f10313
            int r5 = r5 - r2
            int r2 = r4.f7115
            tc0[] r3 = r4.f7112
            r3 = r3[r0]
            r3.getClass()
            int r3 = r3.f10313
            int r2 = r2 - r3
            r4.f7115 = r2
            int r2 = r4.f7114
            int r2 = r2 + (-1)
            r4.f7114 = r2
            int r1 = r1 + 1
            int r0 = r0 + (-1)
            goto L8
        L31:
            tc0[] r5 = r4.f7112
            int r2 = r2 + 1
            int r0 = r2 + r1
            int r3 = r4.f7114
            java.lang.System.arraycopy(r5, r2, r5, r0, r3)
            tc0[] r5 = r4.f7112
            int r0 = r4.f7113
            int r0 = r0 + 1
            int r2 = r0 + r1
            r3 = 0
            java.util.Arrays.fill(r5, r0, r2, r3)
            int r5 = r4.f7113
            int r5 = r5 + r1
            r4.f7113 = r5
        L4d:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m3818(p000.tc0 r7) {
            r6 = this;
            int r0 = r7.f10313
            int r1 = r6.f7111
            r2 = 0
            if (r0 <= r1) goto L1a
            tc0[] r7 = r6.f7112
            r0 = 0
            int r1 = r7.length
            p000.AbstractC0312g7.m2244(r2, r1, r0, r7)
            tc0[] r7 = r6.f7112
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.f7113 = r7
            r6.f7114 = r2
            r6.f7115 = r2
            return
        L1a:
            int r3 = r6.f7115
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.m3817(r3)
            int r1 = r6.f7114
            int r1 = r1 + 1
            tc0[] r3 = r6.f7112
            int r4 = r3.length
            if (r1 <= r4) goto L3d
            int r1 = r3.length
            int r1 = r1 * 2
            tc0[] r1 = new p000.tc0[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            tc0[] r2 = r6.f7112
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.f7113 = r2
            r6.f7112 = r1
        L3d:
            int r1 = r6.f7113
            int r2 = r1 + (-1)
            r6.f7113 = r2
            tc0[] r2 = r6.f7112
            r2[r1] = r7
            int r7 = r6.f7114
            int r7 = r7 + 1
            r6.f7114 = r7
            int r7 = r6.f7115
            int r7 = r7 + r0
            r6.f7115 = r7
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m3819(p000.C0208dd r12) {
            r11 = this;
            r12.getClass()
            int[] r0 = p000.qg0.f9000
            int r0 = r12.mo1701()
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        Le:
            if (r4 >= r0) goto L21
            byte r7 = r12.mo1704(r4)
            byte[] r8 = p000.sd2.f9867
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte[] r8 = p000.qg0.f9001
            r7 = r8[r7]
            long r7 = (long) r7
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto Le
        L21:
            r0 = 7
            long r7 = (long) r0
            long r5 = r5 + r7
            r0 = 3
            long r4 = r5 >> r0
            int r0 = (int) r4
            int r4 = r12.mo1701()
            sc r5 = r11.f7108
            r6 = 127(0x7f, float:1.78E-43)
            if (r0 >= r4) goto L84
            sc r0 = new sc
            r0.<init>()
            int[] r4 = p000.qg0.f9000
            int r4 = r12.mo1701()
            r7 = r3
        L3e:
            if (r3 >= r4) goto L64
            byte r8 = r12.mo1704(r3)
            byte[] r9 = p000.sd2.f9867
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = p000.qg0.f9000
            r9 = r9[r8]
            byte[] r10 = p000.qg0.f9001
            r8 = r10[r8]
            long r1 = r1 << r8
            long r9 = (long) r9
            long r1 = r1 | r9
            int r7 = r7 + r8
        L54:
            r8 = 8
            if (r7 < r8) goto L61
            int r7 = r7 + (-8)
            long r8 = r1 >> r7
            int r8 = (int) r8
            r0.m5466(r8)
            goto L54
        L61:
            int r3 = r3 + 1
            goto L3e
        L64:
            if (r7 <= 0) goto L71
            int r12 = 8 - r7
            long r1 = r1 << r12
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 >>> r7
            long r1 = r1 | r3
            int r12 = (int) r1
            r0.m5466(r12)
        L71:
            long r1 = r0.f9828
            dd r12 = r0.mo58(r1)
            int r0 = r12.mo1701()
            r1 = 128(0x80, float:1.8E-43)
            r11.m3821(r0, r6, r1)
            r5.m5463(r12)
            return
        L84:
            int r0 = r12.mo1701()
            r11.m3821(r0, r6, r3)
            r5.m5463(r12)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3820(java.util.ArrayList r14) {
            r13 = this;
            boolean r0 = r13.f7110
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r13.f7109
            int r2 = r13.f7111
            r3 = 32
            r4 = 31
            if (r0 >= r2) goto L12
            r13.m3821(r0, r4, r3)
        L12:
            r13.f7110 = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13.f7109 = r0
            int r0 = r13.f7111
            r13.m3821(r0, r4, r3)
        L1e:
            int r0 = r14.size()
            r2 = r1
        L23:
            if (r2 >= r0) goto Lfb
            java.lang.Object r3 = r14.get(r2)
            tc0 r3 = (p000.tc0) r3
            dd r4 = r3.f10311
            dd r4 = r4.mo1709()
            dd r5 = r3.f10312
            java.util.Map r6 = p000.nf0.f7592
            java.lang.Object r6 = r6.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r7 = -1
            if (r6 == 0) goto L6c
            int r6 = r6.intValue()
            int r8 = r6 + 1
            r9 = 2
            if (r9 > r8) goto L69
            r9 = 8
            if (r8 >= r9) goto L69
            tc0[] r9 = p000.nf0.f7591
            r10 = r9[r6]
            dd r10 = r10.f10312
            boolean r10 = p000.ln0.m3626(r10, r5)
            if (r10 == 0) goto L59
            r6 = r8
            goto L6e
        L59:
            r9 = r9[r8]
            dd r9 = r9.f10312
            boolean r9 = p000.ln0.m3626(r9, r5)
            if (r9 == 0) goto L69
            int r6 = r6 + 2
            r12 = r8
            r8 = r6
            r6 = r12
            goto L6e
        L69:
            r6 = r8
            r8 = r7
            goto L6e
        L6c:
            r6 = r7
            r8 = r6
        L6e:
            if (r8 != r7) goto Lac
            int r9 = r13.f7113
            int r9 = r9 + 1
            tc0[] r10 = r13.f7112
            int r10 = r10.length
        L77:
            if (r9 >= r10) goto Lac
            tc0[] r11 = r13.f7112
            r11 = r11[r9]
            r11.getClass()
            dd r11 = r11.f10311
            boolean r11 = p000.ln0.m3626(r11, r4)
            if (r11 == 0) goto La9
            tc0[] r11 = r13.f7112
            r11 = r11[r9]
            r11.getClass()
            dd r11 = r11.f10312
            boolean r11 = p000.ln0.m3626(r11, r5)
            if (r11 == 0) goto L9f
            int r8 = r13.f7113
            int r9 = r9 - r8
            tc0[] r8 = p000.nf0.f7591
            int r8 = r8.length
            int r8 = r8 + r9
            goto Lac
        L9f:
            if (r6 != r7) goto La9
            int r6 = r13.f7113
            int r6 = r9 - r6
            tc0[] r11 = p000.nf0.f7591
            int r11 = r11.length
            int r6 = r6 + r11
        La9:
            int r9 = r9 + 1
            goto L77
        Lac:
            if (r8 == r7) goto Lb6
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.8E-43)
            r13.m3821(r8, r3, r4)
            goto Lf7
        Lb6:
            r8 = 64
            if (r6 != r7) goto Lc9
            sc r6 = r13.f7108
            r6.m5466(r8)
            r13.m3819(r4)
            r13.m3819(r5)
            r13.m3818(r3)
            goto Lf7
        Lc9:
            dd r7 = p000.tc0.f10305
            r4.getClass()
            r7.getClass()
            int r9 = r7.mo1701()
            boolean r7 = r4.mo1706(r7, r9)
            if (r7 == 0) goto Lec
            dd r7 = p000.tc0.f10310
            boolean r4 = p000.ln0.m3626(r7, r4)
            if (r4 != 0) goto Lec
            r3 = 15
            r13.m3821(r6, r3, r1)
            r13.m3819(r5)
            goto Lf7
        Lec:
            r4 = 63
            r13.m3821(r6, r4, r8)
            r13.m3819(r5)
            r13.m3818(r3)
        Lf7:
            int r2 = r2 + 1
            goto L23
        Lfb:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m3821(int r1, int r2, int r3) {
            r0 = this;
            sc r0 = r0.f7108
            if (r1 >= r2) goto L9
            r1 = r1 | r3
            r0.m5466(r1)
            return
        L9:
            r3 = r3 | r2
            r0.m5466(r3)
            int r1 = r1 - r2
        Le:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 < r2) goto L1b
            r3 = r1 & 127(0x7f, float:1.78E-43)
            r2 = r2 | r3
            r0.m5466(r2)
            int r1 = r1 >>> 7
            goto Le
        L1b:
            r0.m5466(r1)
            return
    }
}
