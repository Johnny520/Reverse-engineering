package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲈᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0223 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f828;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long f829;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0047[] f830;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f831;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f832;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f833;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0976 f834;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f835;

    public C0223(xhss.C0887 r2) {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r1.f831 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f828 = r0
            xhss.ᲁᛸᛵᛳ r0 = new xhss.ᲁᛸᛵᛳ
            r0.<init>(r2)
            r1.f834 = r0
            r2 = 8
            xhss.ᛱᛵᲀᛱ[] r2 = new xhss.C0047[r2]
            r1.f830 = r2
            r2 = 7
            r1.f835 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m486(int r5) {
            r4 = this;
            r0 = 0
            if (r5 <= 0) goto L35
            xhss.ᛱᛵᲀᛱ[] r1 = r4.f830
            int r1 = r1.length
            int r1 = r1 + (-1)
        L8:
            int r2 = r4.f835
            if (r1 < r2) goto L25
            if (r5 <= 0) goto L25
            xhss.ᛱᛵᲀᛱ[] r2 = r4.f830
            r2 = r2[r1]
            int r2 = r2.f326
            int r5 = r5 - r2
            int r3 = r4.f832
            int r3 = r3 - r2
            r4.f832 = r3
            int r2 = r4.f833
            int r2 = r2 + (-1)
            r4.f833 = r2
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto L8
        L25:
            xhss.ᛱᛵᲀᛱ[] r5 = r4.f830
            int r2 = r2 + 1
            int r1 = r2 + r0
            int r3 = r4.f833
            java.lang.System.arraycopy(r5, r2, r5, r1, r3)
            int r5 = r4.f835
            int r5 = r5 + r0
            r4.f835 = r5
        L35:
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0289 m487(int r3) {
            r2 = this;
            if (r3 < 0) goto Le
            xhss.ᛱᛵᲀᛱ[] r0 = xhss.AbstractC0907.f2936
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r3 > r1) goto Le
            r2 = r0[r3]
            xhss.ᛳᛶᲈᲈ r2 = r2.f327
            return r2
        Le:
            xhss.ᛱᛵᲀᛱ[] r0 = xhss.AbstractC0907.f2936
            int r0 = r0.length
            int r0 = r3 - r0
            int r1 = r2.f835
            int r1 = r1 + 1
            int r1 = r1 + r0
            if (r1 < 0) goto L24
            xhss.ᛱᛵᲀᛱ[] r2 = r2.f830
            int r0 = r2.length
            if (r1 >= r0) goto L24
            r2 = r2[r1]
            xhss.ᛳᛶᲈᲈ r2 = r2.f327
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

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0289 m488() {
            r11 = this;
            xhss.ᲁᛸᛵᛳ r0 = r11.f834
            byte r1 = r0.m1615()
            byte[] r2 = xhss.AbstractC0577.f2010
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
            int r2 = r11.m491(r2, r3)
            long r2 = (long) r2
            long r5 = r11.f829
            long r5 = r5 + r2
            r7 = 262144(0x40000, double:1.295163E-318)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto L97
            if (r1 == 0) goto L92
            xhss.ᛴᛲᛴᛶ r11 = new xhss.ᛴᛲᛴᛶ
            r11.<init>()
            xhss.ᛷᛳᛷᛳ r1 = xhss.AbstractC0958.f3103
            r5 = 0
            r8 = r1
            r6 = r5
            r5 = r4
        L32:
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 >= 0) goto L6a
            byte r9 = r0.m1615()
            byte[] r10 = xhss.AbstractC0577.f2010
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
            java.lang.Object r8 = r8.f2195
            xhss.ᛷᛳᛷᛳ[] r8 = (xhss.C0639[]) r8
            r8 = r8[r9]
            java.lang.Object r9 = r8.f2195
            xhss.ᛷᛳᛷᛳ[] r9 = (xhss.C0639[]) r9
            if (r9 != 0) goto L63
            int r9 = r8.f2192
            r11.m701(r9)
            int r8 = r8.f2193
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
            java.lang.Object r2 = r8.f2195
            xhss.ᛷᛳᛷᛳ[] r2 = (xhss.C0639[]) r2
            r0 = r2[r0]
            java.lang.Object r2 = r0.f2195
            xhss.ᛷᛳᛷᛳ[] r2 = (xhss.C0639[]) r2
            int r3 = r0.f2193
            if (r2 != 0) goto L8b
            if (r3 <= r5) goto L83
            goto L8b
        L83:
            int r0 = r0.f2192
            r11.m701(r0)
            int r5 = r5 - r3
            r8 = r1
            goto L6a
        L8b:
            long r0 = r11.f1261
            xhss.ᛳᛶᲈᲈ r11 = r11.m695(r0)
            return r11
        L92:
            xhss.ᛳᛶᲈᲈ r11 = r0.m1614(r2)
            return r11
        L97:
            java.lang.String r11 = "header byte count limit of 262144 exceeded"
            xhss.C0532.m947(r11)
            r11 = 0
            return r11
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m489(xhss.C0047 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f828
            r0.add(r5)
            xhss.ᛳᛶᲈᲈ r0 = r5.f327
            int r0 = r0.mo611()
            xhss.ᛳᛶᲈᲈ r5 = r5.f325
            int r5 = r5.mo611()
            int r5 = r5 + r0
            long r0 = r4.f829
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.f829 = r0
            r4 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L20
            return
        L20:
            java.lang.String r4 = "header byte count limit of 262144 exceeded"
            xhss.C0532.m947(r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m490(xhss.C0047 r7) {
            r6 = this;
            r6.m489(r7)
            int r0 = r7.f326
            int r1 = r6.f831
            r2 = 0
            if (r0 <= r1) goto L1d
            xhss.ᛱᛵᲀᛱ[] r7 = r6.f830
            r0 = 0
            int r1 = r7.length
            java.util.Arrays.fill(r7, r2, r1, r0)
            xhss.ᛱᛵᲀᛱ[] r7 = r6.f830
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.f835 = r7
            r6.f833 = r2
            r6.f832 = r2
            return
        L1d:
            int r3 = r6.f832
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.m486(r3)
            int r1 = r6.f833
            int r1 = r1 + 1
            xhss.ᛱᛵᲀᛱ[] r3 = r6.f830
            int r4 = r3.length
            if (r1 <= r4) goto L41
            int r1 = r3.length
            int r1 = r1 * 2
            xhss.ᛱᛵᲀᛱ[] r1 = new xhss.C0047[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            xhss.ᛱᛵᲀᛱ[] r2 = r6.f830
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.f835 = r2
            r6.f830 = r1
            r3 = r1
        L41:
            int r1 = r6.f835
            int r2 = r1 + (-1)
            r6.f835 = r2
            r3[r1] = r7
            int r7 = r6.f833
            int r7 = r7 + 1
            r6.f833 = r7
            int r7 = r6.f832
            int r7 = r7 + r0
            r6.f832 = r7
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int m491(int r10, int r11) {
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
            xhss.ᲁᛸᛵᛳ r3 = r9.f834
            byte r3 = r3.m1615()
            byte[] r5 = xhss.AbstractC0577.f2010
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
            xhss.C0532.m947(r4)
            return r0
        L31:
            xhss.C0532.m947(r4)
            return r0
    }
}
