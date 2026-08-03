package od;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f9777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qd.j f9778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f9779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final od.a f9780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f9781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f9782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f9784n;

    public d(od.a r1, java.lang.String r2, java.util.List r3, qd.j r4) {
            r0 = this;
            r0.<init>()
            r0.f9777g = r2
            r0.f9784n = r2
            r0.f9780j = r1
            r0.f9779i = r3
            r0.f9778h = r4
            java.lang.String r2 = i(r2, r3, r4)
            r0.f9781k = r2
            java.lang.String r3 = r1.q()
            java.lang.String r4 = "."
            java.lang.String r3 = wb.en.h(r3, r4, r2)
            r0.f9782l = r3
            int r2 = r2.hashCode()
            qd.j r1 = r1.f9765g
            int r1 = r1.f10893a
            int r1 = r1 * 31
            int r1 = r1 + r2
            r0.f9783m = r1
            return
    }

    public static od.d b(ud.u r1, od.a r2, java.lang.String r3, java.util.List r4, qd.j r5) {
            od.d r0 = new od.d
            r0.<init>(r2, r3, r4, r5)
            be.k r1 = r1.f13746e
            od.d r1 = r1.o(r0)
            return r1
    }

    public static od.d c(ud.u r3, od.a r4, java.lang.String r5, mc.a r6) {
            java.util.List r0 = r6.c()
            me.a r1 = new me.a
            r2 = 6
            r1.<init>(r2)
            java.util.List r0 = xe.s.c(r0, r1)
            java.lang.String r6 = r6.e()
            qd.j r6 = qd.j.z(r6)
            od.d r3 = b(r3, r4, r5, r0, r6)
            return r3
    }

    public static od.d d(ud.u r6, jf.h r7) {
            be.k r0 = r6.f13746e
            int r1 = r7.f6894a
            if (r1 == 0) goto L20
            java.lang.Object r2 = r0.f815d
            java.util.HashMap r2 = (java.util.HashMap) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f815d     // Catch: java.lang.Throwable -> L1d
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L1d
            od.d r3 = (od.d) r3     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L20
            return r3
        L1d:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r6
        L20:
            r7.a()
            java.lang.String r2 = r7.f6896c
            qd.j r2 = qd.j.z(r2)
            od.a r6 = od.a.e(r6, r2)
            java.lang.String r2 = r7.f6897d
            qd.j r2 = qd.j.z(r2)
            java.util.List r3 = r7.f6898e
            me.a r4 = new me.a
            r5 = 6
            r4.<init>(r5)
            java.util.List r3 = xe.s.c(r3, r4)
            od.d r4 = new od.d
            java.lang.String r7 = r7.f6895b
            r4.<init>(r6, r7, r3, r2)
            od.d r6 = r0.o(r4)
            if (r1 == 0) goto L61
            java.lang.Object r7 = r0.f815d
            java.util.HashMap r7 = (java.util.HashMap) r7
            monitor-enter(r7)
            java.lang.Object r0 = r0.f815d     // Catch: java.lang.Throwable -> L5e
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L5e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L5e
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5e
            return r6
        L5e:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5e
            throw r6
        L61:
            return r6
    }

    public static java.lang.String i(java.lang.String r1, java.util.List r2, qd.j r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.util.Iterator r1 = r2.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            qd.j r2 = (qd.j) r2
            java.lang.String r2 = fd.j.b(r2)
            r0.append(r2)
            goto L11
        L25:
            r1 = 41
            r0.append(r1)
            if (r3 == 0) goto L33
            java.lang.String r1 = fd.j.b(r3)
            r0.append(r1)
        L33:
            java.lang.String r1 = r0.toString()
            return r1
    }

    public final int a(od.d r3) {
            r2 = this;
            od.a r0 = r2.f9780j
            od.a r1 = r3.f9780j
            int r0 = r0.b(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = r2.f9781k
            java.lang.String r3 = r3.f9781k
            int r3 = r0.compareTo(r3)
            return r3
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            od.d r1 = (od.d) r1
            int r1 = r0.a(r1)
            return r1
    }

    public final boolean e() {
            r2 = this;
            java.lang.String r0 = r2.f9777g
            java.lang.String r1 = "<clinit>"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof od.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.d r5 = (od.d) r5
            java.lang.String r1 = r4.f9781k
            java.lang.String r3 = r5.f9781k
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            od.a r1 = r4.f9780j
            od.a r5 = r5.f9780j
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final boolean f() {
            r2 = this;
            java.lang.String r0 = r2.f9777g
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final boolean g(od.d r3) {
            r2 = this;
            java.util.List r0 = r2.f9779i
            int r0 = r0.size()
            java.util.List r1 = r3.f9779i
            int r1 = r1.size()
            if (r0 != r1) goto L24
            java.lang.String r0 = r2.f9777g
            java.lang.String r1 = r3.f9777g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.f9781k
            java.lang.String r3 = r3.f9781k
            boolean r3 = java.util.Objects.equals(r0, r3)
            if (r3 != 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f9783m
            return r0
    }

    public final java.lang.String j(boolean r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto L5
            java.lang.String r2 = r1.f9784n
            goto L7
        L5:
            java.lang.String r2 = r1.f9777g
        L7:
            if (r3 == 0) goto Lc
            qd.j r3 = r1.f9778h
            goto Ld
        Lc:
            r3 = 0
        Ld:
            java.util.List r0 = r1.f9779i
            java.lang.String r2 = i(r2, r0, r3)
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            od.a r0 = r4.f9780j
            java.lang.String r0 = r0.f9768j
            java.util.List r1 = r4.f9779i
            java.lang.String r2 = ", "
            java.lang.String r1 = xe.s.j(r1, r2)
            qd.j r2 = r4.f9778h
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "."
            r3.append(r0)
            java.lang.String r0 = r4.f9777g
            r3.append(r0)
            java.lang.String r0 = "("
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "):"
            java.lang.String r0 = eh.a.r(r3, r0, r2)
            return r0
    }
}
