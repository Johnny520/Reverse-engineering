package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends y0.n implements x1.w1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n.k f7069u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n.h f7070v;

    public static final java.lang.Object k1(k.t0 r4, yf.c r5) {
            boolean r0 = r5 instanceof k.q0
            if (r0 == 0) goto L13
            r0 = r5
            k.q0 r0 = (k.q0) r0
            int r1 = r0.f7043j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7043j = r1
            goto L18
        L13:
            k.q0 r0 = new k.q0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7041h
            int r1 = r0.f7043j
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            n.h r0 = r0.f7040g
            f8.i.I0(r5)
            goto L4a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L2e:
            f8.i.I0(r5)
            n.h r5 = r4.f7070v
            if (r5 != 0) goto L4c
            n.h r5 = new n.h
            r5.<init>()
            n.k r1 = r4.f7069u
            r0.f7040g = r5
            r0.f7043j = r2
            java.lang.Object r0 = r1.a(r5, r0)
            xf.a r1 = xf.a.f21579g
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.f7070v = r0
        L4c:
            sf.n r4 = sf.n.f12433a
            return r4
    }

    public static final java.lang.Object l1(k.t0 r4, yf.c r5) {
            boolean r0 = r5 instanceof k.r0
            if (r0 == 0) goto L13
            r0 = r5
            k.r0 r0 = (k.r0) r0
            int r1 = r0.f7057i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7057i = r1
            goto L18
        L13:
            k.r0 r0 = new k.r0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7055g
            int r1 = r0.f7057i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r5)
            goto L45
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L2c:
            f8.i.I0(r5)
            n.h r5 = r4.f7070v
            if (r5 == 0) goto L48
            n.i r1 = new n.i
            r1.<init>(r5)
            n.k r5 = r4.f7069u
            r0.f7057i = r2
            java.lang.Object r5 = r5.a(r1, r0)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L45
            return r0
        L45:
            r5 = 0
            r4.f7070v = r5
        L48:
            sf.n r4 = sf.n.f12433a
            return r4
    }

    @Override // x1.w1
    public final void P(s1.k r2, s1.l r3, long r4) {
            r1 = this;
            s1.l r4 = s1.l.f12275h
            if (r3 != r4) goto L29
            int r2 = r2.f12267f
            r3 = 4
            r4 = 3
            r5 = 0
            if (r2 != r3) goto L19
            qg.t r2 = r1.Y0()
            k.s0 r3 = new k.s0
            r0 = 0
            r3.<init>(r1, r5, r0)
            qg.v.q(r2, r5, r3, r4)
            return
        L19:
            r3 = 5
            if (r2 != r3) goto L29
            qg.t r2 = r1.Y0()
            k.s0 r3 = new k.s0
            r0 = 1
            r3.<init>(r1, r5, r0)
            qg.v.q(r2, r5, r3, r4)
        L29:
            return
    }

    @Override // x1.w1
    public final void b0() {
            r0 = this;
            r0.m1()
            return
    }

    @Override // y0.n
    public final void d1() {
            r0 = this;
            r0.m1()
            return
    }

    public final void m1() {
            r2 = this;
            n.h r0 = r2.f7070v
            if (r0 == 0) goto L11
            n.i r1 = new n.i
            r1.<init>(r0)
            n.k r0 = r2.f7069u
            r0.b(r1)
            r0 = 0
            r2.f7070v = r0
        L11:
            return
    }
}
