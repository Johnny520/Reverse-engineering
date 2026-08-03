package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h6.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k6.p f7361b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.f f7362a;

    static {
            k6.p r0 = new k6.p
            r1 = 1
            r0.<init>(r1)
            k6.q.f7361b = r0
            return
    }

    public q(h6.f r1) {
            r0 = this;
            r0.<init>()
            r0.f7362a = r1
            return
    }

    @Override // h6.n
    public final void b(o6.a r4, java.lang.Object r5) {
            r3 = this;
            if (r5 != 0) goto L6
            r4.l()
            return
        L6:
            java.lang.Class r0 = r5.getClass()
            h6.f r1 = r3.f7362a
            r1.getClass()
            n6.a r2 = new n6.a
            r2.<init>(r0)
            h6.n r0 = r1.b(r2)
            boolean r1 = r0 instanceof k6.q
            if (r1 == 0) goto L23
            r4.c()
            r4.h()
            return
        L23:
            r0.b(r4, r5)
            return
    }
}
