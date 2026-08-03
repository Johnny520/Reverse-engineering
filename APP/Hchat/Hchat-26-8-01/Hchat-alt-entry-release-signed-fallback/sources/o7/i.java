package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l7.f f9583j;

    public i(int r1, int r2, l7.f r3) {
            r0 = this;
            r0.<init>()
            r0.f9581h = r1
            r0.f9582i = r2
            r0.f9583j = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9580g
            int r1 = r2.f9581h
            if (r0 > r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9580g
            int r1 = r3.f9581h
            if (r0 > r1) goto L15
            int r1 = r3.f9582i
            r1 = r1 | r0
            int r0 = r0 + 1
            r3.f9580g = r0
            t7.b r0 = new t7.b
            l7.f r2 = r3.f9583j
            r0.<init>(r2, r1)
            return r0
        L15:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
