package od;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qd.j f9765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f9766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f9767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.String f9768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public od.a f9769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g8.h f9770l;

    public a(ud.u r1, qd.j r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f9765g = r2
            r0.r(r1, r2, r3)
            return
    }

    public static od.a d(ud.u r0, java.lang.String r1) {
            qd.j r1 = qd.j.x(r1)
            od.a r0 = e(r0, r1)
            return r0
    }

    public static od.a e(ud.u r2, qd.j r3) {
            if (r3 == 0) goto L62
            boolean r0 = r3 instanceof qd.a
            if (r0 == 0) goto L9
            qd.e r3 = qd.j.f10877k
            goto L21
        L9:
            boolean r0 = r3.v()
            if (r0 == 0) goto L53
            boolean r0 = r3 instanceof qd.c
            if (r0 != 0) goto L53
            boolean r0 = r3.t()
            if (r0 == 0) goto L21
            java.lang.String r3 = r3.l()
            qd.j r3 = qd.j.x(r3)
        L21:
            be.k r0 = r2.f13746e
            java.lang.Object r0 = r0.f813b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r3)
            od.a r0 = (od.a) r0
            if (r0 == 0) goto L30
            return r0
        L30:
            bc.g r0 = r2.f13742a
            boolean r0 = r0.f727v
            od.a r1 = new od.a
            r1.<init>(r2, r3, r0)
            be.k r2 = r2.f13746e
            java.lang.Object r0 = r2.f813b
            java.util.HashMap r0 = (java.util.HashMap) r0
            monitor-enter(r0)
            java.lang.Object r2 = r2.f813b     // Catch: java.lang.Throwable -> L50
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L50
            java.lang.Object r2 = r2.put(r3, r1)     // Catch: java.lang.Throwable -> L50
            od.a r2 = (od.a) r2     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L4d
            goto L4e
        L4d:
            r1 = r2
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r1
        L50:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r2
        L53:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Not class type: "
            java.lang.String r2 = r3.concat(r2)
            ah.a.k(r2)
        L60:
            r2 = 0
            return r2
        L62:
            java.lang.String r2 = "Null class type"
            ah.a.k(r2)
            goto L60
    }

    public static java.lang.String p(java.lang.String r1, java.lang.String r2, od.a r3, boolean r4, boolean r5) {
            if (r3 == 0) goto L3e
            if (r5 == 0) goto L7
            r1 = 36
            goto L9
        L7:
            r1 = 46
        L9:
            if (r4 == 0) goto L22
            if (r5 == 0) goto L1d
            java.lang.String r4 = r3.j()
            java.lang.String r5 = r3.k()
            od.a r3 = r3.f9769k
            r0 = 1
            java.lang.String r3 = p(r4, r5, r3, r0, r0)
            goto L2b
        L1d:
            java.lang.String r3 = r3.f()
            goto L2b
        L22:
            if (r5 == 0) goto L29
            java.lang.String r3 = r3.q()
            goto L2b
        L29:
            java.lang.String r3 = r3.f9768j
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            return r1
        L3e:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L45
            return r2
        L45:
            java.lang.String r3 = "."
            java.lang.String r1 = wb.en.h(r1, r3, r2)
            return r1
    }

    public final void a(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.j()
            java.lang.String r1 = r2.f9766h
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 != 0) goto L19
            boolean r1 = xe.q.g(r3)
            if (r1 == 0) goto L13
            goto L19
        L13:
            g8.h r1 = new g8.h
            r1.<init>(r0, r3)
            goto L2c
        L19:
            java.lang.String r3 = r2.l()
            boolean r3 = java.util.Objects.equals(r3, r0)
            if (r3 == 0) goto L25
            r1 = 0
            goto L2c
        L25:
            g8.h r1 = new g8.h
            java.lang.String r3 = r2.f9766h
            r1.<init>(r0, r3)
        L2c:
            if (r1 == 0) goto L31
            r2.c(r1)
        L31:
            r2.f9770l = r1
            return
    }

    public final int b(od.a r2) {
            r1 = this;
            qd.j r0 = r1.f9765g
            java.lang.String r0 = r0.l()
            qd.j r2 = r2.f9765g
            java.lang.String r2 = r2.l()
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final void c(g8.h r6) {
            r5 = this;
            od.a r0 = r5.f9769k
            if (r0 != 0) goto L11
            java.lang.String r0 = r6.f4364c
            java.lang.String r1 = r6.f4363b
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.String r0 = p(r0, r1, r4, r2, r3)
            r6.f4365d = r0
        L11:
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            od.a r1 = (od.a) r1
            int r1 = r0.b(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof od.a
            if (r0 == 0) goto L13
            od.a r2 = (od.a) r2
            qd.j r2 = r2.f9765g
            qd.j r0 = r1.f9765g
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final java.lang.String f() {
            r5 = this;
            g8.h r0 = r5.f9770l
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            java.lang.String r0 = r0.f4365d
            if (r0 != 0) goto L18
            java.lang.String r0 = r5.j()
            java.lang.String r3 = r5.k()
            od.a r4 = r5.f9769k
            java.lang.String r0 = p(r0, r3, r4, r2, r1)
        L18:
            return r0
        L19:
            od.a r0 = r5.f9769k
            if (r0 == 0) goto L32
            boolean r0 = r0.n()
            if (r0 == 0) goto L32
            java.lang.String r0 = r5.j()
            java.lang.String r3 = r5.k()
            od.a r4 = r5.f9769k
            java.lang.String r0 = p(r0, r3, r4, r2, r1)
            return r0
        L32:
            java.lang.String r0 = r5.f9768j
            return r0
    }

    public final java.lang.String g() {
            r5 = this;
            java.lang.String r0 = r5.j()
            char r1 = java.io.File.separatorChar
            r2 = 46
            java.lang.String r0 = r0.replace(r2, r1)
            java.lang.String r3 = r5.i()
            r4 = 95
            java.lang.String r2 = r3.replace(r2, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public final int hashCode() {
            r1 = this;
            qd.j r0 = r1.f9765g
            int r0 = r0.f10893a
            return r0
    }

    public final java.lang.String i() {
            r3 = this;
            od.a r0 = r3.f9769k
            if (r0 != 0) goto L9
            java.lang.String r0 = r3.k()
            return r0
        L9:
            java.lang.String r0 = r0.i()
            java.lang.String r1 = r3.k()
            java.lang.String r2 = "."
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }

    public final java.lang.String j() {
            r1 = this;
            boolean r0 = r1.o()
            if (r0 == 0) goto Ld
            od.a r0 = r1.f9769k
            java.lang.String r0 = r0.j()
            return r0
        Ld:
            g8.h r0 = r1.f9770l
            if (r0 != 0) goto L16
            java.lang.String r0 = r1.l()
            return r0
        L16:
            java.lang.String r0 = r0.f4364c
            return r0
    }

    public final java.lang.String k() {
            r1 = this;
            g8.h r0 = r1.f9770l
            if (r0 != 0) goto L7
            java.lang.String r0 = r1.f9766h
            return r0
        L7:
            java.lang.String r0 = r0.f4363b
            return r0
    }

    public final java.lang.String l() {
            r1 = this;
            od.a r0 = r1.f9769k
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.l()
            return r0
        L9:
            java.lang.String r0 = r1.f9767i
            if (r0 == 0) goto Le
            return r0
        Le:
            java.lang.String r0 = "Package is null for not inner class"
            ah.a.k(r0)
            r0 = 0
            return r0
    }

    public final od.a m() {
            r1 = this;
            od.a r0 = r1.f9769k
            if (r0 == 0) goto Le
            od.a r0 = r0.m()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            od.a r0 = r1.f9769k
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final boolean n() {
            r3 = this;
            g8.h r0 = r3.f9770l
            r1 = 1
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.f4363b
            java.lang.String r2 = r3.f9766h
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L10
            return r1
        L10:
            od.a r0 = r3.f9769k
            if (r0 == 0) goto L1b
            boolean r0 = r0.n()
            if (r0 == 0) goto L1b
            return r1
        L1b:
            r0 = 0
            return r0
    }

    public final boolean o() {
            r1 = this;
            od.a r0 = r1.f9769k
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final java.lang.String q() {
            r5 = this;
            java.lang.String r0 = r5.f9767i
            java.lang.String r1 = r5.f9766h
            od.a r2 = r5.f9769k
            r3 = 0
            r4 = 1
            java.lang.String r0 = p(r0, r1, r2, r3, r4)
            return r0
    }

    public final void r(ud.u r7, qd.j r8, boolean r9) {
            r6 = this;
            java.lang.String r8 = r8.l()
            r0 = 46
            int r0 = r8.lastIndexOf(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L12
            java.lang.String r0 = ""
            goto L1c
        L12:
            java.lang.String r1 = r8.substring(r3, r0)
            int r0 = r0 + r2
            java.lang.String r8 = r8.substring(r0)
            r0 = r1
        L1c:
            r1 = 0
            if (r9 == 0) goto L54
            r9 = 36
            int r9 = r8.lastIndexOf(r9)
            if (r9 <= 0) goto L54
            int r4 = r8.length()
            int r4 = r4 - r2
            if (r9 == r4) goto L54
            java.lang.String r4 = r8.substring(r3, r9)
            java.lang.String r5 = "."
            java.lang.String r4 = wb.en.h(r0, r5, r4)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L42
            java.lang.String r4 = r8.substring(r3, r9)
        L42:
            r6.f9767i = r1
            qd.j r4 = qd.j.x(r4)
            od.a r7 = e(r7, r4)
            r6.f9769k = r7
            int r9 = r9 + r2
            java.lang.String r8 = r8.substring(r9)
            goto L55
        L54:
            r2 = r3
        L55:
            if (r2 != 0) goto L5b
            r6.f9767i = r0
            r6.f9769k = r1
        L5b:
            r6.f9766h = r8
            java.lang.String r7 = r6.f9767i
            od.a r9 = r6.f9769k
            java.lang.String r7 = p(r7, r8, r9, r3, r3)
            r6.f9768j = r7
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f9768j
            return r0
    }
}
