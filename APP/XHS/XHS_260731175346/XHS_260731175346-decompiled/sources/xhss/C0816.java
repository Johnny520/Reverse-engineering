package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲇᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0816 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f2644;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f2645;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0047[] f2646;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0338 f2647;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f2648;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f2649;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2650;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f2651;

    public C0816(xhss.C0338 r1) {
            r0 = this;
            r0.<init>()
            r0.f2647 = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f2644 = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r0.f2650 = r1
            r1 = 8
            xhss.ᛱᛵᲀᛱ[] r1 = new xhss.C0047[r1]
            r0.f2646 = r1
            r1 = 7
            r0.f2651 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1378(xhss.C0047 r7) {
            r6 = this;
            int r0 = r7.f326
            int r1 = r6.f2650
            r2 = 0
            if (r0 <= r1) goto L1a
            xhss.ᛱᛵᲀᛱ[] r7 = r6.f2646
            r0 = 0
            int r1 = r7.length
            java.util.Arrays.fill(r7, r2, r1, r0)
            xhss.ᛱᛵᲀᛱ[] r7 = r6.f2646
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.f2651 = r7
            r6.f2649 = r2
            r6.f2648 = r2
            return
        L1a:
            int r3 = r6.f2648
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.m1381(r3)
            int r1 = r6.f2649
            int r1 = r1 + 1
            xhss.ᛱᛵᲀᛱ[] r3 = r6.f2646
            int r4 = r3.length
            if (r1 <= r4) goto L3e
            int r1 = r3.length
            int r1 = r1 * 2
            xhss.ᛱᛵᲀᛱ[] r1 = new xhss.C0047[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            xhss.ᛱᛵᲀᛱ[] r2 = r6.f2646
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.f2651 = r2
            r6.f2646 = r1
            r3 = r1
        L3e:
            int r1 = r6.f2651
            int r2 = r1 + (-1)
            r6.f2651 = r2
            r3[r1] = r7
            int r7 = r6.f2649
            int r7 = r7 + 1
            r6.f2649 = r7
            int r7 = r6.f2648
            int r7 = r7 + r0
            r6.f2648 = r7
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1379(xhss.C0289 r12) {
            r11 = this;
            int[] r0 = xhss.AbstractC0958.f3104
            int r0 = r12.mo611()
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        Lb:
            if (r4 >= r0) goto L1e
            byte r7 = r12.mo616(r4)
            byte[] r8 = xhss.AbstractC0577.f2010
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte[] r8 = xhss.AbstractC0958.f3102
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
            int r4 = r12.mo611()
            xhss.ᛴᛲᛴᛶ r5 = r11.f2647
            r6 = 127(0x7f, float:1.78E-43)
            if (r0 >= r4) goto L81
            xhss.ᛴᛲᛴᛶ r0 = new xhss.ᛴᛲᛴᛶ
            r0.<init>()
            int[] r4 = xhss.AbstractC0958.f3104
            int r4 = r12.mo611()
            r7 = r3
        L3b:
            if (r3 >= r4) goto L61
            byte r8 = r12.mo616(r3)
            byte[] r9 = xhss.AbstractC0577.f2010
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = xhss.AbstractC0958.f3104
            r9 = r9[r8]
            byte[] r10 = xhss.AbstractC0958.f3102
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
            r0.m701(r8)
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
            r0.m701(r12)
        L6e:
            long r1 = r0.f1261
            xhss.ᛳᛶᲈᲈ r12 = r0.m695(r1)
            int r0 = r12.mo611()
            r1 = 128(0x80, float:1.8E-43)
            r11.m1380(r0, r6, r1)
            r5.m687(r12)
            return
        L81:
            int r0 = r12.mo611()
            r11.m1380(r0, r6, r3)
            r5.m687(r12)
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1380(int r1, int r2, int r3) {
            r0 = this;
            xhss.ᛴᛲᛴᛶ r0 = r0.f2647
            if (r1 >= r2) goto L9
            r1 = r1 | r3
            r0.m701(r1)
            return
        L9:
            r3 = r3 | r2
            r0.m701(r3)
            int r1 = r1 - r2
        Le:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 < r2) goto L1b
            r3 = r1 & 127(0x7f, float:1.78E-43)
            r2 = r2 | r3
            r0.m701(r2)
            int r1 = r1 >>> 7
            goto Le
        L1b:
            r0.m701(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1381(int r5) {
            r4 = this;
            if (r5 <= 0) goto L41
            xhss.ᛱᛵᲀᛱ[] r0 = r4.f2646
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 0
        L8:
            int r2 = r4.f2651
            if (r0 < r2) goto L25
            if (r5 <= 0) goto L25
            xhss.ᛱᛵᲀᛱ[] r2 = r4.f2646
            r2 = r2[r0]
            int r2 = r2.f326
            int r5 = r5 - r2
            int r3 = r4.f2648
            int r3 = r3 - r2
            r4.f2648 = r3
            int r2 = r4.f2649
            int r2 = r2 + (-1)
            r4.f2649 = r2
            int r1 = r1 + 1
            int r0 = r0 + (-1)
            goto L8
        L25:
            xhss.ᛱᛵᲀᛱ[] r5 = r4.f2646
            int r2 = r2 + 1
            int r0 = r2 + r1
            int r3 = r4.f2649
            java.lang.System.arraycopy(r5, r2, r5, r0, r3)
            xhss.ᛱᛵᲀᛱ[] r5 = r4.f2646
            int r0 = r4.f2651
            int r0 = r0 + 1
            int r2 = r0 + r1
            r3 = 0
            java.util.Arrays.fill(r5, r0, r2, r3)
            int r5 = r4.f2651
            int r5 = r5 + r1
            r4.f2651 = r5
        L41:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1382(java.util.ArrayList r14) {
            r13 = this;
            boolean r0 = r13.f2645
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r13.f2644
            int r2 = r13.f2650
            r3 = 32
            r4 = 31
            if (r0 >= r2) goto L12
            r13.m1380(r0, r4, r3)
        L12:
            r13.f2645 = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13.f2644 = r0
            int r0 = r13.f2650
            r13.m1380(r0, r4, r3)
        L1e:
            int r0 = r14.size()
            r2 = r1
        L23:
            if (r2 >= r0) goto Lf2
            java.lang.Object r3 = r14.get(r2)
            xhss.ᛱᛵᲀᛱ r3 = (xhss.C0047) r3
            xhss.ᛳᛶᲈᲈ r4 = r3.f327
            xhss.ᛳᛶᲈᲈ r4 = r4.mo612()
            xhss.ᛳᛶᲈᲈ r5 = r3.f325
            java.util.Map r6 = xhss.AbstractC0907.f2935
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
            xhss.ᛱᛵᲀᛱ[] r9 = xhss.AbstractC0907.f2936
            r10 = r9[r6]
            xhss.ᛳᛶᲈᲈ r10 = r10.f325
            boolean r10 = xhss.AbstractC0007.m97(r10, r5)
            if (r10 == 0) goto L59
            r6 = r8
            goto L6e
        L59:
            r9 = r9[r8]
            xhss.ᛳᛶᲈᲈ r9 = r9.f325
            boolean r9 = xhss.AbstractC0007.m97(r9, r5)
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
            int r9 = r13.f2651
            int r9 = r9 + 1
            xhss.ᛱᛵᲀᛱ[] r10 = r13.f2646
            int r10 = r10.length
        L77:
            if (r9 >= r10) goto La6
            xhss.ᛱᛵᲀᛱ[] r11 = r13.f2646
            r11 = r11[r9]
            xhss.ᛳᛶᲈᲈ r11 = r11.f327
            boolean r11 = xhss.AbstractC0007.m97(r11, r4)
            if (r11 == 0) goto La3
            xhss.ᛱᛵᲀᛱ[] r11 = r13.f2646
            r11 = r11[r9]
            xhss.ᛳᛶᲈᲈ r11 = r11.f325
            boolean r11 = xhss.AbstractC0007.m97(r11, r5)
            if (r11 == 0) goto L99
            int r8 = r13.f2651
            int r9 = r9 - r8
            xhss.ᛱᛵᲀᛱ[] r8 = xhss.AbstractC0907.f2936
            int r8 = r8.length
            int r8 = r8 + r9
            goto La6
        L99:
            if (r6 != r7) goto La3
            int r6 = r13.f2651
            int r6 = r9 - r6
            xhss.ᛱᛵᲀᛱ[] r11 = xhss.AbstractC0907.f2936
            int r11 = r11.length
            int r6 = r6 + r11
        La3:
            int r9 = r9 + 1
            goto L77
        La6:
            if (r8 == r7) goto Lb0
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.8E-43)
            r13.m1380(r8, r3, r4)
            goto Lee
        Lb0:
            r8 = 64
            if (r6 != r7) goto Lc3
            xhss.ᛴᛲᛴᛶ r6 = r13.f2647
            r6.m701(r8)
            r13.m1379(r4)
            r13.m1379(r5)
            r13.m1378(r3)
            goto Lee
        Lc3:
            xhss.ᛳᛶᲈᲈ r7 = xhss.C0047.f323
            r4.getClass()
            int r9 = r7.mo611()
            boolean r7 = r4.mo617(r7, r9)
            if (r7 == 0) goto Le3
            xhss.ᛳᛶᲈᲈ r7 = xhss.C0047.f320
            boolean r4 = xhss.AbstractC0007.m97(r7, r4)
            if (r4 != 0) goto Le3
            r3 = 15
            r13.m1380(r6, r3, r1)
            r13.m1379(r5)
            goto Lee
        Le3:
            r4 = 63
            r13.m1380(r6, r4, r8)
            r13.m1379(r5)
            r13.m1378(r3)
        Lee:
            int r2 = r2 + 1
            goto L23
        Lf2:
            return
    }
}
