package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f3067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.graphics.RectF f3068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f3069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.graphics.Matrix f3070d;

    public j(android.graphics.Path r1) {
            r0 = this;
            r0.<init>()
            r0.f3067a = r1
            return
    }

    public static void a(f1.j r3, f1.j r4) {
            android.graphics.Path r3 = r3.f3067a
            boolean r0 = r4 instanceof f1.j
            if (r0 == 0) goto L18
            android.graphics.Path r4 = r4.f3067a
            r0 = 0
            int r2 = (int) r0
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r3.addPath(r4, r2, r0)
            return
        L18:
            java.lang.String r3 = "Unable to obtain android.graphics.Path"
            j8.o.w(r3)
            return
    }

    public static void b(f1.j r4, e1.c r5) {
            r4.getClass()
            float r0 = r5.f2296a
            float r1 = r5.f2299d
            float r2 = r5.f2298c
            float r5 = r5.f2297b
            boolean r3 = java.lang.Float.isNaN(r0)
            if (r3 != 0) goto L23
            boolean r3 = java.lang.Float.isNaN(r5)
            if (r3 != 0) goto L23
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L23
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 == 0) goto L28
        L23:
            java.lang.String r3 = "Invalid rectangle, make sure no value is NaN"
            f1.l.b(r3)
        L28:
            android.graphics.RectF r3 = r4.f3068b
            if (r3 != 0) goto L33
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r4.f3068b = r3
        L33:
            android.graphics.RectF r3 = r4.f3068b
            r3.getClass()
            r3.set(r0, r5, r2, r1)
            android.graphics.Path r5 = r4.f3067a
            android.graphics.RectF r4 = r4.f3068b
            r4.getClass()
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CCW
            r5.addRect(r4, r0)
            return
    }

    public static void c(f1.j r12, e1.d r13) {
            android.graphics.RectF r0 = r12.f3068b
            if (r0 != 0) goto Lb
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.f3068b = r0
        Lb:
            android.graphics.RectF r0 = r12.f3068b
            r0.getClass()
            float r1 = r13.f2300a
            long r2 = r13.f2307h
            long r4 = r13.f2306g
            long r6 = r13.f2305f
            long r8 = r13.f2304e
            float r10 = r13.f2301b
            float r11 = r13.f2302c
            float r13 = r13.f2303d
            r0.set(r1, r10, r11, r13)
            float[] r13 = r12.f3069c
            if (r13 != 0) goto L2d
            r13 = 8
            float[] r13 = new float[r13]
            r12.f3069c = r13
        L2d:
            float[] r13 = r12.f3069c
            r13.getClass()
            r0 = 32
            long r10 = r8 >> r0
            int r1 = (int) r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r10 = 0
            r13[r10] = r1
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r8 = 1
            r13[r8] = r1
            long r8 = r6 >> r0
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r8 = 2
            r13[r8] = r1
            long r6 = r6 & r10
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r6 = 3
            r13[r6] = r1
            long r6 = r4 >> r0
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r6 = 4
            r13[r6] = r1
            long r4 = r4 & r10
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4 = 5
            r13[r4] = r1
            long r0 = r2 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 6
            r13[r1] = r0
            long r0 = r2 & r10
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 7
            r13[r1] = r0
            android.graphics.Path r13 = r12.f3067a
            android.graphics.RectF r0 = r12.f3068b
            r0.getClass()
            float[] r12 = r12.f3069c
            r12.getClass()
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CCW
            r13.addRoundRect(r0, r12, r1)
            return
    }

    public final void d(float r8, float r9, float r10, float r11, float r12, float r13) {
            r7 = this;
            android.graphics.Path r0 = r7.f3067a
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            return
    }

    public final e1.c e() {
            r5 = this;
            android.graphics.RectF r0 = r5.f3068b
            if (r0 != 0) goto Lb
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.f3068b = r0
        Lb:
            android.graphics.RectF r0 = r5.f3068b
            r0.getClass()
            android.graphics.Path r1 = r5.f3067a
            r2 = 1
            r1.computeBounds(r0, r2)
            e1.c r1 = new e1.c
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.<init>(r2, r3, r4, r0)
            return r1
    }

    public final void f(float r2, float r3) {
            r1 = this;
            android.graphics.Path r0 = r1.f3067a
            r0.lineTo(r2, r3)
            return
    }

    public final boolean g(f1.j r3, f1.j r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L5
            android.graphics.Path$Op r5 = android.graphics.Path.Op.DIFFERENCE
            goto L19
        L5:
            r0 = 1
            if (r5 != r0) goto Lb
            android.graphics.Path$Op r5 = android.graphics.Path.Op.INTERSECT
            goto L19
        Lb:
            r0 = 4
            if (r5 != r0) goto L11
            android.graphics.Path$Op r5 = android.graphics.Path.Op.REVERSE_DIFFERENCE
            goto L19
        L11:
            r0 = 2
            if (r5 != r0) goto L17
            android.graphics.Path$Op r5 = android.graphics.Path.Op.UNION
            goto L19
        L17:
            android.graphics.Path$Op r5 = android.graphics.Path.Op.XOR
        L19:
            boolean r0 = r3 instanceof f1.j
            java.lang.String r1 = "Unable to obtain android.graphics.Path"
            if (r0 == 0) goto L33
            android.graphics.Path r3 = r3.f3067a
            boolean r0 = r4 instanceof f1.j
            if (r0 == 0) goto L2e
            android.graphics.Path r4 = r4.f3067a
            android.graphics.Path r0 = r2.f3067a
            boolean r3 = r0.op(r3, r4, r5)
            return r3
        L2e:
            j8.o.w(r1)
            r3 = 0
            return r3
        L33:
            j8.o.w(r1)
            r3 = 0
            return r3
    }

    public final void h() {
            r1 = this;
            android.graphics.Path r0 = r1.f3067a
            r0.reset()
            return
    }

    public final void i(long r5) {
            r4 = this;
            android.graphics.Matrix r0 = r4.f3070d
            if (r0 != 0) goto Lc
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.f3070d = r0
            goto Lf
        Lc:
            r0.reset()
        Lf:
            android.graphics.Matrix r0 = r4.f3070d
            r0.getClass()
            r1 = 32
            long r1 = r5 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.setTranslate(r1, r5)
            android.graphics.Matrix r5 = r4.f3070d
            r5.getClass()
            android.graphics.Path r6 = r4.f3067a
            r6.transform(r5)
            return
    }
}
