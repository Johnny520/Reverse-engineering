package f6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.util.ListIterator, java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f6.e f3311i;

    public c(f6.e r2, int r3) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>()
            if (r3 < 0) goto L12
            if (r3 > r0) goto L12
            r1.f3309g = r0
            r1.f3310h = r3
            r1.f3311i = r2
            return
        L12:
            java.lang.String r2 = "index"
            java.lang.String r2 = oh.h.h(r3, r0, r2)
            okio.a.i(r2)
            r2 = 0
            throw r2
    }

    public final java.lang.Object a(int r2) {
            r1 = this;
            f6.e r0 = r1.f3311i
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f3310h
            int r1 = r2.f3309g
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f3310h
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            int r0 = r2.f3310h
            int r1 = r0 + 1
            r2.f3310h = r1
            java.lang.Object r0 = r2.a(r0)
            return r0
        L11:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f3310h
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L11
            int r0 = r1.f3310h
            int r0 = r0 + (-1)
            r1.f3310h = r0
            java.lang.Object r0 = r1.a(r0)
            return r0
        L11:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f3310h
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
