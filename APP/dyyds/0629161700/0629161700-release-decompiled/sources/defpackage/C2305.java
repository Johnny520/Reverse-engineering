package defpackage;

/* JADX INFO: renamed from: ᲈᛸᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2305 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f9751;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0828[] f9752;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2252 f9753;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f9754;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f9755;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f9756;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f9757;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9758;

    public C2305(defpackage.C1066 r2) {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r1.f9755 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f9756 = r0
            ᲈᛵᲈᛵ r0 = new ᲈᛵᲈᛵ
            r0.<init>(r2)
            r1.f9753 = r0
            r2 = 8
            ᛵᛲᛵᲁ[] r2 = new defpackage.C0828[r2]
            r1.f9752 = r2
            r2 = 7
            r1.f9757 = r2
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1128 m3745() {
            r11 = this;
            ᲈᛵᲈᛵ r0 = r11.f9753
            byte r1 = r0.m3641()
            byte[] r2 = defpackage.AbstractC0709.f3358
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = 128(0x80, float:1.8E-43)
            r1 = r1 & r3
            r4 = 0
            if (r1 != r3) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = r4
        L13:
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = r11.m3750(r2, r3)
            long r2 = (long) r2
            long r5 = r11.f9754
            long r5 = r5 + r2
            r7 = 262144(0x40000, double:1.295163E-318)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto L97
            if (r1 == 0) goto L92
            ᛸᲁᛵ r11 = new ᛸᲁᛵ
            r11.<init>()
            ᲈᲁ r1 = defpackage.AbstractC1791.f7873
            r5 = 0
            r8 = r1
            r6 = r5
            r5 = r4
        L32:
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 >= 0) goto L6a
            byte r9 = r0.m3641()
            byte[] r10 = defpackage.AbstractC0709.f3358
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r9
            int r5 = r5 + 8
        L43:
            r9 = 8
            if (r5 < r9) goto L66
            int r9 = r5 + (-8)
            int r9 = r4 >>> r9
            r9 = r9 & 255(0xff, float:3.57E-43)
            java.lang.Object r8 = r8.f10043
            ᲈᲁ[] r8 = (defpackage.C2328[]) r8
            r8 = r8[r9]
            java.lang.Object r9 = r8.f10043
            ᲈᲁ[] r9 = (defpackage.C2328[]) r9
            if (r9 != 0) goto L63
            int r9 = r8.f10046
            r11.m2855(r9)
            int r8 = r8.f10044
            int r5 = r5 - r8
            r8 = r1
            goto L43
        L63:
            int r5 = r5 + (-8)
            goto L43
        L66:
            r9 = 1
            long r6 = r6 + r9
            goto L32
        L6a:
            if (r5 <= 0) goto L8b
            int r0 = 8 - r5
            int r0 = r4 << r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r2 = r8.f10043
            ᲈᲁ[] r2 = (defpackage.C2328[]) r2
            r0 = r2[r0]
            java.lang.Object r2 = r0.f10043
            ᲈᲁ[] r2 = (defpackage.C2328[]) r2
            int r3 = r0.f10044
            if (r2 != 0) goto L8b
            if (r3 <= r5) goto L83
            goto L8b
        L83:
            int r0 = r0.f10046
            r11.m2855(r0)
            int r5 = r5 - r3
            r8 = r1
            goto L6a
        L8b:
            long r0 = r11.f6928
            ᛶᛸᛸᛶ r11 = r11.m2839(r0)
            return r11
        L92:
            ᛶᛸᛸᛶ r11 = r0.m3638(r2)
            return r11
        L97:
            java.lang.String r11 = "header byte count limit of 262144 exceeded"
            defpackage.C2264.m3682(r11)
            r11 = 0
            return r11
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3746(defpackage.C0828 r7) {
            r6 = this;
            r6.m3748(r7)
            int r0 = r7.f3832
            int r1 = r6.f9755
            r2 = 0
            if (r0 <= r1) goto L1d
            ᛵᛲᛵᲁ[] r7 = r6.f9752
            r0 = 0
            int r1 = r7.length
            java.util.Arrays.fill(r7, r2, r1, r0)
            ᛵᛲᛵᲁ[] r7 = r6.f9752
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.f9757 = r7
            r6.f9758 = r2
            r6.f9751 = r2
            return
        L1d:
            int r3 = r6.f9751
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.m3749(r3)
            int r1 = r6.f9758
            int r1 = r1 + 1
            ᛵᛲᛵᲁ[] r3 = r6.f9752
            int r4 = r3.length
            if (r1 <= r4) goto L41
            int r1 = r3.length
            int r1 = r1 * 2
            ᛵᛲᛵᲁ[] r1 = new defpackage.C0828[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            ᛵᛲᛵᲁ[] r2 = r6.f9752
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.f9757 = r2
            r6.f9752 = r1
            r3 = r1
        L41:
            int r1 = r6.f9757
            int r2 = r1 + (-1)
            r6.f9757 = r2
            r3[r1] = r7
            int r7 = r6.f9758
            int r7 = r7 + 1
            r6.f9758 = r7
            int r7 = r6.f9751
            int r7 = r7 + r0
            r6.f9751 = r7
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1128 m3747(int r3) {
            r2 = this;
            if (r3 < 0) goto Le
            ᛵᛲᛵᲁ[] r0 = defpackage.AbstractC0928.f4193
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r3 > r1) goto Le
            r2 = r0[r3]
            ᛶᛸᛸᛶ r2 = r2.f3833
            return r2
        Le:
            ᛵᛲᛵᲁ[] r0 = defpackage.AbstractC0928.f4193
            int r0 = r0.length
            int r0 = r3 - r0
            int r1 = r2.f9757
            int r1 = r1 + 1
            int r1 = r1 + r0
            if (r1 < 0) goto L24
            ᛵᛲᛵᲁ[] r2 = r2.f9752
            int r0 = r2.length
            if (r1 >= r0) goto L24
            r2 = r2[r1]
            ᛶᛸᛸᛶ r2 = r2.f3833
            return r2
        L24:
            java.io.IOException r2 = new java.io.IOException
            int r3 = r3 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Header index too large "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3748(defpackage.C0828 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f9756
            r0.add(r5)
            ᛶᛸᛸᛶ r0 = r5.f3833
            int r0 = r0.mo2165()
            ᛶᛸᛸᛶ r5 = r5.f3834
            int r5 = r5.mo2165()
            int r5 = r5 + r0
            long r0 = r4.f9754
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.f9754 = r0
            r4 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L20
            return
        L20:
            java.lang.String r4 = "header byte count limit of 262144 exceeded"
            defpackage.C2264.m3682(r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m3749(int r5) {
            r4 = this;
            r0 = 0
            if (r5 <= 0) goto L35
            ᛵᛲᛵᲁ[] r1 = r4.f9752
            int r1 = r1.length
            int r1 = r1 + (-1)
        L8:
            int r2 = r4.f9757
            if (r1 < r2) goto L25
            if (r5 <= 0) goto L25
            ᛵᛲᛵᲁ[] r2 = r4.f9752
            r2 = r2[r1]
            int r2 = r2.f3832
            int r5 = r5 - r2
            int r3 = r4.f9751
            int r3 = r3 - r2
            r4.f9751 = r3
            int r2 = r4.f9758
            int r2 = r2 + (-1)
            r4.f9758 = r2
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto L8
        L25:
            ᛵᛲᛵᲁ[] r5 = r4.f9752
            int r2 = r2 + 1
            int r1 = r2 + r0
            int r3 = r4.f9758
            java.lang.System.arraycopy(r5, r2, r5, r1, r3)
            int r5 = r4.f9757
            int r5 = r5 + r0
            r4.f9757 = r5
        L35:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int m3750(int r10, int r11) {
            r9 = this;
            r10 = r10 & r11
            if (r10 >= r11) goto L4
            return r10
        L4:
            long r10 = (long) r11
            r0 = 0
            r1 = r0
            r2 = r1
        L8:
            r3 = 5
            java.lang.String r4 = "HPACK integer overflow"
            if (r1 == r3) goto L31
            ᲈᛵᲈᛵ r3 = r9.f9753
            byte r3 = r3.m3641()
            byte[] r5 = defpackage.AbstractC0709.f3358
            int r1 = r1 + 1
            r5 = r3 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r5 = r5 << r2
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = r7 - r10
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L2d
            long r10 = r10 + r5
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L2b
            int r2 = r2 + 7
            goto L8
        L2b:
            int r9 = (int) r10
            return r9
        L2d:
            defpackage.C2264.m3682(r4)
            return r0
        L31:
            defpackage.C2264.m3682(r4)
            return r0
    }
}
