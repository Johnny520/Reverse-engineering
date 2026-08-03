package q1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends y0.n implements q1.e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fg.l f10600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public fg.l f10601v;

    @Override // q1.e
    public final boolean C(android.view.KeyEvent r3) {
            r2 = this;
            fg.l r0 = r2.f10601v
            if (r0 == 0) goto L14
            q1.b r1 = new q1.b
            r1.<init>(r3)
            java.lang.Object r3 = r0.invoke(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L14:
            r3 = 0
            return r3
    }

    @Override // q1.e
    public final boolean W(android.view.KeyEvent r3) {
            r2 = this;
            fg.l r0 = r2.f10600u
            if (r0 == 0) goto L14
            q1.b r1 = new q1.b
            r1.<init>(r3)
            java.lang.Object r3 = r0.invoke(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L14:
            r3 = 0
            return r3
    }
}
