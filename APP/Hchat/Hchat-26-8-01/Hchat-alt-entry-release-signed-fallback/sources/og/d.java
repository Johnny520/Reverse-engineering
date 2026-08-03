package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f9817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9821k;

    public d(java.lang.CharSequence r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9817g = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r9 = this;
            int r0 = r9.f9818h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            return r2
        L9:
            return r1
        La:
            int r0 = r9.f9821k
            r3 = 2
            if (r0 >= 0) goto L12
            r9.f9818h = r3
            return r1
        L12:
            java.lang.CharSequence r0 = r9.f9817g
            int r1 = r0.length()
            int r4 = r9.f9819i
            int r5 = r0.length()
        L1e:
            if (r4 >= r5) goto L43
            char r6 = r0.charAt(r4)
            r7 = 13
            r8 = 10
            if (r6 == r8) goto L2f
            if (r6 == r7) goto L2f
            int r4 = r4 + 1
            goto L1e
        L2f:
            if (r6 != r7) goto L40
            int r1 = r4 + 1
            int r5 = r0.length()
            if (r1 >= r5) goto L40
            char r0 = r0.charAt(r1)
            if (r0 != r8) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            r1 = r4
            goto L44
        L43:
            r3 = -1
        L44:
            r9.f9818h = r2
            r9.f9821k = r3
            r9.f9820j = r1
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.f9818h = r0
            int r0 = r3.f9820j
            int r1 = r3.f9819i
            int r2 = r3.f9821k
            int r2 = r2 + r0
            r3.f9819i = r2
            java.lang.CharSequence r2 = r3.f9817g
            java.lang.CharSequence r0 = r2.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            bsh.j.e()
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
