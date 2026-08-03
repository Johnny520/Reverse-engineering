package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13684g;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f13684g = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f13684g
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L5a;
                case 2: goto L49;
                case 3: goto L40;
                case 4: goto L35;
                case 5: goto L18;
                case 6: goto Le;
                default: goto L7;
            }
        L7:
            ud.j r5 = (ud.j) r5
            boolean r5 = java.util.Objects.nonNull(r5)
            return r5
        Le:
            ud.j r5 = (ud.j) r5
            if (r5 != 0) goto L13
            goto L17
        L13:
            boolean r2 = f8.i.L(r5, r5)
        L17:
            return r2
        L18:
            qd.r r5 = (qd.r) r5
            md.f r0 = r5.f8877g
            md.a r3 = md.a.f8838s
            boolean r0 = r0.a(r3)
            if (r0 != 0) goto L34
            ud.p r5 = r5.f10903j
            mh.b r0 = xe.m.f21571a
            if (r5 == 0) goto L33
            md.f r5 = r5.f8877g
            boolean r5 = r5.a(r3)
            if (r5 == 0) goto L33
            goto L34
        L33:
            r1 = r2
        L34:
            return r1
        L35:
            qd.r r5 = (qd.r) r5
            ud.p r5 = r5.f10903j
            pd.k r0 = pd.k.X
            boolean r5 = xe.m.j(r5, r0)
            return r5
        L40:
            ud.e r5 = (ud.e) r5
            od.a r5 = r5.f13690m
            boolean r5 = r5.o()
            return r5
        L49:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r5 <= r1) goto L58
            goto L59
        L58:
            r1 = r2
        L59:
            return r1
        L5a:
            ae.f r5 = (ae.f) r5
            boolean r5 = r5.f240i
            return r5
        L5f:
            hc.a r5 = (hc.a) r5
            int r0 = r5.j()
            r3 = 6
            if (r0 != r3) goto L7e
            ic.e r5 = (ic.e) r5
            ic.d r0 = r5.f6660g
            int r0 = r0.f6658k
            if (r0 != 0) goto L7e
            mh.b r0 = ud.e.F
            boolean r2 = r0.d()
            if (r2 == 0) goto L7f
            java.lang.String r2 = "Var reference '{}' incorrect (ref pos is zero) and was removed from metadata"
            r0.x(r5, r2)
            goto L7f
        L7e:
            r1 = r2
        L7f:
            return r1
    }
}
