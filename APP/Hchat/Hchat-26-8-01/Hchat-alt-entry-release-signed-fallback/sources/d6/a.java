package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.util.ListIterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o5.q f2003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k5.x f2004i;

    public a(k5.x r1, int r2, o5.q r3) {
            r0 = this;
            r0.<init>()
            r0.f2004i = r1
            int r2 = r2 + (-1)
            r0.f2002g = r2
            r0.f2003h = r3
            return
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
            o5.q r0 = r2.f2003h
            if (r0 != 0) goto L16
            k5.x r0 = r2.f2004i     // Catch: java.lang.IndexOutOfBoundsException -> L11
            int r1 = r2.f2002g     // Catch: java.lang.IndexOutOfBoundsException -> L11
            int r1 = r1 + 1
            o5.q r0 = r0.a(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L11
            r2.f2003h = r0     // Catch: java.lang.IndexOutOfBoundsException -> L11
            goto L16
        L11:
            bsh.j.e()
            r0 = 0
            return r0
        L16:
            o5.q r0 = r2.f2003h
            java.util.Iterator r0 = r0.f9536g
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f2002g
            if (r0 < 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            o5.q r0 = r2.f2003h
            if (r0 != 0) goto L16
            k5.x r0 = r2.f2004i     // Catch: java.lang.IndexOutOfBoundsException -> L11
            int r1 = r2.f2002g     // Catch: java.lang.IndexOutOfBoundsException -> L11
            int r1 = r1 + 1
            o5.q r0 = r0.a(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L11
            r2.f2003h = r0     // Catch: java.lang.IndexOutOfBoundsException -> L11
            goto L16
        L11:
            bsh.j.e()
            r0 = 0
            return r0
        L16:
            o5.q r0 = r2.f2003h
            java.lang.Object r0 = r0.next()
            int r1 = r2.f2002g
            int r1 = r1 + 1
            r2.f2002g = r1
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f2002g
            int r0 = r0 + 1
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            r0 = 0
            r3.f2003h = r0
            k5.x r0 = r3.f2004i     // Catch: java.lang.IndexOutOfBoundsException -> L14
            int r1 = r3.f2002g     // Catch: java.lang.IndexOutOfBoundsException -> L14
            int r2 = r1 + (-1)
            r3.f2002g = r2     // Catch: java.lang.IndexOutOfBoundsException -> L14
            o5.q r0 = r0.a(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L14
            java.lang.Object r0 = r0.next()     // Catch: java.lang.IndexOutOfBoundsException -> L14
            return r0
        L14:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f2002g
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
