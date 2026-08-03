package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be.i f806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ud.r f807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud.r f808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd.j f809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od.c f810e;

    public /* synthetic */ j(be.l r1, be.i r2, ud.r r3, ud.r r4, qd.j r5, od.c r6) {
            r0 = this;
            r0.<init>()
            r0.f806a = r2
            r0.f807b = r3
            r0.f808c = r4
            r0.f809d = r5
            r0.f810e = r6
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r8) {
            r7 = this;
            ud.p r8 = (ud.p) r8
            pd.k r0 = r8.f13713k
            pd.k r1 = pd.k.M
            if (r0 != r1) goto L60
            be.i r0 = r7.f806a
            boolean r0 = r0.test(r8)
            if (r0 == 0) goto L60
            ud.r r0 = r7.f807b
            ud.r r1 = r7.f808c
            if (r0 != 0) goto L30
            ud.e r2 = r1.f13718l
            ud.u r2 = r2.f13688k
            qd.j r3 = r7.f809d
            od.a r4 = od.a.e(r2, r3)
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            qd.g r6 = qd.j.f10868b
            qd.a r6 = new qd.a
            r6.<init>(r3)
            java.lang.String r3 = "values"
            od.d r2 = od.d.b(r2, r4, r3, r5, r6)
            goto L32
        L30:
            od.d r2 = r0.f13717k
        L32:
            pd.n r3 = new pd.n
            r4 = 1
            r5 = 0
            r3.<init>(r2, r4, r5)
            qd.r r8 = r8.f13714l
            r3.d0(r8)
            if (r0 != 0) goto L45
            md.a r8 = md.a.f8844y
            r3.w(r8)
        L45:
            od.c r8 = r7.f810e
            java.lang.String r8 = r8.f9774h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Replace access to removed values field ("
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = ") with 'values()' method"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r1.I(r8)
            return r3
        L60:
            r8 = 0
            return r8
    }
}
