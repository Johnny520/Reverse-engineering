package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc.k f750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.e f751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bc.l f752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.List f753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f754e;

    static {
            java.lang.Class<bc.l> r0 = bc.l.class
            mh.d.b(r0)
            return
    }

    public l(ud.e r2, bc.k r3) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f753d = r0
            r1.f750a = r3
            r1.f751b = r2
            r2 = 0
            r1.f752c = r2
            return
    }

    public l(ud.e r2, bc.l r3) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f753d = r0
            r0 = 0
            r1.f750a = r0
            r1.f751b = r2
            r1.f752c = r3
            return
    }

    public final bc.k a() {
            r1 = this;
            bc.l r0 = r1.f752c
            if (r0 == 0) goto L9
            bc.k r0 = r0.a()
            return r0
        L9:
            bc.k r0 = r1.f750a
            return r0
    }

    public final synchronized bc.d b() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f754e     // Catch: java.lang.Throwable -> L24
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r3)
            return r1
        L8:
            ud.e r0 = r3.f751b     // Catch: java.lang.Throwable -> L24
            int r0 = r0.f13702y     // Catch: java.lang.Throwable -> L24
            r2 = 4
            if (r0 == r2) goto L15
            r2 = 5
            if (r0 != r2) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            if (r0 == 0) goto L19
            goto L1f
        L19:
            ud.e r0 = r3.f751b     // Catch: java.lang.Throwable -> L24
            bc.d r1 = r0.V()     // Catch: java.lang.Throwable -> L24
        L1f:
            r3.c()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return r1
        L24:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    public final void c() {
            r6 = this;
            r0 = 1
            r6.f754e = r0
            bc.k r0 = r6.a()
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13699v
            int r1 = r1.size()
            if (r1 == 0) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13699v
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            ud.e r3 = (ud.e) r3
            md.a r4 = md.a.f8838s
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 != 0) goto L1e
            bc.l r3 = r0.b(r3)
            r3.c()
            r2.add(r3)
            goto L1e
        L3f:
            java.util.Collections.unmodifiableList(r2)
        L42:
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13700w
            int r1 = r1.size()
            if (r1 == 0) goto L73
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13700w
            java.util.Iterator r1 = r1.iterator()
        L59:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()
            ud.e r3 = (ud.e) r3
            bc.l r3 = r0.b(r3)
            r3.c()
            r2.add(r3)
            goto L59
        L70:
            java.util.Collections.unmodifiableList(r2)
        L73:
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13698u
            int r1 = r1.size()
            if (r1 == 0) goto Lbe
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13698u
            java.util.Iterator r1 = r1.iterator()
        L8a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r1.next()
            ud.g r3 = (ud.g) r3
            md.a r4 = md.a.f8838s
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 != 0) goto L8a
            monitor-enter(r0)
            bc.m r4 = r3.f13711p     // Catch: java.lang.Throwable -> Lb2
            if (r4 != 0) goto Lb4
            ud.e r4 = r3.f13706k     // Catch: java.lang.Throwable -> Lb2
            r0.b(r4)     // Catch: java.lang.Throwable -> Lb2
            bc.m r4 = new bc.m     // Catch: java.lang.Throwable -> Lb2
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb2
            r3.f13711p = r4     // Catch: java.lang.Throwable -> Lb2
            goto Lb4
        Lb2:
            r1 = move-exception
            goto Lb9
        Lb4:
            monitor-exit(r0)
            r2.add(r4)
            goto L8a
        Lb9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            throw r1
        Lbb:
            java.util.Collections.unmodifiableList(r2)
        Lbe:
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13697t
            int r1 = r1.size()
            if (r1 == 0) goto L106
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            ud.e r1 = r6.f751b
            java.util.List r1 = r1.f13697t
            java.util.Iterator r1 = r1.iterator()
        Ld5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lf3
            java.lang.Object r3 = r1.next()
            ud.r r3 = (ud.r) r3
            md.a r4 = md.a.f8838s
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 != 0) goto Ld5
            bc.n r3 = r0.c(r3)
            r2.add(r3)
            goto Ld5
        Lf3:
            ae.d r0 = new ae.d
            r1 = 7
            r0.<init>(r1)
            java.util.Comparator r0 = java.util.Comparator.comparing(r0)
            r2.sort(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            r6.f753d = r0
        L106:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L15
            boolean r0 = r2 instanceof bc.l
            if (r0 == 0) goto L13
            bc.l r2 = (bc.l) r2
            ud.e r2 = r2.f751b
            ud.e r0 = r1.f751b
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            ud.e r0 = r1.f751b
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            ud.e r0 = r1.f751b
            od.a r0 = r0.f13690m
            java.lang.String r0 = r0.f()
            return r0
    }
}
