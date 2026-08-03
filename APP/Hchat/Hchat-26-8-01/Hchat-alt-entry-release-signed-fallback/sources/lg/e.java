package lg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8053j;

    public e(long r3, long r5, long r7) {
            r2 = this;
            r2.<init>()
            r2.f8050g = r7
            r2.f8051h = r5
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = 0
            r0 = 1
            if (r7 <= 0) goto L15
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L1a
        L13:
            r8 = r0
            goto L1a
        L15:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto L13
        L1a:
            r2.f8052i = r8
            if (r8 == 0) goto L1f
            goto L20
        L1f:
            r3 = r5
        L20:
            r2.f8053j = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f8052i
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            long r0 = r4.f8053j
            long r2 = r4.f8051h
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L15
            boolean r2 = r4.f8052i
            if (r2 == 0) goto L10
            r2 = 0
            r4.f8052i = r2
            goto L1a
        L10:
            bsh.j.e()
            r0 = 0
            return r0
        L15:
            long r2 = r4.f8050g
            long r2 = r2 + r0
            r4.f8053j = r2
        L1a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
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
