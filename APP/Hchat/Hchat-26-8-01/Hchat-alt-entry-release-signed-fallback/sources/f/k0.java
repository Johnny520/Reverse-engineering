package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f2848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f2849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f2850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2853f;

    public /* synthetic */ k0() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public k0(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            r1.f2848a = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2849b = r0
            r1.f2850c = r0
            if (r2 < 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1c
            int r2 = f.r0.d(r2)
            r1.h(r2)
            return
        L1c:
            java.lang.String r2 = "Capacity must be a positive value."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final void a() {
            r10 = this;
            r0 = 0
            r10.f2852e = r0
            long[] r1 = r10.f2848a
            long[] r2 = f.r0.f2895a
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            tf.l.w0(r2, r1)
            long[] r1 = r10.f2848a
            int r2 = r10.f2851d
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
            java.lang.Object[] r1 = r10.f2850c
            int r2 = r10.f2851d
            r3 = 0
            tf.l.v0(r0, r2, r3, r1)
            java.lang.Object[] r1 = r10.f2849b
            int r2 = r10.f2851d
            tf.l.v0(r0, r2, r3, r1)
            int r0 = r10.f2851d
            int r0 = f.r0.a(r0)
            int r1 = r10.f2852e
            int r0 = r0 - r1
            r10.f2853f = r0
            return
    }

    public final boolean b(java.lang.Object r18) {
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
            int r5 = r0.f2851d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f2848a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
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
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f2849b
            r15 = r15[r11]
            boolean r15 = gg.l.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    public final boolean c(java.lang.Object r18) {
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
            int r5 = r0.f2851d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f2848a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
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
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f2849b
            r15 = r15[r11]
            boolean r15 = gg.l.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    public final boolean d(java.lang.Object r15) {
            r14 = this;
            java.lang.Object[] r0 = r14.f2850c
            long[] r1 = r14.f2848a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L48
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L43
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L41
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r10 = gg.l.a(r15, r10)
            if (r10 == 0) goto L3d
            r15 = 1
            return r15
        L3d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L41:
            if (r7 != r8) goto L48
        L43:
            if (r4 == r2) goto L48
            int r4 = r4 + 1
            goto Lb
        L48:
            return r3
    }

    public final int e(int r10) {
            r9 = this;
            int r0 = r9.f2851d
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f2848a
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

    public final boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof f.k0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            f.k0 r1 = (f.k0) r1
            int r3 = r1.f2852e
            int r5 = r0.f2852e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f2849b
            java.lang.Object[] r5 = r0.f2850c
            long[] r6 = r0.f2848a
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
            if (r11 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L6d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L69
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L5e
            java.lang.Object r14 = r1.g(r15)
            if (r14 != 0) goto L5d
            boolean r14 = r1.c(r15)
            if (r14 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r15 = r1.g(r15)
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L69
            return r4
        L69:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L6d:
            if (r11 != r12) goto L74
        L6f:
            if (r8 == r7) goto L74
            int r8 = r8 + 1
            goto L23
        L74:
            return r2
    }

    public final int f(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            r1 = r32
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
            int r6 = r0.f2851d
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.f2848a
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
            java.lang.Object[] r4 = r0.f2849b
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
            if (r2 == 0) goto L29b
            int r1 = r0.e(r5)
            int r2 = r0.f2853f
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto La0
            long[] r2 = r0.f2848a
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
            r32 = 7
            r18 = 128(0x80, double:6.3E-322)
            goto L265
        Laa:
            int r1 = r0.f2851d
            if (r1 <= r3) goto L1e8
            int r2 = r0.f2852e
            r10 = r3
            r32 = 7
            long r3 = (long) r2
            r17 = 32
            long r3 = r3 * r17
            long r1 = (long) r1
            r17 = 25
            long r1 = r1 * r17
            int r1 = java.lang.Long.compareUnsigned(r3, r1)
            if (r1 > 0) goto L1e1
            long[] r1 = r0.f2848a
            int r2 = r0.f2851d
            java.lang.Object[] r3 = r0.f2849b
            java.lang.Object[] r4 = r0.f2850c
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
            long r8 = r8 >>> r32
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
            r10 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r8 | r10
            r1[r7] = r8
            r7 = r1[r15]
            r1[r6] = r7
            r6 = r15
        L10e:
            if (r6 == r2) goto L1d4
            int r7 = r6 >> 3
            r8 = r1[r7]
            r10 = r6 & 7
            int r10 = r10 << 3
            long r8 = r8 >> r10
            long r8 = r8 & r25
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 != 0) goto L122
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
            int r11 = r0.e(r9)
            r9 = r9 & r2
            int r13 = r11 - r9
            r13 = r13 & r2
            int r13 = r13 / r12
            int r9 = r6 - r9
            r9 = r9 & r2
            int r9 = r9 / r12
            if (r13 != r9) goto L165
            r8 = r8 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r13 = r1[r7]
            r17 = r12
            r27 = r13
            long r12 = r25 << r10
            long r11 = ~r12
            long r11 = r27 & r11
            long r8 = r8 << r10
            long r8 = r8 | r11
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 + (-1)
            r8 = r1[r15]
            r1[r7] = r8
            int r6 = r6 + 1
            r12 = r17
            goto L10e
        L165:
            r17 = r12
            int r9 = r11 >> 3
            r12 = r1[r9]
            r14 = r11 & 7
            int r14 = r14 << 3
            long r27 = r12 >> r14
            long r27 = r27 & r25
            int r27 = (r27 > r18 ? 1 : (r27 == r18 ? 0 : -1))
            if (r27 != 0) goto L1a2
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r27 = r2
            r28 = r3
            long r2 = (long) r8
            r29 = r2
            long r2 = r25 << r14
            long r2 = ~r2
            long r2 = r2 & r12
            long r12 = r29 << r14
            long r2 = r2 | r12
            r1[r9] = r2
            r2 = r1[r7]
            long r8 = r25 << r10
            long r8 = ~r8
            long r2 = r2 & r8
            long r8 = r18 << r10
            long r2 = r2 | r8
            r1[r7] = r2
            r2 = r28[r6]
            r28[r11] = r2
            r2 = 0
            r28[r6] = r2
            r3 = r4[r6]
            r4[r11] = r3
            r4[r6] = r2
            goto L1c3
        L1a2:
            r27 = r2
            r28 = r3
            r2 = r8 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            long r7 = r25 << r14
            long r7 = ~r7
            long r7 = r7 & r12
            long r2 = r2 << r14
            long r2 = r2 | r7
            r1[r9] = r2
            r2 = r28[r11]
            r3 = r28[r6]
            r28[r11] = r3
            r28[r6] = r2
            r2 = r4[r11]
            r3 = r4[r6]
            r4[r11] = r3
            r4[r6] = r2
            int r6 = r6 + (-1)
        L1c3:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r7 = r1[r15]
            r1[r2] = r7
            int r6 = r6 + 1
            r12 = r17
            r2 = r27
            r3 = r28
            goto L10e
        L1d4:
            int r1 = r0.f2851d
            int r1 = f.r0.a(r1)
            int r2 = r0.f2852e
            int r1 = r1 - r2
            r0.f2853f = r1
            goto L261
        L1e1:
            r25 = r8
            r23 = r11
            r18 = 128(0x80, double:6.3E-322)
            goto L1eb
        L1e8:
            r32 = 7
            goto L1e1
        L1eb:
            int r1 = r0.f2851d
            int r1 = f.r0.b(r1)
            long[] r2 = r0.f2848a
            java.lang.Object[] r3 = r0.f2849b
            java.lang.Object[] r4 = r0.f2850c
            int r6 = r0.f2851d
            r0.h(r1)
            long[] r1 = r0.f2848a
            java.lang.Object[] r7 = r0.f2849b
            java.lang.Object[] r8 = r0.f2850c
            int r9 = r0.f2851d
            r10 = r15
        L205:
            if (r10 >= r6) goto L261
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r25
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 >= 0) goto L258
            r11 = r3[r10]
            if (r11 == 0) goto L21f
            int r12 = r11.hashCode()
            goto L220
        L21f:
            r12 = r15
        L220:
            int r12 = r12 * r20
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r13 = r0.e(r13)
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
            goto L25b
        L258:
            r17 = r1
            r14 = r2
        L25b:
            int r10 = r10 + 1
            r2 = r14
            r1 = r17
            goto L205
        L261:
            int r1 = r0.e(r5)
        L265:
            int r2 = r0.f2852e
            int r2 = r2 + 1
            r0.f2852e = r2
            int r2 = r0.f2853f
            long[] r3 = r0.f2848a
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L281
            r15 = r16
        L281:
            int r2 = r2 - r15
            r0.f2853f = r2
            int r2 = r0.f2851d
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
        L29b:
            r17 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    public final java.lang.Object g(java.lang.Object r14) {
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
            int r3 = r13.f2851d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f2848a
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
            java.lang.Object[] r11 = r13.f2849b
            r11 = r11[r10]
            boolean r11 = gg.l.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f2850c
            r14 = r14[r10]
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    public final void h(int r10) {
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
            r9.f2851d = r10
            if (r10 != 0) goto L15
            long[] r0 = f.r0.f2895a
            goto L36
        L15:
            int r1 = r10 + 15
            r1 = r1 & (-8)
            int r1 = r1 >> 3
            long[] r2 = new long[r1]
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.util.Arrays.fill(r2, r0, r1, r3)
            int r0 = r10 >> 3
            r1 = r10 & 7
            int r1 = r1 << 3
            r3 = r2[r0]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r1
            long r7 = ~r5
            long r3 = r3 & r7
            long r3 = r3 | r5
            r2[r0] = r3
            r0 = r2
        L36:
            r9.f2848a = r0
            int r0 = r9.f2851d
            int r0 = f.r0.a(r0)
            int r1 = r9.f2852e
            int r0 = r0 - r1
            r9.f2853f = r0
            java.lang.Object[] r0 = g.a.f3962c
            if (r10 != 0) goto L49
            r1 = r0
            goto L4b
        L49:
            java.lang.Object[] r1 = new java.lang.Object[r10]
        L4b:
            r9.f2849b = r1
            if (r10 != 0) goto L50
            goto L52
        L50:
            java.lang.Object[] r0 = new java.lang.Object[r10]
        L52:
            r9.f2850c = r0
            return
    }

    public final int hashCode() {
            r17 = this;
            r0 = r17
            java.lang.Object[] r1 = r0.f2849b
            java.lang.Object[] r2 = r0.f2850c
            long[] r3 = r0.f2848a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L5c
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
            if (r10 == 0) goto L56
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L2a:
            if (r12 >= r10) goto L52
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4e
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
            if (r13 == 0) goto L4b
            int r13 = r13.hashCode()
            goto L4c
        L4b:
            r13 = r5
        L4c:
            r13 = r13 ^ r14
            int r7 = r7 + r13
        L4e:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2a
        L52:
            if (r10 != r11) goto L55
            goto L56
        L55:
            return r7
        L56:
            if (r6 == r4) goto L5b
            int r6 = r6 + 1
            goto L10
        L5b:
            return r7
        L5c:
            return r5
    }

    public final boolean i() {
            r1 = this;
            int r0 = r1.f2852e
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean j() {
            r1 = this;
            int r0 = r1.f2852e
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final java.lang.Object k(java.lang.Object r14) {
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
            int r3 = r13.f2851d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f2848a
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
            java.lang.Object[] r11 = r13.f2849b
            r11 = r11[r10]
            boolean r11 = gg.l.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.l(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    public final java.lang.Object l(int r9) {
            r8 = this;
            int r0 = r8.f2852e
            int r0 = r0 + (-1)
            r8.f2852e = r0
            long[] r0 = r8.f2848a
            int r1 = r8.f2851d
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
            java.lang.Object[] r0 = r8.f2849b
            r1 = 0
            r0[r9] = r1
            java.lang.Object[] r0 = r8.f2850c
            r2 = r0[r9]
            r0[r9] = r1
            return r2
    }

    public final void m(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f(r3)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            java.lang.Object[] r1 = r2.f2849b
            r1[r0] = r3
            java.lang.Object[] r3 = r2.f2850c
            r3[r0] = r4
            return
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            boolean r1 = r0.i()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f2849b
            java.lang.Object[] r3 = r0.f2850c
            long[] r4 = r0.f2848a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L77
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L72
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L70
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L52
            r15 = r16
        L52:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L5e
            r14 = r16
        L5e:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f2852e
            if (r8 >= r14) goto L6c
            java.lang.String r14 = ", "
            r1.append(r14)
        L6c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L70:
            if (r11 != r12) goto L77
        L72:
            if (r7 == r5) goto L77
            int r7 = r7 + 1
            goto L20
        L77:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
