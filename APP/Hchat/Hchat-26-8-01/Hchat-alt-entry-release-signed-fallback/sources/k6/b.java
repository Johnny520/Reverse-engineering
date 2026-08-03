package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h6.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k6.a f7313b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6.y f7314a;

    static {
            k6.a r0 = new k6.a
            r0.<init>()
            k6.b.f7313b = r0
            return
    }

    public b(h6.f r2, h6.n r3, java.lang.Class r4) {
            r1 = this;
            r1.<init>()
            k6.y r0 = new k6.y
            r0.<init>(r2, r3, r4)
            r1.f7314a = r0
            return
    }

    @Override // h6.n
    public final void b(o6.a r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.l()
            return
        L6:
            r5.b()
            int r0 = java.lang.reflect.Array.getLength(r6)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = java.lang.reflect.Array.get(r6, r1)
            k6.y r3 = r4.f7314a
            r3.b(r5, r2)
            int r1 = r1 + 1
            goto Le
        L1c:
            r5.g()
            return
    }
}
