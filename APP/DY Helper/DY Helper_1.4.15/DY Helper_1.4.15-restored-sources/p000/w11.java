package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w11 {

    /* JADX INFO: renamed from: α */
    public long[] f11519;

    /* JADX INFO: renamed from: β */
    public java.lang.Object[] f11520;

    /* JADX INFO: renamed from: γ */
    public long[] f11521;

    /* JADX INFO: renamed from: δ */
    public int f11522;

    /* JADX INFO: renamed from: ε */
    public int f11523;

    /* JADX INFO: renamed from: ζ */
    public int f11524;

    /* JADX INFO: renamed from: η */
    public int f11525;

    /* JADX INFO: renamed from: θ */
    public int f11526;

    public w11(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = p000.tq1.f10431
            r1.f11519 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1.f11520 = r0
            long[] r0 = p000.AbstractC0782s1.f9651
            r1.f11521 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f11522 = r0
            r1.f11523 = r0
            if (r2 < 0) goto L20
            int r2 = p000.tq1.m5734(r2)
            r1.m6304(r2)
            return
        L20:
            java.lang.String r1 = "Capacity must be a positive value."
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    public final boolean equals(java.lang.Object r15) {
            r14 = this;
            r0 = 1
            if (r15 != r14) goto L4
            return r0
        L4:
            boolean r1 = r15 instanceof p000.w11
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            w11 r15 = (p000.w11) r15
            int r1 = r15.f11525
            int r3 = r14.f11525
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Object[] r1 = r14.f11520
            long[] r14 = r14.f11519
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L59
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r10 = r15.m6301(r10)
            if (r10 != 0) goto L4e
            return r2
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r3) goto L59
            int r4 = r4 + 1
            goto L1d
        L59:
            return r0
    }

    public final int hashCode() {
            r15 = this;
            int r0 = r15.f11524
            int r0 = r0 * 31
            int r1 = r15.f11525
            int r0 = r0 + r1
            java.lang.Object[] r1 = r15.f11520
            long[] r2 = r15.f11519
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = 0
            r5 = r4
        L12:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L4f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            boolean r12 = p000.ln0.m3626(r11, r15)
            if (r12 != 0) goto L4b
            if (r11 == 0) goto L49
            int r11 = r11.hashCode()
            goto L4a
        L49:
            r11 = r4
        L4a:
            int r0 = r0 + r11
        L4b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L4f:
            if (r8 != r9) goto L52
            goto L53
        L52:
            return r0
        L53:
            if (r5 == r3) goto L58
            int r5 = r5 + 1
            goto L12
        L58:
            return r0
    }

    public final java.lang.String toString() {
            r9 = this;
            b0 r0 = new b0
            r1 = 15
            r0.<init>(r1, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            java.lang.Object[] r2 = r9.f11520
            long[] r3 = r9.f11521
            int r9 = r9.f11523
            r4 = 0
        L15:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r5) goto L43
            r5 = r3[r9]
            r7 = 31
            long r5 = r5 >> r7
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            r9 = r2[r9]
            r6 = -1
            if (r4 != r6) goto L2f
            java.lang.String r9 = "..."
            r1.append(r9)
            goto L48
        L2f:
            if (r4 == 0) goto L36
            java.lang.String r6 = ", "
            r1.append(r6)
        L36:
            java.lang.Object r9 = r0.invoke(r9)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r1.append(r9)
            int r4 = r4 + 1
            r9 = r5
            goto L15
        L43:
            java.lang.String r9 = "]"
            r1.append(r9)
        L48:
            java.lang.String r9 = r1.toString()
            return r9
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6299(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f11525
            int r1 = r11.m6302(r12)
            java.lang.Object[] r2 = r11.f11520
            r2[r1] = r12
            long[] r12 = r11.f11521
            int r2 = r11.f11522
            long r3 = (long) r2
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r5
            r7 = 4611686016279904256(0x3fffffff80000000, double:1.9999995231628418)
            long r3 = r3 | r7
            r12[r1] = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L31
            r7 = r12[r2]
            r9 = -4611686016279904257(0xc00000007fffffff, double:-2.000000953674316)
            long r7 = r7 & r9
            long r9 = (long) r1
            long r4 = r9 & r5
            r6 = 31
            long r4 = r4 << r6
            long r4 = r4 | r7
            r12[r2] = r4
        L31:
            r11.f11522 = r1
            int r12 = r11.f11523
            if (r12 != r3) goto L39
            r11.f11523 = r1
        L39:
            int r11 = r11.f11525
            if (r11 == r0) goto L3f
            r11 = 1
            return r11
        L3f:
            r11 = 0
            return r11
    }

    /* JADX INFO: renamed from: β */
    public final void m6300() {
            r10 = this;
            r0 = 0
            r10.f11525 = r0
            long[] r1 = r10.f11519
            long[] r2 = p000.tq1.f10431
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            p000.AbstractC0312g7.m2245(r2, r1)
            long[] r1 = r10.f11519
            int r2 = r10.f11524
            int r3 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r4 = r1[r3]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r2
            long r8 = ~r6
            long r4 = r4 & r8
            long r4 = r4 | r6
            r1[r3] = r4
        L25:
            java.lang.Object[] r1 = r10.f11520
            r2 = 0
            int r3 = r10.f11524
            p000.AbstractC0312g7.m2244(r0, r3, r2, r1)
            long[] r0 = r10.f11521
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            p000.AbstractC0312g7.m2245(r1, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r10.f11522 = r0
            r10.f11523 = r0
            int r0 = r10.f11524
            int r0 = p000.tq1.m5731(r0)
            int r1 = r10.f11525
            int r0 = r0 - r1
            r10.f11526 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m6301(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f11524
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f11519
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f11520
            r15 = r15[r11]
            boolean r15 = p000.ln0.m3626(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L74
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            return r12
        L73:
            return r2
        L74:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    /* JADX INFO: renamed from: δ */
    public final int m6302(java.lang.Object r48) {
            r47 = this;
            r0 = r47
            r1 = r48
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.f11524
            r7 = r5 & r6
            r8 = r2
        L1d:
            long[] r9 = r0.f11519
            int r10 = r7 >> 3
            r11 = r7 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r9 = r9[r10]
            int r15 = 64 - r11
            long r9 = r9 << r15
            r16 = r14
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r11 * r13
            r19 = r13
            long r13 = r9 ^ r17
            long r17 = r13 - r19
            long r13 = ~r13
            long r13 = r17 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r17
        L50:
            r19 = 0
            int r15 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r15 == 0) goto L74
            int r15 = java.lang.Long.numberOfTrailingZeros(r13)
            int r15 = r15 >> 3
            int r15 = r15 + r7
            r15 = r15 & r6
            r21 = r4
            java.lang.Object[] r4 = r0.f11520
            r4 = r4[r15]
            boolean r4 = p000.ln0.m3626(r4, r1)
            if (r4 == 0) goto L6b
            return r15
        L6b:
            r19 = 1
            long r19 = r13 - r19
            long r13 = r13 & r19
            r4 = r21
            goto L50
        L74:
            r21 = r4
            long r13 = ~r9
            r4 = 6
            long r13 = r13 << r4
            long r9 = r9 & r13
            long r9 = r9 & r17
            int r4 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            r9 = 8
            if (r4 == 0) goto L3ee
            int r1 = r0.m6303(r5)
            int r3 = r0.f11526
            r13 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto La0
            long[] r3 = r0.f11519
            int r8 = r1 >> 3
            r19 = r3[r8]
            r3 = r1 & 7
            int r3 = r3 << 3
            long r19 = r19 >> r3
            long r19 = r19 & r13
            r22 = 254(0xfe, double:1.255E-321)
            int r3 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r3 != 0) goto Lac
        La0:
            r30 = r2
            r45 = r11
            r35 = r13
            r48 = 7
            r26 = 128(0x80, double:6.3E-322)
            goto L3b8
        Lac:
            int r1 = r0.f11524
            r19 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r24 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 <= r9) goto L2e9
            int r10 = r0.f11525
            r48 = 7
            r15 = 31
            long r3 = (long) r10
            r26 = 32
            long r3 = r3 * r26
            r26 = 128(0x80, double:6.3E-322)
            long r6 = (long) r1
            r28 = 25
            long r6 = r6 * r28
            int r1 = java.lang.Long.compareUnsigned(r3, r6)
            if (r1 > 0) goto L2e2
            long[] r1 = r0.f11519
            if (r1 != 0) goto Ld9
            r30 = r2
            r45 = r11
            r35 = r13
            goto L3b4
        Ld9:
            int r3 = r0.f11524
            java.lang.Object[] r4 = r0.f11520
            long[] r6 = r0.f11521
            long[] r7 = new long[r3]
            r28 = r9
            r9 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.util.Arrays.fill(r7, r2, r3, r9)
            int r29 = r3 + 7
            r30 = r2
            int r2 = r29 >> 3
            r31 = r9
            r9 = r30
        Lf5:
            if (r9 >= r2) goto L110
            r33 = r1[r9]
            r35 = r13
            long r13 = r33 & r17
            r29 = r9
            long r8 = ~r13
            long r13 = r13 >>> r48
            long r8 = r8 + r13
            r13 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r13
            r1[r29] = r8
            int r9 = r29 + 1
            r13 = r35
            goto Lf5
        L110:
            r35 = r13
            int r2 = r1.length
            int r8 = r2 + (-1)
            int r2 = r2 + (-2)
            r13 = r1[r2]
            r17 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r13 = r13 & r17
            r17 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r13 = r13 | r17
            r1[r2] = r13
            r13 = r1[r30]
            r1[r8] = r13
            r2 = r30
        L12c:
            if (r2 == r3) goto L281
            int r13 = r2 >> 3
            r17 = r1[r13]
            r14 = r2 & 7
            int r14 = r14 << 3
            long r17 = r17 >> r14
            long r17 = r17 & r35
            int r29 = (r17 > r26 ? 1 : (r17 == r26 ? 0 : -1))
            if (r29 != 0) goto L141
        L13e:
            int r2 = r2 + 1
            goto L12c
        L141:
            int r17 = (r17 > r22 ? 1 : (r17 == r22 ? 0 : -1))
            if (r17 == 0) goto L146
            goto L13e
        L146:
            r17 = r4[r2]
            if (r17 == 0) goto L14f
            int r17 = r17.hashCode()
            goto L151
        L14f:
            r17 = r30
        L151:
            int r17 = r17 * r21
            int r18 = r17 << 16
            r17 = r17 ^ r18
            r33 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r8 = r17 >>> 7
            int r9 = r0.m6303(r8)
            r8 = r8 & r3
            int r18 = r9 - r8
            r18 = r18 & r3
            int r10 = r18 / 8
            int r8 = r2 - r8
            r8 = r8 & r3
            int r8 = r8 / 8
            r18 = 32
            if (r10 != r8) goto L19e
            r8 = r17 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r33 = r1[r13]
            r37 = r3
            r38 = r4
            long r3 = r35 << r14
            long r3 = ~r3
            long r3 = r33 & r3
            long r8 = r8 << r14
            long r3 = r3 | r8
            r1[r13] = r3
            r3 = r7[r2]
            int r3 = (r3 > r31 ? 1 : (r3 == r31 ? 0 : -1))
            if (r3 != 0) goto L190
            long r3 = (long) r2
            long r8 = r3 << r18
            long r3 = r3 | r8
            r7[r2] = r3
        L190:
            int r3 = r1.length
            int r3 = r3 + (-1)
            r8 = r1[r30]
            r1[r3] = r8
            int r2 = r2 + 1
            r3 = r37
            r4 = r38
            goto L12c
        L19e:
            r37 = r3
            r38 = r4
            int r3 = r9 >> 3
            r39 = r1[r3]
            r4 = r9 & 7
            int r4 = r4 << 3
            long r41 = r39 >> r4
            long r41 = r41 & r35
            int r8 = (r41 > r26 ? 1 : (r41 == r26 ? 0 : -1))
            r41 = -4294967296(0xffffffff00000000, double:NaN)
            if (r8 != 0) goto L21f
            r8 = r17 & 127(0x7f, float:1.78E-43)
            r43 = r3
            r44 = r4
            long r3 = (long) r8
            r45 = r3
            long r3 = r35 << r44
            long r3 = ~r3
            long r3 = r39 & r3
            long r39 = r45 << r44
            long r3 = r3 | r39
            r1[r43] = r3
            r3 = r1[r13]
            r39 = r3
            long r3 = r35 << r14
            long r3 = ~r3
            long r3 = r39 & r3
            long r39 = r26 << r14
            long r3 = r3 | r39
            r1[r13] = r3
            r3 = r38[r2]
            r38[r9] = r3
            r3 = 0
            r38[r2] = r3
            r3 = r6[r2]
            r6[r9] = r3
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r6[r2] = r3
            r3 = r7[r2]
            long r3 = r3 >> r18
            long r3 = r3 & r33
            int r3 = (int) r3
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r10) goto L20e
            r13 = r7[r3]
            long r13 = r13 & r41
            r45 = r11
            long r10 = (long) r9
            long r10 = r10 | r13
            r7[r3] = r10
            r3 = r7[r2]
            long r3 = r3 & r33
            long r3 = r3 | r41
            r7[r2] = r3
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L217
        L20e:
            r45 = r11
            long r3 = (long) r10
            long r3 = r3 << r18
            long r11 = (long) r9
            long r3 = r3 | r11
            r7[r2] = r3
        L217:
            long r3 = (long) r2
            long r3 = r3 << r18
            long r11 = (long) r10
            long r3 = r3 | r11
            r7[r9] = r3
            goto L270
        L21f:
            r43 = r3
            r44 = r4
            r45 = r11
            r3 = r17 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            long r11 = r35 << r44
            long r11 = ~r11
            long r11 = r39 & r11
            long r3 = r3 << r44
            long r3 = r3 | r11
            r1[r43] = r3
            r3 = r38[r9]
            r4 = r38[r2]
            r38[r9] = r4
            r38[r2] = r3
            r3 = r6[r9]
            r11 = r6[r2]
            r6[r9] = r11
            r6[r2] = r3
            r3 = r7[r2]
            long r3 = r3 >> r18
            long r3 = r3 & r33
            int r3 = (int) r3
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r10) goto L260
            r11 = r7[r3]
            long r11 = r11 & r41
            long r13 = (long) r9
            long r11 = r11 | r13
            r7[r3] = r11
            r11 = r7[r2]
            long r13 = r13 << r18
            long r11 = r11 & r33
            long r11 = r11 | r13
            r7[r2] = r11
            goto L267
        L260:
            long r3 = (long) r9
            long r11 = r3 << r18
            long r3 = r3 | r11
            r7[r2] = r3
            r3 = r2
        L267:
            long r3 = (long) r3
            long r3 = r3 << r18
            long r11 = (long) r2
            long r3 = r3 | r11
            r7[r9] = r3
            int r2 = r2 + (-1)
        L270:
            int r3 = r1.length
            int r3 = r3 + (-1)
            r8 = r1[r30]
            r1[r3] = r8
            int r2 = r2 + 1
            r3 = r37
            r4 = r38
            r11 = r45
            goto L12c
        L281:
            r45 = r11
            r33 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = r0.f11524
            int r1 = p000.tq1.m5731(r1)
            int r2 = r0.f11525
            int r1 = r1 - r2
            r0.f11526 = r1
            long[] r1 = r0.f11521
            int r2 = r1.length
            r3 = r30
        L298:
            if (r3 >= r2) goto L2c7
            r8 = r1[r3]
            long r11 = r8 >> r15
            long r11 = r11 & r24
            int r4 = (int) r11
            long r11 = r8 & r24
            int r6 = (int) r11
            long r8 = r8 & r19
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r10) goto L2ad
            r4 = r10
            goto L2b2
        L2ad:
            r11 = r7[r4]
            long r11 = r11 & r33
            int r4 = (int) r11
        L2b2:
            long r11 = (long) r4
            long r8 = r8 | r11
            long r8 = r8 << r15
            if (r6 != r10) goto L2bb
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L2c0
        L2bb:
            r11 = r7[r6]
            long r11 = r11 & r33
            int r4 = (int) r11
        L2c0:
            long r11 = (long) r4
            long r8 = r8 | r11
            r1[r3] = r8
            int r3 = r3 + 1
            goto L298
        L2c7:
            int r1 = r0.f11522
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r10) goto L2d5
            r1 = r7[r1]
            long r1 = r1 & r33
            int r1 = (int) r1
            r0.f11522 = r1
        L2d5:
            int r1 = r0.f11523
            if (r1 == r10) goto L3b4
            r1 = r7[r1]
            long r1 = r1 & r33
            int r1 = (int) r1
            r0.f11523 = r1
            goto L3b4
        L2e2:
            r30 = r2
            r45 = r11
            r35 = r13
            goto L2f0
        L2e9:
            r48 = 7
            r15 = 31
            r26 = 128(0x80, double:6.3E-322)
            goto L2e2
        L2f0:
            int r1 = r0.f11524
            int r1 = p000.tq1.m5732(r1)
            long[] r2 = r0.f11519
            java.lang.Object[] r3 = r0.f11520
            long[] r4 = r0.f11521
            int r6 = r0.f11524
            int[] r7 = new int[r6]
            r0.m6304(r1)
            long[] r1 = r0.f11519
            java.lang.Object[] r8 = r0.f11520
            long[] r9 = r0.f11521
            int r11 = r0.f11524
            r12 = r30
        L30d:
            if (r12 >= r6) goto L371
            int r13 = r12 >> 3
            r13 = r2[r13]
            r17 = r12 & 7
            int r17 = r17 << 3
            long r13 = r13 >> r17
            long r13 = r13 & r35
            int r13 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r13 >= 0) goto L366
            r13 = r3[r12]
            if (r13 == 0) goto L328
            int r14 = r13.hashCode()
            goto L32a
        L328:
            r14 = r30
        L32a:
            int r14 = r14 * r21
            int r17 = r14 << 16
            r14 = r14 ^ r17
            int r10 = r14 >>> 7
            int r10 = r0.m6303(r10)
            r14 = r14 & 127(0x7f, float:1.78E-43)
            r18 = r1
            r17 = r2
            long r1 = (long) r14
            int r14 = r10 >> 3
            r22 = r10 & 7
            int r22 = r22 << 3
            r31 = r18[r14]
            r33 = r1
            long r1 = r35 << r22
            long r1 = ~r1
            long r1 = r31 & r1
            long r22 = r33 << r22
            long r1 = r1 | r22
            r18[r14] = r1
            int r14 = r10 + (-7)
            r14 = r14 & r11
            r22 = r11 & 7
            int r14 = r14 + r22
            int r14 = r14 >> 3
            r18[r14] = r1
            r8[r10] = r13
            r1 = r4[r12]
            r9[r10] = r1
            r7[r12] = r10
            goto L36a
        L366:
            r18 = r1
            r17 = r2
        L36a:
            int r12 = r12 + 1
            r2 = r17
            r1 = r18
            goto L30d
        L371:
            long[] r1 = r0.f11521
            int r2 = r1.length
            r3 = r30
        L376:
            if (r3 >= r2) goto L3a1
            r8 = r1[r3]
            long r10 = r8 >> r15
            long r10 = r10 & r24
            int r4 = (int) r10
            long r10 = r8 & r24
            int r6 = (int) r10
            long r8 = r8 & r19
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r10) goto L38b
            r4 = r10
            goto L38f
        L38b:
            r29 = r7[r4]
            r4 = r29
        L38f:
            long r11 = (long) r4
            long r8 = r8 | r11
            long r8 = r8 << r15
            if (r6 != r10) goto L396
            r4 = r10
            goto L39a
        L396:
            r29 = r7[r6]
            r4 = r29
        L39a:
            long r11 = (long) r4
            long r8 = r8 | r11
            r1[r3] = r8
            int r3 = r3 + 1
            goto L376
        L3a1:
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r0.f11522
            if (r1 == r10) goto L3ac
            r1 = r7[r1]
            r0.f11522 = r1
        L3ac:
            int r1 = r0.f11523
            if (r1 == r10) goto L3b4
            r1 = r7[r1]
            r0.f11523 = r1
        L3b4:
            int r1 = r0.m6303(r5)
        L3b8:
            int r2 = r0.f11525
            int r2 = r2 + 1
            r0.f11525 = r2
            int r2 = r0.f11526
            long[] r3 = r0.f11519
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r35
            int r8 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r8 != 0) goto L3d4
            r30 = r16
        L3d4:
            int r2 = r2 - r30
            r0.f11526 = r2
            int r0 = r0.f11524
            long r8 = r35 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r45 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r2 = r1 + (-7)
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r3[r0] = r5
            return r1
        L3ee:
            r30 = r2
            r28 = r9
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r4 = r21
            goto L1d
    }

    /* JADX INFO: renamed from: ε */
    public final int m6303(int r10) {
            r9 = this;
            int r0 = r9.f11524
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f11519
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r2[r3]
            long r5 = r5 >>> r4
            int r3 = r3 + 1
            r2 = r2[r3]
            int r7 = 64 - r4
            long r2 = r2 << r7
            long r7 = (long) r4
            long r7 = -r7
            r4 = 63
            long r7 = r7 >> r4
            long r2 = r2 & r7
            long r2 = r2 | r5
            long r4 = ~r2
            r6 = 7
            long r4 = r4 << r6
            long r2 = r2 & r4
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r4
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L37
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r10 = r10 + r9
            r9 = r10 & r0
            return r9
        L37:
            int r1 = r1 + 8
            int r10 = r10 + r1
            r10 = r10 & r0
            goto L4
    }

    /* JADX INFO: renamed from: ζ */
    public final void m6304(int r11) {
            r10 = this;
            r0 = 0
            if (r11 <= 0) goto Ld
            int r11 = p000.tq1.m5733(r11)
            r1 = 7
            int r11 = java.lang.Math.max(r1, r11)
            goto Le
        Ld:
            r11 = r0
        Le:
            r10.f11524 = r11
            if (r11 != 0) goto L15
            long[] r1 = p000.tq1.f10431
            goto L26
        L15:
            int r1 = r11 + 15
            r1 = r1 & (-8)
            int r1 = r1 >> 3
            long[] r2 = new long[r1]
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.util.Arrays.fill(r2, r0, r1, r3)
            r1 = r2
        L26:
            r10.f11519 = r1
            int r2 = r11 >> 3
            r3 = r11 & 7
            int r3 = r3 << 3
            r4 = r1[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r8 = ~r6
            long r3 = r4 & r8
            long r3 = r3 | r6
            r1[r2] = r3
            int r1 = r10.f11524
            int r1 = p000.tq1.m5731(r1)
            int r2 = r10.f11525
            int r1 = r1 - r2
            r10.f11526 = r1
            if (r11 != 0) goto L49
            java.lang.Object[] r1 = p000.AbstractC1021yh.f12618
            goto L4b
        L49:
            java.lang.Object[] r1 = new java.lang.Object[r11]
        L4b:
            r10.f11520 = r1
            if (r11 != 0) goto L52
            long[] r11 = p000.AbstractC0782s1.f9651
            goto L5d
        L52:
            long[] r1 = new long[r11]
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            java.util.Arrays.fill(r1, r0, r11, r2)
            r11 = r1
        L5d:
            r10.f11521 = r11
            return
    }

    /* JADX INFO: renamed from: η */
    public final boolean m6305(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f11524
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f11519
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f11520
            r15 = r15[r11]
            boolean r15 = p000.ln0.m3626(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L79
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            r2 = r12
        L73:
            if (r2 == 0) goto L78
            r0.m6306(r11)
        L78:
            return r2
        L79:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    /* JADX INFO: renamed from: θ */
    public final void m6306(int r13) {
            r12 = this;
            int r0 = r12.f11525
            int r0 = r0 + (-1)
            r12.f11525 = r0
            long[] r0 = r12.f11519
            int r1 = r12.f11524
            int r2 = r13 >> 3
            r3 = r13 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r13 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r12.f11520
            r1 = 0
            r0[r13] = r1
            long[] r0 = r12.f11521
            r1 = r0[r13]
            r3 = 31
            long r4 = r1 >> r3
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r6
            int r4 = (int) r4
            long r1 = r1 & r6
            int r1 = (int) r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r2) goto L4d
            r8 = r0[r4]
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            long r8 = r8 & r10
            long r10 = (long) r1
            long r10 = r10 & r6
            long r8 = r8 | r10
            r0[r4] = r8
            goto L4f
        L4d:
            r12.f11522 = r1
        L4f:
            if (r1 == r2) goto L61
            r8 = r0[r1]
            r10 = -4611686016279904257(0xc00000007fffffff, double:-2.000000953674316)
            long r8 = r8 & r10
            long r4 = (long) r4
            long r4 = r4 & r6
            long r2 = r4 << r3
            long r2 = r2 | r8
            r0[r1] = r2
            goto L63
        L61:
            r12.f11523 = r4
        L63:
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0[r13] = r1
            return
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m6307(java.util.Collection r17) {
            r16 = this;
            r0 = r16
            r17.getClass()
            java.lang.Object[] r1 = r0.f11520
            int r2 = r0.f11525
            long[] r3 = r0.f11519
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L54
            r6 = r5
        L12:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L4f
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2c:
            if (r11 >= r9) goto L4d
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L49
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = p000.AbstractC0984xh.m6632(r13, r14)
            if (r13 != 0) goto L49
            r0.m6306(r12)
        L49:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2c
        L4d:
            if (r9 != r10) goto L54
        L4f:
            if (r6 == r4) goto L54
            int r6 = r6 + 1
            goto L12
        L54:
            int r0 = r0.f11525
            if (r2 == r0) goto L5a
            r0 = 1
            return r0
        L5a:
            return r5
    }
}
