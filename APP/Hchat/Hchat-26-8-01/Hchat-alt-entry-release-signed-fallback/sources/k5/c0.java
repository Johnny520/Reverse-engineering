package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends k5.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ac.k f7186j;

    public c0(ac.k r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f7186j = r1
            r0.f7183g = r2
            r0.f7184h = r3
            r0.f7185i = r4
            r0.<init>()
            return
    }

    @Override // k5.t
    public final java.lang.Object a(int r4) {
            r3 = this;
            k5.f0 r0 = new k5.f0
            ac.k r1 = r3.f7186j
            java.lang.Object r1 = r1.f178i
            k5.u r1 = (k5.u) r1
            int r4 = r4 * 8
            int r2 = r3.f7183g
            int r4 = r4 + r2
            int r2 = r3.f7184h
            r0.<init>(r1, r4, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7185i
            return r0
    }
}
