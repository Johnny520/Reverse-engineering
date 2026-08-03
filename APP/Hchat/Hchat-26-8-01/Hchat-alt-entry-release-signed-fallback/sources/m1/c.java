package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m1.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f8506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f8507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.util.List f8510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f1.j f8512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fg.l f8513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1.f f8514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f8515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f8516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f8518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f8519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f8521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f8522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8523s;

    public c() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f8507c = r0
            r0 = 1
            r3.f8508d = r0
            long r1 = f1.w.f3131g
            r3.f8509e = r1
            int r1 = m1.h0.f8607a
            tf.t r1 = tf.t.f13167g
            r3.f8510f = r1
            r3.f8511g = r0
            b1.f r1 = new b1.f
            r2 = 14
            r1.<init>(r3, r2)
            r3.f8514j = r1
            java.lang.String r1 = ""
            r3.f8515k = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.f8519o = r1
            r3.f8520p = r1
            r3.f8523s = r0
            return
    }

    @Override // m1.c0
    public final void a(h1.d r24) {
            r23 = this;
            r1 = r23
            boolean r0 = r1.f8523s
            r2 = 0
            if (r0 == 0) goto Le5
            float[] r0 = r1.f8506b
            if (r0 != 0) goto L12
            float[] r0 = f1.i0.a()
            r1.f8506b = r0
            goto L15
        L12:
            f1.i0.d(r0)
        L15:
            float r3 = r1.f8521q
            float r4 = r1.f8517m
            float r3 = r3 + r4
            float r4 = r1.f8522r
            float r5 = r1.f8518n
            float r4 = r4 + r5
            f1.i0.f(r0, r3, r4)
            float r3 = r1.f8516l
            int r4 = r0.length
            r5 = 1
            r6 = 7
            r7 = 3
            r8 = 6
            r9 = 2
            r10 = 5
            r11 = 4
            r12 = 16
            if (r4 >= r12) goto L31
            goto L8c
        L31:
            double r3 = (double) r3
            r13 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r3 = r3 * r13
            double r13 = java.lang.Math.sin(r3)
            float r13 = (float) r13
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            r4 = r0[r2]
            r14 = r0[r11]
            float r15 = r3 * r4
            float r16 = r13 * r14
            float r16 = r16 + r15
            float r15 = -r13
            float r4 = r4 * r15
            float r14 = r14 * r3
            float r14 = r14 + r4
            r4 = r0[r5]
            r17 = r0[r10]
            float r18 = r3 * r4
            float r19 = r13 * r17
            float r19 = r19 + r18
            float r4 = r4 * r15
            float r17 = r17 * r3
            float r17 = r17 + r4
            r4 = r0[r9]
            r18 = r0[r8]
            float r20 = r3 * r4
            float r21 = r13 * r18
            float r21 = r21 + r20
            float r4 = r4 * r15
            float r18 = r18 * r3
            float r18 = r18 + r4
            r4 = r0[r7]
            r20 = r0[r6]
            float r22 = r3 * r4
            float r13 = r13 * r20
            float r13 = r13 + r22
            float r15 = r15 * r4
            float r3 = r3 * r20
            float r3 = r3 + r15
            r0[r2] = r16
            r0[r5] = r19
            r0[r9] = r21
            r0[r7] = r13
            r0[r11] = r14
            r0[r10] = r17
            r0[r8] = r18
            r0[r6] = r3
        L8c:
            float r3 = r1.f8519o
            float r4 = r1.f8520p
            int r13 = r0.length
            if (r13 >= r12) goto L94
            goto Lda
        L94:
            r12 = r0[r2]
            float r12 = r12 * r3
            r0[r2] = r12
            r12 = r0[r5]
            float r12 = r12 * r3
            r0[r5] = r12
            r5 = r0[r9]
            float r5 = r5 * r3
            r0[r9] = r5
            r5 = r0[r7]
            float r5 = r5 * r3
            r0[r7] = r5
            r3 = r0[r11]
            float r3 = r3 * r4
            r0[r11] = r3
            r3 = r0[r10]
            float r3 = r3 * r4
            r0[r10] = r3
            r3 = r0[r8]
            float r3 = r3 * r4
            r0[r8] = r3
            r3 = r0[r6]
            float r3 = r3 * r4
            r0[r6] = r3
            r3 = 8
            r4 = r0[r3]
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            r0[r3] = r4
            r3 = 9
            r4 = r0[r3]
            float r4 = r4 * r5
            r0[r3] = r4
            r3 = 10
            r4 = r0[r3]
            float r4 = r4 * r5
            r0[r3] = r4
            r3 = 11
            r4 = r0[r3]
            float r4 = r4 * r5
            r0[r3] = r4
        Lda:
            float r3 = r1.f8517m
            float r3 = -r3
            float r4 = r1.f8518n
            float r4 = -r4
            f1.i0.f(r0, r3, r4)
            r1.f8523s = r2
        Le5:
            boolean r0 = r1.f8511g
            if (r0 == 0) goto L102
            java.util.List r0 = r1.f8510f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L100
            f1.j r0 = r1.f8512h
            if (r0 != 0) goto Lfb
            f1.j r0 = f1.l.a()
            r1.f8512h = r0
        Lfb:
            java.util.List r3 = r1.f8510f
            m1.b.d(r3, r0)
        L100:
            r1.f8511g = r2
        L102:
            b5.c r3 = r24.z0()
            long r4 = r3.v()
            f1.u r0 = r3.p()
            r0.e()
            java.lang.Object r0 = r3.f469a     // Catch: java.lang.Throwable -> L14d
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0     // Catch: java.lang.Throwable -> L14d
            java.lang.Object r0 = r0.f310h     // Catch: java.lang.Throwable -> L14d
            b5.c r0 = (b5.c) r0     // Catch: java.lang.Throwable -> L14d
            float[] r6 = r1.f8506b     // Catch: java.lang.Throwable -> L14d
            if (r6 == 0) goto L124
            f1.u r7 = r0.p()     // Catch: java.lang.Throwable -> L14d
            r7.h(r6)     // Catch: java.lang.Throwable -> L14d
        L124:
            f1.j r6 = r1.f8512h     // Catch: java.lang.Throwable -> L14d
            java.util.List r7 = r1.f8510f     // Catch: java.lang.Throwable -> L14d
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L14d
            if (r7 != 0) goto L137
            if (r6 == 0) goto L137
            f1.u r0 = r0.p()     // Catch: java.lang.Throwable -> L14d
            r0.d(r6)     // Catch: java.lang.Throwable -> L14d
        L137:
            java.util.ArrayList r0 = r1.f8507c     // Catch: java.lang.Throwable -> L14d
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L14d
        L13d:
            if (r2 >= r6) goto L14f
            java.lang.Object r7 = r0.get(r2)     // Catch: java.lang.Throwable -> L14d
            m1.c0 r7 = (m1.c0) r7     // Catch: java.lang.Throwable -> L14d
            r8 = r24
            r7.a(r8)     // Catch: java.lang.Throwable -> L14d
            int r2 = r2 + 1
            goto L13d
        L14d:
            r0 = move-exception
            goto L15a
        L14f:
            f1.u r0 = r3.p()
            r0.p()
            r3.U(r4)
            return
        L15a:
            f1.u r2 = r3.p()
            r2.p()
            r3.U(r4)
            throw r0
    }

    @Override // m1.c0
    public final fg.l b() {
            r1 = this;
            fg.l r0 = r1.f8513i
            return r0
    }

    @Override // m1.c0
    public final void d(b1.f r1) {
            r0 = this;
            r0.f8513i = r1
            return
    }

    public final void e(int r3, m1.c0 r4) {
            r2 = this;
            java.util.ArrayList r0 = r2.f8507c
            int r1 = r0.size()
            if (r3 >= r1) goto Lc
            r0.set(r3, r4)
            goto Lf
        Lc:
            r0.add(r4)
        Lf:
            r2.g(r4)
            b1.f r3 = r2.f8514j
            r4.d(r3)
            r2.c()
            return
    }

    public final void f(long r5) {
            r4 = this;
            boolean r0 = r4.f8508d
            if (r0 != 0) goto L5
            goto L42
        L5:
            r0 = 16
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L42
            long r2 = r4.f8509e
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L14
            r4.f8509e = r5
            return
        L14:
            int r0 = m1.h0.f8607a
            float r0 = f1.w.h(r2)
            float r1 = f1.w.h(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            float r0 = f1.w.g(r2)
            float r1 = f1.w.g(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            float r0 = f1.w.e(r2)
            float r5 = f1.w.e(r5)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L3b
            goto L42
        L3b:
            r5 = 0
            r4.f8508d = r5
            long r5 = f1.w.f3131g
            r4.f8509e = r5
        L42:
            return
    }

    public final void g(m1.c0 r5) {
            r4 = this;
            boolean r0 = r5 instanceof m1.h
            r1 = 0
            if (r0 == 0) goto L3e
            m1.h r5 = (m1.h) r5
            f1.s r0 = r5.f8587b
            boolean r2 = r4.f8508d
            if (r2 != 0) goto Le
            goto L22
        Le:
            if (r0 == 0) goto L22
            boolean r2 = r0 instanceof f1.t0
            if (r2 == 0) goto L1c
            f1.t0 r0 = (f1.t0) r0
            long r2 = r0.f3121a
            r4.f(r2)
            goto L22
        L1c:
            r4.f8508d = r1
            long r2 = f1.w.f3131g
            r4.f8509e = r2
        L22:
            f1.s r5 = r5.f8592g
            boolean r0 = r4.f8508d
            if (r0 != 0) goto L29
            goto L58
        L29:
            if (r5 == 0) goto L58
            boolean r0 = r5 instanceof f1.t0
            if (r0 == 0) goto L37
            f1.t0 r5 = (f1.t0) r5
            long r0 = r5.f3121a
            r4.f(r0)
            return
        L37:
            r4.f8508d = r1
            long r0 = f1.w.f3131g
            r4.f8509e = r0
            return
        L3e:
            boolean r0 = r5 instanceof m1.c
            if (r0 == 0) goto L58
            m1.c r5 = (m1.c) r5
            boolean r0 = r5.f8508d
            if (r0 == 0) goto L52
            boolean r0 = r4.f8508d
            if (r0 == 0) goto L52
            long r0 = r5.f8509e
            r4.f(r0)
            return
        L52:
            r4.f8508d = r1
            long r0 = f1.w.f3131g
            r4.f8509e = r0
        L58:
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VGroup: "
            r0.<init>(r1)
            java.lang.String r1 = r6.f8515k
            r0.append(r1)
            java.util.ArrayList r1 = r6.f8507c
            int r2 = r1.size()
            r3 = 0
        L13:
            if (r3 >= r2) goto L2f
            java.lang.Object r4 = r1.get(r3)
            m1.c0 r4 = (m1.c0) r4
            java.lang.String r5 = "\t"
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = "\n"
            r0.append(r4)
            int r3 = r3 + 1
            goto L13
        L2f:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
