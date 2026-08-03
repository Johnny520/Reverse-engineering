package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements java.util.ListIterator {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static z7.n f22619j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f22620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22622i;

    public n(int r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f22620g = r2
            r0.f22621h = r1
            r1 = -1
            r0.f22622i = r1
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f22621h
            java.util.List r1 = r2.f22620g
            r1.add(r0, r3)
            int r0 = r0 + 1
            r2.f22621h = r0
            r3 = -1
            r2.f22622i = r3
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f22621h
            java.util.List r1 = r2.f22620g
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f22621h
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.f22621h
            r2.f22622i = r0
            int r1 = r0 + 1
            r2.f22621h = r1
            java.util.List r1 = r2.f22620g
            java.lang.Object r0 = r1.get(r0)
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f22621h
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            int r0 = r2.f22621h
            int r0 = r0 + (-1)
            if (r0 < 0) goto L11
            r2.f22621h = r0
            r2.f22622i = r0
            java.util.List r1 = r2.f22620g
            java.lang.Object r0 = r1.get(r0)
            return r0
        L11:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f22621h
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f22622i
            java.util.List r1 = r2.f22620g
            r1.remove(r0)
            r2.f22621h = r0
            r0 = -1
            r2.f22622i = r0
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            java.util.List r0 = r2.f22620g
            int r1 = r2.f22622i
            r0.set(r1, r3)
            return
    }
}
