package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b8.k implements b8.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z7.b f509n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z7.b f510o = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z7.c f511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z7.c f513m;

    static {
            z7.b r0 = z7.c.f22583o
            b8.f.f509n = r0
            b8.f.f510o = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            z7.b r0 = b8.f.f509n
            r1.f511k = r0
            z7.b r0 = b8.f.f510o
            r1.f513m = r0
            return
    }

    @Override // b8.j
    public final int a() {
            r3 = this;
            z7.l r0 = new z7.l
            r0.<init>(r3)
            r1 = 0
        L6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r0.next()
            b8.j r2 = (b8.j) r2
            int r2 = r2.a()
            int r1 = r1 + r2
            goto L6
        L18:
            return r1
    }

    @Override // b8.b
    public final int b() {
            r3 = this;
            b8.j r0 = r3.d()
            b8.k r0 = (b8.k) r0
            r0.getClass()
            ae.d r1 = new ae.d
            r2 = 2
            r1.<init>(r2)
            z7.p r2 = new z7.p
            r2.<init>(r0, r1)
            r0 = 0
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            b8.j r1 = (b8.j) r1
            if (r1 != r3) goto L24
            goto L2b
        L24:
            boolean r1 = r1 instanceof b8.f
            if (r1 == 0) goto L15
            int r0 = r0 + 1
            goto L15
        L2b:
            return r0
    }

    @Override // b8.b
    public final int e() {
            r2 = this;
            int r0 = r2.f()
            int r1 = r2.a()
            int r1 = r1 + r0
            if (r1 == 0) goto Ld
            int r1 = r1 + (-1)
        Ld:
            return r1
    }

    @Override // b8.b
    public final int f() {
            r3 = this;
            b8.j r0 = r3.d()
            b8.k r0 = (b8.k) r0
            r0.getClass()
            ae.d r1 = new ae.d
            r2 = 2
            r1.<init>(r2)
            z7.p r2 = new z7.p
            r2.<init>(r0, r1)
            r0 = 0
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r2.next()
            b8.j r1 = (b8.j) r1
            if (r1 != r3) goto L24
            goto L2a
        L24:
            int r1 = r1.g()
            int r0 = r0 + r1
            goto L15
        L2a:
            return r0
    }

    @Override // b8.b
    public final java.lang.String getTagName() {
            r1 = this;
            java.lang.String r0 = r1.f512l
            return r0
    }

    @Override // b8.b
    public final java.lang.String j() {
            r7 = this;
            z7.c r0 = r7.f511k
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
            r3 = r1
            goto L32
        Lc:
            b8.d[] r3 = new b8.d[r0]
            r4 = r2
        Lf:
            if (r4 >= r0) goto L1e
            z7.c r5 = r7.f511k
            java.lang.Object[] r5 = r5.f22584g
            r5 = r5[r4]
            b8.d r5 = (b8.d) r5
            r3[r4] = r5
            int r4 = r4 + 1
            goto Lf
        L1e:
            r4 = 1
            if (r0 == r4) goto L32
            b8.c r5 = new b8.c
            r6 = 0
            r5.<init>(r6)
            j8.f r6 = new j8.f
            r6.<init>(r3, r0, r5)
            r6.f6780a = r2
            int r0 = r0 - r4
            r6.u(r2, r0)
        L32:
            if (r3 != 0) goto L35
            return r1
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.length
        L3b:
            if (r2 >= r1) goto L62
            r4 = r3[r2]
            java.lang.String r5 = r4.f506h
            java.lang.String r6 = "raw_style_tag_attribute"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L58
            r5 = 59
            r0.append(r5)
            java.lang.String r5 = r4.f506h
            r0.append(r5)
            r5 = 61
            r0.append(r5)
        L58:
            java.lang.String r4 = r4.n()
            r0.append(r4)
            int r2 = r2 + 1
            goto L3b
        L62:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // b8.j
    public final void k(java.io.StringWriter r5, boolean r6) {
            r4 = this;
            r0 = 60
            r5.append(r0)
            java.lang.String r0 = r4.f512l
            r5.append(r0)
            if (r6 == 0) goto Lf
            r0 = 32
            goto L11
        Lf:
            r0 = 59
        L11:
            z7.l r1 = new z7.l
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r3 = 3
            r2.<init>(r4, r3)
            r1.<init>(r2)
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            r5.append(r0)
            java.lang.Object r2 = r1.next()
            b8.d r2 = (b8.d) r2
            r2.k(r5, r6)
            goto L1c
        L2f:
            z7.l r0 = new z7.l
            r0.<init>(r4)
            r1 = 0
        L35:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4d
            if (r1 != 0) goto L42
            java.lang.String r1 = ">"
            r5.append(r1)
        L42:
            java.lang.Object r1 = r0.next()
            b8.j r1 = (b8.j) r1
            r1.k(r5, r6)
            r1 = 1
            goto L35
        L4d:
            if (r1 == 0) goto L5f
            java.lang.String r6 = "</"
            r5.append(r6)
            java.lang.String r6 = r4.f512l
            r5.append(r6)
            r6 = 62
            r5.append(r6)
            return
        L5f:
            java.lang.String r6 = " />"
            r5.append(r6)
            return
    }

    @Override // b8.b
    public final b8.f l() {
            r0 = this;
            return r0
    }

    @Override // b8.k
    public final b8.f n() {
            r1 = this;
            b8.f r0 = new b8.f
            r0.<init>()
            r1.m(r0)
            return r0
    }

    @Override // b8.k
    public final b8.h o() {
            r1 = this;
            b8.h r0 = new b8.h
            r0.<init>()
            r1.m(r0)
            return r0
    }

    public final void p(b8.d r3) {
            r2 = this;
            z7.c r0 = r2.f511k
            z7.b r1 = b8.f.f509n
            if (r0 != r1) goto Le
            z7.c r0 = new z7.c
            r1 = 0
            r0.<init>(r1)
            r2.f511k = r0
        Le:
            z7.c r0 = r2.f511k
            r0.add(r3)
            if (r2 == r3) goto L17
            r3.f518g = r2
        L17:
            return
    }

    public final void q() {
            r3 = this;
            z7.c r0 = r3.f511k
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
        La:
            z7.c r1 = r3.f511k
            int r1 = r1.size()
            z7.c r2 = r3.f511k
            if (r0 >= r1) goto L26
            java.lang.Object[] r1 = r2.f22584g
            r1 = r1[r0]
            b8.d r1 = (b8.d) r1
            if (r1 == 0) goto L20
            r2 = 0
            r1.f518g = r2
            goto L23
        L20:
            r1.getClass()
        L23:
            int r0 = r0 + 1
            goto La
        L26:
            r2.clear()
            z7.c r0 = r3.f511k
            r0.m()
            return
    }

    public final b8.f r() {
            r2 = this;
            b8.j r0 = r2.f518g
            boolean r1 = r0 instanceof b8.f
            if (r1 == 0) goto L9
            b8.f r0 = (b8.f) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final b8.i s(java.lang.String r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            goto L2d
        L4:
            z7.c r1 = r5.f513m
            int r1 = r1.size()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L22
            z7.c r3 = r5.f513m
            java.lang.Object[] r3 = r3.f22584g
            r3 = r3[r2]
            b8.i r3 = (b8.i) r3
            r3.getClass()
            boolean r4 = r6.equals(r0)
            if (r4 == 0) goto L1f
            return r3
        L1f:
            int r2 = r2 + 1
            goto Lb
        L22:
            b8.f r1 = r5.r()
            if (r1 == 0) goto L2d
            b8.i r6 = r1.s(r6)
            return r6
        L2d:
            return r0
    }

    public final void t(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = b8.l.a(r3)
            r2.f512l = r0
            r0 = 0
            if (r3 != 0) goto La
            goto L17
        La:
            r1 = 58
            int r1 = r3.indexOf(r1)
            if (r1 <= 0) goto L17
            r0 = 0
            java.lang.String r0 = r3.substring(r0, r1)
        L17:
            if (r0 != 0) goto L1a
            return
        L1a:
            r2.s(r0)
            java.lang.String r3 = "Namespace not found for prefix: "
            java.lang.String r3 = r3.concat(r0)
            j8.o.t(r3)
            return
    }

    @Override // b8.j
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            int r1 = r3.f()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r1 = r3.e()
            r0.append(r1)
            java.lang.String r1 = "] "
            r0.append(r1)
            java.lang.String r1 = r3.f512l
            java.lang.String r2 = r3.j()
            if (r2 != 0) goto L28
            goto L2c
        L28:
            java.lang.String r1 = bc.e.i(r1, r2)
        L2c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void u(java.lang.Appendable r4) {
            r3 = this;
            z7.l r0 = new z7.l
            r0.<init>(r3)
        L5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            b8.j r1 = (b8.j) r1
            boolean r2 = r1 instanceof b8.h
            if (r2 == 0) goto L20
            b8.h r1 = (b8.h) r1
            java.lang.String r1 = r1.f517h
            r2 = r4
            java.io.StringWriter r2 = (java.io.StringWriter) r2
            r2.append(r1)
            goto L5
        L20:
            boolean r2 = r1 instanceof b8.f
            if (r2 == 0) goto L5
            b8.f r1 = (b8.f) r1
            r1.u(r4)
            goto L5
        L2a:
            return
    }
}
