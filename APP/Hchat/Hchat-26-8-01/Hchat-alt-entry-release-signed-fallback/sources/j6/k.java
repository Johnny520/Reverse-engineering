package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j6.m f6735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j6.m f6736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j6.n f6738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6739k;

    public k(j6.n r1, int r2) {
            r0 = this;
            r0.f6739k = r2
            r0.<init>()
            r0.f6738j = r1
            j6.m r2 = r1.f6757l
            j6.m r2 = r2.f6745j
            r0.f6735g = r2
            r2 = 0
            r0.f6736h = r2
            int r1 = r1.f6756k
            r0.f6737i = r1
            return
    }

    public final java.lang.Object a() {
            r1 = this;
            j6.m r0 = r1.b()
            return r0
    }

    public final j6.m b() {
            r3 = this;
            j6.m r0 = r3.f6735g
            j6.n r1 = r3.f6738j
            j6.m r2 = r1.f6757l
            if (r0 == r2) goto L1b
            int r1 = r1.f6756k
            int r2 = r3.f6737i
            if (r1 != r2) goto L15
            j6.m r1 = r0.f6745j
            r3.f6735g = r1
            r3.f6736h = r0
            return r0
        L15:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        L1b:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            j6.m r0 = r2.f6735g
            j6.n r1 = r2.f6738j
            j6.m r1 = r1.f6757l
            if (r0 == r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r1 = this;
            int r0 = r1.f6739k
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.a()
            return r0
        La:
            j6.m r0 = r1.b()
            java.lang.Object r0 = r0.f6747l
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            j6.m r0 = r3.f6736h
            if (r0 == 0) goto L12
            r1 = 1
            j6.n r2 = r3.f6738j
            r2.d(r0, r1)
            r0 = 0
            r3.f6736h = r0
            int r0 = r2.f6756k
            r3.f6737i = r0
            return
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }
}
