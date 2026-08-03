package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends y0.n implements x1.e2, x1.w1, x1.h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x1.l f12226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s1.a f12227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12228w;

    public f(s1.a r1, x1.l r2) {
            r0 = this;
            r0.<init>()
            r0.f12226u = r2
            r0.f12227v = r1
            return
    }

    @Override // x1.w1
    public final long H() {
            r5 = this;
            x1.l r0 = r5.f12226u
            if (r0 == 0) goto L29
            x1.f0 r1 = x1.k.w(r5)
            u2.c r1 = r1.E
            int r2 = x1.c2.f20854b
            float r2 = r0.f20977a
            int r2 = r1.G0(r2)
            float r3 = r0.f20978b
            int r3 = r1.G0(r3)
            float r4 = r0.f20979c
            int r4 = r1.G0(r4)
            float r0 = r0.f20980d
            int r0 = r1.G0(r0)
            long r0 = x1.d1.h(r2, r3, r4, r0)
            return r0
        L29:
            long r0 = x1.c2.f20853a
            return r0
    }

    @Override // x1.w1
    public final void P(s1.k r2, s1.l r3, long r4) {
            r1 = this;
            s1.l r4 = s1.l.f12275h
            if (r3 != r4) goto L31
            java.lang.Object r3 = r2.f12262a
            int r4 = r3.size()
            r5 = 0
        Lb:
            if (r5 >= r4) goto L31
            java.lang.Object r0 = r3.get(r5)
            s1.t r0 = (s1.t) r0
            int r0 = r0.f12299i
            boolean r0 = r1.n1(r0)
            if (r0 == 0) goto L2e
            int r2 = r2.f12267f
            r3 = 4
            if (r2 != r3) goto L27
            r2 = 1
            r1.f12228w = r2
            r1.m1()
            return
        L27:
            r3 = 5
            if (r2 != r3) goto L31
            r1.o1()
            return
        L2e:
            int r5 = r5 + 1
            goto Lb
        L31:
            return
    }

    @Override // x1.w1
    public final void b0() {
            r0 = this;
            r0.o1()
            return
    }

    @Override // y0.n
    public final void d1() {
            r0 = this;
            r0.o1()
            return
    }

    public final void k1() {
            r3 = this;
            gg.u r0 = new gg.u
            r0.<init>()
            s1.e r1 = new s1.e
            r2 = 1
            r1.<init>(r2)
            x1.k.A(r3, r1)
            java.lang.Object r0 = r0.f4564g
            s1.f r0 = (s1.f) r0
            if (r0 == 0) goto L18
            s1.a r0 = r0.f12227v
            if (r0 != 0) goto L1a
        L18:
            s1.a r0 = r3.f12227v
        L1a:
            r3.l1(r0)
            return
    }

    public abstract void l1(s1.q r1);

    public final void m1() {
            r2 = this;
            gg.q r0 = new gg.q
            r0.<init>()
            r1 = 1
            r0.f4560g = r1
            b1.e r1 = new b1.e
            r1.<init>(r0)
            x1.k.B(r2, r1)
            boolean r0 = r0.f4560g
            if (r0 == 0) goto L17
            r2.k1()
        L17:
            return
    }

    public abstract boolean n1(int r1);

    public final void o1() {
            r3 = this;
            boolean r0 = r3.f12228w
            if (r0 == 0) goto L27
            r0 = 0
            r3.f12228w = r0
            boolean r0 = r3.f21832t
            if (r0 == 0) goto L27
            gg.u r0 = new gg.u
            r0.<init>()
            r1.j r1 = new r1.j
            r2 = 1
            r1.<init>(r0, r2)
            x1.k.A(r3, r1)
            java.lang.Object r0 = r0.f4564g
            s1.f r0 = (s1.f) r0
            if (r0 == 0) goto L23
            r0.k1()
            return
        L23:
            r0 = 0
            r3.l1(r0)
        L27:
            return
    }
}
