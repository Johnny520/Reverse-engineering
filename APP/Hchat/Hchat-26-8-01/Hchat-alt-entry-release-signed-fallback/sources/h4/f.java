package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4.d0 f5081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4.z f5082c;

    public f(v4.d0 r2, v4.z r3) {
            r1 = this;
            java.lang.String r0 = "EnclosingMethod"
            r1.<init>(r0)
            if (r2 == 0) goto Lc
            r1.f5081b = r2
            r1.f5082c = r3
            return
        Lc:
            java.lang.String r2 = "type == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            r0 = 10
            return r0
    }
}
