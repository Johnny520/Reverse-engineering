package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0.h f7656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7659j;

    public d(l0.h r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7656g = r1
            r0.f7657h = r3
            r0.f7658i = r2
            int r2 = r1.f7687n
            r0.f7659j = r2
            boolean r1 = r1.f7686m
            if (r1 == 0) goto L14
            l0.j.f()
        L14:
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f7658i
            int r1 = r2.f7657h
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r5 = this;
            l0.h r0 = r5.f7656g
            int r1 = r0.f7687n
            int r2 = r5.f7659j
            if (r1 == r2) goto Lb
            l0.j.f()
        Lb:
            int r1 = r5.f7658i
            int[] r3 = r0.f7680g
            int r4 = r1 * 5
            int r4 = r4 + 3
            r3 = r3[r4]
            int r3 = r3 + r1
            r5.f7658i = r3
            l0.i r3 = new l0.i
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
