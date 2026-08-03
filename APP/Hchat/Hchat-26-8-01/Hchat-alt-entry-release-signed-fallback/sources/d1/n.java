package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg.u f1930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1931h;

    public n(gg.u r1, int r2) {
            r0 = this;
            r0.f1930g = r1
            r0.f1931h = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            d1.b0 r2 = (d1.b0) r2
            int r0 = r1.f1931h
            boolean r2 = r2.r1(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            gg.u r0 = r1.f1930g
            r0.f4564g = r2
            return r2
    }
}
