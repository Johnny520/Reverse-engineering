package m6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h6.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m6.c f8725b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.n f8726a;

    static {
            m6.c r0 = new m6.c
            r0.<init>()
            m6.d.f8725b = r0
            return
    }

    public d(h6.n r1) {
            r0 = this;
            r0.<init>()
            r0.f8726a = r1
            return
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            java.sql.Timestamp r3 = (java.sql.Timestamp) r3
            h6.n r0 = r1.f8726a
            r0.b(r2, r3)
            return
    }
}
