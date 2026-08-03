package c7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c7.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7.a f1035e;

    public d(java.lang.String r1, k7.a r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f1035e = r2
            return
    }

    @Override // c7.e
    public final java.io.InputStream b() {
            r4 = this;
            x7.a r0 = new x7.a
            k7.a r1 = r4.f1035e
            boolean r2 = r1 instanceof k7.e
            if (r2 == 0) goto Le
            r2 = r1
            k7.e r2 = (k7.e) r2
            r2.c()
        Le:
            byte[] r1 = r1.r()
            r2 = 0
            int r3 = r1.length
            r0.<init>(r1, r2, r3)
            return r0
    }
}
