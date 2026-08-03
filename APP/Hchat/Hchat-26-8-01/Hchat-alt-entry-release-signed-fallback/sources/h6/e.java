package h6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class e extends k6.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h6.n f5107a;

    public e() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5107a = r0
            return
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            h6.n r0 = r1.f5107a
            if (r0 == 0) goto L8
            r0.b(r2, r3)
            return
        L8:
            java.lang.String r2 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            j8.o.A(r2)
            return
    }

    @Override // k6.x
    public final h6.n c() {
            r1 = this;
            h6.n r0 = r1.f5107a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            j8.o.A(r0)
            r0 = 0
            return r0
    }
}
