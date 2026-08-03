package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends g1.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g1.d f4119r = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1.t f4120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1.s f4123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f4124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f4125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f4126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g1.j f4127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g1.q f4128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g1.n f4129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1.j f4130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1.q f4131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1.n f4132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f4133q;

    static {
            g1.d r0 = new g1.d
            r1 = 4
            r0.<init>(r1)
            g1.r.f4119r = r0
            return
    }

    public r(java.lang.String r18, float[] r19, g1.t r20, double r21, float r23, float r24, int r25) {
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            g1.d r3 = g1.r.f4119r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            g1.o r4 = new g1.o
            r5 = 0
            r4.<init>(r1, r5)
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            g1.o r3 = new g1.o
            r0 = 1
            r3.<init>(r1, r0)
            goto L15
        L1e:
            g1.s r15 = new g1.s
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    public r(java.lang.String r16, float[] r17, g1.t r18, g1.s r19, int r20) {
            r15 = this;
            r9 = r19
            double r0 = r9.f4134a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            double r5 = r9.f4140g
            double r7 = r9.f4139f
            r10 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r12 = 0
            if (r4 == 0) goto L1e
            g1.p r4 = new g1.p
            r14 = 4
            r4.<init>(r9, r14)
            goto L3e
        L1e:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L29
            g1.p r4 = new g1.p
            r14 = 5
            r4.<init>(r9, r14)
            goto L3e
        L29:
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            g1.p r4 = new g1.p
            r14 = 6
            r4.<init>(r9, r14)
            goto L3e
        L38:
            g1.p r4 = new g1.p
            r14 = 7
            r4.<init>(r9, r14)
        L3e:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4a
            g1.p r0 = new g1.p
            r1 = 0
            r0.<init>(r9, r1)
        L48:
            r6 = r0
            goto L6b
        L4a:
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L55
            g1.p r0 = new g1.p
            r1 = 1
            r0.<init>(r9, r1)
            goto L48
        L55:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            g1.p r0 = new g1.p
            r1 = 2
            r0.<init>(r9, r1)
            goto L48
        L64:
            g1.p r0 = new g1.p
            r1 = 3
            r0.<init>(r9, r1)
            goto L48
        L6b:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public r(java.lang.String r33, float[] r34, g1.t r35, float[] r36, g1.j r37, g1.j r38, float r39, float r40, g1.s r41, int r42) {
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r42
            long r9 = g1.b.f4058a
            r11 = r33
            r0.<init>(r8, r11, r9)
            r0.f4120d = r2
            r0.f4121e = r6
            r0.f4122f = r7
            r9 = r41
            r0.f4123g = r9
            r0.f4127k = r4
            g1.q r9 = new g1.q
            r10 = 1
            r9.<init>(r0, r10)
            r0.f4128l = r9
            g1.n r9 = new g1.n
            r11 = 0
            r9.<init>(r0, r11)
            r0.f4129m = r9
            r0.f4130n = r5
            g1.q r9 = new g1.q
            r9.<init>(r0, r11)
            r0.f4131o = r9
            g1.n r9 = new g1.n
            r9.<init>(r0, r10)
            r0.f4132p = r9
            int r9 = r1.length
            r12 = 9
            r13 = 6
            if (r9 == r13) goto L56
            int r9 = r1.length
            if (r9 != r12) goto L4f
            goto L56
        L4f:
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L56:
            int r9 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r9 >= 0) goto L27c
            float[] r9 = new float[r13]
            int r14 = r1.length
            r15 = 8
            r16 = 7
            r17 = 2
            r18 = 3
            r19 = 4
            r20 = 5
            if (r14 != r12) goto La2
            r14 = r1[r11]
            r21 = r1[r10]
            float r22 = r14 + r21
            r23 = r1[r17]
            float r22 = r22 + r23
            float r14 = r14 / r22
            r9[r11] = r14
            float r21 = r21 / r22
            r9[r10] = r21
            r14 = r1[r18]
            r21 = r1[r19]
            float r22 = r14 + r21
            r23 = r1[r20]
            float r22 = r22 + r23
            float r14 = r14 / r22
            r9[r17] = r14
            float r21 = r21 / r22
            r9[r18] = r21
            r14 = r1[r13]
            r21 = r1[r16]
            float r22 = r14 + r21
            r1 = r1[r15]
            float r22 = r22 + r1
            float r14 = r14 / r22
            r9[r19] = r14
            float r21 = r21 / r22
            r9[r20] = r21
            goto La5
        La2:
            java.lang.System.arraycopy(r1, r11, r9, r11, r13)
        La5:
            r0.f4124h = r9
            if (r3 != 0) goto L12b
            r3 = r9[r11]
            r14 = r9[r10]
            r21 = r9[r17]
            r22 = r9[r18]
            r23 = r9[r19]
            r24 = r9[r20]
            r33 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.f4141a
            r41 = r11
            float r11 = r2.f4142b
            r25 = r15
            float r15 = (float) r10
            float r26 = r15 - r3
            float r26 = r26 / r14
            float r27 = r15 - r21
            float r27 = r27 / r22
            float r28 = r15 - r23
            float r28 = r28 / r24
            float r15 = r15 - r1
            float r15 = r15 / r11
            float r29 = r3 / r14
            float r30 = r21 / r22
            float r31 = r23 / r24
            float r1 = r1 / r11
            float r15 = r15 - r26
            float r30 = r30 - r29
            float r15 = r15 * r30
            float r1 = r1 - r29
            float r27 = r27 - r26
            float r11 = r1 * r27
            float r15 = r15 - r11
            float r28 = r28 - r26
            float r28 = r28 * r30
            float r31 = r31 - r29
            float r27 = r27 * r31
            float r28 = r28 - r27
            float r15 = r15 / r28
            float r31 = r31 * r15
            float r1 = r1 - r31
            float r1 = r1 / r30
            float r11 = r33 - r1
            float r11 = r11 - r15
            float r26 = r11 / r14
            float r27 = r1 / r22
            float r28 = r15 / r24
            float r29 = r26 * r3
            float r3 = r33 - r3
            float r3 = r3 - r14
            float r3 = r3 * r26
            float r14 = r27 * r21
            float r21 = r33 - r21
            float r21 = r21 - r22
            float r21 = r21 * r27
            float r22 = r28 * r23
            float r23 = r33 - r23
            float r23 = r23 - r24
            float r23 = r23 * r28
            float[] r12 = new float[r12]
            r12[r41] = r29
            r12[r10] = r11
            r12[r17] = r3
            r12[r18] = r14
            r12[r19] = r1
            r12[r20] = r21
            r12[r13] = r22
            r12[r16] = r15
            r12[r25] = r23
            r0.f4125i = r12
            goto L134
        L12b:
            r41 = r11
            r33 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.length
            if (r1 != r12) goto L267
            r0.f4125i = r3
        L134:
            float[] r1 = r0.f4125i
            float[] r1 = g1.k.f(r1)
            r0.f4126j = r1
            float r1 = g1.k.b(r9)
            float[] r3 = g1.e.f4068a
            float[] r3 = g1.e.f4069b
            float r3 = g1.k.b(r3)
            float r1 = r1 / r3
            r3 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1e4
            float[] r1 = g1.e.f4068a
            r11 = r9[r41]
            r12 = r1[r41]
            float r11 = r11 - r12
            r14 = r9[r10]
            r15 = r1[r10]
            float r14 = r14 - r15
            r16 = r9[r17]
            r21 = r1[r17]
            float r16 = r16 - r21
            r22 = r9[r18]
            r23 = r1[r18]
            float r22 = r22 - r23
            r24 = r9[r19]
            r25 = r1[r19]
            float r24 = r24 - r25
            r26 = r9[r20]
            r1 = r1[r20]
            float r26 = r26 - r1
            r34 = 0
            float[] r3 = new float[r13]
            r3[r41] = r11
            r3[r10] = r14
            r3[r17] = r16
            r3[r18] = r22
            r3[r19] = r24
            r3[r20] = r26
            r11 = r3[r41]
            r14 = r3[r10]
            float r16 = r12 - r25
            float r22 = r15 - r1
            float r22 = r22 * r11
            float r16 = r16 * r14
            float r22 = r22 - r16
            int r16 = (r22 > r34 ? 1 : (r22 == r34 ? 0 : -1))
            if (r16 < 0) goto L1e6
            float r16 = r12 - r21
            float r22 = r15 - r23
            float r16 = r16 * r14
            float r22 = r22 * r11
            float r16 = r16 - r22
            int r11 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r11 >= 0) goto L1a5
            goto L1e6
        L1a5:
            r11 = r3[r17]
            r14 = r3[r18]
            float r16 = r21 - r12
            float r17 = r23 - r15
            float r17 = r17 * r11
            float r16 = r16 * r14
            float r17 = r17 - r16
            int r16 = (r17 > r34 ? 1 : (r17 == r34 ? 0 : -1))
            if (r16 < 0) goto L1e6
            float r16 = r21 - r25
            float r17 = r23 - r1
            float r16 = r16 * r14
            float r17 = r17 * r11
            float r16 = r16 - r17
            int r11 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r11 >= 0) goto L1c6
            goto L1e6
        L1c6:
            r11 = r3[r19]
            r3 = r3[r20]
            float r14 = r25 - r21
            float r16 = r1 - r23
            float r16 = r16 * r11
            float r14 = r14 * r3
            float r16 = r16 - r14
            int r14 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r14 < 0) goto L1e6
            float r25 = r25 - r12
            float r1 = r1 - r15
            float r25 = r25 * r3
            float r1 = r1 * r11
            float r25 = r25 - r1
            int r1 = (r25 > r34 ? 1 : (r25 == r34 ? 0 : -1))
            if (r1 < 0) goto L1e6
            goto L1e8
        L1e4:
            r34 = 0
        L1e6:
            int r1 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
        L1e8:
            if (r8 != 0) goto L1ec
            goto L264
        L1ec:
            float[] r1 = g1.e.f4068a
            if (r9 != r1) goto L1f1
            goto L213
        L1f1:
            r3 = r41
        L1f3:
            if (r3 >= r13) goto L213
            r8 = r9[r3]
            r11 = r1[r3]
            int r8 = java.lang.Float.compare(r8, r11)
            if (r8 == 0) goto L210
            r8 = r9[r3]
            r11 = r1[r3]
            float r8 = r8 - r11
            float r8 = java.lang.Math.abs(r8)
            r11 = 981668463(0x3a83126f, float:0.001)
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 <= 0) goto L210
            goto L262
        L210:
            int r3 = r3 + 1
            goto L1f3
        L213:
            g1.t r1 = g1.k.f4104d
            boolean r1 = g1.k.d(r2, r1)
            if (r1 != 0) goto L21c
            goto L262
        L21c:
            int r1 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
            if (r1 != 0) goto L262
            int r1 = (r7 > r33 ? 1 : (r7 == r33 ? 0 : -1))
            if (r1 != 0) goto L262
            float[] r1 = g1.e.f4068a
            g1.r r1 = g1.e.f4072e
            r2 = 0
        L22a:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L264
            g1.j r6 = r1.f4127k
            double r7 = r4.c(r2)
            double r11 = r6.c(r2)
            double r7 = r7 - r11
            double r6 = java.lang.Math.abs(r7)
            r8 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L262
            g1.j r6 = r1.f4130n
            double r11 = r5.c(r2)
            double r6 = r6.c(r2)
            double r11 = r11 - r6
            double r6 = java.lang.Math.abs(r11)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L262
            r6 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r2 = r2 + r6
            goto L22a
        L262:
            r10 = r41
        L264:
            r0.f4133q = r10
            return
        L267:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r3.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Transform must have 9 entries! Has "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L27c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid range: min="
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = ", max="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "; min must be strictly < max"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // g1.c
    public final float a(int r1) {
            r0 = this;
            float r1 = r0.f4122f
            return r1
    }

    @Override // g1.c
    public final float b(int r1) {
            r0 = this;
            float r1 = r0.f4121e
            return r1
    }

    @Override // g1.c
    public final boolean c() {
            r1 = this;
            boolean r0 = r1.f4133q
            return r0
    }

    @Override // g1.c
    public final long d(float r5, float r6, float r7) {
            r4 = this;
            double r0 = (double) r5
            g1.n r5 = r4.f4132p
            double r0 = r5.c(r0)
            float r0 = (float) r0
            double r1 = (double) r6
            double r1 = r5.c(r1)
            float r6 = (float) r1
            double r1 = (double) r7
            double r1 = r5.c(r1)
            float r5 = (float) r1
            float[] r7 = r4.f4125i
            int r1 = r7.length
            r2 = 9
            if (r1 >= r2) goto L1e
            r5 = 0
            return r5
        L1e:
            r1 = 0
            r1 = r7[r1]
            float r1 = r1 * r0
            r2 = 3
            r2 = r7[r2]
            float r2 = r2 * r6
            float r2 = r2 + r1
            r1 = 6
            r1 = r7[r1]
            float r1 = r1 * r5
            float r1 = r1 + r2
            r2 = 1
            r2 = r7[r2]
            float r2 = r2 * r0
            r0 = 4
            r0 = r7[r0]
            float r0 = r0 * r6
            float r0 = r0 + r2
            r6 = 7
            r6 = r7[r6]
            float r6 = r6 * r5
            float r6 = r6 + r0
            int r5 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            r7 = 32
            long r0 = r0 << r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            long r5 = r5 | r0
            return r5
    }

    @Override // g1.c
    public final float e(float r4, float r5, float r6) {
            r3 = this;
            double r0 = (double) r4
            g1.n r4 = r3.f4132p
            double r0 = r4.c(r0)
            float r0 = (float) r0
            double r1 = (double) r5
            double r1 = r4.c(r1)
            float r5 = (float) r1
            double r1 = (double) r6
            double r1 = r4.c(r1)
            float r4 = (float) r1
            r6 = 2
            float[] r1 = r3.f4125i
            r6 = r1[r6]
            float r6 = r6 * r0
            r0 = 5
            r0 = r1[r0]
            float r0 = r0 * r5
            float r0 = r0 + r6
            r5 = 8
            r5 = r1[r5]
            float r5 = r5 * r4
            float r5 = r5 + r0
            return r5
    }

    @Override // g1.c
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L67
            java.lang.Class<g1.r> r2 = g1.r.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L67
        L10:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto L17
            return r1
        L17:
            g1.r r5 = (g1.r) r5
            float r2 = r5.f4121e
            float r3 = r4.f4121e
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L24
            return r1
        L24:
            float r2 = r5.f4122f
            float r3 = r4.f4122f
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L2f
            return r1
        L2f:
            g1.t r2 = r4.f4120d
            g1.t r3 = r5.f4120d
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L3a
            return r1
        L3a:
            float[] r2 = r4.f4124h
            float[] r3 = r5.f4124h
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L45
            return r1
        L45:
            g1.s r2 = r5.f4123g
            g1.s r3 = r4.f4123g
            if (r3 == 0) goto L50
            boolean r5 = gg.l.a(r3, r2)
            return r5
        L50:
            if (r2 != 0) goto L53
            return r0
        L53:
            g1.j r0 = r4.f4127k
            g1.j r2 = r5.f4127k
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L5e
            return r1
        L5e:
            g1.j r0 = r4.f4130n
            g1.j r5 = r5.f4130n
            boolean r5 = gg.l.a(r0, r5)
            return r5
        L67:
            return r1
    }

    @Override // g1.c
    public final long f(float r5, float r6, float r7, float r8, g1.c r9) {
            r4 = this;
            r0 = 0
            float[] r1 = r4.f4126j
            r0 = r1[r0]
            float r0 = r0 * r5
            r2 = 3
            r2 = r1[r2]
            float r2 = r2 * r6
            float r2 = r2 + r0
            r0 = 6
            r0 = r1[r0]
            float r0 = r0 * r7
            float r0 = r0 + r2
            r2 = 1
            r2 = r1[r2]
            float r2 = r2 * r5
            r3 = 4
            r3 = r1[r3]
            float r3 = r3 * r6
            float r3 = r3 + r2
            r2 = 7
            r2 = r1[r2]
            float r2 = r2 * r7
            float r2 = r2 + r3
            r3 = 2
            r3 = r1[r3]
            float r3 = r3 * r5
            r5 = 5
            r5 = r1[r5]
            float r5 = r5 * r6
            float r5 = r5 + r3
            r6 = 8
            r6 = r1[r6]
            float r6 = r6 * r7
            float r6 = r6 + r5
            double r0 = (double) r0
            g1.n r5 = r4.f4129m
            double r0 = r5.c(r0)
            float r7 = (float) r0
            double r0 = (double) r2
            double r0 = r5.c(r0)
            float r0 = (float) r0
            double r1 = (double) r6
            double r5 = r5.c(r1)
            float r5 = (float) r5
            long r5 = f1.c0.b(r7, r0, r5, r8, r9)
            return r5
    }

    @Override // g1.c
    public final int hashCode() {
            r5 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            g1.t r1 = r5.f4120d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            float[] r0 = r5.f4124h
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r5.f4121e
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 0
            if (r3 != 0) goto L22
            r1 = r4
            goto L26
        L22:
            int r1 = java.lang.Float.floatToIntBits(r1)
        L26:
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r5.f4122f
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L31
            r1 = r4
            goto L35
        L31:
            int r1 = java.lang.Float.floatToIntBits(r1)
        L35:
            int r0 = r0 + r1
            int r0 = r0 * 31
            g1.s r1 = r5.f4123g
            if (r1 == 0) goto L40
            int r4 = r1.hashCode()
        L40:
            int r0 = r0 + r4
            if (r1 != 0) goto L55
            int r0 = r0 * 31
            g1.j r1 = r5.f4127k
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            g1.j r0 = r5.f4130n
            int r0 = r0.hashCode()
            int r0 = r0 + r1
        L55:
            return r0
    }
}
