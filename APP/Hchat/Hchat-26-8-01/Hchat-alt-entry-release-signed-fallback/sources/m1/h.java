package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m1.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1.s f8587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.List f8589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f1.s f8592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f8597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f8598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h1.g f8602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f1.j f8603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f1.j f8604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f1.j f8605t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.lang.Object f8606u;

    public h() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f8588c = r0
            int r1 = m1.h0.f8607a
            tf.t r1 = tf.t.f13167g
            r2.f8589d = r1
            r2.f8590e = r0
            r1 = 0
            r2.f8593h = r1
            r2.f8594i = r1
            r1 = 1082130432(0x40800000, float:4.0)
            r2.f8595j = r1
            r2.f8597l = r0
            r0 = 1
            r2.f8599n = r0
            r2.f8600o = r0
            f1.j r0 = f1.l.a()
            r2.f8603r = r0
            r2.f8604s = r0
            sf.d r0 = sf.d.f12416h
            m1.g r1 = m1.g.f8574h
            sf.c r0 = be.h.G(r0, r1)
            r2.f8606u = r0
            return
    }

    @Override // m1.c0
    public final void a(h1.d r14) {
            r13 = this;
            boolean r0 = r13.f8599n
            if (r0 == 0) goto Lf
            java.util.List r0 = r13.f8589d
            f1.j r1 = r13.f8603r
            m1.b.d(r0, r1)
            r13.e()
            goto L16
        Lf:
            boolean r0 = r13.f8601p
            if (r0 == 0) goto L16
            r13.e()
        L16:
            r0 = 0
            r13.f8599n = r0
            r13.f8601p = r0
            f1.s r3 = r13.f8587b
            if (r3 == 0) goto L2b
            f1.j r2 = r13.f8604s
            float r4 = r13.f8588c
            r5 = 0
            r6 = 56
            r1 = r14
            h1.d.s0(r1, r2, r3, r4, r5, r6)
            goto L2c
        L2b:
            r1 = r14
        L2c:
            f1.s r9 = r13.f8592g
            if (r9 == 0) goto L59
            h1.g r14 = r13.f8602q
            boolean r2 = r13.f8600o
            if (r2 != 0) goto L3b
            if (r14 != 0) goto L39
            goto L3b
        L39:
            r11 = r14
            goto L4f
        L3b:
            h1.g r3 = new h1.g
            float r4 = r13.f8591f
            float r5 = r13.f8595j
            int r6 = r13.f8593h
            int r7 = r13.f8594i
            r8 = 16
            r3.<init>(r4, r5, r6, r7, r8)
            r13.f8602q = r3
            r13.f8600o = r0
            r11 = r3
        L4f:
            f1.j r8 = r13.f8604s
            float r10 = r13.f8590e
            r12 = 48
            r7 = r1
            h1.d.s0(r7, r8, r9, r10, r11, r12)
        L59:
            return
    }

    public final void e() {
            r8 = this;
            float r0 = r8.f8596k
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            f1.j r2 = r8.f8603r
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L14
            float r0 = r8.f8597l
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L14
            r8.f8604s = r2
            return
        L14:
            f1.j r0 = r8.f8604s
            boolean r0 = gg.l.a(r0, r2)
            r4 = 0
            if (r0 == 0) goto L24
            f1.j r0 = f1.l.a()
            r8.f8604s = r0
            goto L47
        L24:
            f1.j r0 = r8.f8604s
            android.graphics.Path r0 = r0.f3067a
            android.graphics.Path$FillType r0 = r0.getFillType()
            android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
            r6 = 1
            if (r0 != r5) goto L33
            r0 = r6
            goto L34
        L33:
            r0 = r4
        L34:
            f1.j r7 = r8.f8604s
            android.graphics.Path r7 = r7.f3067a
            r7.rewind()
            f1.j r7 = r8.f8604s
            android.graphics.Path r7 = r7.f3067a
            if (r0 != r6) goto L42
            goto L44
        L42:
            android.graphics.Path$FillType r5 = android.graphics.Path.FillType.WINDING
        L44:
            r7.setFillType(r5)
        L47:
            java.lang.Object r0 = r8.f8606u
            java.lang.Object r5 = r0.getValue()
            f1.k r5 = (f1.k) r5
            android.graphics.PathMeasure r5 = r5.f3072a
            if (r2 == 0) goto L56
            android.graphics.Path r2 = r2.f3067a
            goto L57
        L56:
            r2 = 0
        L57:
            r5.setPath(r2, r4)
            java.lang.Object r2 = r0.getValue()
            f1.k r2 = (f1.k) r2
            android.graphics.PathMeasure r2 = r2.f3072a
            float r2 = r2.getLength()
            float r4 = r8.f8596k
            float r5 = r8.f8598m
            float r4 = r4 + r5
            float r4 = r4 % r3
            float r4 = r4 * r2
            float r6 = r8.f8597l
            float r6 = r6 + r5
            float r6 = r6 % r3
            float r6 = r6 * r2
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto La4
            f1.j r3 = r8.f8605t
            if (r3 == 0) goto L7b
            goto L81
        L7b:
            f1.j r3 = f1.l.a()
            r8.f8605t = r3
        L81:
            r3.h()
            java.lang.Object r5 = r0.getValue()
            f1.k r5 = (f1.k) r5
            r5.a(r4, r2, r3)
            f1.j r2 = r8.f8604s
            f1.j.a(r2, r3)
            r3.h()
            java.lang.Object r0 = r0.getValue()
            f1.k r0 = (f1.k) r0
            r0.a(r1, r6, r3)
            f1.j r0 = r8.f8604s
            f1.j.a(r0, r3)
            return
        La4:
            java.lang.Object r0 = r0.getValue()
            f1.k r0 = (f1.k) r0
            f1.j r1 = r8.f8604s
            r0.a(r4, r6, r1)
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            f1.j r0 = r1.f8603r
            java.lang.String r0 = r0.toString()
            return r0
    }
}
