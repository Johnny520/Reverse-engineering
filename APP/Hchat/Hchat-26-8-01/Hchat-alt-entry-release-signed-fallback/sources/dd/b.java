package dd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mh.b f2202b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fc.e f2203c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f2204a;

    static {
            java.lang.Class<dd.b> r0 = dd.b.class
            mh.b r0 = mh.d.b(r0)
            dd.b.f2202b = r0
            fc.e r0 = new fc.e
            java.lang.String r1 = ""
            r0.<init>(r1)
            dd.b.f2203c = r0
            return
    }

    public b(java.util.ArrayList r3) {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<bc.b> r1 = bc.b.class
            r0.<init>(r1)
            r2.f2204a = r3
            return
    }

    public final void a(ud.e r4) {
            r3 = this;
            ud.e r0 = r4.a0()
            if (r0 == r4) goto La
            r3.a(r0)
            return
        La:
            r0 = 0
            r3.c(r4, r0)     // Catch: java.lang.Exception -> Lf java.lang.StackOverflowError -> L11
            return
        Lf:
            r0 = move-exception
            goto L12
        L11:
            r0 = move-exception
        L12:
            af.g r1 = new af.g
            od.a r4 = r4.f13690m
            java.lang.String r4 = r4.f()
            java.lang.String r2 = "Failed to process class: "
            java.lang.String r4 = wb.en.g(r2, r4)
            r1.<init>(r4, r0)
            throw r1
    }

    public final bc.d b(ud.e r4) {
            r3 = this;
            ud.e r0 = r4.a0()
            if (r0 == r4) goto Lb
            bc.d r4 = r3.b(r0)
            return r4
        Lb:
            md.a r0 = md.a.f8838s     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            md.f r1 = r4.f8877g     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            boolean r0 = r1.a(r0)     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            r1 = 0
            if (r0 == 0) goto L20
            r3.c(r4, r1)     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            fc.e r4 = dd.b.f2203c     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            return r4
        L1c:
            r0 = move-exception
            goto L67
        L1e:
            r0 = move-exception
            goto L67
        L20:
            java.util.List r0 = r4.f13703z     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
        L26:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            ud.e r2 = (ud.e) r2     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            r3.c(r2, r1)     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            goto L26
        L36:
            java.util.List r0 = r4.A     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            if (r0 != 0) goto L57
            r3.c(r4, r1)     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            java.util.List r0 = r4.A     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
        L47:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            ud.e r2 = (ud.e) r2     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            r3.c(r2, r1)     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            goto L47
        L57:
            r0 = 1
            bc.d r0 = r3.c(r4, r0)     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            if (r0 == 0) goto L5f
            return r0
        L5f:
            af.g r0 = new af.g     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            java.lang.String r1 = "Codegen failed"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
            throw r0     // Catch: java.lang.Exception -> L1c java.lang.StackOverflowError -> L1e
        L67:
            af.g r1 = new af.g
            od.a r4 = r4.f13690m
            java.lang.String r4 = r4.f()
            java.lang.String r2 = "Failed to generate code for class: "
            java.lang.String r4 = wb.en.g(r2, r4)
            r1.<init>(r4, r0)
            throw r1
    }

    public final bc.d c(ud.e r8, boolean r9) {
            r7 = this;
            r0 = 4
            r1 = 0
            if (r9 != 0) goto La
            int r2 = r8.f13702y
            if (r2 != r0) goto La
            goto Lbc
        La:
            xe.s.a()
            od.a r2 = r8.f13690m
            monitor-enter(r2)
            md.a r3 = md.a.f8822h0     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            md.f r4 = r8.f8877g     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            boolean r4 = r4.a(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            if (r4 == 0) goto L2e
            r8.D(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r8.W()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            md.a r3 = md.a.f8824i0     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r8.w(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            goto L2e
        L26:
            r8 = move-exception
            goto Lbe
        L29:
            r0 = move-exception
            goto L9d
        L2c:
            r0 = move-exception
            goto L9d
        L2e:
            md.a r3 = md.a.f8824i0     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            md.f r4 = r8.f8877g     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            boolean r4 = r4.a(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            if (r4 == 0) goto L40
            ud.u r4 = r8.f13688k     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r4.j(r8)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r8.D(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
        L40:
            int r3 = r8.f13702y     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r4 = 1
            r5 = 5
            if (r3 != r5) goto L48
            r8.f13702y = r4     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
        L48:
            if (r9 == 0) goto L5a
            md.a r3 = md.a.f8820g0     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            md.f r6 = r8.f8877g     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            boolean r6 = r6.a(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            if (r6 == 0) goto L5a
            r8.D(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r8.o0()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
        L5a:
            int r3 = r8.f13702y     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            if (r3 != r4) goto L61
            r8.e0()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
        L61:
            int r3 = r8.f13702y     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r4 = 2
            if (r3 != r4) goto L81
            r3 = 3
            r8.f13702y = r3     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            java.util.ArrayList r3 = r7.f2204a     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
        L6f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            be.a r4 = (be.a) r4     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            be.h.h0(r4, r8)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            goto L6f
        L7f:
            r8.f13702y = r0     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
        L81:
            if (r9 == 0) goto L9b
            xe.s.a()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            bc.d r0 = a7.a.v(r8)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            md.a r3 = md.a.f8826j0     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            md.f r4 = r8.f8877g     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            boolean r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            if (r3 != 0) goto L99
            r8.o0()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
            r8.f13702y = r5     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29 java.lang.StackOverflowError -> L2c
        L99:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            return r0
        L9b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            return r1
        L9d:
            if (r9 != 0) goto Lbd
            java.lang.Class r9 = r0.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r9 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "Class process error: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L26
            r3.append(r9)     // Catch: java.lang.Throwable -> L26
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L26
            xe.h.a(r8, r9, r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
        Lbc:
            return r1
        Lbd:
            throw r0     // Catch: java.lang.Throwable -> L26
        Lbe:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r8
    }
}
