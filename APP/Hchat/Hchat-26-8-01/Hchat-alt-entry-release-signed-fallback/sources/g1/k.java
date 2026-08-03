package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1.t f4101a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1.t f4102b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1.t f4103c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1.t f4104d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f4105e = null;

    static {
            g1.t r0 = new g1.t
            r1 = 1050591279(0x3e9ec02f, float:0.31006)
            r2 = 1050795961(0x3ea1dfb9, float:0.31616)
            r0.<init>(r1, r2)
            g1.k.f4101a = r0
            g1.t r0 = new g1.t
            r1 = 1051786153(0x3eb0fba9, float:0.34567)
            r2 = 1052216656(0x3eb78d50, float:0.3585)
            r0.<init>(r1, r2)
            g1.k.f4102b = r0
            g1.t r0 = new g1.t
            r1 = 1050981182(0x3ea4b33e, float:0.32168)
            r2 = 1051517717(0x3eace315, float:0.33767)
            r0.<init>(r1, r2)
            g1.k.f4103c = r0
            g1.t r0 = new g1.t
            r1 = 1050680198(0x3ea01b86, float:0.31271)
            r2 = 1051227471(0x3ea8754f, float:0.32902)
            r0.<init>(r1, r2)
            g1.k.f4104d = r0
            r0 = 3
            float[] r0 = new float[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [1064752793, 1065353216, 1062420357} // fill-array
            g1.k.f4105e = r0
            return
    }

    public static g1.c a(g1.c r13) {
            long r0 = r13.f4064b
            long r2 = g1.b.f4058a
            boolean r0 = g1.b.a(r0, r2)
            if (r0 == 0) goto L43
            r0 = r13
            g1.r r0 = (g1.r) r0
            g1.t r1 = r0.f4120d
            g1.t r5 = g1.k.f4102b
            boolean r2 = d(r1, r5)
            if (r2 == 0) goto L18
            goto L43
        L18:
            float[] r13 = r5.a()
            g1.a r2 = g1.a.f4056b
            float[] r2 = r2.f4057a
            float[] r1 = r1.a()
            float[] r13 = c(r2, r1, r13)
            float[] r1 = r0.f4125i
            float[] r6 = g(r13, r1)
            g1.r r2 = new g1.r
            java.lang.String r3 = r0.f4063a
            float[] r4 = r0.f4124h
            g1.j r7 = r0.f4127k
            g1.j r8 = r0.f4130n
            float r9 = r0.f4121e
            float r10 = r0.f4122f
            g1.s r11 = r0.f4123g
            r12 = -1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L43:
            return r13
    }

    public static float b(float[] r8) {
            int r0 = r8.length
            r1 = 6
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            r0 = 0
            r0 = r8[r0]
            r1 = 1
            r1 = r8[r1]
            r3 = 2
            r3 = r8[r3]
            r4 = 3
            r4 = r8[r4]
            r5 = 4
            r5 = r8[r5]
            r6 = 5
            r8 = r8[r6]
            float r6 = r0 * r4
            float r7 = r1 * r5
            float r7 = r7 + r6
            float r6 = r3 * r8
            float r6 = r6 + r7
            float r4 = r4 * r5
            float r6 = r6 - r4
            float r1 = r1 * r3
            float r6 = r6 - r1
            float r0 = r0 * r8
            float r6 = r6 - r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r8
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L2f
            float r8 = -r6
            return r8
        L2f:
            return r6
    }

    public static final float[] c(float[] r20, float[] r21, float[] r22) {
            r0 = r20
            r1 = r22
            h(r20, r21)
            h(r0, r1)
            r2 = 0
            r3 = r1[r2]
            r4 = r21[r2]
            float r3 = r3 / r4
            r4 = 1
            r5 = r1[r4]
            r6 = r21[r4]
            float r5 = r5 / r6
            r6 = 2
            r1 = r1[r6]
            r7 = r21[r6]
            float r1 = r1 / r7
            r7 = 3
            float[] r8 = new float[r7]
            r8[r2] = r3
            r8[r4] = r5
            r8[r6] = r1
            float[] r1 = f(r0)
            r3 = r8[r2]
            r5 = r0[r2]
            float r5 = r5 * r3
            r9 = r8[r4]
            r10 = r0[r4]
            float r10 = r10 * r9
            r8 = r8[r6]
            r11 = r0[r6]
            float r11 = r11 * r8
            r12 = r0[r7]
            float r12 = r12 * r3
            r13 = 4
            r14 = r0[r13]
            float r14 = r14 * r9
            r15 = 5
            r16 = r0[r15]
            float r16 = r16 * r8
            r17 = 6
            r18 = r0[r17]
            float r3 = r3 * r18
            r18 = 7
            r19 = r0[r18]
            float r9 = r9 * r19
            r19 = 8
            r0 = r0[r19]
            float r8 = r8 * r0
            r0 = 9
            float[] r0 = new float[r0]
            r0[r2] = r5
            r0[r4] = r10
            r0[r6] = r11
            r0[r7] = r12
            r0[r13] = r14
            r0[r15] = r16
            r0[r17] = r3
            r0[r18] = r9
            r0[r19] = r8
            float[] r0 = g(r1, r0)
            return r0
    }

    public static final boolean d(g1.t r3, g1.t r4) {
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            float r1 = r3.f4141a
            float r2 = r4.f4141a
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r2 = 981668463(0x3a83126f, float:0.001)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L22
            float r3 = r3.f4142b
            float r4 = r4.f4142b
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 >= 0) goto L22
            return r0
        L22:
            r3 = 0
            return r3
    }

    public static final g1.h e(g1.c r4, g1.c r5) {
            if (r4 != r5) goto L9
            g1.f r5 = new g1.f
            r0 = 1
            r5.<init>(r4, r4, r0)
            return r5
        L9:
            long r0 = r4.f4064b
            long r2 = g1.b.f4058a
            boolean r0 = g1.b.a(r0, r2)
            if (r0 == 0) goto L25
            long r0 = r5.f4064b
            boolean r0 = g1.b.a(r0, r2)
            if (r0 == 0) goto L25
            g1.g r0 = new g1.g
            g1.r r4 = (g1.r) r4
            g1.r r5 = (g1.r) r5
            r0.<init>(r4, r5)
            return r0
        L25:
            g1.h r0 = new g1.h
            r1 = 0
            r0.<init>(r4, r5, r1)
            return r0
    }

    public static final float[] f(float[] r24) {
            r0 = r24
            r1 = 0
            r2 = r0[r1]
            r3 = 3
            r4 = r0[r3]
            r5 = 6
            r6 = r0[r5]
            r7 = 1
            r8 = r0[r7]
            r9 = 4
            r10 = r0[r9]
            r11 = 7
            r12 = r0[r11]
            r13 = 2
            r14 = r0[r13]
            r15 = 5
            r16 = r0[r15]
            r17 = 8
            r18 = r0[r17]
            float r19 = r10 * r18
            float r20 = r12 * r16
            float r19 = r19 - r20
            float r20 = r12 * r14
            float r21 = r8 * r18
            float r20 = r20 - r21
            float r21 = r8 * r16
            float r22 = r10 * r14
            float r21 = r21 - r22
            float r22 = r2 * r19
            float r23 = r4 * r20
            float r23 = r23 + r22
            float r22 = r6 * r21
            float r22 = r22 + r23
            int r0 = r0.length
            float[] r0 = new float[r0]
            float r19 = r19 / r22
            r0[r1] = r19
            float r20 = r20 / r22
            r0[r7] = r20
            float r21 = r21 / r22
            r0[r13] = r21
            float r1 = r6 * r16
            float r7 = r4 * r18
            float r1 = r1 - r7
            float r1 = r1 / r22
            r0[r3] = r1
            float r18 = r18 * r2
            float r1 = r6 * r14
            float r18 = r18 - r1
            float r18 = r18 / r22
            r0[r9] = r18
            float r14 = r14 * r4
            float r16 = r16 * r2
            float r14 = r14 - r16
            float r14 = r14 / r22
            r0[r15] = r14
            float r1 = r4 * r12
            float r3 = r6 * r10
            float r1 = r1 - r3
            float r1 = r1 / r22
            r0[r5] = r1
            float r6 = r6 * r8
            float r12 = r12 * r2
            float r6 = r6 - r12
            float r6 = r6 / r22
            r0[r11] = r6
            float r2 = r2 * r10
            float r4 = r4 * r8
            float r2 = r2 - r4
            float r2 = r2 / r22
            r0[r17] = r2
            return r0
    }

    public static final float[] g(float[] r21, float[] r22) {
            r0 = r21
            r1 = r22
            r2 = 9
            float[] r3 = new float[r2]
            int r4 = r0.length
            if (r4 >= r2) goto Lc
            goto Lf
        Lc:
            int r4 = r1.length
            if (r4 >= r2) goto L10
        Lf:
            return r3
        L10:
            r2 = 0
            r4 = r0[r2]
            r5 = r1[r2]
            float r4 = r4 * r5
            r5 = 3
            r6 = r0[r5]
            r7 = 1
            r8 = r1[r7]
            float r9 = r6 * r8
            float r9 = r9 + r4
            r4 = 6
            r10 = r0[r4]
            r11 = 2
            r12 = r1[r11]
            float r13 = r10 * r12
            float r13 = r13 + r9
            r3[r2] = r13
            r9 = r0[r7]
            r13 = r1[r2]
            float r9 = r9 * r13
            r14 = 4
            r15 = r0[r14]
            float r8 = r8 * r15
            float r8 = r8 + r9
            r9 = 7
            r16 = r0[r9]
            float r17 = r16 * r12
            float r17 = r17 + r8
            r3[r7] = r17
            r8 = r0[r11]
            float r8 = r8 * r13
            r13 = 5
            r17 = r0[r13]
            r18 = r1[r7]
            float r18 = r18 * r17
            float r18 = r18 + r8
            r8 = 8
            r19 = r0[r8]
            float r12 = r12 * r19
            float r12 = r12 + r18
            r3[r11] = r12
            r2 = r0[r2]
            r12 = r1[r5]
            float r12 = r12 * r2
            r18 = r1[r14]
            float r6 = r6 * r18
            float r6 = r6 + r12
            r12 = r1[r13]
            float r20 = r10 * r12
            float r20 = r20 + r6
            r3[r5] = r20
            r6 = r0[r7]
            r7 = r1[r5]
            float r20 = r6 * r7
            float r15 = r15 * r18
            float r15 = r15 + r20
            float r18 = r16 * r12
            float r18 = r18 + r15
            r3[r14] = r18
            r11 = r0[r11]
            float r7 = r7 * r11
            r15 = r1[r14]
            float r17 = r17 * r15
            float r17 = r17 + r7
            float r12 = r12 * r19
            float r12 = r12 + r17
            r3[r13] = r12
            r7 = r1[r4]
            float r2 = r2 * r7
            r5 = r0[r5]
            r7 = r1[r9]
            float r5 = r5 * r7
            float r5 = r5 + r2
            r2 = r1[r8]
            float r10 = r10 * r2
            float r10 = r10 + r5
            r3[r4] = r10
            r4 = r1[r4]
            float r6 = r6 * r4
            r5 = r0[r14]
            float r5 = r5 * r7
            float r5 = r5 + r6
            float r16 = r16 * r2
            float r16 = r16 + r5
            r3[r9] = r16
            float r11 = r11 * r4
            r0 = r0[r13]
            r1 = r1[r9]
            float r0 = r0 * r1
            float r0 = r0 + r11
            float r19 = r19 * r2
            float r19 = r19 + r0
            r3[r8] = r19
            return r3
    }

    public static final float[] h(float[] r8, float[] r9) {
            int r0 = r8.length
            r1 = 9
            if (r0 >= r1) goto L6
            goto La
        L6:
            int r0 = r9.length
            r1 = 3
            if (r0 >= r1) goto Lb
        La:
            return r9
        Lb:
            r0 = 0
            r2 = r9[r0]
            r3 = 1
            r4 = r9[r3]
            r5 = 2
            r6 = r9[r5]
            r7 = r8[r0]
            float r7 = r7 * r2
            r1 = r8[r1]
            float r1 = r1 * r4
            float r1 = r1 + r7
            r7 = 6
            r7 = r8[r7]
            float r7 = r7 * r6
            float r7 = r7 + r1
            r9[r0] = r7
            r0 = r8[r3]
            float r0 = r0 * r2
            r1 = 4
            r1 = r8[r1]
            float r1 = r1 * r4
            float r1 = r1 + r0
            r0 = 7
            r0 = r8[r0]
            float r0 = r0 * r6
            float r0 = r0 + r1
            r9[r3] = r0
            r0 = r8[r5]
            float r0 = r0 * r2
            r1 = 5
            r1 = r8[r1]
            float r1 = r1 * r4
            float r1 = r1 + r0
            r0 = 8
            r8 = r8[r0]
            float r8 = r8 * r6
            float r8 = r8 + r1
            r9[r5] = r8
            return r9
    }
}
