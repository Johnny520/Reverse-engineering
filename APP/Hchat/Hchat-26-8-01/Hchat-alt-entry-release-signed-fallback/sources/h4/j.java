package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.r f5086b;

    public j(java.lang.String r2, i4.r r3) {
            r1 = this;
            r1.<init>(r2)
            boolean r2 = r3.f22555g     // Catch: java.lang.NullPointerException -> L13
            if (r2 != 0) goto La
            r1.f5086b = r3
            return
        La:
            e4.a r2 = new e4.a     // Catch: java.lang.NullPointerException -> L13
            java.lang.String r3 = "localVariables.isMutable()"
            r0 = 0
            r2.<init>(r3, r0)     // Catch: java.lang.NullPointerException -> L13
            throw r2     // Catch: java.lang.NullPointerException -> L13
        L13:
            java.lang.String r2 = "localVariables == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            i4.r r0 = r1.f5086b
            java.lang.Object[] r0 = r0.f22543h
            int r0 = r0.length
            int r0 = r0 * 10
            int r0 = r0 + 8
            return r0
    }
}
