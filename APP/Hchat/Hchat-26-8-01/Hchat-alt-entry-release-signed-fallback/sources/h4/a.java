package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4.a f5070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5071c;

    public a(int r2, v4.a r3) {
            r1 = this;
            java.lang.String r0 = "AnnotationDefault"
            r1.<init>(r0)
            if (r3 == 0) goto Lc
            r1.f5070b = r3
            r1.f5071c = r2
            return
        Lc:
            java.lang.String r2 = "value == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            int r0 = r1.f5071c
            int r0 = r0 + 6
            return r0
    }
}
