package jd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f6864a = null;

    static {
            java.lang.String r0 = "\\R"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            jd.c.f6864a = r0
            return
    }

    public static void a(fc.f r4, nd.b0 r5, md.i r6) {
            if (r6 != 0) goto L3
            goto L4f
        L3:
            bc.a r0 = bc.a.f697h
            boolean r5 = r5.N(r0)
            if (r5 == 0) goto L4f
            boolean r5 = r6 instanceof nd.b0
            md.e r6 = (md.e) r6
            md.f r6 = r6.f8877g
            md.b r0 = md.b.f8846a
            java.util.List r6 = r6.d(r0)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r6.next()
            jd.a r0 = (jd.a) r0
            if (r5 == 0) goto L2d
            r4.p()
            goto L32
        L2d:
            r1 = 32
            r4.d(r1)
        L32:
            r0.getClass()
            r0 = 0
            java.lang.String r1 = bc.e.c(r0)
            java.lang.String r2 = ""
            g(r4, r2, r1)
            java.lang.String r1 = bc.e.b(r0)
            r3 = 0
            g(r4, r1, r3)
            java.lang.String r0 = bc.e.a(r0)
            g(r4, r2, r0)
            goto L1b
        L4f:
            return
    }

    public static void b(fc.f r4, nd.b0 r5) {
            md.b r0 = md.b.f8849d
            md.f r1 = r5.f8877g
            oc.b r0 = r1.c(r0)
            nd.o r0 = (nd.o) r0
            if (r0 == 0) goto L56
            ud.u r1 = r5.n()
            bc.g r1 = r1.f13742a
            bc.a r1 = r1.H
            bc.a r2 = bc.a.f696g
            if (r1 == r2) goto L4b
            bc.a r2 = bc.a.f697h
            if (r1 != r2) goto L1d
            goto L4b
        L1d:
            java.util.EnumMap r0 = r0.f9384g
            java.util.Set r0 = r0.entrySet()
            java.util.stream.Stream r0 = r0.stream()
            be.i r2 = new be.i
            r3 = 18
            r2.<init>(r1, r3)
            java.util.stream.Stream r0 = r0.filter(r2)
            me.a r1 = new me.a
            r2 = 4
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.flatMap(r1)
            java.util.stream.Stream r0 = r0.sorted()
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            goto L4d
        L4b:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L4d:
            jd.b r1 = new jd.b
            r2 = 0
            r1.<init>(r4, r2)
            r0.forEach(r1)
        L56:
            a(r4, r5, r5)
            return
    }

    public static void c(fc.f r2, java.lang.String r3, java.lang.Throwable r4) {
            java.lang.String r0 = "/*  JADX ERROR: "
            r2.r(r0)
            r2.e(r3)
            if (r4 == 0) goto L37
            r2.o()
            java.lang.String r3 = xe.s.f21577a
            r2.p()
            xe.r r3 = new xe.r
            r3.<init>(r2)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r1 = 1
            r0.<init>(r3, r1)
            xe.s.e(r4)     // Catch: java.lang.Throwable -> L2d
            r4.printStackTrace(r0)     // Catch: java.lang.Throwable -> L2d
            r0.flush()     // Catch: java.lang.Throwable -> L2d
            r0.close()
            r2.n()
            goto L37
        L2d:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r3 = move-exception
            r2.addSuppressed(r3)
        L36:
            throw r2
        L37:
            java.lang.String r3 = "*/"
            r2.e(r3)
            return
    }

    public static void d(fc.f r2, nd.b0 r3) {
            bc.a r0 = bc.a.f698i
            boolean r0 = r3.N(r0)
            if (r0 != 0) goto L9
            goto L2c
        L9:
            md.b r0 = md.b.f8848c
            md.f r3 = r3.f8877g
            java.util.List r3 = r3.d(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2c
            java.util.stream.Stream r3 = r3.stream()
            java.util.stream.Stream r3 = r3.distinct()
            java.util.stream.Stream r3 = r3.sorted()
            jd.b r0 = new jd.b
            r1 = 1
            r0.<init>(r2, r1)
            r3.forEach(r0)
        L2c:
            return
    }

    public static void e(fc.f r3, java.lang.String r4) {
            r3.p()
            java.lang.String r0 = "JADX INFO: "
            java.lang.String r4 = r0.concat(r4)
            r0 = 3
            java.lang.String r1 = bc.e.c(r0)
            java.lang.String r2 = ""
            g(r3, r2, r1)
            java.lang.String r1 = bc.e.b(r0)
            g(r3, r1, r4)
            java.lang.String r4 = bc.e.a(r0)
            g(r3, r2, r4)
            return
    }

    public static void f(fc.f r3, nd.b0 r4, java.lang.String r5) {
            bc.a r0 = bc.a.f700k
            boolean r0 = r4.N(r0)
            if (r0 == 0) goto L48
            r3.p()
            java.lang.String r0 = "/* "
            java.lang.String r1 = ""
            g(r3, r1, r0)
            java.lang.String r0 = "JADX "
            fc.f r0 = r3.e(r0)
            java.lang.String r2 = "INFO"
            fc.f r0 = r0.e(r2)
            java.lang.String r2 = ": "
            r0.e(r2)
            java.lang.String r0 = "renamed from: "
            fc.f r0 = r3.e(r0)
            r0.e(r5)
            md.b r5 = md.b.f8847b
            md.f r4 = r4.f8877g
            oc.b r4 = r4.c(r5)
            nd.f0 r4 = (nd.f0) r4
            if (r4 == 0) goto L43
            java.lang.String r5 = ", reason: "
            fc.f r5 = r3.e(r5)
            java.lang.String r4 = r4.f9365g
            r5.e(r4)
        L43:
            java.lang.String r4 = " */"
            g(r3, r1, r4)
        L48:
            return
    }

    public static void g(fc.f r3, java.lang.String r4, java.lang.String r5) {
            java.util.regex.Pattern r0 = jd.c.f6864a
            java.lang.String[] r5 = r0.split(r5)
            int r0 = r5.length
            if (r0 != 0) goto La
            goto L1e
        La:
            r1 = 0
            r1 = r5[r1]
            r3.e(r1)
            r1 = 1
        L11:
            if (r1 >= r0) goto L1e
            r3.r(r4)
            r2 = r5[r1]
            r3.e(r2)
            int r1 = r1 + 1
            goto L11
        L1e:
            return
    }
}
