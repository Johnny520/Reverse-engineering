package mh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    void a(java.lang.Object r1, java.lang.String r2);

    void b();

    boolean c();

    boolean d();

    void e(java.lang.String r1, java.lang.Throwable r2);

    void f(java.lang.Integer r1, java.lang.Object r2);

    boolean g();

    java.lang.String getName();

    void h(java.lang.Object r1, java.lang.String r2);

    void i(java.lang.String r1, java.lang.Object... r2);

    boolean j();

    void k(java.lang.String r1, java.lang.Long r2);

    void l(java.lang.String r1);

    boolean m();

    void n(java.lang.Object r1, java.lang.String r2, java.lang.Object r3);

    void o(java.lang.String r1, java.lang.Object... r2);

    void p(java.lang.Object r1, java.lang.String r2, java.lang.Object r3);

    void q(java.lang.Object... r1);

    void r(java.lang.Object r1, java.lang.String r2);

    void s(java.lang.Object r1, java.lang.String r2, java.lang.Object r3);

    void t(java.lang.String r1, java.lang.Throwable r2);

    void u(java.lang.Exception r1);

    void v(java.lang.String r1);

    default boolean w(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L1c
            r0 = 2
            if (r3 == r0) goto L19
            r0 = 3
            if (r3 == r0) goto L16
            r0 = 4
            if (r3 == r0) goto L13
            r0 = 5
            if (r3 != r0) goto L11
            r0 = 0
            goto L1e
        L11:
            r3 = 0
            throw r3
        L13:
            r0 = 10
            goto L1e
        L16:
            r0 = 20
            goto L1e
        L19:
            r0 = 30
            goto L1e
        L1c:
            r0 = 40
        L1e:
            if (r0 == 0) goto L6d
            r1 = 10
            if (r0 == r1) goto L68
            r1 = 20
            if (r0 == r1) goto L63
            r1 = 30
            if (r0 == r1) goto L5e
            r1 = 40
            if (r0 != r1) goto L35
            boolean r3 = r2.g()
            return r3
        L35:
            r0 = 1
            if (r3 == r0) goto L53
            r0 = 2
            if (r3 == r0) goto L50
            r0 = 3
            if (r3 == r0) goto L4d
            r0 = 4
            if (r3 == r0) goto L4a
            r0 = 5
            if (r3 == r0) goto L47
            java.lang.String r3 = "null"
            goto L55
        L47:
            java.lang.String r3 = "TRACE"
            goto L55
        L4a:
            java.lang.String r3 = "DEBUG"
            goto L55
        L4d:
            java.lang.String r3 = "INFO"
            goto L55
        L50:
            java.lang.String r3 = "WARN"
            goto L55
        L53:
            java.lang.String r3 = "ERROR"
        L55:
            java.lang.String r0 = "] not recognized."
            java.lang.String r1 = "Level ["
            bsh.j.b(r3, r1, r0)
            r3 = 0
            return r3
        L5e:
            boolean r3 = r2.c()
            return r3
        L63:
            boolean r3 = r2.j()
            return r3
        L68:
            boolean r3 = r2.d()
            return r3
        L6d:
            boolean r3 = r2.m()
            return r3
    }

    void x(java.lang.Object r1, java.lang.String r2);

    void y(java.lang.Object r1, java.lang.String r2, java.lang.Object r3);

    void z(java.lang.Object... r1);
}
