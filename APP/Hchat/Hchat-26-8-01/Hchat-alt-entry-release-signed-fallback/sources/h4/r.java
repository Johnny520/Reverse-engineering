package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z4.j f5092d;

    public r(java.lang.String r2, t4.b r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f5090b = r0
            r1.<init>(r2)
            boolean r2 = r3.f22555g     // Catch: java.lang.NullPointerException -> L18
            if (r2 != 0) goto Lf
            r1.f5092d = r3
            r1.f5091c = r4
            return
        Lf:
            e4.a r2 = new e4.a     // Catch: java.lang.NullPointerException -> L18
            java.lang.String r3 = "annotations.isMutable()"
            r4 = 0
            r2.<init>(r3, r4)     // Catch: java.lang.NullPointerException -> L18
            throw r2     // Catch: java.lang.NullPointerException -> L18
        L18:
            java.lang.String r2 = "annotations == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public r(java.lang.String r2, t4.c r3, int r4) {
            r1 = this;
            r0 = 1
            r1.f5090b = r0
            r1.<init>(r2)
            boolean r2 = r3.f22555g     // Catch: java.lang.NullPointerException -> L18
            if (r2 != 0) goto Lf
            r1.f5092d = r3
            r1.f5091c = r4
            return
        Lf:
            e4.a r2 = new e4.a     // Catch: java.lang.NullPointerException -> L18
            java.lang.String r3 = "parameterAnnotations.isMutable()"
            r4 = 0
            r2.<init>(r3, r4)     // Catch: java.lang.NullPointerException -> L18
            throw r2     // Catch: java.lang.NullPointerException -> L18
        L18:
            java.lang.String r2 = "parameterAnnotations == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            int r0 = r1.f5090b
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r1.f5091c
        L7:
            int r0 = r0 + 6
            return r0
        La:
            int r0 = r1.f5091c
            goto L7
    }
}
