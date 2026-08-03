package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4.f0 f5079b;

    public d(v4.f0 r2) {
            r1 = this;
            java.lang.String r0 = "ConstantValue"
            r1.<init>(r0)
            boolean r0 = r2 instanceof v4.c0
            if (r0 != 0) goto L29
            boolean r0 = r2 instanceof v4.o
            if (r0 != 0) goto L29
            boolean r0 = r2 instanceof v4.v
            if (r0 != 0) goto L29
            boolean r0 = r2 instanceof v4.n
            if (r0 != 0) goto L29
            boolean r0 = r2 instanceof v4.k
            if (r0 != 0) goto L29
            if (r2 != 0) goto L22
            java.lang.String r2 = "constantValue == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L22:
            java.lang.String r2 = "bad type for constantValue"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L29:
            r1.f5079b = r2
            return
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            r0 = 8
            return r0
    }
}
