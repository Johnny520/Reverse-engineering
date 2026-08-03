package fc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mh.b f3881f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.StringBuilder f3882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f3883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3886e;

    static {
            java.lang.Class<fc.f> r0 = fc.f.class
            mh.b r0 = mh.d.b(r0)
            fc.f.f3881f = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.f3882a = r0
            java.lang.String r0 = ""
            r1.f3883b = r0
            r0 = 0
            r1.f3884c = r0
            java.lang.String r0 = "    "
            r1.f3885d = r0
            java.lang.String r0 = bc.g.Z
            r1.f3886e = r0
            return
    }

    public f(bc.g r2) {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.f3882a = r0
            java.lang.String r0 = ""
            r1.f3883b = r0
            r0 = 0
            r1.f3884c = r0
            r2.getClass()
            java.lang.String r0 = r2.G
            r1.f3885d = r0
            java.lang.String r2 = r2.F
            r1.f3886e = r2
            return
    }

    public fc.f a(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            r0.append(r2)
            return r1
    }

    public fc.f b(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            r0.append(r2)
            return r1
    }

    public void c(fc.b r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            java.lang.StringBuilder r2 = r2.f3882a
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            return
    }

    public /* bridge */ fc.f d(char r1) {
            r0 = this;
            fc.f r1 = r0.a(r1)
            return r1
    }

    public /* bridge */ fc.f e(java.lang.String r1) {
            r0 = this;
            fc.f r1 = r0.b(r1)
            return r1
    }

    public void f() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.f3882a
            java.lang.String r1 = r2.f3886e
            r0.append(r1)
            return
    }

    public void g() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.f3882a
            java.lang.String r1 = r2.f3883b
            r0.append(r1)
            return
    }

    public fc.f h(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.f3886e
            boolean r1 = r5.contains(r0)
            java.lang.StringBuilder r2 = r4.f3882a
            if (r1 == 0) goto L23
            java.lang.String r1 = r4.f3883b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r5 = r5.replace(r0, r1)
            r2.append(r5)
            return r4
        L23:
            r2.append(r5)
            return r4
    }

    public /* bridge */ fc.f i(java.lang.String r1) {
            r0 = this;
            fc.f r1 = r0.h(r1)
            return r1
    }

    public void j(hc.a r1) {
            r0 = this;
            return
    }

    public void k(hc.c r1) {
            r0 = this;
            return
    }

    public void l(ic.a r1) {
            r0 = this;
            return
    }

    public void m(int r1) {
            r0 = this;
            return
    }

    public final void n() {
            r2 = this;
            int r0 = r2.f3884c
            int r0 = r0 + (-1)
            r2.f3884c = r0
            if (r0 >= 0) goto L12
            mh.b r0 = fc.f.f3881f
            java.lang.String r1 = "Indent < 0"
            r0.v(r1)
            r0 = 0
            r2.f3884c = r0
        L12:
            r2.t()
            return
    }

    public final void o() {
            r1 = this;
            int r0 = r1.f3884c
            int r0 = r0 + 1
            r1.f3884c = r0
            r1.t()
            return
    }

    public final void p() {
            r0 = this;
            r0.f()
            r0.g()
            return
    }

    public final void q() {
            r1 = this;
            r1.p()
            r0 = 125(0x7d, float:1.75E-43)
            r1.a(r0)
            return
    }

    public final void r(java.lang.String r1) {
            r0 = this;
            r0.p()
            r0.b(r1)
            return
    }

    public final void s(int r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.p()
            return
        L6:
            r0.p()
            r0.m(r1)
            return
    }

    public final void t() {
            r4 = this;
            int r0 = r4.f3884c
            java.lang.String r1 = xe.s.f21577a
            r1 = 1
            if (r0 >= r1) goto La
            java.lang.String r0 = ""
            goto L27
        La:
            java.lang.String r2 = r4.f3885d
            if (r0 != r1) goto L10
            r0 = r2
            goto L27
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r2.length()
            int r3 = r3 * r0
            r1.<init>(r3)
            r3 = 0
        L1b:
            if (r3 >= r0) goto L23
            r1.append(r2)
            int r3 = r3 + 1
            goto L1b
        L23:
            java.lang.String r0 = r1.toString()
        L27:
            r4.f3883b = r0
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
