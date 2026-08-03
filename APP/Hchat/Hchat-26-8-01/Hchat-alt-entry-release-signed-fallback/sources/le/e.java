package le;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r9.e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ud.j f8020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ze.c f8021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ xd.d f8022l;

    public e(ud.j r1, ze.c r2, xd.d r3) {
            r0 = this;
            r0.<init>()
            r0.f8020j = r1
            r0.f8021k = r2
            r0.f8022l = r3
            return
    }

    @Override // r9.e0, ke.e
    public final void b(ud.r r3, ud.n r4) {
            r2 = this;
            ud.j r3 = r2.f8020j
            if (r4 != r3) goto L5
            goto L2f
        L5:
            java.util.List r3 = r4.u()
            java.lang.Object r3 = be.h.F(r3)
            ud.j r3 = (ud.j) r3
            boolean r0 = r3 instanceof ud.a
            if (r0 == 0) goto L65
            ud.a r3 = (ud.a) r3
            java.util.List r3 = r3.f13676n
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r3.next()
            ud.a r0 = (ud.a) r0
            ze.c r1 = r2.f8021k
            boolean r0 = r1.b(r0)
            if (r0 != 0) goto L1b
        L2f:
            r3 = r4
            md.e r3 = (md.e) r3
            md.f r3 = r3.f8877g
            md.a r0 = md.a.U
            boolean r3 = r3.a(r0)
            if (r3 != 0) goto L65
            boolean r3 = f8.i.L(r4, r4)
            if (r3 != 0) goto L65
            java.util.List r3 = r4.u()
            ud.p r4 = new ud.p
            pd.k r0 = pd.k.T
            r1 = 0
            r4.<init>(r0, r1)
            md.a r0 = md.a.f8831m
            r4.w(r0)
            nd.e0 r0 = new nd.e0
            xd.d r1 = r2.f8022l
            r0.<init>(r1)
            r4.y(r0)
            ud.o r0 = new ud.o
            r0.<init>(r4)
            r3.add(r0)
        L65:
            return
    }
}
