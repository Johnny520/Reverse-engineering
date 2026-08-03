package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z7.c f22596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22597h;

    public e(z7.c r1) {
            r0 = this;
            r0.<init>()
            r0.f22596g = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f22597h
            z7.c r1 = r2.f22596g
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.f22597h
            int r1 = r0 + 1
            r2.f22597h = r1
            z7.c r1 = r2.f22596g
            java.lang.Object[] r1 = r1.f22584g
            r0 = r1[r0]
            return r0
    }
}
