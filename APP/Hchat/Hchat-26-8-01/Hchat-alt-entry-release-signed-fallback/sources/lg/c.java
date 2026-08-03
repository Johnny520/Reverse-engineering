package lg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8048j;

    public c(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f8045g = r5
            r2.f8046h = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.f8047i = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.f8048j = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f8047i
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            int r0 = r1.nextInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public final int nextInt() {
            r2 = this;
            int r0 = r2.f8048j
            int r1 = r2.f8046h
            if (r0 != r1) goto L13
            boolean r1 = r2.f8047i
            if (r1 == 0) goto Le
            r1 = 0
            r2.f8047i = r1
            return r0
        Le:
            bsh.j.e()
            r0 = 0
            return r0
        L13:
            int r1 = r2.f8045g
            int r1 = r1 + r0
            r2.f8048j = r1
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
