package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class u11 {

    /* JADX INFO: renamed from: α */
    public long[] f10555;

    /* JADX INFO: renamed from: β */
    public java.lang.Object[] f10556;

    /* JADX INFO: renamed from: γ */
    public int[] f10557;

    /* JADX INFO: renamed from: δ */
    public int f10558;

    /* JADX INFO: renamed from: ε */
    public int f10559;

    /* JADX INFO: renamed from: ζ */
    public int f10560;

    public /* synthetic */ u11() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public u11(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = p000.tq1.f10431
            r1.f10555 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1.f10556 = r0
            int[] r0 = p000.an0.f333
            r1.f10557 = r0
            if (r2 < 0) goto L19
            int r2 = p000.tq1.m5734(r2)
            r1.m5777(r2)
            return
        L19:
            java.lang.String r1 = "Capacity must be a positive value."
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    public final boolean equals(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p000.u11
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            u11 r1 = (p000.u11) r1
            int r3 = r1.f10559
            int r5 = r0.f10559
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f10556
            int[] r5 = r0.f10557
            long[] r0 = r0.f10555
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L67
            r7 = r4
        L23:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r14 = r1.m5776(r14)
            if (r14 < 0) goto L5b
            int[] r15 = r1.f10557
            r14 = r15[r14]
            if (r13 == r14) goto L5c
        L5b:
            return r4
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r6) goto L67
            int r7 = r7 + 1
            goto L23
        L67:
            return r2
    }

    public final int hashCode() {
            r15 = this;
            java.lang.Object[] r0 = r15.f10556
            int[] r1 = r15.f10557
            long[] r15 = r15.f10555
            int r2 = r15.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L56
            r4 = r3
            r5 = r4
        Le:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L50
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L28:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L48
            int r11 = r4 << 3
            int r11 = r11 + r10
            r12 = r0[r11]
            r11 = r1[r11]
            if (r12 == 0) goto L41
            int r12 = r12.hashCode()
            goto L42
        L41:
            r12 = r3
        L42:
            int r11 = java.lang.Integer.hashCode(r11)
            r11 = r11 ^ r12
            int r5 = r5 + r11
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L28
        L4c:
            if (r8 != r9) goto L4f
            goto L50
        L4f:
            return r5
        L50:
            if (r4 == r2) goto L55
            int r4 = r4 + 1
            goto Le
        L55:
            return r5
        L56:
            return r3
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            int r1 = r0.f10559
            if (r1 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f10556
            int[] r3 = r0.f10557
            long[] r4 = r0.f10555
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f10559
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final int m5774(int r10) {
            r9 = this;
            int r0 = r9.f10558
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f10555
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

    /* JADX INFO: renamed from: β */
    public final int m5775(java.lang.Object r36) {
            r35 = this;
            r0 = r35
            r1 = r36
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.f10558
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.f10555
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
            r19 = r3
            r15 = 0
            long r2 = r9 ^ r17
            long r13 = r2 - r13
            long r2 = ~r2
            long r2 = r2 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r13
        L4e:
            r17 = 0
            int r20 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r20 == 0) goto L74
            int r17 = java.lang.Long.numberOfTrailingZeros(r2)
            int r17 = r17 >> 3
            int r17 = r7 + r17
            r17 = r17 & r6
            r20 = r4
            java.lang.Object[] r4 = r0.f10556
            r4 = r4[r17]
            boolean r4 = p000.ln0.m3626(r4, r1)
            if (r4 == 0) goto L6b
            return r17
        L6b:
            r17 = 1
            long r17 = r2 - r17
            long r2 = r2 & r17
            r4 = r20
            goto L4e
        L74:
            r20 = r4
            long r2 = ~r9
            r4 = 6
            long r2 = r2 << r4
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L2ab
            int r1 = r0.m5774(r5)
            int r2 = r0.f10560
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L9f
            long[] r2 = r0.f10555
            int r10 = r1 >> 3
            r17 = r2[r10]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r17 = r17 >> r2
            long r17 = r17 & r8
            r21 = 254(0xfe, double:1.255E-321)
            int r2 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r2 != 0) goto La9
        L9f:
            r25 = r8
            r23 = r11
            r36 = 7
            r18 = 128(0x80, double:6.3E-322)
            goto L275
        La9:
            int r1 = r0.f10558
            if (r1 <= r3) goto L1f8
            int r2 = r0.f10559
            r10 = r3
            r36 = 7
            long r3 = (long) r2
            r17 = 32
            long r3 = r3 * r17
            long r1 = (long) r1
            r17 = 25
            long r1 = r1 * r17
            int r1 = java.lang.Long.compareUnsigned(r3, r1)
            if (r1 > 0) goto L1f1
            long[] r1 = r0.f10555
            int r2 = r0.f10558
            java.lang.Object[] r3 = r0.f10556
            int[] r4 = r0.f10557
            int r17 = r2 + 7
            r18 = 128(0x80, double:6.3E-322)
            int r6 = r17 >> 3
            r7 = r15
        Ld1:
            if (r7 >= r6) goto Lf0
            r23 = r1[r7]
            r25 = r8
            long r8 = r23 & r13
            r23 = r11
            r12 = r10
            long r10 = ~r8
            long r8 = r8 >>> r36
            long r10 = r10 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r10
            r1[r7] = r8
            int r7 = r7 + 1
            r10 = r12
            r11 = r23
            r8 = r25
            goto Ld1
        Lf0:
            r25 = r8
            r23 = r11
            r12 = r10
            int r6 = p000.AbstractC0312g7.m2252(r1)
            int r7 = r6 + (-1)
            r8 = r1[r7]
            r10 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r8 = r8 & r10
            r13 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r8 | r13
            r1[r7] = r8
            r7 = r1[r15]
            r1[r6] = r7
            r6 = r15
        L10d:
            if (r6 == r2) goto L1e4
            int r7 = r6 >> 3
            r8 = r1[r7]
            r13 = r6 & 7
            int r13 = r13 << 3
            long r8 = r8 >> r13
            long r8 = r8 & r25
            int r14 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r14 != 0) goto L121
        L11e:
            int r6 = r6 + 1
            goto L10d
        L121:
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L126
            goto L11e
        L126:
            r8 = r3[r6]
            if (r8 == 0) goto L12f
            int r8 = r8.hashCode()
            goto L130
        L12f:
            r8 = r15
        L130:
            int r8 = r8 * r20
            int r9 = r8 << 16
            r8 = r8 ^ r9
            int r9 = r8 >>> 7
            int r14 = r0.m5774(r9)
            r9 = r9 & r2
            int r17 = r14 - r9
            r17 = r17 & r2
            r27 = r10
            int r10 = r17 / 8
            int r9 = r6 - r9
            r9 = r9 & r2
            int r9 = r9 / r12
            r29 = -9223372036854775808
            if (r10 != r9) goto L170
            r8 = r8 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r10 = r1[r7]
            r17 = r12
            r31 = r13
            long r12 = r25 << r31
            long r12 = ~r12
            long r10 = r10 & r12
            long r8 = r8 << r31
            long r8 = r8 | r10
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 + (-1)
            r8 = r1[r15]
            long r8 = r8 & r27
            long r8 = r8 | r29
            r1[r7] = r8
            int r6 = r6 + 1
            r12 = r17
            r10 = r27
            goto L10d
        L170:
            r17 = r12
            r31 = r13
            int r9 = r14 >> 3
            r10 = r1[r9]
            r12 = r14 & 7
            int r12 = r12 << 3
            long r32 = r10 >> r12
            long r32 = r32 & r25
            int r13 = (r32 > r18 ? 1 : (r32 == r18 ? 0 : -1))
            if (r13 != 0) goto L1ae
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r13 = r2
            r32 = r3
            long r2 = (long) r8
            r33 = r2
            long r2 = r25 << r12
            long r2 = ~r2
            long r2 = r2 & r10
            long r10 = r33 << r12
            long r2 = r2 | r10
            r1[r9] = r2
            r2 = r1[r7]
            long r8 = r25 << r31
            long r8 = ~r8
            long r2 = r2 & r8
            long r8 = r18 << r31
            long r2 = r2 | r8
            r1[r7] = r2
            r2 = r32[r6]
            r32[r14] = r2
            r2 = 0
            r32[r6] = r2
            r2 = r4[r6]
            r4[r14] = r2
            r4[r6] = r15
            goto L1ce
        L1ae:
            r13 = r2
            r32 = r3
            r2 = r8 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            long r7 = r25 << r12
            long r7 = ~r7
            long r7 = r7 & r10
            long r2 = r2 << r12
            long r2 = r2 | r7
            r1[r9] = r2
            r2 = r32[r14]
            r3 = r32[r6]
            r32[r14] = r3
            r32[r6] = r2
            r2 = r4[r14]
            r3 = r4[r6]
            r4[r14] = r3
            r4[r6] = r2
            int r6 = r6 + (-1)
        L1ce:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r7 = r1[r15]
            long r7 = r7 & r27
            long r7 = r7 | r29
            r1[r2] = r7
            int r6 = r6 + 1
            r2 = r13
            r12 = r17
            r10 = r27
            r3 = r32
            goto L10d
        L1e4:
            int r1 = r0.f10558
            int r1 = p000.tq1.m5731(r1)
            int r2 = r0.f10559
            int r1 = r1 - r2
            r0.f10560 = r1
            goto L271
        L1f1:
            r25 = r8
            r23 = r11
            r18 = 128(0x80, double:6.3E-322)
            goto L1fb
        L1f8:
            r36 = 7
            goto L1f1
        L1fb:
            int r1 = r0.f10558
            int r1 = p000.tq1.m5732(r1)
            long[] r2 = r0.f10555
            java.lang.Object[] r3 = r0.f10556
            int[] r4 = r0.f10557
            int r6 = r0.f10558
            r0.m5777(r1)
            long[] r1 = r0.f10555
            java.lang.Object[] r7 = r0.f10556
            int[] r8 = r0.f10557
            int r9 = r0.f10558
            r10 = r15
        L215:
            if (r10 >= r6) goto L271
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r25
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 >= 0) goto L268
            r11 = r3[r10]
            if (r11 == 0) goto L22f
            int r12 = r11.hashCode()
            goto L230
        L22f:
            r12 = r15
        L230:
            int r12 = r12 * r20
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r13 = r0.m5774(r13)
            r12 = r12 & 127(0x7f, float:1.78E-43)
            r17 = r1
            r14 = r2
            long r1 = (long) r12
            int r12 = r13 >> 3
            r21 = r13 & 7
            int r21 = r21 << 3
            r27 = r17[r12]
            r29 = r1
            long r1 = r25 << r21
            long r1 = ~r1
            long r1 = r27 & r1
            long r21 = r29 << r21
            long r1 = r1 | r21
            r17[r12] = r1
            int r12 = r13 + (-7)
            r12 = r12 & r9
            r21 = r9 & 7
            int r12 = r12 + r21
            int r12 = r12 >> 3
            r17[r12] = r1
            r7[r13] = r11
            r1 = r4[r10]
            r8[r13] = r1
            goto L26b
        L268:
            r17 = r1
            r14 = r2
        L26b:
            int r10 = r10 + 1
            r2 = r14
            r1 = r17
            goto L215
        L271:
            int r1 = r0.m5774(r5)
        L275:
            int r2 = r0.f10559
            int r2 = r2 + 1
            r0.f10559 = r2
            int r2 = r0.f10560
            long[] r3 = r0.f10555
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L291
            r15 = r16
        L291:
            int r2 = r2 - r15
            r0.f10560 = r2
            int r0 = r0.f10558
            long r8 = r25 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r23 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r2 = r1 + (-7)
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r3[r0] = r5
            int r0 = ~r1
            return r0
        L2ab:
            r17 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    /* JADX INFO: renamed from: γ */
    public final int m5776(java.lang.Object r14) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f10558
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f10555
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f10556
            r11 = r11[r10]
            boolean r11 = p000.ln0.m3626(r11, r14)
            if (r11 == 0) goto L5b
            return r10
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6c
            r13 = -1
            return r13
        L6c:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    /* JADX INFO: renamed from: δ */
    public final void m5777(int r10) {
            r9 = this;
            r0 = 0
            if (r10 <= 0) goto Ld
            int r10 = p000.tq1.m5733(r10)
            r1 = 7
            int r10 = java.lang.Math.max(r1, r10)
            goto Le
        Ld:
            r10 = r0
        Le:
            r9.f10558 = r10
            if (r10 != 0) goto L15
            long[] r0 = p000.tq1.f10431
            goto L26
        L15:
            int r1 = r10 + 15
            r1 = r1 & (-8)
            int r1 = r1 >> 3
            long[] r2 = new long[r1]
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.util.Arrays.fill(r2, r0, r1, r3)
            r0 = r2
        L26:
            r9.f10555 = r0
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r2
            long r7 = ~r5
            long r2 = r3 & r7
            long r2 = r2 | r5
            r0[r1] = r2
            int r0 = r9.f10558
            int r0 = p000.tq1.m5731(r0)
            int r1 = r9.f10559
            int r0 = r0 - r1
            r9.f10560 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r9.f10556 = r0
            int[] r10 = new int[r10]
            r9.f10557 = r10
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m5778(int r9) {
            r8 = this;
            int r0 = r8.f10559
            int r0 = r0 + (-1)
            r8.f10559 = r0
            long[] r0 = r8.f10555
            int r1 = r8.f10558
            int r2 = r9 >> 3
            r3 = r9 & 7
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
            int r2 = r9 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r8 = r8.f10556
            r0 = 0
            r8[r9] = r0
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m5779(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.m5775(r4)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            java.lang.Object[] r1 = r2.f10556
            r1[r0] = r4
            int[] r2 = r2.f10557
            r2[r0] = r3
            return
    }
}
