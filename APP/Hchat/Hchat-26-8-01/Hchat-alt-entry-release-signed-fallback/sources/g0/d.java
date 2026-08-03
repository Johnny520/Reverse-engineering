package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i2.g f3975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m2.d f3976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.List f3981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g0.b f3982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u2.c f3984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i2.n0 f3985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public be.k f3986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u2.m f3987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i2.k0 f3988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3991q;

    public d(i2.g r1, i2.n0 r2, m2.d r3, int r4, boolean r5, int r6, int r7, java.util.List r8) {
            r0 = this;
            r0.<init>()
            r0.f3975a = r1
            r0.f3976b = r3
            r0.f3977c = r4
            r0.f3978d = r5
            r0.f3979e = r6
            r0.f3980f = r7
            r0.f3981g = r8
            long r3 = g0.a.f3963a
            r0.f3983i = r3
            r0.f3985k = r2
            r1 = -1
            r0.f3989o = r1
            r0.f3990p = r1
            return
    }

    public final int a(int r7, u2.m r8) {
            r6 = this;
            int r0 = r6.f3989o
            int r1 = r6.f3990p
            if (r7 != r0) goto La
            r2 = -1
            if (r0 == r2) goto La
            return r1
        La:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            long r0 = u2.b.a(r1, r7, r1, r0)
            int r2 = r6.f3980f
            r3 = 1
            if (r2 <= r3) goto L2e
            g0.b r2 = r6.f3982h
            i2.n0 r3 = r6.f3985k
            u2.c r4 = r6.f3984j
            r4.getClass()
            m2.d r5 = r6.f3976b
            g0.b r2 = be.h.y(r2, r8, r3, r4, r5)
            r6.f3982h = r2
            int r3 = r6.f3980f
            long r0 = r2.a(r3, r0)
        L2e:
            i2.o r8 = r6.b(r0, r8)
            float r8 = r8.f6372e
            int r8 = w.s.n(r8)
            int r0 = u2.a.i(r0)
            if (r8 >= r0) goto L3f
            r8 = r0
        L3f:
            r6.f3989o = r7
            r6.f3990p = r8
            return r8
    }

    public final i2.o b(long r7, u2.m r9) {
            r6 = this;
            be.k r1 = r6.e(r9)
            i2.o r0 = new i2.o
            boolean r9 = r6.f3978d
            int r2 = r6.f3977c
            float r3 = r1.c()
            long r2 = ac.p.q(r7, r9, r2, r3)
            boolean r7 = r6.f3978d
            int r5 = r6.f3977c
            int r8 = r6.f3979e
            r9 = 1
            if (r7 != 0) goto L28
            r7 = 2
            if (r5 != r7) goto L1f
            goto L26
        L1f:
            r7 = 4
            if (r5 != r7) goto L23
            goto L26
        L23:
            r7 = 5
            if (r5 != r7) goto L28
        L26:
            r4 = r9
            goto L2c
        L28:
            if (r8 >= r9) goto L2b
            goto L26
        L2b:
            r4 = r8
        L2c:
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public final boolean c(long r7, u2.m r9) {
            r6 = this;
            long r0 = r6.f3991q
            r2 = 2
            long r0 = r0 << r2
            r2 = 3
            long r0 = r0 | r2
            r6.f3991q = r0
            int r0 = r6.f3980f
            r1 = 1
            if (r0 <= r1) goto L25
            g0.b r0 = r6.f3982h
            i2.n0 r2 = r6.f3985k
            u2.c r3 = r6.f3984j
            r3.getClass()
            m2.d r4 = r6.f3976b
            g0.b r0 = be.h.y(r0, r9, r2, r3, r4)
            r6.f3982h = r0
            int r2 = r6.f3980f
            long r7 = r0.a(r2, r7)
        L25:
            i2.k0 r0 = r6.f3988n
            if (r0 != 0) goto L2a
            goto L8a
        L2a:
            i2.o r2 = r0.f6347b
            i2.j0 r0 = r0.f6346a
            be.k r3 = r2.f6368a
            boolean r3 = r3.a()
            if (r3 == 0) goto L37
            goto L8a
        L37:
            u2.m r3 = r0.f6341h
            long r4 = r0.f6343j
            if (r9 == r3) goto L3e
            goto L8a
        L3e:
            boolean r0 = u2.a.b(r7, r4)
            if (r0 == 0) goto L45
            goto L6b
        L45:
            int r0 = u2.a.h(r7)
            int r3 = u2.a.h(r4)
            if (r0 == r3) goto L50
            goto L8a
        L50:
            int r0 = u2.a.j(r7)
            int r3 = u2.a.j(r4)
            if (r0 == r3) goto L5b
            goto L8a
        L5b:
            int r0 = u2.a.g(r7)
            float r0 = (float) r0
            float r3 = r2.f6372e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L8a
            boolean r0 = r2.f6370c
            if (r0 == 0) goto L6b
            goto L8a
        L6b:
            i2.k0 r0 = r6.f3988n
            r0.getClass()
            i2.j0 r0 = r0.f6346a
            long r2 = r0.f6343j
            boolean r0 = u2.a.b(r7, r2)
            if (r0 == 0) goto L7c
            r7 = 0
            return r7
        L7c:
            i2.k0 r0 = r6.f3988n
            r0.getClass()
            i2.o r0 = r0.f6347b
            i2.k0 r7 = r6.f(r9, r7, r0)
            r6.f3988n = r7
            return r1
        L8a:
            i2.o r0 = r6.b(r7, r9)
            i2.k0 r7 = r6.f(r9, r7, r0)
            r6.f3988n = r7
            return r1
    }

    public final void d(u2.c r6) {
            r5 = this;
            u2.c r0 = r5.f3984j
            if (r6 == 0) goto L13
            int r1 = g0.a.f3964b
            float r1 = r6.d()
            float r2 = r6.q0()
            long r1 = g0.a.a(r1, r2)
            goto L15
        L13:
            long r1 = g0.a.f3963a
        L15:
            if (r0 != 0) goto L1c
            r5.f3984j = r6
            r5.f3983i = r1
            return
        L1c:
            if (r6 == 0) goto L25
            long r3 = r5.f3983i
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            return
        L25:
            r5.f3984j = r6
            r5.f3983i = r1
            long r0 = r5.f3991q
            r6 = 2
            long r0 = r0 << r6
            r2 = 1
            long r0 = r0 | r2
            r5.f3991q = r0
            r6 = 0
            r5.f3986l = r6
            r5.f3988n = r6
            r6 = -1
            r5.f3990p = r6
            r5.f3989o = r6
            return
    }

    public final be.k e(u2.m r9) {
            r8 = this;
            be.k r0 = r8.f3986l
            if (r0 == 0) goto Le
            u2.m r1 = r8.f3987m
            if (r9 != r1) goto Le
            boolean r1 = r0.a()
            if (r1 == 0) goto L2c
        Le:
            r8.f3987m = r9
            i2.g r3 = r8.f3975a
            i2.n0 r0 = r8.f3985k
            i2.n0 r4 = i2.e0.h(r0, r9)
            u2.c r6 = r8.f3984j
            r6.getClass()
            m2.d r7 = r8.f3976b
            java.util.List r9 = r8.f3981g
            if (r9 != 0) goto L25
            tf.t r9 = tf.t.f13167g
        L25:
            r5 = r9
            be.k r2 = new be.k
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r2
        L2c:
            r8.f3986l = r0
            return r0
    }

    public final i2.k0 f(u2.m r17, long r18, i2.o r20) {
            r16 = this;
            r0 = r16
            r1 = r20
            be.k r2 = r1.f6368a
            float r2 = r2.c()
            float r3 = r1.f6371d
            float r2 = java.lang.Math.min(r2, r3)
            i2.k0 r3 = new i2.k0
            i2.j0 r4 = new i2.j0
            i2.g r5 = r0.f3975a
            i2.n0 r6 = r0.f3985k
            java.util.List r7 = r0.f3981g
            if (r7 != 0) goto L1e
            tf.t r7 = tf.t.f13167g
        L1e:
            int r8 = r0.f3979e
            boolean r9 = r0.f3978d
            int r10 = r0.f3977c
            u2.c r11 = r0.f3984j
            r11.getClass()
            m2.d r13 = r0.f3976b
            r12 = r17
            r14 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r2 = w.s.n(r2)
            float r5 = r1.f6372e
            int r5 = w.s.n(r5)
            long r6 = (long) r2
            r2 = 32
            long r6 = r6 << r2
            long r8 = (long) r5
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r5 = r6 | r8
            long r5 = u2.b.d(r14, r5)
            r3.<init>(r4, r1, r5)
            return r3
    }

    public final void g(i2.g r5, i2.n0 r6, m2.d r7, int r8, boolean r9, int r10, int r11, java.util.List r12) {
            r4 = this;
            r4.f3975a = r5
            i2.n0 r5 = r4.f3985k
            boolean r5 = r6.b(r5)
            r4.f3985k = r6
            r6 = -1
            r0 = 0
            r1 = 2
            if (r5 != 0) goto L1c
            long r2 = r4.f3991q
            long r2 = r2 << r1
            r4.f3991q = r2
            r4.f3986l = r0
            r4.f3988n = r0
            r4.f3990p = r6
            r4.f3989o = r6
        L1c:
            r4.f3976b = r7
            r4.f3977c = r8
            r4.f3978d = r9
            r4.f3979e = r10
            r4.f3980f = r11
            r4.f3981g = r12
            long r7 = r4.f3991q
            long r7 = r7 << r1
            r9 = 2
            long r7 = r7 | r9
            r4.f3991q = r7
            r4.f3986l = r0
            r4.f3988n = r0
            r4.f3990p = r6
            r4.f3989o = r6
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiParagraphLayoutCache(textLayoutResult="
            r0.<init>(r1)
            i2.k0 r1 = r5.f3988n
            java.lang.String r2 = "null"
            if (r1 == 0) goto L10
            java.lang.String r1 = "<TextLayoutResult>"
            goto L11
        L10:
            r1 = r2
        L11:
            r0.append(r1)
            java.lang.String r1 = ", lastDensity="
            r0.append(r1)
            long r3 = r5.f3983i
            java.lang.String r1 = g0.a.b(r3)
            r0.append(r1)
            java.lang.String r1 = ", history="
            r0.append(r1)
            long r3 = r5.f3991q
            r0.append(r3)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            i2.k0 r1 = r5.f3988n
            if (r1 == 0) goto L41
            i2.j0 r1 = r1.f6346a
            if (r1 == 0) goto L41
            long r1 = r1.f6343j
            u2.a r3 = new u2.a
            r3.<init>(r1)
            r2 = r3
        L41:
            r0.append(r2)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
