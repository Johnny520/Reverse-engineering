package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2.t f9003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2.n f9004b;

    public y(n2.t r1, n2.n r2) {
            r0 = this;
            r0.<init>()
            r0.f9003a = r1
            r0.f9004b = r2
            return
    }

    public final void a(n2.s r2, n2.s r3) {
            r1 = this;
            n2.t r0 = r1.f9003a
            java.util.concurrent.atomic.AtomicReference r0 = r0.f8980b
            java.lang.Object r0 = r0.get()
            n2.y r0 = (n2.y) r0
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L15
            n2.n r0 = r1.f9004b
            r0.e(r2, r3)
        L15:
            return
    }
}
