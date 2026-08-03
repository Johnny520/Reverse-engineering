package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f2774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f2775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2779f;

    public /* synthetic */ b0() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public b0(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            r1.f2774a = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2775b = r0
            int[] r0 = f.m.f2860a
            r1.f2776c = r0
            if (r2 < 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L1e
            int r2 = f.r0.d(r2)
            r1.e(r2)
            return
        L1e:
            java.lang.String r2 = "Capacity must be a positive value."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final void a() {
            r10 = this;
            r0 = 0
            r10.f2778e = r0
            long[] r1 = r10.f2774a
            long[] r2 = f.r0.f2895a
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            tf.l.w0(r2, r1)
            long[] r1 = r10.f2774a
            int r2 = r10.f2777d
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
            java.lang.Object[] r1 = r10.f2775b
            r2 = 0
            int r3 = r10.f2777d
            tf.l.v0(r0, r3, r2, r1)
            int r0 = r10.f2777d
            int r0 = f.r0.a(r0)
            int r1 = r10.f2778e
            int r0 = r0 - r1
            r10.f2779f = r0
            return
    }

    public final int b(int r10) {
            r9 = this;
            int r0 = r9.f2777d
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f2774a
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

    public final int c(java.lang.Object r36) {
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
            int r6 = r0.f2777d
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.f2774a
            int r10 = r7 >> 3
            r11 = r7 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
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
        L4f:
            r17 = 0
            int r20 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r20 == 0) goto L75
            int r17 = java.lang.Long.numberOfTrailingZeros(r2)
            int r17 = r17 >> 3
            int r17 = r7 + r17
            r17 = r17 & r6
            r20 = r4
            java.lang.Object[] r4 = r0.f2775b
            r4 = r4[r17]
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L6c
            return r17
        L6c:
            r17 = 1
            long r17 = r2 - r17
            long r2 = r2 & r17
            r4 = r20
            goto L4f
        L75:
            r20 = r4
            long r2 = ~r9
            r4 = 6
            long r2 = r2 << r4
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L2ac
            int r1 = r0.b(r5)
            int r2 = r0.f2779f
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto La0
            long[] r2 = r0.f2774a
            int r10 = r1 >> 3
            r17 = r2[r10]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r17 = r17 >> r2
            long r17 = r17 & r8
            r21 = 254(0xfe, double:1.255E-321)
            int r2 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r2 != 0) goto Laa
        La0:
            r25 = r8
            r23 = r11
            r36 = 7
            r18 = 128(0x80, double:6.3E-322)
            goto L276
        Laa:
            int r1 = r0.f2777d
            if (r1 <= r3) goto L1f9
            int r2 = r0.f2778e
            r10 = r3
            r36 = 7
            long r3 = (long) r2
            r17 = 32
            long r3 = r3 * r17
            long r1 = (long) r1
            r17 = 25
            long r1 = r1 * r17
            int r1 = java.lang.Long.compareUnsigned(r3, r1)
            if (r1 > 0) goto L1f2
            long[] r1 = r0.f2774a
            int r2 = r0.f2777d
            java.lang.Object[] r3 = r0.f2775b
            int[] r4 = r0.f2776c
            int r17 = r2 + 7
            r18 = 128(0x80, double:6.3E-322)
            int r6 = r17 >> 3
            r7 = r15
        Ld2:
            if (r7 >= r6) goto Lf1
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
            goto Ld2
        Lf1:
            r25 = r8
            r23 = r11
            r12 = r10
            int r6 = tf.l.B0(r1)
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
        L10e:
            if (r6 == r2) goto L1e5
            int r7 = r6 >> 3
            r8 = r1[r7]
            r13 = r6 & 7
            int r13 = r13 << 3
            long r8 = r8 >> r13
            long r8 = r8 & r25
            int r14 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r14 != 0) goto L122
        L11f:
            int r6 = r6 + 1
            goto L10e
        L122:
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L127
            goto L11f
        L127:
            r8 = r3[r6]
            if (r8 == 0) goto L130
            int r8 = r8.hashCode()
            goto L131
        L130:
            r8 = r15
        L131:
            int r8 = r8 * r20
            int r9 = r8 << 16
            r8 = r8 ^ r9
            int r9 = r8 >>> 7
            int r14 = r0.b(r9)
            r9 = r9 & r2
            int r17 = r14 - r9
            r17 = r17 & r2
            r27 = r10
            int r10 = r17 / 8
            int r9 = r6 - r9
            r9 = r9 & r2
            int r9 = r9 / r12
            r29 = -9223372036854775808
            if (r10 != r9) goto L171
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
            goto L10e
        L171:
            r17 = r12
            r31 = r13
            int r9 = r14 >> 3
            r10 = r1[r9]
            r12 = r14 & 7
            int r12 = r12 << 3
            long r32 = r10 >> r12
            long r32 = r32 & r25
            int r13 = (r32 > r18 ? 1 : (r32 == r18 ? 0 : -1))
            if (r13 != 0) goto L1af
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
            goto L1cf
        L1af:
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
        L1cf:
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
            goto L10e
        L1e5:
            int r1 = r0.f2777d
            int r1 = f.r0.a(r1)
            int r2 = r0.f2778e
            int r1 = r1 - r2
            r0.f2779f = r1
            goto L272
        L1f2:
            r25 = r8
            r23 = r11
            r18 = 128(0x80, double:6.3E-322)
            goto L1fc
        L1f9:
            r36 = 7
            goto L1f2
        L1fc:
            int r1 = r0.f2777d
            int r1 = f.r0.b(r1)
            long[] r2 = r0.f2774a
            java.lang.Object[] r3 = r0.f2775b
            int[] r4 = r0.f2776c
            int r6 = r0.f2777d
            r0.e(r1)
            long[] r1 = r0.f2774a
            java.lang.Object[] r7 = r0.f2775b
            int[] r8 = r0.f2776c
            int r9 = r0.f2777d
            r10 = r15
        L216:
            if (r10 >= r6) goto L272
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r25
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 >= 0) goto L269
            r11 = r3[r10]
            if (r11 == 0) goto L230
            int r12 = r11.hashCode()
            goto L231
        L230:
            r12 = r15
        L231:
            int r12 = r12 * r20
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r13 = r0.b(r13)
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
            goto L26c
        L269:
            r17 = r1
            r14 = r2
        L26c:
            int r10 = r10 + 1
            r2 = r14
            r1 = r17
            goto L216
        L272:
            int r1 = r0.b(r5)
        L276:
            int r2 = r0.f2778e
            int r2 = r2 + 1
            r0.f2778e = r2
            int r2 = r0.f2779f
            long[] r3 = r0.f2774a
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L292
            r15 = r16
        L292:
            int r2 = r2 - r15
            r0.f2779f = r2
            int r2 = r0.f2777d
            long r8 = r25 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r23 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r4 = r1 + (-7)
            r4 = r4 & r2
            r2 = r2 & 7
            int r4 = r4 + r2
            int r2 = r4 >> 3
            r3[r2] = r5
            int r1 = ~r1
            return r1
        L2ac:
            r17 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    public final int d(java.lang.Object r14) {
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
            int r3 = r13.f2777d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f2774a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f2775b
            r11 = r11[r10]
            boolean r11 = gg.l.a(r11, r14)
            if (r11 == 0) goto L5c
            return r10
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r14 = -1
            return r14
        L6d:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
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
            r9.f2777d = r10
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
            r9.f2774a = r0
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
            int r0 = r9.f2777d
            int r0 = f.r0.a(r0)
            int r1 = r9.f2778e
            int r0 = r0 - r1
            r9.f2779f = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r9.f2775b = r0
            int[] r10 = new int[r10]
            r9.f2776c = r10
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
            boolean r3 = r1 instanceof f.b0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            f.b0 r1 = (f.b0) r1
            int r3 = r1.f2778e
            int r5 = r0.f2778e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f2775b
            int[] r5 = r0.f2776c
            long[] r6 = r0.f2774a
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
            int r15 = r1.d(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f2776c
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

    public final void f(int r9) {
            r8 = this;
            int r0 = r8.f2778e
            int r0 = r0 + (-1)
            r8.f2778e = r0
            long[] r0 = r8.f2774a
            int r1 = r8.f2777d
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
            java.lang.Object[] r0 = r8.f2775b
            r1 = 0
            r0[r9] = r1
            return
    }

    public final void g(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.c(r4)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            java.lang.Object[] r1 = r2.f2775b
            r1[r0] = r4
            int[] r4 = r2.f2776c
            r4[r0] = r3
            return
    }

    public final int hashCode() {
            r17 = this;
            r0 = r17
            java.lang.Object[] r1 = r0.f2775b
            int[] r2 = r0.f2776c
            long[] r3 = r0.f2774a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L58
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
            if (r10 == 0) goto L52
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L2a:
            if (r12 >= r10) goto L4e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4a
            int r13 = r6 << 3
            int r13 = r13 + r12
            r14 = r1[r13]
            r13 = r2[r13]
            if (r14 == 0) goto L43
            int r14 = r14.hashCode()
            goto L44
        L43:
            r14 = r5
        L44:
            int r13 = java.lang.Integer.hashCode(r13)
            r13 = r13 ^ r14
            int r7 = r7 + r13
        L4a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2a
        L4e:
            if (r10 != r11) goto L51
            goto L52
        L51:
            return r7
        L52:
            if (r6 == r4) goto L57
            int r6 = r6 + 1
            goto L10
        L57:
            return r7
        L58:
            return r5
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            int r1 = r0.f2778e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f2775b
            int[] r3 = r0.f2776c
            long[] r4 = r0.f2774a
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
            int r14 = r0.f2778e
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
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
