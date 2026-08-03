package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f848g = null;

    static {
            java.lang.Class<be.v> r0 = be.v.class
            mh.b r0 = mh.d.b(r0)
            be.v.f848g = r0
            return
    }

    @Override // be.a
    public final void g(ud.r r7) {
            r6 = this;
            boolean r0 = r7.f13722p
            if (r0 == 0) goto L6
            goto L76
        L6:
            java.util.List r0 = r7.f13732z
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            java.util.ArrayList r1 = r1.f13674l
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc
            java.lang.Object r2 = r1.next()
            ud.p r2 = (ud.p) r2
            pd.k r3 = r2.f13713k
            pd.k r4 = pd.k.S
            if (r3 != r4) goto L1e
            td.a r2 = (td.a) r2
            qd.r r3 = r2.f13714l     // Catch: java.lang.Exception -> L5f
            if (r3 != 0) goto L37
            goto L1e
        L37:
            qd.s r3 = r3.f10923m     // Catch: java.lang.Exception -> L5f
            qd.k r3 = r3.b()     // Catch: java.lang.Exception -> L5f
            qd.j r3 = r3.f10895b     // Catch: java.lang.Exception -> L5f
            if (r3 == 0) goto L1e
            java.util.List r4 = r3.j()     // Catch: java.lang.Exception -> L5f
            if (r4 != 0) goto L48
            goto L1e
        L48:
            ud.e r4 = r7.f13718l     // Catch: java.lang.Exception -> L5f
            ud.u r4 = r4.f13688k     // Catch: java.lang.Exception -> L5f
            od.d r5 = r2.f13119o     // Catch: java.lang.Exception -> L5f
            od.a r5 = r5.f9780j     // Catch: java.lang.Exception -> L5f
            ud.e r4 = r4.f(r5)     // Catch: java.lang.Exception -> L5f
            if (r4 == 0) goto L61
            java.util.List r4 = r4.f13695r     // Catch: java.lang.Exception -> L5f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Exception -> L5f
            if (r4 == 0) goto L61
            goto L1e
        L5f:
            r2 = move-exception
            goto L6e
        L61:
            nd.l r4 = new nd.l     // Catch: java.lang.Exception -> L5f
            java.util.List r3 = r3.j()     // Catch: java.lang.Exception -> L5f
            r4.<init>(r3)     // Catch: java.lang.Exception -> L5f
            r2.y(r4)     // Catch: java.lang.Exception -> L5f
            goto L1e
        L6e:
            mh.b r3 = be.v.f848g
            java.lang.String r4 = "Failed to attach constructor generic info"
            r3.e(r4, r2)
            goto L1e
        L76:
            return
    }
}
