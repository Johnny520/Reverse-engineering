package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f9623g;

    public /* synthetic */ d(long r1) {
            r0 = this;
            r0.<init>()
            r0.f9623g = r1
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            o9.l r4 = (o9.l) r4
            r3.getClass()
            o9.l r3 = new o9.l
            if (r4 == 0) goto Le
            int r4 = r4.f9644a
            goto Lf
        Le:
            r4 = 0
        Lf:
            int r4 = r4 + 1
            long r0 = r2.f9623g
            r3.<init>(r4, r0)
            return r3
    }
}
