package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f.k0 f9960a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f.k0 f9961b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p.n f9962c = null;

    static {
            r0 = 1
            f.k0 r0 = c(r0)
            p.o.f9960a = r0
            r0 = 0
            f.k0 r0 = c(r0)
            p.o.f9961b = r0
            p.n r0 = p.n.f9952b
            p.o.f9962c = r0
            return
    }

    public static final void a(y0.o r6, i0.h0 r7, int r8) {
            r0 = -211209833(0xfffffffff3693197, float:-1.8475509E31)
            r7.b0(r0)
            r0 = r8 & 6
            r1 = 2
            if (r0 != 0) goto L16
            boolean r0 = r7.f(r6)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = r1
        L14:
            r0 = r0 | r8
            goto L17
        L16:
            r0 = r8
        L17:
            r2 = r0 & 3
            r3 = 1
            if (r2 == r1) goto L1e
            r1 = r3
            goto L1f
        L1e:
            r1 = 0
        L1f:
            r0 = r0 & r3
            boolean r0 = r7.S(r0, r1)
            if (r0 == 0) goto L6c
            long r0 = r7.T
            int r0 = java.lang.Long.hashCode(r0)
            y0.o r1 = y0.a.c(r7, r6)
            s0.h r2 = r7.l()
            x1.f r4 = x1.g.f20914f
            r4.getClass()
            x1.y r4 = x1.f.f20883b
            r7.d0()
            boolean r5 = r7.S
            if (r5 == 0) goto L46
            r7.k(r4)
            goto L49
        L46:
            r7.n0()
        L49:
            x1.e r4 = x1.f.f20886e
            p.n r5 = p.o.f9962c
            i0.r.A(r4, r7, r5)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r7, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r7)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r7, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r7, r0)
            r7.p(r3)
            goto L6f
        L6c:
            r7.V()
        L6f:
            i0.r1 r7 = r7.t()
            if (r7 == 0) goto L7c
            p.m r0 = new p.m
            r0.<init>(r6, r8)
            r7.f6035d = r0
        L7c:
            return
    }

    public static final void b(v1.a1 r7, v1.b1 r8, v1.m0 r9, u2.m r10, int r11, int r12, y0.g r13) {
            java.lang.Object r9 = r9.X()
            boolean r0 = r9 instanceof p.l
            if (r0 == 0) goto Lb
            p.l r9 = (p.l) r9
            goto Lc
        Lb:
            r9 = 0
        Lc:
            if (r9 == 0) goto L15
            y0.c r9 = r9.f9941u
            if (r9 != 0) goto L13
            goto L15
        L13:
            r0 = r9
            goto L16
        L15:
            r0 = r13
        L16:
            int r9 = r8.f13900g
            int r13 = r8.f13901h
            long r1 = (long) r9
            r9 = 32
            long r1 = r1 << r9
            long r3 = (long) r13
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            long r3 = (long) r11
            long r3 = r3 << r9
            long r11 = (long) r12
            long r11 = r11 & r5
            long r3 = r3 | r11
            r5 = r10
            long r9 = r0.a(r1, r3, r5)
            v1.a1.C(r7, r8, r9)
            return
    }

    public static final f.k0 c(boolean r3) {
            f.k0 r0 = new f.k0
            r1 = 9
            r0.<init>(r1)
            y0.g r1 = y0.b.f21792g
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21793h
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21794i
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21795j
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21796k
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21797l
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21798m
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21799n
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            y0.g r1 = y0.b.f21800o
            p.q r2 = new p.q
            r2.<init>(r1, r3)
            r0.m(r1, r2)
            return r0
    }

    public static final v1.n0 d(y0.g r1, boolean r2) {
            if (r2 == 0) goto L5
            f.k0 r0 = p.o.f9960a
            goto L7
        L5:
            f.k0 r0 = p.o.f9961b
        L7:
            java.lang.Object r0 = r0.g(r1)
            v1.n0 r0 = (v1.n0) r0
            if (r0 != 0) goto L14
            p.q r0 = new p.q
            r0.<init>(r1, r2)
        L14:
            return r0
    }
}
