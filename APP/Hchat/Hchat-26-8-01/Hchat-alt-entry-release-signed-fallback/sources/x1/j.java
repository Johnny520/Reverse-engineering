package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends y0.n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f20949u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y0.n f20950v;

    public j() {
            r1 = this;
            r1.<init>()
            int r0 = x1.j1.e(r1)
            r1.f20949u = r0
            return
    }

    @Override // y0.n
    public final void a1() {
            r2 = this;
            super.a1()
            y0.n r0 = r2.f20950v
        L5:
            if (r0 == 0) goto L16
            x1.i1 r1 = r2.f21826n
            r0.j1(r1)
            boolean r1 = r0.f21832t
            if (r1 != 0) goto L13
            r0.a1()
        L13:
            y0.n r0 = r0.f21824l
            goto L5
        L16:
            return
    }

    @Override // y0.n
    public final void b1() {
            r1 = this;
            y0.n r0 = r1.f20950v
        L2:
            if (r0 == 0) goto La
            r0.b1()
            y0.n r0 = r0.f21824l
            goto L2
        La:
            super.b1()
            return
    }

    @Override // y0.n
    public final void f1() {
            r1 = this;
            super.f1()
            y0.n r0 = r1.f20950v
        L5:
            if (r0 == 0) goto Ld
            r0.f1()
            y0.n r0 = r0.f21824l
            goto L5
        Ld:
            return
    }

    @Override // y0.n
    public final void g1() {
            r1 = this;
            y0.n r0 = r1.f20950v
        L2:
            if (r0 == 0) goto La
            r0.g1()
            y0.n r0 = r0.f21824l
            goto L2
        La:
            super.g1()
            return
    }

    @Override // y0.n
    public final void h1() {
            r1 = this;
            super.h1()
            y0.n r0 = r1.f20950v
        L5:
            if (r0 == 0) goto Ld
            r0.h1()
            y0.n r0 = r0.f21824l
            goto L5
        Ld:
            return
    }

    @Override // y0.n
    public final void i1(y0.n r2) {
            r1 = this;
            r1.f21819g = r2
            y0.n r0 = r1.f20950v
        L4:
            if (r0 == 0) goto Lc
            r0.i1(r2)
            y0.n r0 = r0.f21824l
            goto L4
        Lc:
            return
    }

    @Override // y0.n
    public final void j1(x1.i1 r2) {
            r1 = this;
            r1.f21826n = r2
            y0.n r0 = r1.f20950v
        L4:
            if (r0 == 0) goto Lc
            r0.j1(r2)
            y0.n r0 = r0.f21824l
            goto L4
        Lc:
            return
    }

    public final x1.i k1(x1.i r8) {
            r7 = this;
            r0 = r8
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            r1 = 0
            if (r0 == r8) goto L28
            boolean r2 = r8 instanceof y0.n
            if (r2 == 0) goto L10
            r2 = r8
            y0.n r2 = (y0.n) r2
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L15
            y0.n r1 = r2.f21823k
        L15:
            y0.n r2 = r7.f21819g
            if (r0 != r2) goto L21
            boolean r0 = gg.l.a(r1, r7)
            if (r0 == 0) goto L21
            goto La7
        L21:
            java.lang.String r8 = "Cannot delegate to an already delegated node"
            j8.o.A(r8)
            r8 = 0
            return r8
        L28:
            boolean r2 = r0.f21832t
            if (r2 == 0) goto L31
            java.lang.String r2 = "Cannot delegate to an already attached node"
            u1.a.b(r2)
        L31:
            y0.n r2 = r7.f21819g
            r0.i1(r2)
            int r2 = r7.f21821i
            int r3 = x1.j1.f(r0)
            r0.f21821i = r3
            int r4 = r7.f21821i
            r5 = r3 & 2
            if (r5 == 0) goto L65
            r4 = r4 & 2
            if (r4 == 0) goto L65
            boolean r4 = r7 instanceof x1.v
            if (r4 != 0) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "
            r4.<init>(r6)
            r4.append(r7)
            java.lang.String r6 = "\nDelegate Node: "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            u1.a.b(r4)
        L65:
            y0.n r4 = r7.f20950v
            r0.f21824l = r4
            r7.f20950v = r0
            r0.f21823k = r7
            int r4 = r7.f21821i
            r3 = r3 | r4
            r4 = 0
            r7.m1(r3, r4)
            boolean r3 = r7.f21832t
            if (r3 == 0) goto La7
            if (r5 == 0) goto L8e
            r2 = r2 & 2
            if (r2 == 0) goto L7f
            goto L8e
        L7f:
            x1.f0 r2 = x1.k.w(r7)
            x1.b1 r2 = r2.L
            y0.n r3 = r7.f21819g
            r3.j1(r1)
            r2.g()
            goto L93
        L8e:
            x1.i1 r1 = r7.f21826n
            r7.j1(r1)
        L93:
            r0.a1()
            r0.g1()
            boolean r1 = r0.f21832t
            if (r1 != 0) goto La2
            java.lang.String r1 = "autoInvalidateInsertedNode called on unattached node"
            u1.a.b(r1)
        La2:
            r1 = -1
            r2 = 1
            x1.j1.a(r0, r1, r2)
        La7:
            return r8
    }

    public final void l1(x1.i r7) {
            r6 = this;
            y0.n r0 = r6.f20950v
            r1 = 0
            r2 = r1
        L4:
            if (r0 == 0) goto L5e
            if (r0 != r7) goto L58
            boolean r7 = r0.f21832t
            r3 = 2
            if (r7 == 0) goto L20
            f.b0 r4 = x1.j1.f20968a
            if (r7 != 0) goto L16
            java.lang.String r7 = "autoInvalidateRemovedNode called on unattached node"
            u1.a.b(r7)
        L16:
            r7 = -1
            x1.j1.a(r0, r7, r3)
            r0.h1()
            r0.b1()
        L20:
            r0.i1(r0)
            r7 = 0
            r0.f21822j = r7
            y0.n r7 = r0.f21824l
            if (r2 != 0) goto L2d
            r6.f20950v = r7
            goto L2f
        L2d:
            r2.f21824l = r7
        L2f:
            r0.f21824l = r1
            r0.f21823k = r1
            int r7 = r6.f21821i
            int r0 = x1.j1.f(r6)
            r2 = 1
            r6.m1(r0, r2)
            boolean r2 = r6.f21832t
            if (r2 == 0) goto L57
            r7 = r7 & r3
            if (r7 == 0) goto L57
            r7 = r0 & 2
            if (r7 == 0) goto L49
            goto L57
        L49:
            x1.f0 r7 = x1.k.w(r6)
            x1.b1 r7 = r7.L
            y0.n r0 = r6.f21819g
            r0.j1(r1)
            r7.g()
        L57:
            return
        L58:
            y0.n r2 = r0.f21824l
            r5 = r2
            r2 = r0
            r0 = r5
            goto L4
        L5e:
            java.lang.String r0 = "Could not find delegate: "
            okio.a.p(r7, r0)
            return
    }

    public final void m1(int r4, boolean r5) {
            r3 = this;
            int r0 = r3.f21821i
            r3.f21821i = r4
            if (r0 == r4) goto L3c
            y0.n r0 = r3.f21819g
            if (r0 != r3) goto Lc
            r3.f21822j = r4
        Lc:
            boolean r1 = r3.f21832t
            if (r1 == 0) goto L3c
            r1 = r3
        L11:
            if (r1 == 0) goto L1d
            int r2 = r1.f21821i
            r4 = r4 | r2
            r1.f21821i = r4
            if (r1 == r0) goto L1d
            y0.n r1 = r1.f21823k
            goto L11
        L1d:
            if (r5 == 0) goto L27
            if (r1 != r0) goto L27
            int r4 = x1.j1.f(r0)
            r0.f21821i = r4
        L27:
            if (r1 == 0) goto L30
            y0.n r5 = r1.f21824l
            if (r5 == 0) goto L30
            int r5 = r5.f21822j
            goto L31
        L30:
            r5 = 0
        L31:
            r4 = r4 | r5
        L32:
            if (r1 == 0) goto L3c
            int r5 = r1.f21821i
            r4 = r4 | r5
            r1.f21822j = r4
            y0.n r1 = r1.f21823k
            goto L32
        L3c:
            return
    }
}
