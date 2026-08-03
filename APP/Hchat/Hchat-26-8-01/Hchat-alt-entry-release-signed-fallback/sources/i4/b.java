package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.u f6440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4.x f6441b;

    public b(v4.d0 r1, v4.x r2, h4.u r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L13
            if (r2 == 0) goto Lc
            r0.f6441b = r2
            r0.f6440a = r3
            return
        Lc:
            java.lang.String r1 = "bootstrapMethodHandle == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L13:
            java.lang.String r1 = "declaringClass == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }
}
