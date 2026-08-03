package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f5756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f5757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f5760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f5761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f5762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f5763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f5764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f5765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f5767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f5768r;

    public r(int r19, float r20, float r21, float r22, float r23, float r24, float r25) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r0.<init>()
            r0.f5751a = r2
            r0.f5752b = r3
            r0.f5753c = r4
            r0.f5754d = r5
            r0.f5755e = r6
            r0.f5756f = r7
            float r8 = r6 - r4
            float r9 = r7 - r5
            r10 = 0
            r12 = 1
            if (r1 == r12) goto L33
            r13 = 4
            if (r1 == r13) goto L35
            r13 = 5
            if (r1 == r13) goto L2f
        L2d:
            r13 = 0
            goto L3a
        L2f:
            int r13 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r13 >= 0) goto L2d
        L33:
            r13 = r12
            goto L3a
        L35:
            int r13 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r13 <= 0) goto L2d
            goto L33
        L3a:
            if (r13 == 0) goto L3f
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L41
        L3f:
            r14 = 1065353216(0x3f800000, float:1.0)
        L41:
            r0.f5763m = r14
            float r15 = (float) r12
            float r2 = r3 - r2
            float r15 = r15 / r2
            r0.f5761k = r15
            r2 = 101(0x65, float:1.42E-43)
            float[] r2 = new float[r2]
            r0.f5760j = r2
            r3 = 3
            if (r1 != r3) goto L54
            r1 = r12
            goto L55
        L54:
            r1 = 0
        L55:
            if (r1 != 0) goto L6a
            float r3 = java.lang.Math.abs(r8)
            r16 = 981668463(0x3a83126f, float:0.001)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 < 0) goto L6a
            float r3 = java.lang.Math.abs(r9)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 >= 0) goto L6e
        L6a:
            r17 = r12
            goto L117
        L6e:
            float r8 = r8 * r14
            r0.f5764n = r8
            float r3 = -r14
            float r9 = r9 * r3
            r0.f5765o = r9
            if (r13 == 0) goto L79
            r3 = r6
            goto L7a
        L79:
            r3 = r4
        L7a:
            r0.f5767q = r3
            if (r13 == 0) goto L80
            r3 = r5
            goto L81
        L80:
            r3 = r7
        L81:
            r0.f5768r = r3
            float r3 = r6 - r4
            float r4 = r5 - r7
            float[] r5 = i.d.f5627i
            r6 = 90
            float r7 = (float) r6
            r14 = r4
            r9 = r10
            r13 = r9
            r8 = r12
        L90:
            r15 = 4636033603912859648(0x4056800000000000, double:90.0)
            r17 = r12
            r19 = r13
            double r12 = (double) r8
            double r12 = r12 * r15
            r16 = r10
            double r10 = (double) r6
            double r12 = r12 / r10
            r10 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r12 = r12 * r10
            float r10 = (float) r12
            double r10 = (double) r10
            double r12 = java.lang.Math.sin(r10)
            float r12 = (float) r12
            double r10 = java.lang.Math.cos(r10)
            float r10 = (float) r10
            float r12 = r12 * r3
            float r10 = r10 * r4
            float r11 = r12 - r19
            r13 = r7
            double r6 = (double) r11
            float r11 = r10 - r14
            double r14 = (double) r11
            double r6 = java.lang.Math.hypot(r6, r14)
            float r6 = (float) r6
            float r9 = r9 + r6
            r5[r8] = r9
            r6 = 90
            if (r8 == r6) goto Ld0
            int r8 = r8 + 1
            r14 = r10
            r7 = r13
            r10 = r16
            r13 = r12
            r12 = r17
            goto L90
        Ld0:
            r0.f5757g = r9
            r3 = r17
        Ld4:
            r4 = r5[r3]
            float r4 = r4 / r9
            r5[r3] = r4
            if (r3 == r6) goto Lde
            int r3 = r3 + 1
            goto Ld4
        Lde:
            int r3 = r2.length
            r4 = 0
        Le0:
            if (r4 >= r3) goto L10e
            float r6 = (float) r4
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r7
            r7 = 91
            r8 = 0
            int r7 = java.util.Arrays.binarySearch(r5, r8, r7, r6)
            if (r7 < 0) goto Lf4
            float r6 = (float) r7
            float r6 = r6 / r13
            r2[r4] = r6
            goto L10b
        Lf4:
            r9 = -1
            if (r7 != r9) goto Lfa
            r2[r4] = r16
            goto L10b
        Lfa:
            int r7 = -r7
            int r9 = r7 + (-2)
            int r7 = r7 + (-1)
            float r10 = (float) r9
            r9 = r5[r9]
            float r6 = r6 - r9
            r7 = r5[r7]
            float r7 = r7 - r9
            float r6 = r6 / r7
            float r6 = r6 + r10
            float r6 = r6 / r13
            r2[r4] = r6
        L10b:
            int r4 = r4 + 1
            goto Le0
        L10e:
            float r2 = r0.f5757g
            float r3 = r0.f5761k
            float r2 = r2 * r3
            r0.f5762l = r2
            r12 = r1
            goto L131
        L117:
            double r1 = (double) r9
            double r3 = (double) r8
            double r1 = java.lang.Math.hypot(r1, r3)
            float r1 = (float) r1
            r0.f5757g = r1
            float r1 = r1 * r15
            r0.f5762l = r1
            float r8 = r8 * r15
            r0.f5767q = r8
            float r9 = r9 * r15
            r0.f5768r = r9
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f5764n = r1
            r0.f5765o = r1
            r12 = r17
        L131:
            r0.f5766p = r12
            return
    }

    public final float a() {
            r6 = this;
            float r0 = r6.f5764n
            float r1 = r6.f5759i
            float r0 = r0 * r1
            float r1 = r6.f5765o
            float r1 = -r1
            float r2 = r6.f5758h
            float r1 = r1 * r2
            double r2 = (double) r0
            double r4 = (double) r1
            double r1 = java.lang.Math.hypot(r2, r4)
            float r1 = (float) r1
            float r2 = r6.f5762l
            float r2 = r2 / r1
            float r1 = r6.f5763m
            float r0 = r0 * r1
            float r0 = r0 * r2
            return r0
    }

    public final float b() {
            r6 = this;
            float r0 = r6.f5764n
            float r1 = r6.f5759i
            float r0 = r0 * r1
            float r1 = r6.f5765o
            float r1 = -r1
            float r2 = r6.f5758h
            float r1 = r1 * r2
            double r2 = (double) r0
            double r4 = (double) r1
            double r2 = java.lang.Math.hypot(r2, r4)
            float r0 = (float) r2
            float r2 = r6.f5762l
            float r2 = r2 / r0
            float r0 = r6.f5763m
            float r1 = r1 * r0
            float r1 = r1 * r2
            return r1
    }

    public final void c(float r5) {
            r4 = this;
            float r0 = r4.f5763m
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            float r0 = r4.f5752b
            float r0 = r0 - r5
            goto L10
        Lc:
            float r0 = r4.f5751a
            float r0 = r5 - r0
        L10:
            float r5 = r4.f5761k
            float r0 = r0 * r5
            r5 = 0
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 > 0) goto L19
            goto L32
        L19:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 < 0) goto L20
            goto L32
        L20:
            r5 = 100
            float r5 = (float) r5
            float r0 = r0 * r5
            int r5 = (int) r0
            float r1 = (float) r5
            float r0 = r0 - r1
            float[] r1 = r4.f5760j
            r2 = r1[r5]
            int r5 = r5 + 1
            r5 = r1[r5]
            float r5 = r5 - r2
            float r5 = r5 * r0
            float r5 = r5 + r2
        L32:
            r0 = 1070141403(0x3fc90fdb, float:1.5707964)
            float r5 = r5 * r0
            double r0 = (double) r5
            double r2 = java.lang.Math.sin(r0)
            float r5 = (float) r2
            r4.f5758h = r5
            double r0 = java.lang.Math.cos(r0)
            float r5 = (float) r0
            r4.f5759i = r5
            return
    }
}
