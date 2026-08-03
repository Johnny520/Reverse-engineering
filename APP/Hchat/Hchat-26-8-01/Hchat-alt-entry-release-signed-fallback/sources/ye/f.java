package ye;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f22435a = null;

    static {
            java.lang.Class<ye.f> r0 = ye.f.class
            mh.b r0 = mh.d.b(r0)
            ye.f.f22435a = r0
            return
    }

    public static void a(ud.e r8, df.i r9, boolean r10) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            ud.u r1 = r8.f13688k
            j8.f r1 = r1.f13745d
            java.lang.Object r1 = r1.f6781b
            od.b r1 = (od.b) r1
            java.util.concurrent.ConcurrentHashMap r1 = r1.f9771a
            ce.e r2 = new ce.e
            r3 = 2
            r2.<init>(r0, r3)
            r1.forEach(r2)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            if (r10 == 0) goto L4b
            java.util.List r2 = r8.f13699v
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()
            ud.e r3 = (ud.e) r3
            ye.e r4 = new ye.e
            r4.<init>(r3)
            java.util.List r5 = r3.f13698u
            ye.b r6 = new ye.b
            r7 = 0
            r6.<init>(r4, r7)
            r5.forEach(r6)
            od.a r3 = r3.f13690m
            java.lang.String r3 = r3.k()
            r1.put(r3, r4)
            goto L25
        L4b:
            java.util.ArrayList r9 = r9.f2231a
            java.util.Iterator r9 = r9.iterator()
        L51:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lae
            java.lang.Object r2 = r9.next()
            ef.c r2 = (ef.c) r2
            java.lang.String r3 = r2.f2755c
            java.lang.String r4 = r2.f2756d
            r5 = 46
            r6 = 95
            java.lang.String r4 = r4.replace(r5, r6)
            ye.c r5 = new ye.c
            r5.<init>(r8, r10)
            java.lang.Object r3 = r1.computeIfAbsent(r3, r5)
            ye.e r3 = (ye.e) r3
            java.util.HashMap r5 = r3.f22434b
            ye.d r6 = new ye.d
            r6.<init>(r3, r4, r2, r10)
            r5.computeIfAbsent(r4, r6)
            int r2 = r2.f2753a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            ud.g r2 = (ud.g) r2
            if (r2 == 0) goto L51
            od.c r3 = r2.f13707l
            java.lang.String r5 = r3.f9774h
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L51
            boolean r5 = kd.d.c(r4)
            if (r5 == 0) goto L51
            ud.u r5 = r8.f13688k
            bc.g r5 = r5.f13742a
            boolean r5 = r5.a()
            if (r5 == 0) goto L51
            md.a r5 = md.a.f8843x
            r2.w(r5)
            r3.f9776j = r4
            goto L51
        Lae:
            return
    }
}
