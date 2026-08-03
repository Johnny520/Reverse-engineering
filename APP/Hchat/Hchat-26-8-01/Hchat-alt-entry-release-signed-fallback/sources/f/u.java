package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f2907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2912f;

    public /* synthetic */ u() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public u(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            r1.f2907a = r0
            int[] r0 = f.m.f2860a
            r1.f2908b = r0
            r1.f2909c = r0
            if (r2 < 0) goto L17
            int r2 = f.r0.d(r2)
            r1.e(r2)
            return
        L17:
            java.lang.String r2 = "Capacity must be a positive value."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final void a() {
            r9 = this;
            r0 = 0
            r9.f2911e = r0
            long[] r0 = r9.f2907a
            long[] r1 = f.r0.f2895a
            if (r0 == r1) goto L25
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            tf.l.w0(r1, r0)
            long[] r0 = r9.f2907a
            int r1 = r9.f2910d
            int r2 = r1 >> 3
            r1 = r1 & 7
            int r1 = r1 << 3
            r3 = r0[r2]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r1
            long r7 = ~r5
            long r3 = r3 & r7
            long r3 = r3 | r5
            r0[r2] = r3
        L25:
            int r0 = r9.f2910d
            int r0 = f.r0.a(r0)
            int r1 = r9.f2911e
            int r0 = r0 - r1
            r9.f2912f = r0
            return
    }

    public final int b(int r10) {
            r9 = this;
            int r0 = r9.f2910d
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f2907a
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r2[r3]
            long r5 = r5 >>> r4
            int r3 = r3 + 1
            r7 = r2[r3]
            int r2 = 64 - r4
            long r2 = r7 << r2
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
            int r1 = java.lang.Long.numberOfTrailingZeros(r2)
            int r1 = r1 >> 3
            int r10 = r10 + r1
            r10 = r10 & r0
            return r10
        L37:
            int r1 = r1 + 8
            int r10 = r10 + r1
            r10 = r10 & r0
            goto L4
    }

    public final int c(int r14) {
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f2910d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f2907a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
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
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f2908b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            return r10
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L65
            r14 = -1
            return r14
        L65:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }

    public final int d(int r2) {
            r1 = this;
            int r2 = r1.c(r2)
            if (r2 < 0) goto Lb
            int[] r0 = r1.f2909c
            r2 = r0[r2]
            return r2
        Lb:
            r2 = -1
            return r2
    }

    public final void e(int r10) {
            r9 = this;
            r0 = 0
            if (r10 <= 0) goto Ld
            int r10 = f.r0.c(r10)
            r1 = 7
            int r10 = java.lang.Math.max(r1, r10)
            goto Le
        Ld:
            r10 = r0
        Le:
            r9.f2910d = r10
            if (r10 != 0) goto L15
            long[] r0 = f.r0.f2895a
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
            r9.f2907a = r0
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
            int r0 = r9.f2910d
            int r0 = f.r0.a(r0)
            int r1 = r9.f2911e
            int r0 = r0 - r1
            r9.f2912f = r0
            int[] r0 = new int[r10]
            r9.f2908b = r0
            int[] r10 = new int[r10]
            r9.f2909c = r10
            return
    }

    public final boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof f.u
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            f.u r1 = (f.u) r1
            int r3 = r1.f2911e
            int r5 = r0.f2911e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f2908b
            int[] r5 = r0.f2909c
            long[] r6 = r0.f2907a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f2909c
            r2 = r2[r15]
            if (r14 == r2) goto L60
        L5d:
            return r4
        L5e:
            r16 = r2
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L3d
        L66:
            r16 = r2
            if (r11 != r12) goto L76
            goto L6d
        L6b:
            r16 = r2
        L6d:
            if (r8 == r7) goto L76
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L74:
            r16 = r2
        L76:
            return r16
    }

    public final void f(int r38, int r39) {
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
            int r5 = r0.f2910d
            r6 = r4 & r5
            r8 = 0
        L18:
            long[] r9 = r0.f2907a
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
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
        L4d:
            r19 = 0
            int r13 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r13 == 0) goto L6e
            int r13 = java.lang.Long.numberOfTrailingZeros(r11)
            int r13 = r13 >> 3
            int r13 = r13 + r6
            r13 = r13 & r5
            r21 = r3
            int[] r3 = r0.f2908b
            r3 = r3[r13]
            if (r3 != r1) goto L65
            goto L2af
        L65:
            r19 = 1
            long r19 = r11 - r19
            long r11 = r11 & r19
            r3 = r21
            goto L4d
        L6e:
            r21 = r3
            long r11 = ~r7
            r3 = 6
            long r11 = r11 << r3
            long r7 = r7 & r11
            long r7 = r7 & r17
            int r3 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            r7 = 8
            if (r3 == 0) goto L2bb
            int r2 = r0.b(r4)
            int r3 = r0.f2912f
            r11 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto L9a
            long[] r3 = r0.f2907a
            int r13 = r2 >> 3
            r19 = r3[r13]
            r3 = r2 & 7
            int r3 = r3 << 3
            long r19 = r19 >> r3
            long r19 = r19 & r11
            r22 = 254(0xfe, double:1.255E-321)
            int r3 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r3 != 0) goto La8
        L9a:
            r27 = r9
            r25 = r11
            r18 = r14
            r32 = r15
            r19 = 128(0x80, double:6.3E-322)
            r29 = 7
            goto L279
        La8:
            int r2 = r0.f2910d
            if (r2 <= r7) goto L203
            int r3 = r0.f2911e
            r19 = 128(0x80, double:6.3E-322)
            long r5 = (long) r3
            r24 = 32
            long r5 = r5 * r24
            long r2 = (long) r2
            r24 = 25
            long r2 = r2 * r24
            int r2 = java.lang.Long.compareUnsigned(r5, r2)
            if (r2 > 0) goto L1f8
            long[] r2 = r0.f2907a
            int r3 = r0.f2910d
            int[] r5 = r0.f2908b
            int[] r6 = r0.f2909c
            int r13 = r3 + 7
            int r13 = r13 >> 3
            r24 = r7
            r7 = r15
        Lcf:
            if (r7 >= r13) goto Led
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
            goto Lcf
        Led:
            r27 = r9
            r25 = r11
            r12 = 7
            int r7 = tf.l.B0(r2)
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
        L10c:
            if (r7 == r3) goto L1e5
            int r8 = r7 >> 3
            r9 = r2[r8]
            r11 = r7 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            long r9 = r9 & r25
            int r13 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r13 != 0) goto L120
        L11d:
            int r7 = r7 + 1
            goto L10c
        L120:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L125
            goto L11d
        L125:
            r9 = r5[r7]
            int r9 = java.lang.Integer.hashCode(r9)
            int r9 = r9 * r21
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r13 = r0.b(r10)
            r10 = r10 & r3
            int r18 = r13 - r10
            r18 = r18 & r3
            r29 = r12
            int r12 = r18 / 8
            int r10 = r7 - r10
            r10 = r10 & r3
            int r10 = r10 / 8
            r30 = -9223372036854775808
            if (r12 != r10) goto L16d
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
            goto L10c
        L16d:
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
            r34[r7] = r32
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
            goto L10c
        L1e5:
            r29 = r12
            r18 = r14
            r32 = r15
            int r2 = r0.f2910d
            int r2 = f.r0.a(r2)
            int r3 = r0.f2911e
            int r2 = r2 - r3
            r0.f2912f = r2
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
            int r2 = r0.f2910d
            int r2 = f.r0.b(r2)
            long[] r3 = r0.f2907a
            int[] r5 = r0.f2908b
            int[] r6 = r0.f2909c
            int r7 = r0.f2910d
            r0.e(r2)
            long[] r2 = r0.f2907a
            int[] r8 = r0.f2908b
            int[] r9 = r0.f2909c
            int r10 = r0.f2910d
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
            int r14 = r0.b(r14)
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
            int r2 = r0.b(r4)
        L279:
            int r1 = r0.f2911e
            int r1 = r1 + 1
            r0.f2911e = r1
            int r1 = r0.f2912f
            long[] r3 = r0.f2907a
            int r4 = r2 >> 3
            r5 = r3[r4]
            r7 = r2 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r8 != 0) goto L295
            r32 = r18
        L295:
            int r1 = r1 - r32
            r0.f2912f = r1
            int r1 = r0.f2910d
            long r8 = r25 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r27 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r4 = r2 + (-7)
            r4 = r4 & r1
            r1 = r1 & 7
            int r4 = r4 + r1
            int r1 = r4 >> 3
            r3[r1] = r5
            int r13 = ~r2
        L2af:
            if (r13 >= 0) goto L2b2
            int r13 = ~r13
        L2b2:
            int[] r1 = r0.f2908b
            r1[r13] = r38
            int[] r1 = r0.f2909c
            r1[r13] = r39
            return
        L2bb:
            r24 = r7
            r32 = r15
            int r8 = r16 + 8
            int r6 = r6 + r8
            r6 = r6 & r5
            r1 = r38
            r3 = r21
            goto L18
    }

    public final int hashCode() {
            r17 = this;
            r0 = r17
            int[] r1 = r0.f2908b
            int[] r2 = r0.f2909c
            long[] r3 = r0.f2907a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L54
            r6 = r5
            r7 = r6
        L10:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4e
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L2a:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r6 << 3
            int r13 = r13 + r12
            r14 = r1[r13]
            r13 = r2[r13]
            int r14 = java.lang.Integer.hashCode(r14)
            int r13 = java.lang.Integer.hashCode(r13)
            r13 = r13 ^ r14
            int r7 = r7 + r13
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2a
        L4a:
            if (r10 != r11) goto L4d
            goto L4e
        L4d:
            return r7
        L4e:
            if (r6 == r4) goto L53
            int r6 = r6 + 1
            goto L10
        L53:
            return r7
        L54:
            return r5
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            int r1 = r0.f2911e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f2908b
            int[] r3 = r0.f2909c
            long[] r4 = r0.f2907a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f2911e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
