package defpackage;

/* JADX INFO: renamed from: ᲁᲈᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1963 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f8530;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0828[] f8531;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f8532;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f8533;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1569 f8534;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f8535;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f8536;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f8537;

    public C1963(defpackage.C1569 r1) {
            r0 = this;
            r0.<init>()
            r0.f8534 = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f8535 = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r0.f8532 = r1
            r1 = 8
            ᛵᛲᛵᲁ[] r1 = new defpackage.C0828[r1]
            r0.f8531 = r1
            r1 = 7
            r0.f8536 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m3383(int r1, int r2, int r3) {
            r0 = this;
            ᛸᲁᛵ r0 = r0.f8534
            if (r1 >= r2) goto L9
            r1 = r1 | r3
            r0.m2855(r1)
            return
        L9:
            r3 = r3 | r2
            r0.m2855(r3)
            int r1 = r1 - r2
        Le:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 < r2) goto L1b
            r3 = r1 & 127(0x7f, float:1.78E-43)
            r2 = r2 | r3
            r0.m2855(r2)
            int r1 = r1 >>> 7
            goto Le
        L1b:
            r0.m2855(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3384(java.util.ArrayList r14) {
            r13 = this;
            boolean r0 = r13.f8533
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r13.f8535
            int r2 = r13.f8532
            r3 = 32
            r4 = 31
            if (r0 >= r2) goto L12
            r13.m3383(r0, r4, r3)
        L12:
            r13.f8533 = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13.f8535 = r0
            int r0 = r13.f8532
            r13.m3383(r0, r4, r3)
        L1e:
            int r0 = r14.size()
            r2 = r1
        L23:
            if (r2 >= r0) goto Lf2
            java.lang.Object r3 = r14.get(r2)
            ᛵᛲᛵᲁ r3 = (defpackage.C0828) r3
            ᛶᛸᛸᛶ r4 = r3.f3833
            ᛶᛸᛸᛶ r4 = r4.mo2164()
            ᛶᛸᛸᛶ r5 = r3.f3834
            java.util.Map r6 = defpackage.AbstractC0928.f4194
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
            ᛵᛲᛵᲁ[] r9 = defpackage.AbstractC0928.f4193
            r10 = r9[r6]
            ᛶᛸᛸᛶ r10 = r10.f3834
            boolean r10 = defpackage.AbstractC0498.m1280(r10, r5)
            if (r10 == 0) goto L59
            r6 = r8
            goto L6e
        L59:
            r9 = r9[r8]
            ᛶᛸᛸᛶ r9 = r9.f3834
            boolean r9 = defpackage.AbstractC0498.m1280(r9, r5)
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
            if (r8 != r7) goto La6
            int r9 = r13.f8536
            int r9 = r9 + 1
            ᛵᛲᛵᲁ[] r10 = r13.f8531
            int r10 = r10.length
        L77:
            if (r9 >= r10) goto La6
            ᛵᛲᛵᲁ[] r11 = r13.f8531
            r11 = r11[r9]
            ᛶᛸᛸᛶ r11 = r11.f3833
            boolean r11 = defpackage.AbstractC0498.m1280(r11, r4)
            if (r11 == 0) goto La3
            ᛵᛲᛵᲁ[] r11 = r13.f8531
            r11 = r11[r9]
            ᛶᛸᛸᛶ r11 = r11.f3834
            boolean r11 = defpackage.AbstractC0498.m1280(r11, r5)
            if (r11 == 0) goto L99
            int r8 = r13.f8536
            int r9 = r9 - r8
            ᛵᛲᛵᲁ[] r8 = defpackage.AbstractC0928.f4193
            int r8 = r8.length
            int r8 = r8 + r9
            goto La6
        L99:
            if (r6 != r7) goto La3
            int r6 = r13.f8536
            int r6 = r9 - r6
            ᛵᛲᛵᲁ[] r11 = defpackage.AbstractC0928.f4193
            int r11 = r11.length
            int r6 = r6 + r11
        La3:
            int r9 = r9 + 1
            goto L77
        La6:
            if (r8 == r7) goto Lb0
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.8E-43)
            r13.m3383(r8, r3, r4)
            goto Lee
        Lb0:
            r8 = 64
            if (r6 != r7) goto Lc3
            ᛸᲁᛵ r6 = r13.f8534
            r6.m2855(r8)
            r13.m3385(r4)
            r13.m3385(r5)
            r13.m3387(r3)
            goto Lee
        Lc3:
            ᛶᛸᛸᛶ r7 = defpackage.C0828.f3829
            r4.getClass()
            int r9 = r7.mo2165()
            boolean r7 = r4.mo2167(r7, r9)
            if (r7 == 0) goto Le3
            ᛶᛸᛸᛶ r7 = defpackage.C0828.f3827
            boolean r4 = defpackage.AbstractC0498.m1280(r7, r4)
            if (r4 != 0) goto Le3
            r3 = 15
            r13.m3383(r6, r3, r1)
            r13.m3385(r5)
            goto Lee
        Le3:
            r4 = 63
            r13.m3383(r6, r4, r8)
            r13.m3385(r5)
            r13.m3387(r3)
        Lee:
            int r2 = r2 + 1
            goto L23
        Lf2:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3385(defpackage.C1128 r12) {
            r11 = this;
            int[] r0 = defpackage.AbstractC1791.f7874
            int r0 = r12.mo2165()
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        Lb:
            if (r4 >= r0) goto L1e
            byte r7 = r12.mo2160(r4)
            byte[] r8 = defpackage.AbstractC0709.f3358
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte[] r8 = defpackage.AbstractC1791.f7875
            r7 = r8[r7]
            long r7 = (long) r7
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto Lb
        L1e:
            r7 = 7
            long r5 = r5 + r7
            r0 = 3
            long r4 = r5 >> r0
            int r0 = (int) r4
            int r4 = r12.mo2165()
            ᛸᲁᛵ r5 = r11.f8534
            r6 = 127(0x7f, float:1.78E-43)
            if (r0 >= r4) goto L81
            ᛸᲁᛵ r0 = new ᛸᲁᛵ
            r0.<init>()
            int[] r4 = defpackage.AbstractC1791.f7874
            int r4 = r12.mo2165()
            r7 = r3
        L3b:
            if (r3 >= r4) goto L61
            byte r8 = r12.mo2160(r3)
            byte[] r9 = defpackage.AbstractC0709.f3358
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = defpackage.AbstractC1791.f7874
            r9 = r9[r8]
            byte[] r10 = defpackage.AbstractC1791.f7875
            r8 = r10[r8]
            long r1 = r1 << r8
            long r9 = (long) r9
            long r1 = r1 | r9
            int r7 = r7 + r8
        L51:
            r8 = 8
            if (r7 < r8) goto L5e
            int r7 = r7 + (-8)
            long r8 = r1 >> r7
            int r8 = (int) r8
            r0.m2855(r8)
            goto L51
        L5e:
            int r3 = r3 + 1
            goto L3b
        L61:
            if (r7 <= 0) goto L6e
            int r12 = 8 - r7
            long r1 = r1 << r12
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 >>> r7
            long r1 = r1 | r3
            int r12 = (int) r1
            r0.m2855(r12)
        L6e:
            long r1 = r0.f6928
            ᛶᛸᛸᛶ r12 = r0.m2839(r1)
            int r0 = r12.mo2165()
            r1 = 128(0x80, float:1.8E-43)
            r11.m3383(r0, r6, r1)
            r5.m2849(r12)
            return
        L81:
            int r0 = r12.mo2165()
            r11.m3383(r0, r6, r3)
            r5.m2849(r12)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3386(int r5) {
            r4 = this;
            if (r5 <= 0) goto L41
            ᛵᛲᛵᲁ[] r0 = r4.f8531
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 0
        L8:
            int r2 = r4.f8536
            if (r0 < r2) goto L25
            if (r5 <= 0) goto L25
            ᛵᛲᛵᲁ[] r2 = r4.f8531
            r2 = r2[r0]
            int r2 = r2.f3832
            int r5 = r5 - r2
            int r3 = r4.f8530
            int r3 = r3 - r2
            r4.f8530 = r3
            int r2 = r4.f8537
            int r2 = r2 + (-1)
            r4.f8537 = r2
            int r1 = r1 + 1
            int r0 = r0 + (-1)
            goto L8
        L25:
            ᛵᛲᛵᲁ[] r5 = r4.f8531
            int r2 = r2 + 1
            int r0 = r2 + r1
            int r3 = r4.f8537
            java.lang.System.arraycopy(r5, r2, r5, r0, r3)
            ᛵᛲᛵᲁ[] r5 = r4.f8531
            int r0 = r4.f8536
            int r0 = r0 + 1
            int r2 = r0 + r1
            r3 = 0
            java.util.Arrays.fill(r5, r0, r2, r3)
            int r5 = r4.f8536
            int r5 = r5 + r1
            r4.f8536 = r5
        L41:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3387(defpackage.C0828 r7) {
            r6 = this;
            int r0 = r7.f3832
            int r1 = r6.f8532
            r2 = 0
            if (r0 <= r1) goto L1a
            ᛵᛲᛵᲁ[] r7 = r6.f8531
            r0 = 0
            int r1 = r7.length
            java.util.Arrays.fill(r7, r2, r1, r0)
            ᛵᛲᛵᲁ[] r7 = r6.f8531
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.f8536 = r7
            r6.f8537 = r2
            r6.f8530 = r2
            return
        L1a:
            int r3 = r6.f8530
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.m3386(r3)
            int r1 = r6.f8537
            int r1 = r1 + 1
            ᛵᛲᛵᲁ[] r3 = r6.f8531
            int r4 = r3.length
            if (r1 <= r4) goto L3e
            int r1 = r3.length
            int r1 = r1 * 2
            ᛵᛲᛵᲁ[] r1 = new defpackage.C0828[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            ᛵᛲᛵᲁ[] r2 = r6.f8531
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.f8536 = r2
            r6.f8531 = r1
            r3 = r1
        L3e:
            int r1 = r6.f8536
            int r2 = r1 + (-1)
            r6.f8536 = r2
            r3[r1] = r7
            int r7 = r6.f8537
            int r7 = r7 + 1
            r6.f8537 = r7
            int r7 = r6.f8530
            int r7 = r7 + r0
            r6.f8530 = r7
            return
    }
}
