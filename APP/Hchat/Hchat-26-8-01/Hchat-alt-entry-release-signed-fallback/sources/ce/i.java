package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ud.r f1643h;

    public /* synthetic */ i(me.c r1, ud.r r2) {
            r0 = this;
            r1 = 1
            r0.f1642g = r1
            r0.<init>()
            r0.f1643h = r2
            return
    }

    public /* synthetic */ i(ud.r r2) {
            r1 = this;
            r0 = 0
            r1.f1642g = r0
            r1.<init>()
            r1.f1643h = r2
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f1642g
            switch(r0) {
                case 0: goto L7e;
                default: goto L5;
            }
        L5:
            qd.r r7 = (qd.r) r7
            md.f r0 = r7.f8877g
            md.a r1 = md.a.f8840u
            boolean r0 = r0.a(r1)
            r2 = 1
            if (r0 == 0) goto L13
            goto L7d
        L13:
            ud.p r0 = r7.f10903j
            if (r0 == 0) goto L7c
            pd.k r3 = r0.f13713k
            pd.k r4 = pd.k.S
            if (r3 != r4) goto L7c
            md.b r3 = md.b.I
            md.f r4 = r0.f8877g
            boolean r3 = r4.b(r3)
            if (r3 == 0) goto L7c
            ud.r r3 = r6.f1643h
            ud.e r3 = r3.f13718l
            ud.u r3 = r3.f13688k
            fe.a r3 = r3.f13749h
            r4 = r0
            td.a r4 = (td.a) r4
            ud.m r3 = r3.g(r4)
            boolean r4 = r3 instanceof ud.r
            if (r4 == 0) goto L3d
            ud.r r3 = (ud.r) r3
            goto L3e
        L3d:
            r3 = 0
        L3e:
            if (r3 == 0) goto L7c
            md.b r4 = md.b.f8862q
            md.f r5 = r3.f8877g
            boolean r4 = r5.b(r4)
            if (r4 == 0) goto L7c
            int r0 = r0.T(r7)
            java.util.List r3 = r3.S()
            if (r0 < 0) goto L7c
            int r4 = r3.size()
            if (r0 >= r4) goto L7c
            java.lang.Object r0 = r3.get(r0)
            qd.r r0 = (qd.r) r0
            md.f r3 = r0.f8877g
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L7c
            qd.j r1 = r7.I()
            qd.j r0 = r0.I()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7c
            md.a r0 = md.a.f8838s
            r7.w(r0)
            goto L7d
        L7c:
            r2 = 0
        L7d:
            return r2
        L7e:
            ud.a r7 = (ud.a) r7
            md.a r0 = md.a.f8840u
            md.f r1 = r7.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Lb7
            java.util.List r0 = r7.f13675m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lae
            java.util.List r0 = r7.f13676n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9b
            goto Lae
        L9b:
            md.b r0 = md.b.D
            md.f r1 = r7.f8877g
            oc.b r0 = r1.c(r0)
            ae.h r0 = (ae.h) r0
            if (r0 == 0) goto Lac
            java.util.List r0 = r0.f245i
            r0.remove(r7)
        Lac:
            r7 = 1
            goto Lb8
        Lae:
            mh.b r0 = ce.l.f1650g
            java.lang.String r1 = "Block {} not deleted, method: {}"
            ud.r r2 = r6.f1643h
            r0.s(r7, r1, r2)
        Lb7:
            r7 = 0
        Lb8:
            return r7
    }
}
