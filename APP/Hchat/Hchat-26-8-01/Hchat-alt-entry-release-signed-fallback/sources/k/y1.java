package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends x1.j implements x1.h, x1.m1 {
    public n.k A;
    public boolean B;
    public k.k1 C;
    public m.h2 D;
    public x1.i E;
    public k.l1 F;
    public k.k1 G;
    public boolean H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m.i2 f7112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m.p1 f7113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7114y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m.p f7115z;

    @Override // x1.m1
    public final void C0() {
            r10 = this;
            i0.u r0 = k.m1.f7016a
            java.lang.Object r0 = x1.k.h(r10, r0)
            k.l1 r0 = (k.l1) r0
            k.l1 r1 = r10.F
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L3f
            r10.F = r0
            r0 = 0
            r10.G = r0
            x1.i r1 = r10.E
            if (r1 == 0) goto L1c
            r10.l1(r1)
        L1c:
            r10.E = r0
            r10.n1()
            m.h2 r2 = r10.D
            if (r2 == 0) goto L3f
            m.i2 r6 = r10.f7112w
            m.p1 r5 = r10.f7113x
            boolean r0 = r10.B
            if (r0 == 0) goto L31
            k.k1 r0 = r10.G
        L2f:
            r3 = r0
            goto L34
        L31:
            k.k1 r0 = r10.C
            goto L2f
        L34:
            boolean r8 = r10.f7114y
            boolean r9 = r10.H
            m.p r4 = r10.f7115z
            n.k r7 = r10.A
            r2.F1(r3, r4, r5, r6, r7, r8, r9)
        L3f:
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y0.n
    public final void c1() {
            r9 = this;
            boolean r0 = r9.o1()
            r9.H = r0
            r9.n1()
            m.h2 r0 = r9.D
            if (r0 != 0) goto L2e
            m.h2 r1 = new m.h2
            m.i2 r5 = r9.f7112w
            boolean r0 = r9.B
            if (r0 == 0) goto L19
            k.k1 r0 = r9.G
        L17:
            r2 = r0
            goto L1c
        L19:
            k.k1 r0 = r9.C
            goto L17
        L1c:
            m.p r3 = r9.f7115z
            m.p1 r4 = r9.f7113x
            boolean r7 = r9.f7114y
            boolean r8 = r9.H
            n.k r6 = r9.A
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.k1(r1)
            r9.D = r1
        L2e:
            return
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            x1.i r0 = r1.E
            if (r0 == 0) goto L7
            r1.l1(r0)
        L7:
            return
    }

    @Override // x1.i
    public final void k0() {
            r10 = this;
            boolean r0 = r10.o1()
            boolean r1 = r10.H
            if (r1 == r0) goto L23
            r10.H = r0
            m.i2 r6 = r10.f7112w
            m.p1 r5 = r10.f7113x
            boolean r8 = r10.B
            if (r8 == 0) goto L16
            k.k1 r0 = r10.G
        L14:
            r3 = r0
            goto L19
        L16:
            k.k1 r0 = r10.C
            goto L14
        L19:
            boolean r9 = r10.f7114y
            m.p r4 = r10.f7115z
            n.k r7 = r10.A
            r2 = r10
            r2.p1(r3, r4, r5, r6, r7, r8, r9)
        L23:
            return
    }

    public final void n1() {
            r2 = this;
            x1.i r0 = r2.E
            if (r0 != 0) goto L2f
            boolean r0 = r2.B
            if (r0 == 0) goto L11
            i.e0 r0 = new i.e0
            r1 = 5
            r0.<init>(r2, r1)
            x1.k.r(r2, r0)
        L11:
            boolean r0 = r2.B
            if (r0 == 0) goto L18
            k.k1 r0 = r2.G
            goto L1a
        L18:
            k.k1 r0 = r2.C
        L1a:
            if (r0 == 0) goto L3b
            x1.i r0 = r0.c()
            r1 = r0
            y0.n r1 = (y0.n) r1
            y0.n r1 = r1.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto L3b
            r2.k1(r0)
            r2.E = r0
            return
        L2f:
            r1 = r0
            y0.n r1 = (y0.n) r1
            y0.n r1 = r1.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto L3b
            r2.k1(r0)
        L3b:
            return
    }

    public final boolean o1() {
            r3 = this;
            boolean r0 = r3.f21832t
            if (r0 == 0) goto Lb
            x1.f0 r0 = x1.k.w(r3)
            u2.m r0 = r0.F
            goto Ld
        Lb:
            u2.m r0 = u2.m.f13354g
        Ld:
            m.p1 r1 = r3.f7113x
            u2.m r2 = u2.m.f13355h
            if (r0 != r2) goto L19
            m.p1 r0 = m.p1.f8324g
            if (r1 == r0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = 1
            return r0
    }

    public final void p1(k.k1 r9, m.p r10, m.p1 r11, m.i2 r12, n.k r13, boolean r14, boolean r15) {
            r8 = this;
            r8.f7112w = r12
            r8.f7113x = r11
            boolean r0 = r8.B
            r1 = 1
            r2 = 0
            if (r0 == r14) goto Le
            r8.B = r14
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            k.k1 r3 = r8.C
            boolean r3 = gg.l.a(r3, r9)
            if (r3 != 0) goto L1a
            r8.C = r9
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r0 != 0) goto L21
            if (r1 == 0) goto L2e
            if (r14 != 0) goto L2e
        L21:
            x1.i r9 = r8.E
            if (r9 == 0) goto L28
            r8.l1(r9)
        L28:
            r9 = 0
            r8.E = r9
            r8.n1()
        L2e:
            r8.f7114y = r15
            r8.f7115z = r10
            r8.A = r13
            boolean r7 = r8.o1()
            r8.H = r7
            m.h2 r0 = r8.D
            if (r0 == 0) goto L51
            boolean r9 = r8.B
            if (r9 == 0) goto L4b
            k.k1 r9 = r8.G
        L44:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r15
            goto L4e
        L4b:
            k.k1 r9 = r8.C
            goto L44
        L4e:
            r0.F1(r1, r2, r3, r4, r5, r6, r7)
        L51:
            return
    }
}
