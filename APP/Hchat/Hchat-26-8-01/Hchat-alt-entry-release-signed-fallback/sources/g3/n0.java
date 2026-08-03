package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g3.r0 f4225b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.r0 f4226a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            g3.f0 r0 = new g3.f0
            r0.<init>()
            goto L25
        Lc:
            r1 = 30
            if (r0 < r1) goto L16
            g3.e0 r0 = new g3.e0
            r0.<init>()
            goto L25
        L16:
            r1 = 29
            if (r0 < r1) goto L20
            g3.d0 r0 = new g3.d0
            r0.<init>()
            goto L25
        L20:
            g3.c0 r0 = new g3.c0
            r0.<init>()
        L25:
            g3.r0 r0 = r0.b()
            g3.n0 r0 = r0.f4230a
            g3.r0 r0 = r0.a()
            g3.n0 r0 = r0.f4230a
            g3.r0 r0 = r0.b()
            g3.n0 r0 = r0.f4230a
            g3.r0 r0 = r0.c()
            g3.n0.f4225b = r0
            return
    }

    public n0(g3.r0 r1) {
            r0 = this;
            r0.<init>()
            r0.f4226a = r1
            return
    }

    public g3.r0 a() {
            r1 = this;
            g3.r0 r0 = r1.f4226a
            return r0
    }

    public g3.r0 b() {
            r1 = this;
            g3.r0 r0 = r1.f4226a
            return r0
    }

    public g3.r0 c() {
            r1 = this;
            g3.r0 r0 = r1.f4226a
            return r0
    }

    public void d(android.view.View r1) {
            r0 = this;
            return
    }

    public void e(g3.r0 r1) {
            r0 = this;
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof g3.n0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g3.n0 r5 = (g3.n0) r5
            boolean r1 = r4.p()
            boolean r3 = r5.p()
            if (r1 != r3) goto L4b
            boolean r1 = r4.o()
            boolean r3 = r5.o()
            if (r1 != r3) goto L4b
            b3.a r1 = r4.l()
            b3.a r3 = r5.l()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            b3.a r1 = r4.j()
            b3.a r3 = r5.j()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            g3.d r1 = r4.f()
            g3.d r5 = r5.f()
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L4b
            return r0
        L4b:
            return r2
    }

    public g3.d f() {
            r1 = this;
            r0 = 0
            return r0
    }

    public b3.a g(int r1) {
            r0 = this;
            b3.a r1 = b3.a.f444e
            return r1
    }

    public b3.a h(int r1) {
            r0 = this;
            r1 = r1 & 8
            if (r1 != 0) goto L7
            b3.a r1 = b3.a.f444e
            return r1
        L7:
            java.lang.String r1 = "Unable to query the maximum insets for IME"
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public int hashCode() {
            r5 = this;
            boolean r0 = r5.p()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.o()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            b3.a r2 = r5.l()
            b3.a r3 = r5.j()
            g3.d r4 = r5.f()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public b3.a i() {
            r1 = this;
            b3.a r0 = r1.l()
            return r0
    }

    public b3.a j() {
            r1 = this;
            b3.a r0 = b3.a.f444e
            return r0
    }

    public b3.a k() {
            r1 = this;
            b3.a r0 = r1.l()
            return r0
    }

    public b3.a l() {
            r1 = this;
            b3.a r0 = b3.a.f444e
            return r0
    }

    public b3.a m() {
            r1 = this;
            b3.a r0 = r1.l()
            return r0
    }

    public g3.r0 n(int r1, int r2, int r3, int r4) {
            r0 = this;
            g3.r0 r1 = g3.n0.f4225b
            return r1
    }

    public boolean o() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean p() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean q(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void r(b3.a[] r1) {
            r0 = this;
            return
    }

    public void s(b3.a r1) {
            r0 = this;
            return
    }

    public void t(g3.r0 r1) {
            r0 = this;
            return
    }

    public void u(b3.a r1) {
            r0 = this;
            return
    }

    public void v(int r1) {
            r0 = this;
            return
    }
}
