package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Iterator f9536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Iterator f9537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Iterator f9538i;

    public q(java.util.List r1, java.util.List r2, java.util.Iterator r3) {
            r0 = this;
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
            r0.f9536g = r1
            java.util.Iterator r1 = r2.iterator()
            r0.f9537h = r1
            r0.f9538i = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.f9536g
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            java.util.Iterator r0 = r4.f9536g
            java.lang.Object r0 = r0.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = r0.toString()
            java.util.Iterator r1 = r4.f9537h
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r1 = r1.next()
            java.util.Set r1 = (java.util.Set) r1
            goto L1d
        L1b:
            java.util.Set r1 = java.util.Collections.EMPTY_SET
        L1d:
            java.util.Iterator r2 = r4.f9538i
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r2 = r2.next()
            java.lang.String r2 = (java.lang.String) r2
            goto L2d
        L2c:
            r2 = 0
        L2d:
            o5.p r3 = new o5.p
            r3.<init>(r2, r0, r1)
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
