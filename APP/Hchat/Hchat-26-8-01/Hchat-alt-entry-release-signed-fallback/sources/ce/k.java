package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ud.a f1649b;

    public /* synthetic */ k(ud.a r1, int r2) {
            r0 = this;
            r0.f1648a = r2
            r0.f1649b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f1648a
            ud.a r4 = (ud.a) r4
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            java.util.List r0 = r4.f13676n
            ud.a r1 = r3.f1649b
            r0.remove(r1)
            r4.H()
            return
        L12:
            ud.a r0 = r3.f1649b
            java.util.BitSet r1 = r0.f13678p
            int r2 = r4.f13672j
            boolean r1 = r1.get(r2)
            if (r1 != 0) goto L20
            if (r0 != r4) goto L3b
        L20:
            md.a r1 = md.a.f8827k
            r4.w(r1)
            md.a r1 = md.a.f8829l
            r0.w(r1)
            java.util.HashSet r1 = a.a.P(r4, r0)
            nd.t r2 = new nd.t
            r2.<init>(r1, r4, r0)
            md.b r1 = md.b.f8871z
            r4.x(r1, r2)
            r0.x(r1, r2)
        L3b:
            return
    }
}
