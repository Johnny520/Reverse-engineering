package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛵᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0159 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public /* synthetic */ boolean f659;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public /* synthetic */ long[] f660;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public /* synthetic */ int f661;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object[] f662;

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            xhss.ᛲᛵᛶᲈ r0 = (xhss.C0159) r0
            long[] r1 = r2.f660
            java.lang.Object r1 = r1.clone()
            long[] r1 = (long[]) r1
            r0.f660 = r1
            java.lang.Object[] r2 = r2.f662
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.f662 = r2
            return r0
    }

    public final java.lang.String toString() {
            r15 = this;
            java.lang.Object r0 = xhss.AbstractC0694.f2349
            boolean r1 = r15.f659
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L29
            int r1 = r15.f661
            long[] r4 = r15.f660
            java.lang.Object[] r5 = r15.f662
            r6 = r3
            r7 = r6
        L10:
            if (r6 >= r1) goto L25
            r8 = r5[r6]
            if (r8 == r0) goto L22
            if (r6 == r7) goto L20
            r9 = r4[r6]
            r4[r7] = r9
            r5[r7] = r8
            r5[r6] = r2
        L20:
            int r7 = r7 + 1
        L22:
            int r6 = r6 + 1
            goto L10
        L25:
            r15.f659 = r3
            r15.f661 = r7
        L29:
            int r1 = r15.f661
            if (r1 > 0) goto L30
            java.lang.String r15 = "{}"
            return r15
        L30:
            int r1 = r1 * 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r4.append(r1)
            int r1 = r15.f661
            r5 = r3
        L3f:
            if (r5 >= r1) goto Lca
            if (r5 <= 0) goto L48
            java.lang.String r6 = ", "
            r4.append(r6)
        L48:
            java.lang.String r6 = "Expected index to be within 0..size()-1, but was "
            if (r5 < 0) goto Lc2
            int r7 = r15.f661
            if (r5 >= r7) goto Lc2
            boolean r8 = r15.f659
            if (r8 == 0) goto L73
            long[] r8 = r15.f660
            java.lang.Object[] r9 = r15.f662
            r10 = r3
            r11 = r10
        L5a:
            if (r10 >= r7) goto L6f
            r12 = r9[r10]
            if (r12 == r0) goto L6c
            if (r10 == r11) goto L6a
            r13 = r8[r10]
            r8[r11] = r13
            r9[r11] = r12
            r9[r10] = r2
        L6a:
            int r11 = r11 + 1
        L6c:
            int r10 = r10 + 1
            goto L5a
        L6f:
            r15.f659 = r3
            r15.f661 = r11
        L73:
            long[] r7 = r15.f660
            r7 = r7[r5]
            r4.append(r7)
            r7 = 61
            r4.append(r7)
            if (r5 < 0) goto Lba
            int r7 = r15.f661
            if (r5 >= r7) goto Lba
            boolean r6 = r15.f659
            if (r6 == 0) goto La8
            long[] r6 = r15.f660
            java.lang.Object[] r8 = r15.f662
            r9 = r3
            r10 = r9
        L8f:
            if (r9 >= r7) goto La4
            r11 = r8[r9]
            if (r11 == r0) goto La1
            if (r9 == r10) goto L9f
            r12 = r6[r9]
            r6[r10] = r12
            r8[r10] = r11
            r8[r9] = r2
        L9f:
            int r10 = r10 + 1
        La1:
            int r9 = r9 + 1
            goto L8f
        La4:
            r15.f659 = r3
            r15.f661 = r10
        La8:
            java.lang.Object[] r6 = r15.f662
            r6 = r6[r5]
            if (r6 == r4) goto Lb2
            r4.append(r6)
            goto Lb7
        Lb2:
            java.lang.String r6 = "(this Map)"
            r4.append(r6)
        Lb7:
            int r5 = r5 + 1
            goto L3f
        Lba:
            java.lang.String r15 = xhss.AbstractC0390.m774(r6, r5)
            xhss.C0532.m946(r15)
            return r2
        Lc2:
            java.lang.String r15 = xhss.AbstractC0390.m774(r6, r5)
            xhss.C0532.m946(r15)
            return r2
        Lca:
            r15 = 125(0x7d, float:1.75E-43)
            r4.append(r15)
            java.lang.String r15 = r4.toString()
            return r15
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m405(long r11, java.lang.ref.WeakReference r13) {
            r10 = this;
            java.lang.Object r0 = xhss.AbstractC0694.f2349
            long[] r1 = r10.f660
            int r2 = r10.f661
            int r1 = xhss.AbstractC0473.m853(r1, r2, r11)
            if (r1 < 0) goto L11
            java.lang.Object[] r10 = r10.f662
            r10[r1] = r13
            return
        L11:
            int r1 = ~r1
            int r2 = r10.f661
            if (r1 >= r2) goto L23
            java.lang.Object[] r3 = r10.f662
            r4 = r3[r1]
            if (r4 != r0) goto L23
            long[] r10 = r10.f660
            r10[r1] = r11
            r3[r1] = r13
            return
        L23:
            boolean r3 = r10.f659
            if (r3 == 0) goto L52
            long[] r3 = r10.f660
            int r4 = r3.length
            if (r2 < r4) goto L52
            java.lang.Object[] r1 = r10.f662
            r4 = 0
            r5 = r4
            r6 = r5
        L31:
            if (r5 >= r2) goto L47
            r7 = r1[r5]
            if (r7 == r0) goto L44
            if (r5 == r6) goto L42
            r8 = r3[r5]
            r3[r6] = r8
            r1[r6] = r7
            r7 = 0
            r1[r5] = r7
        L42:
            int r6 = r6 + 1
        L44:
            int r5 = r5 + 1
            goto L31
        L47:
            r10.f659 = r4
            r10.f661 = r6
            long[] r0 = r10.f660
            int r0 = xhss.AbstractC0473.m853(r0, r6, r11)
            int r1 = ~r0
        L52:
            int r0 = r10.f661
            long[] r2 = r10.f660
            int r2 = r2.length
            r3 = 1
            if (r0 < r2) goto L7f
            int r0 = r0 + r3
            int r0 = r0 * 8
            r2 = 4
        L5e:
            r4 = 32
            if (r2 >= r4) goto L6d
            int r4 = r3 << r2
            int r4 = r4 + (-12)
            if (r0 > r4) goto L6a
            r0 = r4
            goto L6d
        L6a:
            int r2 = r2 + 1
            goto L5e
        L6d:
            int r0 = r0 / 8
            long[] r2 = r10.f660
            long[] r2 = java.util.Arrays.copyOf(r2, r0)
            r10.f660 = r2
            java.lang.Object[] r2 = r10.f662
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.f662 = r0
        L7f:
            int r0 = r10.f661
            int r0 = r0 - r1
            if (r0 == 0) goto L92
            long[] r2 = r10.f660
            int r4 = r1 + 1
            java.lang.System.arraycopy(r2, r1, r2, r4, r0)
            java.lang.Object[] r0 = r10.f662
            int r2 = r10.f661
            xhss.AbstractC0193.m448(r4, r1, r2, r0, r0)
        L92:
            long[] r0 = r10.f660
            r0[r1] = r11
            java.lang.Object[] r11 = r10.f662
            r11[r1] = r13
            int r11 = r10.f661
            int r11 = r11 + r3
            r10.f661 = r11
            return
    }
}
