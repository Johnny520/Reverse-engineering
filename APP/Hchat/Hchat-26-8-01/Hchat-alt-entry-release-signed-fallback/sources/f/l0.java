package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f2855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f2856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2859e;

    public /* synthetic */ l0() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public l0(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            r1.f2855a = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2856b = r0
            if (r2 < 0) goto L15
            int r2 = f.r0.d(r2)
            r1.f(r2)
            return
        L15:
            java.lang.String r2 = "Capacity must be a positive value."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final boolean a(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2858d
            int r1 = r3.d(r4)
            java.lang.Object[] r2 = r3.f2856b
            r2[r1] = r4
            int r4 = r3.f2858d
            if (r4 == r0) goto L10
            r4 = 1
            return r4
        L10:
            r4 = 0
            return r4
    }

    public final void b() {
            r10 = this;
            r0 = 0
            r10.f2858d = r0
            long[] r1 = r10.f2855a
            long[] r2 = f.r0.f2895a
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            tf.l.w0(r2, r1)
            long[] r1 = r10.f2855a
            int r2 = r10.f2857c
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
            java.lang.Object[] r1 = r10.f2856b
            r2 = 0
            int r3 = r10.f2857c
            tf.l.v0(r0, r3, r2, r1)
            int r0 = r10.f2857c
            int r0 = f.r0.a(r0)
            int r1 = r10.f2858d
            int r0 = r0 - r1
            r10.f2859e = r0
            return
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
            int r5 = r0.f2857c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f2855a
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
            java.lang.Object[] r15 = r0.f2856b
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

    public final int d(java.lang.Object r35) {
            r34 = this;
            r0 = r34
            r1 = r35
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
            int r6 = r0.f2857c
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.f2855a
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
            java.lang.Object[] r4 = r0.f2856b
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
            if (r2 == 0) goto L28f
            int r1 = r0.e(r5)
            int r2 = r0.f2859e
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto La0
            long[] r2 = r0.f2855a
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
            r35 = 7
            r17 = 128(0x80, double:6.3E-322)
            goto L25a
        Laa:
            int r1 = r0.f2857c
            if (r1 <= r3) goto L1e7
            int r2 = r0.f2858d
            r10 = r3
            r35 = 7
            long r3 = (long) r2
            r17 = 32
            long r3 = r3 * r17
            long r1 = (long) r1
            r17 = 25
            long r1 = r1 * r17
            int r1 = java.lang.Long.compareUnsigned(r3, r1)
            if (r1 > 0) goto L1e0
            long[] r1 = r0.f2855a
            int r2 = r0.f2857c
            java.lang.Object[] r3 = r0.f2856b
            int r4 = r2 + 7
            int r4 = r4 >> 3
            r6 = r15
            r17 = 128(0x80, double:6.3E-322)
        Ld0:
            if (r6 >= r4) goto Lef
            r23 = r1[r6]
            r25 = r8
            long r8 = r23 & r13
            r23 = r11
            r12 = r10
            long r10 = ~r8
            long r7 = r8 >>> r35
            long r10 = r10 + r7
            r7 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r7 = r7 & r10
            r1[r6] = r7
            int r6 = r6 + 1
            r10 = r12
            r11 = r23
            r8 = r25
            goto Ld0
        Lef:
            r25 = r8
            r23 = r11
            r12 = r10
            int r4 = tf.l.B0(r1)
            int r6 = r4 + (-1)
            r7 = r1[r6]
            r9 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r7 = r7 & r9
            r13 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r7 = r7 | r13
            r1[r6] = r7
            r6 = r1[r15]
            r1[r4] = r6
            r4 = r15
        L10c:
            if (r4 == r2) goto L1d3
            int r6 = r4 >> 3
            r7 = r1[r6]
            r11 = r4 & 7
            int r11 = r11 << 3
            long r7 = r7 >> r11
            long r7 = r7 & r25
            int r13 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r13 != 0) goto L120
        L11d:
            int r4 = r4 + 1
            goto L10c
        L120:
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L125
            goto L11d
        L125:
            r7 = r3[r4]
            if (r7 == 0) goto L12e
            int r7 = r7.hashCode()
            goto L12f
        L12e:
            r7 = r15
        L12f:
            int r7 = r7 * r20
            int r8 = r7 << 16
            r7 = r7 ^ r8
            int r8 = r7 >>> 7
            int r13 = r0.e(r8)
            r8 = r8 & r2
            int r14 = r13 - r8
            r14 = r14 & r2
            int r14 = r14 / r12
            int r8 = r4 - r8
            r8 = r8 & r2
            int r8 = r8 / r12
            r27 = -9223372036854775808
            if (r14 != r8) goto L166
            r7 = r7 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            r13 = r1[r6]
            r29 = r9
            long r9 = r25 << r11
            long r9 = ~r9
            long r9 = r9 & r13
            long r7 = r7 << r11
            long r7 = r7 | r9
            r1[r6] = r7
            int r6 = r1.length
            int r6 = r6 + (-1)
            r7 = r1[r15]
            long r7 = r7 & r29
            long r7 = r7 | r27
            r1[r6] = r7
            int r4 = r4 + 1
            r9 = r29
            goto L10c
        L166:
            r29 = r9
            int r8 = r13 >> 3
            r9 = r1[r8]
            r14 = r13 & 7
            int r14 = r14 << 3
            long r31 = r9 >> r14
            long r31 = r31 & r25
            int r19 = (r31 > r17 ? 1 : (r31 == r17 ? 0 : -1))
            if (r19 != 0) goto L19f
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r31 = r12
            r19 = r13
            long r12 = (long) r7
            r32 = r2
            r33 = r3
            long r2 = r25 << r14
            long r2 = ~r2
            long r2 = r2 & r9
            long r9 = r12 << r14
            long r2 = r2 | r9
            r1[r8] = r2
            r2 = r1[r6]
            long r7 = r25 << r11
            long r7 = ~r7
            long r2 = r2 & r7
            long r7 = r17 << r11
            long r2 = r2 | r7
            r1[r6] = r2
            r2 = r33[r4]
            r33[r19] = r2
            r2 = 0
            r33[r4] = r2
            goto L1bc
        L19f:
            r32 = r2
            r33 = r3
            r31 = r12
            r19 = r13
            r2 = r7 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            long r6 = r25 << r14
            long r6 = ~r6
            long r6 = r6 & r9
            long r2 = r2 << r14
            long r2 = r2 | r6
            r1[r8] = r2
            r2 = r33[r19]
            r3 = r33[r4]
            r33[r19] = r3
            r33[r4] = r2
            int r4 = r4 + (-1)
        L1bc:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r6 = r1[r15]
            long r6 = r6 & r29
            long r6 = r6 | r27
            r1[r2] = r6
            int r4 = r4 + 1
            r9 = r29
            r12 = r31
            r2 = r32
            r3 = r33
            goto L10c
        L1d3:
            int r1 = r0.f2857c
            int r1 = f.r0.a(r1)
            int r2 = r0.f2858d
            int r1 = r1 - r2
            r0.f2859e = r1
            goto L256
        L1e0:
            r25 = r8
            r23 = r11
            r17 = 128(0x80, double:6.3E-322)
            goto L1ea
        L1e7:
            r35 = 7
            goto L1e0
        L1ea:
            int r1 = r0.f2857c
            int r1 = f.r0.b(r1)
            long[] r2 = r0.f2855a
            java.lang.Object[] r3 = r0.f2856b
            int r4 = r0.f2857c
            r0.f(r1)
            long[] r1 = r0.f2855a
            java.lang.Object[] r6 = r0.f2856b
            int r7 = r0.f2857c
            r8 = r15
        L200:
            if (r8 >= r4) goto L256
            int r9 = r8 >> 3
            r9 = r2[r9]
            r11 = r8 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            long r9 = r9 & r25
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 >= 0) goto L24b
            r9 = r3[r8]
            if (r9 == 0) goto L21a
            int r10 = r9.hashCode()
            goto L21b
        L21a:
            r10 = r15
        L21b:
            int r10 = r10 * r20
            int r11 = r10 << 16
            r10 = r10 ^ r11
            int r11 = r10 >>> 7
            int r11 = r0.e(r11)
            r10 = r10 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r10
            int r10 = r11 >> 3
            r14 = r11 & 7
            int r14 = r14 << 3
            r21 = r1[r10]
            r27 = r1
            r19 = r2
            long r1 = r25 << r14
            long r1 = ~r1
            long r1 = r21 & r1
            long r12 = r12 << r14
            long r1 = r1 | r12
            r27[r10] = r1
            int r10 = r11 + (-7)
            r10 = r10 & r7
            r12 = r7 & 7
            int r10 = r10 + r12
            int r10 = r10 >> 3
            r27[r10] = r1
            r6[r11] = r9
            goto L24f
        L24b:
            r27 = r1
            r19 = r2
        L24f:
            int r8 = r8 + 1
            r2 = r19
            r1 = r27
            goto L200
        L256:
            int r1 = r0.e(r5)
        L25a:
            int r2 = r0.f2858d
            int r2 = r2 + 1
            r0.f2858d = r2
            int r2 = r0.f2859e
            long[] r3 = r0.f2855a
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 != 0) goto L276
            r15 = r16
        L276:
            int r2 = r2 - r15
            r0.f2859e = r2
            int r2 = r0.f2857c
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
            return r1
        L28f:
            r31 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    public final int e(int r10) {
            r9 = this;
            int r0 = r9.f2857c
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f2855a
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

    public final boolean equals(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof f.l0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            f.l0 r1 = (f.l0) r1
            int r3 = r1.f2858d
            int r5 = r0.f2858d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f2856b
            long[] r5 = r0.f2855a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.c(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
    }

    public final void f(int r10) {
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
            r9.f2857c = r10
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
            r9.f2855a = r0
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
            int r0 = r9.f2857c
            int r0 = f.r0.a(r0)
            int r1 = r9.f2858d
            int r0 = r0 - r1
            r9.f2859e = r0
            if (r10 != 0) goto L49
            java.lang.Object[] r10 = g.a.f3962c
            goto L4b
        L49:
            java.lang.Object[] r10 = new java.lang.Object[r10]
        L4b:
            r9.f2856b = r10
            return
    }

    public final boolean g() {
            r1 = this;
            int r0 = r1.f2858d
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean h() {
            r1 = this;
            int r0 = r1.f2858d
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r15 = this;
            int r0 = r15.f2857c
            int r0 = r0 * 31
            int r1 = r15.f2858d
            int r0 = r0 + r1
            java.lang.Object[] r1 = r15.f2856b
            long[] r2 = r15.f2855a
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
            boolean r12 = gg.l.a(r11, r15)
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

    public final void i(java.lang.Object r14) {
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
            int r3 = r13.f2857c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f2855a
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
            java.lang.Object[] r11 = r13.f2856b
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
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    public final void j(f.l0 r14) {
            r13 = this;
            r14.getClass()
            java.lang.Object[] r0 = r14.f2856b
            long[] r14 = r14.f2855a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L46
            r2 = 0
            r3 = r2
        Le:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L41
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L28:
            if (r8 >= r6) goto L3f
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3b
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r13.k(r9)
        L3b:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L28
        L3f:
            if (r6 != r7) goto L46
        L41:
            if (r3 == r1) goto L46
            int r3 = r3 + 1
            goto Le
        L46:
            return
    }

    public final void k(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.d(r3)
            java.lang.Object[] r1 = r2.f2856b
            r1[r0] = r3
            return
    }

    public final boolean l(java.lang.Object r18) {
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
            int r5 = r0.f2857c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f2855a
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
            java.lang.Object[] r15 = r0.f2856b
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
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    public final void m(int r9) {
            r8 = this;
            int r0 = r8.f2858d
            int r0 = r0 + (-1)
            r8.f2858d = r0
            long[] r0 = r8.f2855a
            int r1 = r8.f2857c
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
            java.lang.Object[] r0 = r8.f2856b
            r1 = 0
            r0[r9] = r1
            return
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            b1.f r1 = new b1.f
            r2 = 6
            r1.<init>(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object[] r3 = r0.f2856b
            long[] r4 = r0.f2855a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = r6
            r8 = r7
        L1b:
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
        L35:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r14 = r3[r14]
            r15 = -1
            if (r8 != r15) goto L4e
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L70
        L4e:
            if (r8 == 0) goto L55
            java.lang.String r15 = ", "
            r2.append(r15)
        L55:
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r2.append(r14)
            int r8 = r8 + 1
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L35
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1b
        L6b:
            java.lang.String r1 = "]"
            r2.append(r1)
        L70:
            java.lang.String r1 = r2.toString()
            return r1
    }
}
