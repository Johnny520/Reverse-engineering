package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛷᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0674 extends xhss.C0289 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final transient int[] f2292;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final transient byte[][] f2293;

    public C0674(byte[][] r2, int[] r3) {
            r1 = this;
            xhss.ᛳᛶᲈᲈ r0 = xhss.C0289.f1117
            byte[] r0 = r0.f1118
            r1.<init>(r0)
            r1.f2293 = r2
            r1.f2292 = r3
            return
    }

    @Override // xhss.C0289
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof xhss.C0289
            if (r0 == 0) goto L1f
            xhss.ᛳᛶᲈᲈ r3 = (xhss.C0289) r3
            int r0 = r3.mo611()
            int r1 = r2.mo611()
            if (r0 != r1) goto L1f
            int r0 = r2.mo611()
            boolean r2 = r2.mo617(r3, r0)
            if (r2 == 0) goto L1f
        L1d:
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    @Override // xhss.C0289
    public final int hashCode() {
            r9 = this;
            int r0 = r9.f1119
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[][] r0 = r9.f2293
            int r1 = r0.length
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        Lc:
            if (r2 >= r1) goto L29
            int r5 = r1 + r2
            int[] r6 = r9.f2292
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
            r9.f1119 = r4
            return r4
    }

    @Override // xhss.C0289
    public final java.lang.String toString() {
            r1 = this;
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            byte[] r1 = r1.m1162()
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo608() {
            r8 = this;
            byte[] r8 = r8.m1162()
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
            char[] r6 = xhss.AbstractC0694.f2348
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

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final byte[] mo609() {
            r0 = this;
            byte[] r0 = r0.m1162()
            return r0
    }

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final boolean mo610(int r9, byte[] r10, int r11, int r12) {
            r8 = this;
            r0 = 0
            if (r9 < 0) goto L4e
            int r1 = r8.mo611()
            int r1 = r1 - r12
            if (r9 > r1) goto L4e
            if (r11 < 0) goto L4e
            int r1 = r10.length
            int r1 = r1 - r12
            if (r11 <= r1) goto L11
            goto L4e
        L11:
            int r12 = r12 + r9
            int r1 = xhss.AbstractC0485.m886(r8, r9)
        L16:
            if (r9 >= r12) goto L4c
            int[] r2 = r8.f2292
            if (r1 != 0) goto L1e
            r3 = r0
            goto L22
        L1e:
            int r3 = r1 + (-1)
            r3 = r2[r3]
        L22:
            r4 = r2[r1]
            int r4 = r4 - r3
            byte[][] r5 = r8.f2293
            int r6 = r5.length
            int r6 = r6 + r1
            r2 = r2[r6]
            int r4 = r4 + r3
            int r4 = java.lang.Math.min(r12, r4)
            int r4 = r4 - r9
            int r3 = r9 - r3
            int r3 = r3 + r2
            r2 = r5[r1]
            r5 = r0
        L37:
            if (r5 >= r4) goto L47
            int r6 = r5 + r3
            r6 = r2[r6]
            int r7 = r5 + r11
            r7 = r10[r7]
            if (r6 == r7) goto L44
            goto L4e
        L44:
            int r5 = r5 + 1
            goto L37
        L47:
            int r11 = r11 + r4
            int r9 = r9 + r4
            int r1 = r1 + 1
            goto L16
        L4c:
            r8 = 1
            return r8
        L4e:
            return r0
    }

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo611() {
            r1 = this;
            byte[][] r0 = r1.f2293
            int r0 = r0.length
            int r0 = r0 + (-1)
            int[] r1 = r1.f2292
            r1 = r1[r0]
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final byte[] m1162() {
            r10 = this;
            int r0 = r10.mo611()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r10.f2293
            int r2 = r1.length
            r3 = 0
            r4 = r3
            r5 = r4
        Lc:
            if (r3 >= r2) goto L25
            int r6 = r2 + r3
            int[] r7 = r10.f2292
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

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final xhss.C0289 mo612() {
            r1 = this;
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            byte[] r1 = r1.m1162()
            r0.<init>(r1)
            xhss.ᛳᛶᲈᲈ r1 = r0.mo612()
            return r1
    }

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final xhss.C0289 mo613(int r11, int r12) {
            r10 = this;
            r0 = 0
            if (r11 < 0) goto L9f
            int r1 = r10.mo611()
            java.lang.String r2 = "endIndex="
            if (r12 > r1) goto L78
            int r1 = r12 - r11
            if (r1 < 0) goto L6e
            if (r11 != 0) goto L18
            int r0 = r10.mo611()
            if (r12 != r0) goto L18
            return r10
        L18:
            if (r11 != r12) goto L1d
            xhss.ᛳᛶᲈᲈ r10 = xhss.C0289.f1117
            return r10
        L1d:
            int r0 = xhss.AbstractC0485.m886(r10, r11)
            int r12 = r12 + (-1)
            int r12 = xhss.AbstractC0485.m886(r10, r12)
            int r2 = r12 + 1
            byte[][] r3 = r10.f2293
            int r4 = r3.length
            xhss.AbstractC0485.m881(r2, r4)
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r3, r0, r2)
            byte[][] r2 = (byte[][]) r2
            int r4 = r2.length
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            r5 = 0
            int[] r10 = r10.f2292
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
            xhss.ᛷᛷᛱᛵ r10 = new xhss.ᛷᛷᛱᛵ
            r10.<init>(r2, r4)
            return r10
        L6e:
            java.lang.String r10 = " < beginIndex="
            java.lang.String r10 = xhss.AbstractC0390.m782(r12, r11, r2, r10)
            xhss.C0532.m946(r10)
            return r0
        L78:
            int r10 = r10.mo611()
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
            xhss.C0532.m958(r10, r11, r12)
            return r0
    }

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final java.lang.String mo615(java.nio.charset.Charset r2) {
            r1 = this;
            byte[] r1 = r1.m1162()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final byte mo616(int r10) {
            r9 = this;
            byte[][] r0 = r9.f2293
            int r1 = r0.length
            int r1 = r1 + (-1)
            int[] r2 = r9.f2292
            r1 = r2[r1]
            long r3 = (long) r1
            long r5 = (long) r10
            r7 = 1
            xhss.AbstractC0694.m1210(r3, r5, r7)
            int r9 = xhss.AbstractC0485.m886(r9, r10)
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

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final boolean mo617(xhss.C0289 r10, int r11) {
            r9 = this;
            int r0 = r9.mo611()
            int r0 = r0 - r11
            r1 = 0
            if (r0 >= 0) goto L9
            goto L35
        L9:
            int r0 = xhss.AbstractC0485.m886(r9, r1)
            r2 = r1
            r3 = r2
        Lf:
            if (r2 >= r11) goto L3b
            int[] r4 = r9.f2292
            if (r0 != 0) goto L17
            r5 = r1
            goto L1b
        L17:
            int r5 = r0 + (-1)
            r5 = r4[r5]
        L1b:
            r6 = r4[r0]
            int r6 = r6 - r5
            byte[][] r7 = r9.f2293
            int r8 = r7.length
            int r8 = r8 + r0
            r4 = r4[r8]
            int r6 = r6 + r5
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r2
            int r5 = r2 - r5
            int r5 = r5 + r4
            r4 = r7[r0]
            boolean r4 = r10.mo610(r3, r4, r5, r6)
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

    @Override // xhss.C0289
    /* JADX INFO: renamed from: ᲈᛳᲀ */
    public final void mo618(xhss.C0338 r10, int r11) {
            r9 = this;
            r0 = 0
            int r1 = xhss.AbstractC0485.m886(r9, r0)
            r2 = r0
        L6:
            if (r2 >= r11) goto L42
            int[] r3 = r9.f2292
            if (r1 != 0) goto Le
            r4 = r0
            goto L12
        Le:
            int r4 = r1 + (-1)
            r4 = r3[r4]
        L12:
            r5 = r3[r1]
            int r5 = r5 - r4
            byte[][] r6 = r9.f2293
            int r7 = r6.length
            int r7 = r7 + r1
            r3 = r3[r7]
            int r5 = r5 + r4
            int r5 = java.lang.Math.min(r11, r5)
            int r5 = r5 - r2
            int r4 = r2 - r4
            int r4 = r4 + r3
            r3 = r6[r1]
            xhss.ᛲᛳᲁᛳ r6 = new xhss.ᛲᛳᲁᛳ
            int r7 = r4 + r5
            r8 = 1
            r6.<init>(r3, r4, r7, r8)
            xhss.ᛲᛳᲁᛳ r3 = r10.f1260
            if (r3 != 0) goto L39
            r6.f623 = r6
            r6.f625 = r6
            r10.f1260 = r6
            goto L3e
        L39:
            xhss.ᛲᛳᲁᛳ r3 = r3.f623
            r3.m389(r6)
        L3e:
            int r2 = r2 + r5
            int r1 = r1 + 1
            goto L6
        L42:
            long r0 = r10.f1261
            long r2 = (long) r11
            long r0 = r0 + r2
            r10.f1261 = r0
            return
    }
}
