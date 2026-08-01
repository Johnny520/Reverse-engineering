package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n11 extends p000.sm0 {

    /* JADX INFO: renamed from: ζ */
    public int f7356;

    public /* synthetic */ n11() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public n11(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = p000.tq1.f10431
            r1.f9962 = r0
            int[] r0 = p000.an0.f333
            r1.f9963 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1.f9964 = r0
            if (r2 < 0) goto L19
            int r2 = p000.tq1.m5734(r2)
            r1.m3940(r2)
            return
        L19:
            java.lang.String r1 = "Capacity must be a positive value."
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m3938() {
            r10 = this;
            r0 = 0
            r10.f9966 = r0
            long[] r1 = r10.f9962
            long[] r2 = p000.tq1.f10431
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            p000.AbstractC0312g7.m2245(r2, r1)
            long[] r1 = r10.f9962
            int r2 = r10.f9965
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
            java.lang.Object[] r1 = r10.f9964
            r2 = 0
            int r3 = r10.f9965
            p000.AbstractC0312g7.m2244(r0, r3, r2, r1)
            int r0 = r10.f9965
            int r0 = p000.tq1.m5731(r0)
            int r1 = r10.f9966
            int r0 = r0 - r1
            r10.f7356 = r0
            return
    }

    /* JADX INFO: renamed from: δ */
    public final int m3939(int r10) {
            r9 = this;
            int r0 = r9.f9965
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f9962
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

    /* JADX INFO: renamed from: ε */
    public final void m3940(int r10) {
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
            r9.f9965 = r10
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
            r9.f9962 = r0
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
            int r0 = r9.f9965
            int r0 = p000.tq1.m5731(r0)
            int r1 = r9.f9966
            int r0 = r0 - r1
            r9.f7356 = r0
            int[] r0 = new int[r10]
            r9.f9963 = r0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r9.f9964 = r10
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object m3941(int r14) {
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f9965
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f9962
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L59
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f9963
            r11 = r11[r10]
            if (r11 != r14) goto L53
            goto L63
        L53:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L59:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L96
            r10 = -1
        L63:
            r14 = 0
            if (r10 < 0) goto L95
            int r0 = r13.f9966
            int r0 = r0 + (-1)
            r13.f9966 = r0
            long[] r0 = r13.f9962
            int r1 = r13.f9965
            int r2 = r10 >> 3
            r3 = r10 & 7
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
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r13 = r13.f9964
            r0 = r13[r10]
            r13[r10] = r14
            return r0
        L95:
            return r14
        L96:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }

    /* JADX INFO: renamed from: η */
    public final void m3942(int r38, java.lang.Object r39) {
            r37 = this;
            r0 = r37
            r1 = r38
            int r2 = java.lang.Integer.hashCode(r1)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r4 = r2 << 16
            r2 = r2 ^ r4
            int r4 = r2 >>> 7
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f9965
            r6 = r4 & r5
            r8 = 0
        L18:
            long[] r9 = r0.f9962
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r9 = r9[r10]
            int r15 = 64 - r11
            long r9 = r9 << r15
            r16 = r8
            r15 = 0
            long r7 = (long) r11
            long r7 = -r7
            r11 = 63
            long r7 = r7 >> r11
            long r7 = r7 & r9
            long r7 = r7 | r12
            long r9 = (long) r2
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r9 * r11
            r19 = r11
            long r11 = r7 ^ r17
            long r17 = r11 - r19
            long r11 = ~r11
            long r11 = r17 & r11
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r17
        L4c:
            r19 = 0
            int r13 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r13 == 0) goto L6d
            int r13 = java.lang.Long.numberOfTrailingZeros(r11)
            int r13 = r13 >> 3
            int r13 = r13 + r6
            r13 = r13 & r5
            r21 = r3
            int[] r3 = r0.f9963
            r3 = r3[r13]
            if (r3 != r1) goto L64
            goto L2b3
        L64:
            r19 = 1
            long r19 = r11 - r19
            long r11 = r11 & r19
            r3 = r21
            goto L4c
        L6d:
            r21 = r3
            long r11 = ~r7
            r3 = 6
            long r11 = r11 << r3
            long r7 = r7 & r11
            long r7 = r7 & r17
            int r3 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            r7 = 8
            if (r3 == 0) goto L2bc
            int r2 = r0.m3939(r4)
            int r3 = r0.f7356
            r11 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto L99
            long[] r3 = r0.f9962
            int r13 = r2 >> 3
            r19 = r3[r13]
            r3 = r2 & 7
            int r3 = r3 << 3
            long r19 = r19 >> r3
            long r19 = r19 & r11
            r22 = 254(0xfe, double:1.255E-321)
            int r3 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r3 != 0) goto La7
        L99:
            r27 = r9
            r25 = r11
            r18 = r14
            r32 = r15
            r19 = 128(0x80, double:6.3E-322)
            r29 = 7
            goto L27b
        La7:
            int r2 = r0.f9965
            if (r2 <= r7) goto L203
            int r3 = r0.f9966
            r19 = 128(0x80, double:6.3E-322)
            long r5 = (long) r3
            r24 = 32
            long r5 = r5 * r24
            long r2 = (long) r2
            r24 = 25
            long r2 = r2 * r24
            int r2 = java.lang.Long.compareUnsigned(r5, r2)
            if (r2 > 0) goto L1f8
            long[] r2 = r0.f9962
            int r3 = r0.f9965
            int[] r5 = r0.f9963
            java.lang.Object[] r6 = r0.f9964
            int r13 = r3 + 7
            int r13 = r13 >> 3
            r24 = r7
            r7 = r15
        Lce:
            if (r7 >= r13) goto Lec
            r25 = r2[r7]
            r27 = r9
            r10 = 7
            long r8 = r25 & r17
            r25 = r11
            r12 = r10
            long r10 = ~r8
            long r8 = r8 >>> r12
            long r10 = r10 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r10
            r2[r7] = r8
            int r7 = r7 + 1
            r11 = r25
            r9 = r27
            goto Lce
        Lec:
            r27 = r9
            r25 = r11
            r12 = 7
            int r7 = p000.AbstractC0312g7.m2252(r2)
            int r8 = r7 + (-1)
            r9 = r2[r8]
            r16 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r9 = r9 & r16
            r29 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r9 = r9 | r29
            r2[r8] = r9
            r8 = r2[r15]
            r2[r7] = r8
            r7 = r15
        L10b:
            if (r7 == r3) goto L1e5
            int r8 = r7 >> 3
            r9 = r2[r8]
            r11 = r7 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            long r9 = r9 & r25
            int r13 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r13 != 0) goto L11f
        L11c:
            int r7 = r7 + 1
            goto L10b
        L11f:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L124
            goto L11c
        L124:
            r9 = r5[r7]
            int r9 = java.lang.Integer.hashCode(r9)
            int r9 = r9 * r21
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r13 = r0.m3939(r10)
            r10 = r10 & r3
            int r18 = r13 - r10
            r18 = r18 & r3
            r29 = r12
            int r12 = r18 / 8
            int r10 = r7 - r10
            r10 = r10 & r3
            int r10 = r10 / 8
            r30 = -9223372036854775808
            if (r12 != r10) goto L16c
            r9 = r9 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r12 = r2[r8]
            r18 = r14
            r32 = r15
            long r14 = r25 << r11
            long r14 = ~r14
            long r12 = r12 & r14
            long r9 = r9 << r11
            long r9 = r9 | r12
            r2[r8] = r9
            int r8 = r2.length
            int r8 = r8 + (-1)
            r9 = r2[r32]
            long r9 = r9 & r16
            long r9 = r9 | r30
            r2[r8] = r9
            int r7 = r7 + 1
            r14 = r18
            r12 = r29
            r15 = r32
            goto L10b
        L16c:
            r18 = r14
            r32 = r15
            int r10 = r13 >> 3
            r14 = r2[r10]
            r12 = r13 & 7
            int r12 = r12 << 3
            long r33 = r14 >> r12
            long r33 = r33 & r25
            int r33 = (r33 > r19 ? 1 : (r33 == r19 ? 0 : -1))
            if (r33 != 0) goto L1ab
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r33 = r5
            r34 = r6
            long r5 = (long) r9
            r35 = r5
            long r5 = r25 << r12
            long r5 = ~r5
            long r5 = r5 & r14
            long r14 = r35 << r12
            long r5 = r5 | r14
            r2[r10] = r5
            r5 = r2[r8]
            long r9 = r25 << r11
            long r9 = ~r9
            long r5 = r5 & r9
            long r9 = r19 << r11
            long r5 = r5 | r9
            r2[r8] = r5
            r5 = r33[r7]
            r33[r13] = r5
            r33[r7] = r32
            r5 = r34[r7]
            r34[r13] = r5
            r5 = 0
            r34[r7] = r5
            goto L1cc
        L1ab:
            r33 = r5
            r34 = r6
            r5 = r9 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r8 = r25 << r12
            long r8 = ~r8
            long r8 = r8 & r14
            long r5 = r5 << r12
            long r5 = r5 | r8
            r2[r10] = r5
            r5 = r33[r13]
            r6 = r33[r7]
            r33[r13] = r6
            r33[r7] = r5
            r5 = r34[r13]
            r6 = r34[r7]
            r34[r13] = r6
            r34[r7] = r5
            int r7 = r7 + (-1)
        L1cc:
            int r5 = r2.length
            int r5 = r5 + (-1)
            r8 = r2[r32]
            long r8 = r8 & r16
            long r8 = r8 | r30
            r2[r5] = r8
            int r7 = r7 + 1
            r14 = r18
            r12 = r29
            r15 = r32
            r5 = r33
            r6 = r34
            goto L10b
        L1e5:
            r29 = r12
            r18 = r14
            r32 = r15
            int r2 = r0.f9965
            int r2 = p000.tq1.m5731(r2)
            int r3 = r0.f9966
            int r2 = r2 - r3
            r0.f7356 = r2
            goto L275
        L1f8:
            r27 = r9
            r25 = r11
            r18 = r14
            r32 = r15
            r29 = 7
            goto L206
        L203:
            r19 = 128(0x80, double:6.3E-322)
            goto L1f8
        L206:
            int r2 = r0.f9965
            int r2 = p000.tq1.m5732(r2)
            long[] r3 = r0.f9962
            int[] r5 = r0.f9963
            java.lang.Object[] r6 = r0.f9964
            int r7 = r0.f9965
            r0.m3940(r2)
            long[] r2 = r0.f9962
            int[] r8 = r0.f9963
            java.lang.Object[] r9 = r0.f9964
            int r10 = r0.f9965
            r11 = r32
        L221:
            if (r11 >= r7) goto L275
            int r12 = r11 >> 3
            r12 = r3[r12]
            r14 = r11 & 7
            int r14 = r14 << 3
            long r12 = r12 >> r14
            long r12 = r12 & r25
            int r12 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r12 >= 0) goto L26e
            r12 = r5[r11]
            int r13 = java.lang.Integer.hashCode(r12)
            int r13 = r13 * r21
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.m3939(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r15 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r16 = r14 & 7
            int r16 = r16 << 3
            r22 = r15[r13]
            r30 = r1
            long r1 = r25 << r16
            long r1 = ~r1
            long r1 = r22 & r1
            long r16 = r30 << r16
            long r1 = r1 | r16
            r15[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r10
            r16 = r10 & 7
            int r13 = r13 + r16
            int r13 = r13 >> 3
            r15[r13] = r1
            r8[r14] = r12
            r1 = r6[r11]
            r9[r14] = r1
            goto L26f
        L26e:
            r15 = r2
        L26f:
            int r11 = r11 + 1
            r1 = r38
            r2 = r15
            goto L221
        L275:
            int r1 = r0.m3939(r4)
            r13 = r1
            goto L27c
        L27b:
            r13 = r2
        L27c:
            int r1 = r0.f9966
            int r1 = r1 + 1
            r0.f9966 = r1
            int r1 = r0.f7356
            long[] r2 = r0.f9962
            int r3 = r13 >> 3
            r4 = r2[r3]
            r6 = r13 & 7
            int r6 = r6 << 3
            long r7 = r4 >> r6
            long r7 = r7 & r25
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 != 0) goto L299
            r7 = r18
            goto L29b
        L299:
            r7 = r32
        L29b:
            int r1 = r1 - r7
            r0.f7356 = r1
            int r1 = r0.f9965
            long r7 = r25 << r6
            long r7 = ~r7
            long r4 = r4 & r7
            long r6 = r27 << r6
            long r4 = r4 | r6
            r2[r3] = r4
            int r3 = r13 + (-7)
            r3 = r3 & r1
            r1 = r1 & 7
            int r3 = r3 + r1
            int r1 = r3 >> 3
            r2[r1] = r4
        L2b3:
            int[] r1 = r0.f9963
            r1[r13] = r38
            java.lang.Object[] r0 = r0.f9964
            r0[r13] = r39
            return
        L2bc:
            r24 = r7
            r32 = r15
            int r8 = r16 + 8
            int r6 = r6 + r8
            r6 = r6 & r5
            r1 = r38
            r3 = r21
            goto L18
    }
}
