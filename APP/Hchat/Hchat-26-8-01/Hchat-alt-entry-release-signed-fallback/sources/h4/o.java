package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4.c0 f5087b;

    public o(v4.c0 r2) {
            r1 = this;
            java.lang.String r0 = "Signature"
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.f5087b = r2
            return
        La:
            java.lang.String r2 = "signature == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            r0 = 8
            return r0
    }
}
