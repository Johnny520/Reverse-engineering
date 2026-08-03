package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f2817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f2818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f2819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2824h;

    public g0(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            r1.f2817a = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2818b = r0
            long[] r0 = f.q.f2885b
            r1.f2819c = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f2820d = r0
            r1.f2821e = r0
            if (r2 < 0) goto L20
            int r2 = f.r0.d(r2)
            r1.f(r2)
            return
        L20:
            java.lang.String r2 = "Capacity must be a positive value."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final boolean a(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f2823g
            int r1 = r11.d(r12)
            java.lang.Object[] r2 = r11.f2818b
            r2[r1] = r12
            long[] r12 = r11.f2819c
            int r2 = r11.f2820d
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
            r11.f2820d = r1
            int r12 = r11.f2821e
            if (r12 != r3) goto L39
            r11.f2821e = r1
        L39:
            int r12 = r11.f2823g
            if (r12 == r0) goto L3f
            r12 = 1
            return r12
        L3f:
            r12 = 0
            return r12
    }

    public final void b() {
            r10 = this;
            r0 = 0
            r10.f2823g = r0
            long[] r1 = r10.f2817a
            long[] r2 = f.r0.f2895a
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            tf.l.w0(r2, r1)
            long[] r1 = r10.f2817a
            int r2 = r10.f2822f
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
            java.lang.Object[] r1 = r10.f2818b
            r2 = 0
            int r3 = r10.f2822f
            tf.l.v0(r0, r3, r2, r1)
            long[] r0 = r10.f2819c
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            tf.l.w0(r1, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r10.f2820d = r0
            r10.f2821e = r0
            int r0 = r10.f2822f
            int r0 = f.r0.a(r0)
            int r1 = r10.f2823g
            int r0 = r0 - r1
            r10.f2824h = r0
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
            int r5 = r0.f2822f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f2817a
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
            java.lang.Object[] r15 = r0.f2818b
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

    public final int d(java.lang.Object r48) {
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
            int r6 = r0.f2822f
            r7 = r5 & r6
            r8 = r2
        L1d:
            long[] r9 = r0.f2817a
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
            r19 = r13
            long r13 = r9 ^ r17
            long r17 = r13 - r19
            long r13 = ~r13
            long r13 = r17 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r17
        L51:
            r19 = 0
            int r15 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r15 == 0) goto L75
            int r15 = java.lang.Long.numberOfTrailingZeros(r13)
            int r15 = r15 >> 3
            int r15 = r15 + r7
            r15 = r15 & r6
            r21 = r4
            java.lang.Object[] r4 = r0.f2818b
            r4 = r4[r15]
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L6c
            return r15
        L6c:
            r19 = 1
            long r19 = r13 - r19
            long r13 = r13 & r19
            r4 = r21
            goto L51
        L75:
            r21 = r4
            long r13 = ~r9
            r4 = 6
            long r13 = r13 << r4
            long r9 = r9 & r13
            long r9 = r9 & r17
            int r4 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            r9 = 8
            if (r4 == 0) goto L3ef
            int r1 = r0.e(r5)
            int r3 = r0.f2824h
            r13 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto La1
            long[] r3 = r0.f2817a
            int r8 = r1 >> 3
            r19 = r3[r8]
            r3 = r1 & 7
            int r3 = r3 << 3
            long r19 = r19 >> r3
            long r19 = r19 & r13
            r22 = 254(0xfe, double:1.255E-321)
            int r3 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r3 != 0) goto Lad
        La1:
            r30 = r2
            r45 = r11
            r35 = r13
            r48 = 7
            r26 = 128(0x80, double:6.3E-322)
            goto L3b9
        Lad:
            int r1 = r0.f2822f
            r19 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r24 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 <= r9) goto L2ea
            int r10 = r0.f2823g
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
            if (r1 > 0) goto L2e3
            long[] r1 = r0.f2817a
            if (r1 != 0) goto Lda
            r30 = r2
            r45 = r11
            r35 = r13
            goto L3b5
        Lda:
            int r3 = r0.f2822f
            java.lang.Object[] r4 = r0.f2818b
            long[] r6 = r0.f2819c
            long[] r7 = new long[r3]
            r28 = r9
            r9 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.util.Arrays.fill(r7, r2, r3, r9)
            int r29 = r3 + 7
            r30 = r2
            int r2 = r29 >> 3
            r31 = r9
            r9 = r30
        Lf6:
            if (r9 >= r2) goto L111
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
            goto Lf6
        L111:
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
        L12d:
            if (r2 == r3) goto L282
            int r13 = r2 >> 3
            r17 = r1[r13]
            r14 = r2 & 7
            int r14 = r14 << 3
            long r17 = r17 >> r14
            long r17 = r17 & r35
            int r29 = (r17 > r26 ? 1 : (r17 == r26 ? 0 : -1))
            if (r29 != 0) goto L142
        L13f:
            int r2 = r2 + 1
            goto L12d
        L142:
            int r17 = (r17 > r22 ? 1 : (r17 == r22 ? 0 : -1))
            if (r17 == 0) goto L147
            goto L13f
        L147:
            r17 = r4[r2]
            if (r17 == 0) goto L150
            int r17 = r17.hashCode()
            goto L152
        L150:
            r17 = r30
        L152:
            int r17 = r17 * r21
            int r18 = r17 << 16
            r17 = r17 ^ r18
            r33 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r8 = r17 >>> 7
            int r9 = r0.e(r8)
            r8 = r8 & r3
            int r18 = r9 - r8
            r18 = r18 & r3
            int r10 = r18 / 8
            int r8 = r2 - r8
            r8 = r8 & r3
            int r8 = r8 / 8
            r18 = 32
            if (r10 != r8) goto L19f
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
            if (r3 != 0) goto L191
            long r3 = (long) r2
            long r8 = r3 << r18
            long r3 = r3 | r8
            r7[r2] = r3
        L191:
            int r3 = r1.length
            int r3 = r3 + (-1)
            r8 = r1[r30]
            r1[r3] = r8
            int r2 = r2 + 1
            r3 = r37
            r4 = r38
            goto L12d
        L19f:
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
            if (r8 != 0) goto L220
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
            if (r3 == r10) goto L20f
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
            goto L218
        L20f:
            r45 = r11
            long r3 = (long) r10
            long r3 = r3 << r18
            long r11 = (long) r9
            long r3 = r3 | r11
            r7[r2] = r3
        L218:
            long r3 = (long) r2
            long r3 = r3 << r18
            long r11 = (long) r10
            long r3 = r3 | r11
            r7[r9] = r3
            goto L271
        L220:
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
            if (r3 == r10) goto L261
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
            goto L268
        L261:
            long r3 = (long) r9
            long r11 = r3 << r18
            long r3 = r3 | r11
            r7[r2] = r3
            r3 = r2
        L268:
            long r3 = (long) r3
            long r3 = r3 << r18
            long r11 = (long) r2
            long r3 = r3 | r11
            r7[r9] = r3
            int r2 = r2 + (-1)
        L271:
            int r3 = r1.length
            int r3 = r3 + (-1)
            r8 = r1[r30]
            r1[r3] = r8
            int r2 = r2 + 1
            r3 = r37
            r4 = r38
            r11 = r45
            goto L12d
        L282:
            r45 = r11
            r33 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = r0.f2822f
            int r1 = f.r0.a(r1)
            int r2 = r0.f2823g
            int r1 = r1 - r2
            r0.f2824h = r1
            long[] r1 = r0.f2819c
            int r2 = r1.length
            r3 = r30
        L299:
            if (r3 >= r2) goto L2c8
            r8 = r1[r3]
            long r11 = r8 >> r15
            long r11 = r11 & r24
            int r4 = (int) r11
            long r11 = r8 & r24
            int r6 = (int) r11
            long r8 = r8 & r19
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r10) goto L2ae
            r4 = r10
            goto L2b3
        L2ae:
            r11 = r7[r4]
            long r11 = r11 & r33
            int r4 = (int) r11
        L2b3:
            long r11 = (long) r4
            long r8 = r8 | r11
            long r8 = r8 << r15
            if (r6 != r10) goto L2bc
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L2c1
        L2bc:
            r11 = r7[r6]
            long r11 = r11 & r33
            int r4 = (int) r11
        L2c1:
            long r11 = (long) r4
            long r8 = r8 | r11
            r1[r3] = r8
            int r3 = r3 + 1
            goto L299
        L2c8:
            int r1 = r0.f2820d
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r10) goto L2d6
            r1 = r7[r1]
            long r1 = r1 & r33
            int r1 = (int) r1
            r0.f2820d = r1
        L2d6:
            int r1 = r0.f2821e
            if (r1 == r10) goto L3b5
            r1 = r7[r1]
            long r1 = r1 & r33
            int r1 = (int) r1
            r0.f2821e = r1
            goto L3b5
        L2e3:
            r30 = r2
            r45 = r11
            r35 = r13
            goto L2f1
        L2ea:
            r48 = 7
            r15 = 31
            r26 = 128(0x80, double:6.3E-322)
            goto L2e3
        L2f1:
            int r1 = r0.f2822f
            int r1 = f.r0.b(r1)
            long[] r2 = r0.f2817a
            java.lang.Object[] r3 = r0.f2818b
            long[] r4 = r0.f2819c
            int r6 = r0.f2822f
            int[] r7 = new int[r6]
            r0.f(r1)
            long[] r1 = r0.f2817a
            java.lang.Object[] r8 = r0.f2818b
            long[] r9 = r0.f2819c
            int r11 = r0.f2822f
            r12 = r30
        L30e:
            if (r12 >= r6) goto L372
            int r13 = r12 >> 3
            r13 = r2[r13]
            r17 = r12 & 7
            int r17 = r17 << 3
            long r13 = r13 >> r17
            long r13 = r13 & r35
            int r13 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r13 >= 0) goto L367
            r13 = r3[r12]
            if (r13 == 0) goto L329
            int r14 = r13.hashCode()
            goto L32b
        L329:
            r14 = r30
        L32b:
            int r14 = r14 * r21
            int r17 = r14 << 16
            r14 = r14 ^ r17
            int r10 = r14 >>> 7
            int r10 = r0.e(r10)
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
            goto L36b
        L367:
            r18 = r1
            r17 = r2
        L36b:
            int r12 = r12 + 1
            r2 = r17
            r1 = r18
            goto L30e
        L372:
            long[] r1 = r0.f2819c
            int r2 = r1.length
            r3 = r30
        L377:
            if (r3 >= r2) goto L3a2
            r8 = r1[r3]
            long r10 = r8 >> r15
            long r10 = r10 & r24
            int r4 = (int) r10
            long r10 = r8 & r24
            int r6 = (int) r10
            long r8 = r8 & r19
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r10) goto L38c
            r4 = r10
            goto L390
        L38c:
            r29 = r7[r4]
            r4 = r29
        L390:
            long r11 = (long) r4
            long r8 = r8 | r11
            long r8 = r8 << r15
            if (r6 != r10) goto L397
            r4 = r10
            goto L39b
        L397:
            r29 = r7[r6]
            r4 = r29
        L39b:
            long r11 = (long) r4
            long r8 = r8 | r11
            r1[r3] = r8
            int r3 = r3 + 1
            goto L377
        L3a2:
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r0.f2820d
            if (r1 == r10) goto L3ad
            r1 = r7[r1]
            r0.f2820d = r1
        L3ad:
            int r1 = r0.f2821e
            if (r1 == r10) goto L3b5
            r1 = r7[r1]
            r0.f2821e = r1
        L3b5:
            int r1 = r0.e(r5)
        L3b9:
            int r2 = r0.f2823g
            int r2 = r2 + 1
            r0.f2823g = r2
            int r2 = r0.f2824h
            long[] r3 = r0.f2817a
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r35
            int r8 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r8 != 0) goto L3d5
            r30 = r16
        L3d5:
            int r2 = r2 - r30
            r0.f2824h = r2
            int r2 = r0.f2822f
            long r8 = r35 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r45 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r4 = r1 + (-7)
            r4 = r4 & r2
            r2 = r2 & 7
            int r4 = r4 + r2
            int r2 = r4 >> 3
            r3[r2] = r5
            return r1
        L3ef:
            r30 = r2
            r28 = r9
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r4 = r21
            goto L1d
    }

    public final int e(int r10) {
            r9 = this;
            int r0 = r9.f2822f
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f2817a
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
            boolean r3 = r1 instanceof f.g0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            f.g0 r1 = (f.g0) r1
            int r3 = r1.f2823g
            int r5 = r0.f2823g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f2818b
            long[] r5 = r0.f2817a
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

    public final void f(int r11) {
            r10 = this;
            r0 = 0
            if (r11 <= 0) goto Ld
            int r11 = f.r0.c(r11)
            r1 = 7
            int r11 = java.lang.Math.max(r1, r11)
            goto Le
        Ld:
            r11 = r0
        Le:
            r10.f2822f = r11
            if (r11 != 0) goto L15
            long[] r1 = f.r0.f2895a
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
            r10.f2817a = r1
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
            int r1 = r10.f2822f
            int r1 = f.r0.a(r1)
            int r2 = r10.f2823g
            int r1 = r1 - r2
            r10.f2824h = r1
            if (r11 != 0) goto L49
            java.lang.Object[] r1 = g.a.f3962c
            goto L4b
        L49:
            java.lang.Object[] r1 = new java.lang.Object[r11]
        L4b:
            r10.f2818b = r1
            if (r11 != 0) goto L52
            long[] r11 = f.q.f2885b
            goto L5d
        L52:
            long[] r1 = new long[r11]
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            java.util.Arrays.fill(r1, r0, r11, r2)
            r11 = r1
        L5d:
            r10.f2819c = r11
            return
    }

    public final boolean g(java.lang.Object r18) {
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
            int r5 = r0.f2822f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f2817a
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
            java.lang.Object[] r15 = r0.f2818b
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
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    public final void h(int r13) {
            r12 = this;
            int r0 = r12.f2823g
            int r0 = r0 + (-1)
            r12.f2823g = r0
            long[] r0 = r12.f2817a
            int r1 = r12.f2822f
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
            java.lang.Object[] r0 = r12.f2818b
            r1 = 0
            r0[r13] = r1
            long[] r0 = r12.f2819c
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
            r12.f2820d = r1
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
            r12.f2821e = r4
        L63:
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0[r13] = r1
            return
    }

    public final int hashCode() {
            r15 = this;
            int r0 = r15.f2822f
            int r0 = r0 * 31
            int r1 = r15.f2823g
            int r0 = r0 + r1
            java.lang.Object[] r1 = r15.f2818b
            long[] r2 = r15.f2817a
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

    public final boolean i(java.util.Collection r17) {
            r16 = this;
            r0 = r16
            r17.getClass()
            java.lang.Object[] r1 = r0.f2818b
            int r2 = r0.f2823g
            long[] r3 = r0.f2817a
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
            boolean r13 = tf.m.o1(r13, r14)
            if (r13 != 0) goto L49
            r0.h(r12)
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
            int r1 = r0.f2823g
            if (r2 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r5
    }

    public final java.lang.String toString() {
            r10 = this;
            b1.f r0 = new b1.f
            r1 = 5
            r0.<init>(r10, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            java.lang.Object[] r2 = r10.f2818b
            long[] r3 = r10.f2819c
            int r4 = r10.f2821e
            r5 = 0
        L14:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r6) goto L42
            r6 = r3[r4]
            r8 = 31
            long r6 = r6 >> r8
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r6 = r6 & r8
            int r6 = (int) r6
            r4 = r2[r4]
            r7 = -1
            if (r5 != r7) goto L2e
            java.lang.String r0 = "..."
            r1.append(r0)
            goto L47
        L2e:
            if (r5 == 0) goto L35
            java.lang.String r7 = ", "
            r1.append(r7)
        L35:
            java.lang.Object r4 = r0.invoke(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.append(r4)
            int r5 = r5 + 1
            r4 = r6
            goto L14
        L42:
            java.lang.String r0 = "]"
            r1.append(r0)
        L47:
            java.lang.String r0 = r1.toString()
            return r0
    }
}
