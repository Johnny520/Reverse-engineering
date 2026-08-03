package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ac.k f7179i;

    public b0(ac.k r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7179i = r1
            r0.f7177g = r2
            r0.f7178h = r3
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            k5.a0 r0 = new k5.a0
            ac.k r1 = r3.f7179i
            java.lang.Object r1 = r1.f178i
            k5.u r1 = (k5.u) r1
            androidx.lifecycle.x r1 = r1.f7264b
            int r2 = r3.f7177g
            r0.<init>(r3, r1, r2)
            return r0
    }
}
