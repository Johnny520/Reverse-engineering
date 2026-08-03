package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.e f5083b;

    public g(w4.e r3) {
            r2 = this;
            java.lang.String r0 = "Exceptions"
            r2.<init>(r0)
            boolean r0 = r3.e()     // Catch: java.lang.NullPointerException -> L17
            if (r0 != 0) goto Le
            r2.f5083b = r3
            return
        Le:
            e4.a r3 = new e4.a     // Catch: java.lang.NullPointerException -> L17
            java.lang.String r0 = "exceptions.isMutable()"
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.NullPointerException -> L17
            throw r3     // Catch: java.lang.NullPointerException -> L17
        L17:
            java.lang.String r3 = "exceptions == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            w4.e r0 = r1.f5083b
            int r0 = r0.size()
            int r0 = r0 * 2
            int r0 = r0 + 8
            return r0
    }
}
