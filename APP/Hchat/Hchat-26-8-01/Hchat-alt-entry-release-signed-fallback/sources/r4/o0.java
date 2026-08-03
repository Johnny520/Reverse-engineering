package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4.p f11472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11475e;

    public o0(java.lang.String r2, r4.p r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L20
            if (r4 <= 0) goto L19
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 != 0) goto L19
            r1.f11471a = r2
            r1.f11472b = r3
            r1.f11473c = r4
            r2 = -1
            r1.f11474d = r2
            r2 = 0
            r1.f11475e = r2
            return
        L19:
            java.lang.String r2 = "invalid alignment"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L20:
            java.lang.String r2 = "file == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public abstract int a(r4.a0 r1);

    public final int b() {
            r1 = this;
            int r0 = r1.f11474d
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "fileOffset not set"
            bsh.j.g(r0)
            r0 = 0
            return r0
    }

    public abstract java.util.Collection c();

    public final void d() {
            r1 = this;
            r1.g()
            r1.e()
            r0 = 1
            r1.f11475e = r0
            return
    }

    public abstract void e();

    public final void f() {
            r1 = this;
            boolean r0 = r1.f11475e
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "not prepared"
            bsh.j.g(r0)
            return
    }

    public final void g() {
            r1 = this;
            boolean r0 = r1.f11475e
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "already prepared"
            bsh.j.g(r0)
            return
    }

    public abstract int h();

    public final void i(z4.d r5) {
            r4 = this;
            r4.f()
            int r0 = r4.f11473c
            r5.a(r0)
            int r0 = r5.f22538c
            int r1 = r4.f11474d
            if (r1 >= 0) goto L11
            r4.f11474d = r0
            goto L13
        L11:
            if (r1 != r0) goto L3e
        L13:
            boolean r1 = r5.d()
            if (r1 == 0) goto L3a
            java.lang.String r1 = "\n"
            r2 = 0
            java.lang.String r3 = r4.f11471a
            if (r3 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.b(r2, r0)
            goto L3a
        L35:
            if (r0 == 0) goto L3a
            r5.b(r2, r1)
        L3a:
            r4.j(r5)
            return
        L3e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "alignment mismatch: for "
            r1.<init>(r2)
            r1.append(r4)
            int r2 = r4.f11474d
            java.lang.String r3 = ", at "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = ", but expected "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
    }

    public abstract void j(z4.d r1);
}
