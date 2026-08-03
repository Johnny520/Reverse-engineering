package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends java.util.AbstractList {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k5.o f7192i;

    public e(k5.o r1, int r2, int r3) {
            r0 = this;
            r0.f7192i = r1
            r0.f7190g = r2
            r0.f7191h = r3
            r0.<init>()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            k5.o r0 = r3.f7192i
            k5.u r0 = r0.f7243j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r0 = r0.f7264b
            int r2 = r3.f7190g
            int r2 = r2 + 4
            int r4 = r4 * 2
            int r4 = r4 + r2
            int r4 = r0.P(r4)
            java.lang.String r4 = r1.b(r4)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7191h
            return r0
    }
}
