package de;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends be.a {
    static {
            java.lang.Class<de.a> r0 = de.a.class
            mh.d.b(r0)
            return
    }

    public static void i(ud.r r6) {
            java.util.List r0 = r6.D
            ce.d r1 = new ce.d
            r2 = 3
            r1.<init>(r6, r2)
            r0.forEach(r1)
            boolean r0 = r6.Z()
            if (r0 == 0) goto L13
            goto L8a
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            ud.a r1 = r6.C
            java.util.List r1 = r1.f13675m
            int r1 = r1.size()
            r0.<init>(r1)
            ud.a r1 = r6.C
            java.util.List r1 = r1.f13675m
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L29:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            ud.a r3 = (ud.a) r3
            ud.p r3 = a.a.c0(r3)
            if (r3 == 0) goto L29
            md.a r4 = md.a.f8834o
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L47
            r2 = r3
            goto L29
        L47:
            r0.add(r3)
            goto L29
        L4b:
            if (r2 == 0) goto L8a
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            r3 = 0
            qd.l r4 = r2.S(r3)
            qd.l r3 = r1.S(r3)
            r4.getClass()
            boolean r5 = r4 instanceof qd.r
            if (r5 == 0) goto L85
            r3.getClass()
            boolean r5 = r3 instanceof qd.r
            if (r5 == 0) goto L85
            qd.r r4 = (qd.r) r4
            qd.r r3 = (qd.r) r3
            qd.s r3 = r3.f10923m
            qd.j r5 = r4.I()
            java.lang.String r4 = r4.getName()
            j(r6, r3, r5, r4)
        L85:
            int r3 = r2.f9389i
            r1.f9389i = r3
            goto L51
        L8a:
            java.util.List r0 = r6.D
            ce.d r1 = new ce.d
            r2 = 4
            r1.<init>(r6, r2)
            r0.forEach(r1)
            return
    }

    public static boolean j(ud.r r2, qd.s r3, qd.j r4, java.lang.String r5) {
            ud.e r0 = r2.f13718l
            ud.u r0 = r0.f13688k
            qe.x r0 = r0.f13748g
            r0.getClass()
            qe.a0 r1 = qe.a0.f10937e
            int r2 = r0.c(r2, r3, r4, r1)
            r4 = 1
            if (r2 != r4) goto L14
            r2 = 0
            return r2
        L14:
            boolean r2 = kd.d.c(r5)
            if (r2 == 0) goto L35
            if (r5 == 0) goto L32
            qd.k r2 = r3.f10931m
            if (r2 == 0) goto L23
            r2.f10894a = r5
            goto L35
        L23:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "CodeVar not initialized for name set in SSAVar: "
            java.lang.String r2 = r3.concat(r2)
            ah.a.k(r2)
            r2 = 0
            return r2
        L32:
            r3.getClass()
        L35:
            return r4
    }

    public static void k(ud.r r8) {
            oc.c r0 = oc.c.f9764j
            md.f r1 = r8.f8877g
            oc.b r0 = r1.c(r0)
            pc.i r0 = (pc.i) r0
            if (r0 != 0) goto Ld
            goto L5d
        Ld:
            java.util.ArrayList r1 = r0.f10471g     // Catch: java.lang.Exception -> L59
            int r2 = r1.size()     // Catch: java.lang.Exception -> L59
            od.d r3 = r8.f13717k     // Catch: java.lang.Exception -> L59
            java.util.List r3 = r3.f9779i     // Catch: java.lang.Exception -> L59
            int r3 = r3.size()     // Catch: java.lang.Exception -> L59
            if (r2 == r3) goto L1e
            goto L5d
        L1e:
            java.util.List r2 = r8.S()     // Catch: java.lang.Exception -> L59
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L59
            r3 = 0
        L27:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L59
            qd.r r4 = (qd.r) r4     // Catch: java.lang.Exception -> L59
            int r5 = r3 + 1
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L59
            pc.h r3 = (pc.h) r3     // Catch: java.lang.Exception -> L59
            java.lang.String r6 = r3.f10470b     // Catch: java.lang.Exception -> L59
            boolean r7 = kd.d.c(r6)     // Catch: java.lang.Exception -> L59
            if (r7 == 0) goto L5b
            qd.s r4 = r4.f10923m     // Catch: java.lang.Exception -> L59
            qd.k r4 = r4.b()     // Catch: java.lang.Exception -> L59
            r4.f10894a = r6     // Catch: java.lang.Exception -> L59
            int r3 = r3.f10469a     // Catch: java.lang.Exception -> L59
            r6 = 16
            boolean r3 = r9.e0.G(r3, r6)     // Catch: java.lang.Exception -> L59
            if (r3 == 0) goto L5b
            r3 = 1
            r4.f10897d = r3     // Catch: java.lang.Exception -> L59
            goto L5b
        L59:
            r1 = move-exception
            goto L5e
        L5b:
            r3 = r5
            goto L27
        L5d:
            return
        L5e:
            java.util.ArrayList r0 = r0.f10471g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Failed to process method parameters attribute: "
            java.lang.String r0 = r2.concat(r0)
            r8.M(r0, r1)
            return
    }

    @Override // be.a
    public final void g(ud.r r3) {
            r2 = this;
            md.b r0 = md.b.f8858m     // Catch: java.lang.Exception -> L11
            md.f r1 = r3.f8877g     // Catch: java.lang.Exception -> L11
            boolean r1 = r1.b(r0)     // Catch: java.lang.Exception -> L11
            if (r1 == 0) goto L13
            i(r3)     // Catch: java.lang.Exception -> L11
            r3.E(r0)     // Catch: java.lang.Exception -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L17
        L13:
            k(r3)     // Catch: java.lang.Exception -> L11
            return
        L17:
            java.lang.String r1 = "Failed to apply debug info"
            r3.M(r1, r0)
            return
    }
}
