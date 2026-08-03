package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o5.c f7229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o5.c f7230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f7232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f7233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k5.o f7234l;

    public k(k5.o r1, o5.e r2, int r3, k5.m r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f7234l = r1
            r0.f7231i = r3
            r0.f7232j = r4
            r0.f7233k = r5
            o5.c r1 = r2.d()
            r0.f7229g = r1
            o5.c r1 = r2.e()
            r0.f7230h = r1
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            k5.j r0 = new k5.j
            k5.o r1 = r3.f7234l
            k5.u r1 = r1.f7243j
            androidx.lifecycle.x r1 = r1.f7264b
            int r2 = r3.f7231i
            r0.<init>(r3, r1, r2)
            return r0
    }
}
