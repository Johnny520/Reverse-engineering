package nh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements mh.b, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.String f9461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public oh.e f9462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Queue f9463i;

    public final void A(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.String r4) {
            r0 = this;
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto Lc
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r0.C(r1, r2)
            return
        Lc:
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            r0.C(r1, r2)
            return
    }

    public final void B(int r3, java.lang.String r4, java.lang.Object[] r5) {
            r2 = this;
            int r4 = r5.length
            if (r4 != 0) goto L4
            goto L10
        L4:
            int r4 = r5.length
            int r4 = r4 + (-1)
            r4 = r5[r4]
            boolean r0 = r4 instanceof java.lang.Throwable
            if (r0 == 0) goto L10
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            goto L11
        L10:
            r4 = 0
        L11:
            if (r4 == 0) goto L2b
            int r4 = r5.length
            if (r4 == 0) goto L25
            int r4 = r5.length
            int r4 = r4 + (-1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            if (r4 <= 0) goto L21
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r0, r1, r4)
        L21:
            r2.C(r3, r0)
            return
        L25:
            java.lang.String r3 = "non-sensical empty or null argument array"
            j8.o.A(r3)
            return
        L2b:
            r2.C(r3, r5)
            return
    }

    public final void C(int r2, java.lang.Object[] r3) {
            r1 = this;
            nh.b r0 = new nh.b
            r0.<init>()
            java.lang.System.currentTimeMillis()
            r0.f9464a = r2
            oh.e r2 = r1.f9462h
            r0.f9465b = r2
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.getName()
            r0.f9466c = r3
            java.util.Queue r2 = r1.f9463i
            r2.add(r0)
            return
    }

    @Override // mh.b
    public final void a(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            r2 = 3
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.C(r2, r1)
            return
    }

    @Override // mh.b
    public final void b() {
            r2 = this;
            r0 = 3
            r1 = 0
            r2.C(r0, r1)
            return
    }

    @Override // mh.b
    public final boolean c() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // mh.b
    public final boolean d() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // mh.b
    public final void e(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r1 = 1
            r2 = 0
            r0.C(r1, r2)
            return
    }

    @Override // mh.b
    public final void f(java.lang.Integer r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = "Found resource shared library {}, pkgId: {}"
            r1 = 3
            r2.A(r1, r4, r3, r0)
            return
    }

    @Override // mh.b
    public final boolean g() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // mh.b
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f9461g
            return r0
    }

    @Override // mh.b
    public final void h(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            r2 = 2
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.C(r2, r1)
            return
    }

    @Override // mh.b
    public final void i(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 2
            r1.B(r0, r2, r3)
            return
    }

    @Override // mh.b
    public final boolean j() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // mh.b
    public final void k(java.lang.String r1, java.lang.Long r2) {
            r0 = this;
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r0.C(r1, r2)
            return
    }

    @Override // mh.b
    public final void l(java.lang.String r2) {
            r1 = this;
            r2 = 4
            r0 = 0
            r1.C(r2, r0)
            return
    }

    @Override // mh.b
    public final boolean m() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // mh.b
    public final void n(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            r0 = 1
            r1.A(r0, r2, r4, r3)
            return
    }

    @Override // mh.b
    public final void o(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 4
            r1.B(r0, r2, r3)
            return
    }

    @Override // mh.b
    public final void p(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            r0 = 5
            r1.A(r0, r2, r4, r3)
            return
    }

    @Override // mh.b
    public final void q(java.lang.Object... r3) {
            r2 = this;
            java.lang.String r0 = "Potential zip bomb attack detected, invalid sizes: compressed {}, uncompressed {}, name {}"
            r1 = 1
            r2.B(r1, r0, r3)
            return
    }

    @Override // mh.b
    public final void r(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.C(r2, r1)
            return
    }

    @Override // mh.b
    public final void s(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            r0 = 2
            r1.A(r0, r2, r4, r3)
            return
    }

    @Override // mh.b
    public final void t(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r1 = 4
            r2 = 0
            r0.C(r1, r2)
            return
    }

    @Override // mh.b
    public final void u(java.lang.Exception r2) {
            r1 = this;
            r2 = 2
            r0 = 0
            r1.C(r2, r0)
            return
    }

    @Override // mh.b
    public final void v(java.lang.String r2) {
            r1 = this;
            r2 = 2
            r0 = 0
            r1.C(r2, r0)
            return
    }

    @Override // mh.b
    public final void x(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            r2 = 4
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.C(r2, r1)
            return
    }

    @Override // mh.b
    public final void y(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            r0 = 4
            r1.A(r0, r2, r4, r3)
            return
    }

    @Override // mh.b
    public final void z(java.lang.Object... r3) {
            r2 = this;
            java.lang.String r0 = "Loaded classes: {}, methods: {}, instructions: {}"
            r1 = 3
            r2.B(r1, r0, r3)
            return
    }
}
