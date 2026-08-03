package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o5.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k5.u f9504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9506i;

    public b(k5.u r1, int r2, int r3) {
            r0 = this;
            r0.f9504g = r1
            r0.f9505h = r2
            r0.f9506i = r3
            r0.<init>()
            return
    }

    @Override // o5.o
    public final java.lang.Object a(int r4) {
            r3 = this;
            k5.u r0 = r3.f9504g
            androidx.lifecycle.x r1 = r0.f7264b
            int r2 = r3.f9505h
            int r2 = r2 + 4
            int r4 = r4 * 4
            int r4 = r4 + r2
            int r4 = r1.N(r4)
            k5.b r1 = new k5.b
            r1.<init>(r0, r4)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.f9506i
            return r0
    }
}
