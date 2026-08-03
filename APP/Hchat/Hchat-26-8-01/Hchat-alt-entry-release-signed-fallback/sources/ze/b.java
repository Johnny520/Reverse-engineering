package ze;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.BitSet f22674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f22676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22678k;

    public b(java.util.BitSet r1, int r2, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.f22674g = r1
            r0.f22675h = r2
            r0.f22676i = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f22677j
            int r1 = r2.f22675h
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            java.util.BitSet r0 = r2.f22674g
            int r1 = r2.f22678k
            int r0 = r0.nextSetBit(r1)
            r1 = -1
            if (r0 == r1) goto L1e
            int r1 = r0 + 1
            r2.f22678k = r1
            int r1 = r2.f22677j
            int r1 = r1 + 1
            r2.f22677j = r1
            java.util.List r1 = r2.f22676i
            java.lang.Object r0 = r1.get(r0)
            ud.a r0 = (ud.a) r0
            return r0
        L1e:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
