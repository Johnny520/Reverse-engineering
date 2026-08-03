package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f2925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f2926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f2927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2930f;

    public z(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            r1.f2925a = r0
            long[] r0 = f.o.f2876a
            r1.f2926b = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2927c = r0
            if (r2 < 0) goto L19
            int r2 = f.r0.d(r2)
            r1.e(r2)
            return
        L19:
            java.lang.String r2 = "Capacity must be a positive value."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final void a() {
            r10 = this;
            r0 = 0
            r10.f2929e = r0
            long[] r1 = r10.f2925a
            long[] r2 = f.r0.f2895a
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            tf.l.w0(r2, r1)
            long[] r1 = r10.f2925a
            int r2 = r10.f2928d
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
            java.lang.Object[] r1 = r10.f2927c
            r2 = 0
            int r3 = r10.f2928d
            tf.l.v0(r0, r3, r2, r1)
            int r0 = r10.f2928d
            int r0 = f.r0.a(r0)
            int r1 = r10.f2929e
            int r0 = r0 - r1
            r10.f2930f = r0
            return
    }

    public final boolean b(long r18) {
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f2928d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f2925a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f2926b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
    }

    public final int c(int r10) {
            r9 = this;
            int r0 = r9.f2928d
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f2925a
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

    public final java.lang.Object d(long r15) {
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f2928d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f2925a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f2926b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r0 = r14.f2927c
            r0 = r0[r10]
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
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
            r9.f2928d = r10
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
            r9.f2925a = r0
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
            int r0 = r9.f2928d
            int r0 = f.r0.a(r0)
            int r1 = r9.f2929e
            int r0 = r0 - r1
            r9.f2930f = r0
            long[] r0 = new long[r10]
            r9.f2926b = r0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r9.f2927c = r10
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
            boolean r3 = r1 instanceof f.z
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            f.z r1 = (f.z) r1
            int r3 = r1.f2929e
            int r5 = r0.f2929e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f2926b
            java.lang.Object[] r5 = r0.f2927c
            long[] r6 = r0.f2925a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L87
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
            if (r11 == 0) goto L7c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L76
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L61
            java.lang.Object r14 = r1.d(r2)
            if (r14 != 0) goto L60
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L6f
        L60:
            return r4
        L61:
            java.lang.Object r2 = r1.d(r2)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L6f
            return r4
        L6c:
            r15 = r2
            r16 = r3
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L76:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L88
            goto L7f
        L7c:
            r15 = r2
            r16 = r3
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L87:
            r15 = r2
        L88:
            return r15
    }

    public final java.lang.Object f(long r15) {
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f2928d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f2925a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f2926b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L99
            r10 = -1
        L66:
            r0 = 0
            if (r10 < 0) goto L98
            int r1 = r14.f2929e
            int r1 = r1 + (-1)
            r14.f2929e = r1
            long[] r1 = r14.f2925a
            int r2 = r14.f2928d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            java.lang.Object[] r1 = r14.f2927c
            r2 = r1[r10]
            r1[r10] = r0
            return r2
        L98:
            return r0
        L99:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }

    public final void g(java.lang.Object r39, long r40) {
            r38 = this;
            r0 = r38
            int r1 = java.lang.Long.hashCode(r40)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f2928d
            r5 = r3 & r4
            r7 = 0
        L16:
            long[] r8 = r0.f2925a
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r1
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r10 * r14
            r18 = r7
            r12 = 0
            long r6 = r8 ^ r16
            long r14 = r6 - r14
            long r6 = ~r6
            long r6 = r6 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r14
        L47:
            r16 = 0
            int r19 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r19 == 0) goto L6c
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            r19 = r2
            long[] r2 = r0.f2926b
            r20 = r2[r16]
            int r2 = (r20 > r40 ? 1 : (r20 == r40 ? 0 : -1))
            if (r2 != 0) goto L63
            goto L2b6
        L63:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            r2 = r19
            goto L47
        L6c:
            r19 = r2
            long r6 = ~r8
            r2 = 6
            long r6 = r6 << r2
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r6 = 8
            if (r2 == 0) goto L2bf
            int r1 = r0.c(r3)
            int r2 = r0.f2930f
            r7 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L97
            long[] r2 = r0.f2925a
            int r18 = r1 >> 3
            r20 = r2[r18]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r20 = r20 >> r2
            long r20 = r20 & r7
            r22 = 254(0xfe, double:1.255E-321)
            int r2 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r2 != 0) goto La5
        L97:
            r25 = r7
            r29 = r10
            r27 = r12
            r18 = r13
            r20 = 128(0x80, double:6.3E-322)
            r28 = 7
            goto L27e
        La5:
            int r1 = r0.f2928d
            if (r1 <= r6) goto L204
            int r2 = r0.f2929e
            r20 = 128(0x80, double:6.3E-322)
            long r4 = (long) r2
            r24 = 32
            long r4 = r4 * r24
            long r1 = (long) r1
            r24 = 25
            long r1 = r1 * r24
            int r1 = java.lang.Long.compareUnsigned(r4, r1)
            if (r1 > 0) goto L1f9
            long[] r1 = r0.f2925a
            int r2 = r0.f2928d
            long[] r4 = r0.f2926b
            java.lang.Object[] r5 = r0.f2927c
            int r18 = r2 + 7
            r24 = r6
            int r6 = r18 >> 3
            r25 = r7
            r7 = r12
        Lce:
            if (r7 >= r6) goto Led
            r27 = r1[r7]
            r29 = r10
            r8 = 7
            long r9 = r27 & r14
            r27 = r12
            r11 = r13
            long r12 = ~r9
            long r9 = r9 >>> r8
            long r12 = r12 + r9
            r9 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r9 = r9 & r12
            r1[r7] = r9
            int r7 = r7 + 1
            r13 = r11
            r12 = r27
            r10 = r29
            goto Lce
        Led:
            r29 = r10
            r27 = r12
            r11 = r13
            r8 = 7
            int r6 = tf.l.B0(r1)
            int r7 = r6 + (-1)
            r9 = r1[r7]
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r9 = r9 & r12
            r14 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r9 = r9 | r14
            r1[r7] = r9
            r9 = r1[r27]
            r1[r6] = r9
            r6 = r27
        L10c:
            if (r6 == r2) goto L1e8
            int r7 = r6 >> 3
            r9 = r1[r7]
            r14 = r6 & 7
            int r14 = r14 << 3
            long r9 = r9 >> r14
            long r9 = r9 & r25
            int r15 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r15 != 0) goto L120
        L11d:
            int r6 = r6 + 1
            goto L10c
        L120:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L125
            goto L11d
        L125:
            r9 = r4[r6]
            int r9 = java.lang.Long.hashCode(r9)
            int r9 = r9 * r19
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r15 = r0.c(r10)
            r10 = r10 & r2
            int r18 = r15 - r10
            r18 = r18 & r2
            r28 = r8
            int r8 = r18 / 8
            int r10 = r6 - r10
            r10 = r10 & r2
            int r10 = r10 / 8
            r31 = -9223372036854775808
            if (r8 != r10) goto L16b
            r8 = r9 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r33 = r1[r7]
            r10 = r11
            r35 = r12
            long r11 = r25 << r14
            long r11 = ~r11
            long r11 = r33 & r11
            long r8 = r8 << r14
            long r8 = r8 | r11
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 - r10
            r8 = r1[r27]
            long r8 = r8 & r35
            long r8 = r8 | r31
            r1[r7] = r8
            int r6 = r6 + 1
            r11 = r10
            r8 = r28
            r12 = r35
            goto L10c
        L16b:
            r10 = r11
            r35 = r12
            int r8 = r15 >> 3
            r11 = r1[r8]
            r13 = r15 & 7
            int r13 = r13 << 3
            long r33 = r11 >> r13
            long r33 = r33 & r25
            int r18 = (r33 > r20 ? 1 : (r33 == r20 ? 0 : -1))
            if (r18 != 0) goto L1ab
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r18 = r10
            r33 = r11
            long r10 = (long) r9
            r12 = r4
            r37 = r5
            long r4 = r25 << r13
            long r4 = ~r4
            long r4 = r33 & r4
            long r9 = r10 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r1[r7]
            long r8 = r25 << r14
            long r8 = ~r8
            long r4 = r4 & r8
            long r8 = r20 << r14
            long r4 = r4 | r8
            r1[r7] = r4
            r4 = r12[r6]
            r12[r15] = r4
            r12[r6] = r16
            r4 = r37[r6]
            r37[r15] = r4
            r4 = 0
            r37[r6] = r4
            goto L1d0
        L1ab:
            r37 = r5
            r18 = r10
            r33 = r11
            r12 = r4
            r4 = r9 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r9 = r25 << r13
            long r9 = ~r9
            long r9 = r33 & r9
            long r4 = r4 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r12[r15]
            r7 = r12[r6]
            r12[r15] = r7
            r12[r6] = r4
            r4 = r37[r15]
            r5 = r37[r6]
            r37[r15] = r5
            r37[r6] = r4
            int r6 = r6 + (-1)
        L1d0:
            int r4 = r1.length
            int r4 = r4 + (-1)
            r7 = r1[r27]
            long r7 = r7 & r35
            long r7 = r7 | r31
            r1[r4] = r7
            int r6 = r6 + 1
            r4 = r12
            r11 = r18
            r8 = r28
            r12 = r35
            r5 = r37
            goto L10c
        L1e8:
            r28 = r8
            r18 = r11
            int r1 = r0.f2928d
            int r1 = f.r0.a(r1)
            int r2 = r0.f2929e
            int r1 = r1 - r2
            r0.f2930f = r1
            goto L27a
        L1f9:
            r25 = r7
            r29 = r10
            r27 = r12
            r18 = r13
            r28 = 7
            goto L207
        L204:
            r20 = 128(0x80, double:6.3E-322)
            goto L1f9
        L207:
            int r1 = r0.f2928d
            int r1 = f.r0.b(r1)
            long[] r2 = r0.f2925a
            long[] r4 = r0.f2926b
            java.lang.Object[] r5 = r0.f2927c
            int r6 = r0.f2928d
            r0.e(r1)
            long[] r1 = r0.f2925a
            long[] r7 = r0.f2926b
            java.lang.Object[] r8 = r0.f2927c
            int r9 = r0.f2928d
            r10 = r27
        L222:
            if (r10 >= r6) goto L27a
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r25
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 >= 0) goto L271
            r11 = r4[r10]
            int r13 = java.lang.Long.hashCode(r11)
            int r13 = r13 * r19
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.c(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r16 = r1
            r15 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r17 = r14 & 7
            int r17 = r17 << 3
            r22 = r16[r13]
            r31 = r1
            long r1 = r25 << r17
            long r1 = ~r1
            long r1 = r22 & r1
            long r22 = r31 << r17
            long r1 = r1 | r22
            r16[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r9
            r17 = r9 & 7
            int r13 = r13 + r17
            int r13 = r13 >> 3
            r16[r13] = r1
            r7[r14] = r11
            r1 = r5[r10]
            r8[r14] = r1
            goto L274
        L271:
            r16 = r1
            r15 = r2
        L274:
            int r10 = r10 + 1
            r2 = r15
            r1 = r16
            goto L222
        L27a:
            int r1 = r0.c(r3)
        L27e:
            r16 = r1
            int r1 = r0.f2929e
            int r1 = r1 + 1
            r0.f2929e = r1
            int r1 = r0.f2930f
            long[] r2 = r0.f2925a
            int r3 = r16 >> 3
            r4 = r2[r3]
            r6 = r16 & 7
            int r6 = r6 << 3
            long r7 = r4 >> r6
            long r7 = r7 & r25
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 != 0) goto L29b
            goto L29d
        L29b:
            r18 = r27
        L29d:
            int r1 = r1 - r18
            r0.f2930f = r1
            int r1 = r0.f2928d
            long r7 = r25 << r6
            long r7 = ~r7
            long r4 = r4 & r7
            long r6 = r29 << r6
            long r4 = r4 | r6
            r2[r3] = r4
            int r3 = r16 + (-7)
            r3 = r3 & r1
            r1 = r1 & 7
            int r3 = r3 + r1
            int r1 = r3 >> 3
            r2[r1] = r4
        L2b6:
            long[] r1 = r0.f2926b
            r1[r16] = r40
            java.lang.Object[] r1 = r0.f2927c
            r1[r16] = r39
            return
        L2bf:
            r24 = r6
            r27 = r12
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = r19
            goto L16
    }

    public final int hashCode() {
            r17 = this;
            r0 = r17
            long[] r1 = r0.f2926b
            java.lang.Object[] r2 = r0.f2927c
            long[] r3 = r0.f2925a
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
            int r14 = java.lang.Long.hashCode(r14)
            if (r13 == 0) goto L47
            int r13 = r13.hashCode()
            goto L48
        L47:
            r13 = r5
        L48:
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
            int r1 = r0.f2929e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            long[] r2 = r0.f2926b
            java.lang.Object[] r3 = r0.f2927c
            long[] r4 = r0.f2925a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7b
            r7 = 0
            r8 = 0
        L1d:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L75
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L37:
            if (r13 >= r11) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L66
            int r14 = r7 << 3
            int r14 = r14 + r13
            r16 = r7
            r6 = r2[r14]
            r14 = r3[r14]
            r1.append(r6)
            java.lang.String r6 = "="
            r1.append(r6)
            if (r14 != r0) goto L57
            java.lang.String r14 = "(this)"
        L57:
            r1.append(r14)
            int r8 = r8 + 1
            int r6 = r0.f2929e
            if (r8 >= r6) goto L68
            java.lang.String r6 = ", "
            r1.append(r6)
            goto L68
        L66:
            r16 = r7
        L68:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r7 = r16
            goto L37
        L6e:
            r16 = r7
            if (r11 != r12) goto L7b
            r6 = r16
            goto L76
        L75:
            r6 = r7
        L76:
            if (r6 == r5) goto L7b
            int r7 = r6 + 1
            goto L1d
        L7b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
