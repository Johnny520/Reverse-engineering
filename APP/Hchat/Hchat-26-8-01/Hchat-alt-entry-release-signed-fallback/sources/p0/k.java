package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object[] f10070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10072i;

    public k() {
            r1 = this;
            r1.<init>()
            p0.j r0 = p0.j.f10065e
            java.lang.Object[] r0 = r0.f10069d
            r1.f10070g = r0
            return
    }

    public final void a(java.lang.Object[] r1, int r2, int r3) {
            r0 = this;
            r0.f10070g = r1
            r0.f10071h = r2
            r0.f10072i = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f10072i
            int r1 = r2.f10071h
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
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
