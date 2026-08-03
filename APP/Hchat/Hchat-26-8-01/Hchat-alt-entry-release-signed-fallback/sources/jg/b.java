package jg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jg.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d6.m f6901h;

    public b() {
            r2 = this;
            r2.<init>()
            d6.m r0 = new d6.m
            r1 = 1
            r0.<init>(r1)
            r2.f6901h = r0
            return
    }

    @Override // jg.a
    public final java.util.Random f() {
            r1 = this;
            d6.m r0 = r1.f6901h
            java.lang.Object r0 = r0.get()
            r0.getClass()
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
