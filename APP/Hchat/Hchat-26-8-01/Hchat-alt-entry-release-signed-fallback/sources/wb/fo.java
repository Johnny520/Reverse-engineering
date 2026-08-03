package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class fo implements i0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m.a f16230b;

    public /* synthetic */ fo(m.a r1, int r2) {
            r0 = this;
            r0.f16229a = r2
            r0.f16230b = r1
            r0.<init>()
            return
    }

    @Override // i0.z
    public final void a() {
            r1 = this;
            int r0 = r1.f16229a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            m.a r0 = r1.f16230b
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.f8069h
            c9.n0 r0 = (c9.n0) r0
            r0.invoke()
        L10:
            return
        L11:
            m.a r0 = r1.f16230b
            java.lang.Object r0 = r0.f8069h
            c9.n0 r0 = (c9.n0) r0
            r0.invoke()
            return
    }
}
