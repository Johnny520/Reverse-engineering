package defpackage;

/* JADX INFO: renamed from: ᛸᛲᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1439 extends defpackage.C1128 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final transient int[] f6321;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final transient byte[][] f6322;

    public C1439(byte[][] r2, int[] r3) {
            r1 = this;
            ᛶᛸᛸᛶ r0 = defpackage.C1128.f5017
            byte[] r0 = r0.f5020
            r1.<init>(r0)
            r1.f6322 = r2
            r1.f6321 = r3
            return
    }

    @Override // defpackage.C1128
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.C1128
            if (r0 == 0) goto L1f
            ᛶᛸᛸᛶ r3 = (defpackage.C1128) r3
            int r0 = r3.mo2165()
            int r1 = r2.mo2165()
            if (r0 != r1) goto L1f
            int r0 = r2.mo2165()
            boolean r2 = r2.mo2167(r3, r0)
            if (r2 == 0) goto L1f
        L1d:
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    @Override // defpackage.C1128
    public final int hashCode() {
            r9 = this;
            int r0 = r9.f5019
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[][] r0 = r9.f6322
            int r1 = r0.length
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        Lc:
            if (r2 >= r1) goto L29
            int r5 = r1 + r2
            int[] r6 = r9.f6321
            r5 = r6[r5]
            r6 = r6[r2]
            r7 = r0[r2]
            int r3 = r6 - r3
            int r3 = r3 + r5
        L1b:
            if (r5 >= r3) goto L25
            int r4 = r4 * 31
            r8 = r7[r5]
            int r4 = r4 + r8
            int r5 = r5 + 1
            goto L1b
        L25:
            int r2 = r2 + 1
            r3 = r6
            goto Lc
        L29:
            r9.f5019 = r4
            return r4
    }

    @Override // defpackage.C1128
    public final java.lang.String toString() {
            r1 = this;
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            byte[] r1 = r1.m2649()
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.String mo2156(java.nio.charset.Charset r2) {
            r1 = this;
            byte[] r1 = r1.m2649()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final void mo2158(defpackage.C1569 r10, int r11) {
            r9 = this;
            r0 = 0
            int r1 = defpackage.AbstractC0209.m780(r9, r0)
            r2 = r0
        L6:
            if (r2 >= r11) goto L42
            int[] r3 = r9.f6321
            if (r1 != 0) goto Le
            r4 = r0
            goto L12
        Le:
            int r4 = r1 + (-1)
            r4 = r3[r4]
        L12:
            r5 = r3[r1]
            int r5 = r5 - r4
            byte[][] r6 = r9.f6322
            int r7 = r6.length
            int r7 = r7 + r1
            r3 = r3[r7]
            int r5 = r5 + r4
            int r5 = java.lang.Math.min(r11, r5)
            int r5 = r5 - r2
            int r4 = r2 - r4
            int r4 = r4 + r3
            r3 = r6[r1]
            ᲁᲇᛶᛶ r6 = new ᲁᲇᛶᛶ
            int r7 = r4 + r5
            r8 = 1
            r6.<init>(r3, r4, r7, r8)
            ᲁᲇᛶᛶ r3 = r10.f6929
            if (r3 != 0) goto L39
            r6.f8470 = r6
            r6.f8469 = r6
            r10.f6929 = r6
            goto L3e
        L39:
            ᲁᲇᛶᛶ r3 = r3.f8470
            r3.m3362(r6)
        L3e:
            int r2 = r2 + r5
            int r1 = r1 + 1
            goto L6
        L42:
            long r0 = r10.f6928
            long r2 = (long) r11
            long r0 = r0 + r2
            r10.f6928 = r0
            return
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final defpackage.C1128 mo2159(int r11, int r12) {
            r10 = this;
            r0 = 0
            if (r11 < 0) goto L9f
            int r1 = r10.mo2165()
            java.lang.String r2 = "endIndex="
            if (r12 > r1) goto L78
            int r1 = r12 - r11
            if (r1 < 0) goto L6e
            if (r11 != 0) goto L18
            int r0 = r10.mo2165()
            if (r12 != r0) goto L18
            return r10
        L18:
            if (r11 != r12) goto L1d
            ᛶᛸᛸᛶ r10 = defpackage.C1128.f5017
            return r10
        L1d:
            int r0 = defpackage.AbstractC0209.m780(r10, r11)
            int r12 = r12 + (-1)
            int r12 = defpackage.AbstractC0209.m780(r10, r12)
            int r2 = r12 + 1
            byte[][] r3 = r10.f6322
            int r4 = r3.length
            defpackage.AbstractC2346.m3844(r2, r4)
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r3, r0, r2)
            byte[][] r2 = (byte[][]) r2
            int r4 = r2.length
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            r5 = 0
            int[] r10 = r10.f6321
            if (r0 > r12) goto L5a
            r7 = r0
            r6 = r5
        L41:
            r8 = r10[r7]
            int r8 = r8 - r11
            int r8 = java.lang.Math.min(r8, r1)
            r4[r6] = r8
            int r8 = r6 + 1
            int r9 = r2.length
            int r6 = r6 + r9
            int r9 = r3.length
            int r9 = r9 + r7
            r9 = r10[r9]
            r4[r6] = r9
            if (r7 == r12) goto L5a
            int r7 = r7 + 1
            r6 = r8
            goto L41
        L5a:
            if (r0 != 0) goto L5d
            goto L61
        L5d:
            int r0 = r0 + (-1)
            r5 = r10[r0]
        L61:
            int r10 = r2.length
            r12 = r4[r10]
            int r11 = r11 - r5
            int r11 = r11 + r12
            r4[r10] = r11
            ᛸᛲᛷᲇ r10 = new ᛸᛲᛷᲇ
            r10.<init>(r2, r4)
            return r10
        L6e:
            java.lang.String r10 = " < beginIndex="
            java.lang.String r10 = defpackage.AbstractC1124.m2143(r12, r11, r2, r10)
            defpackage.C2264.m3678(r10)
            return r0
        L78:
            int r10 = r10.mo2165()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r2)
            r11.append(r12)
            java.lang.String r12 = " > length("
            r11.append(r12)
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L9f:
            java.lang.String r10 = "beginIndex="
            java.lang.String r12 = " < 0"
            defpackage.C0086.m546(r10, r11, r12)
            return r0
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final byte mo2160(int r10) {
            r9 = this;
            byte[][] r0 = r9.f6322
            int r1 = r0.length
            int r1 = r1 + (-1)
            int[] r2 = r9.f6321
            r1 = r2[r1]
            long r3 = (long) r1
            long r5 = (long) r10
            r7 = 1
            defpackage.AbstractC1171.m2271(r3, r5, r7)
            int r9 = defpackage.AbstractC0209.m780(r9, r10)
            if (r9 != 0) goto L18
            r1 = 0
            goto L1c
        L18:
            int r1 = r9 + (-1)
            r1 = r2[r1]
        L1c:
            int r3 = r0.length
            int r3 = r3 + r9
            r2 = r2[r3]
            r9 = r0[r9]
            int r10 = r10 - r1
            int r10 = r10 + r2
            r9 = r9[r10]
            return r9
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final byte[] m2649() {
            r10 = this;
            int r0 = r10.mo2165()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r10.f6322
            int r2 = r1.length
            r3 = 0
            r4 = r3
            r5 = r4
        Lc:
            if (r3 >= r2) goto L25
            int r6 = r2 + r3
            int[] r7 = r10.f6321
            r6 = r7[r6]
            r7 = r7[r3]
            r8 = r1[r3]
            int r4 = r7 - r4
            int r9 = r6 + r4
            int r9 = r9 - r6
            java.lang.System.arraycopy(r8, r6, r0, r5, r9)
            int r5 = r5 + r4
            int r3 = r3 + 1
            r4 = r7
            goto Lc
        L25:
            return r0
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final byte[] mo2161() {
            r0 = this;
            byte[] r0 = r0.m2649()
            return r0
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final java.lang.String mo2162() {
            r8 = this;
            byte[] r8 = r8.m2649()
            int r0 = r8.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Lc:
            if (r2 >= r1) goto L27
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = defpackage.AbstractC1754.f7742
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r7 = r6[r7]
            r0[r3] = r7
            int r3 = r3 + 2
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto Lc
        L27:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo2163() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final defpackage.C1128 mo2164() {
            r1 = this;
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            byte[] r1 = r1.m2649()
            r0.<init>(r1)
            ᛶᛸᛸᛶ r1 = r0.mo2164()
            return r1
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final int mo2165() {
            r1 = this;
            byte[][] r0 = r1.f6322
            int r0 = r0.length
            int r0 = r0 + (-1)
            int[] r1 = r1.f6321
            r1 = r1[r0]
            return r1
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final boolean mo2166(int r9, int r10, int r11, byte[] r12) {
            r8 = this;
            r0 = 0
            if (r9 < 0) goto L4e
            int r1 = r8.mo2165()
            int r1 = r1 - r11
            if (r9 > r1) goto L4e
            if (r10 < 0) goto L4e
            int r1 = r12.length
            int r1 = r1 - r11
            if (r10 <= r1) goto L11
            goto L4e
        L11:
            int r11 = r11 + r9
            int r1 = defpackage.AbstractC0209.m780(r8, r9)
        L16:
            if (r9 >= r11) goto L4c
            int[] r2 = r8.f6321
            if (r1 != 0) goto L1e
            r3 = r0
            goto L22
        L1e:
            int r3 = r1 + (-1)
            r3 = r2[r3]
        L22:
            r4 = r2[r1]
            int r4 = r4 - r3
            byte[][] r5 = r8.f6322
            int r6 = r5.length
            int r6 = r6 + r1
            r2 = r2[r6]
            int r4 = r4 + r3
            int r4 = java.lang.Math.min(r11, r4)
            int r4 = r4 - r9
            int r3 = r9 - r3
            int r3 = r3 + r2
            r2 = r5[r1]
            r5 = r0
        L37:
            if (r5 >= r4) goto L47
            int r6 = r5 + r3
            r6 = r2[r6]
            int r7 = r5 + r10
            r7 = r12[r7]
            if (r6 == r7) goto L44
            goto L4e
        L44:
            int r5 = r5 + 1
            goto L37
        L47:
            int r10 = r10 + r4
            int r9 = r9 + r4
            int r1 = r1 + 1
            goto L16
        L4c:
            r8 = 1
            return r8
        L4e:
            return r0
    }

    @Override // defpackage.C1128
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo2167(defpackage.C1128 r10, int r11) {
            r9 = this;
            int r0 = r9.mo2165()
            int r0 = r0 - r11
            r1 = 0
            if (r0 >= 0) goto L9
            goto L35
        L9:
            int r0 = defpackage.AbstractC0209.m780(r9, r1)
            r2 = r1
            r3 = r2
        Lf:
            if (r2 >= r11) goto L3b
            int[] r4 = r9.f6321
            if (r0 != 0) goto L17
            r5 = r1
            goto L1b
        L17:
            int r5 = r0 + (-1)
            r5 = r4[r5]
        L1b:
            r6 = r4[r0]
            int r6 = r6 - r5
            byte[][] r7 = r9.f6322
            int r8 = r7.length
            int r8 = r8 + r0
            r4 = r4[r8]
            int r6 = r6 + r5
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r2
            int r5 = r2 - r5
            int r5 = r5 + r4
            r4 = r7[r0]
            boolean r4 = r10.mo2166(r3, r5, r6, r4)
            if (r4 != 0) goto L36
        L35:
            return r1
        L36:
            int r3 = r3 + r6
            int r2 = r2 + r6
            int r0 = r0 + 1
            goto Lf
        L3b:
            r9 = 1
            return r9
    }
}
