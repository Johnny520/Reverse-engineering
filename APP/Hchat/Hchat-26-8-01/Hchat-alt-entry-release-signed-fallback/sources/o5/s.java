package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s implements java.util.ListIterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a5.a f9542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9545j;

    public s(androidx.lifecycle.x r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r3.getClass()
            a5.a r0 = new a5.a
            r1 = 5
            r0.<init>(r4, r1, r3)
            r2.f9542g = r0
            r2.f9544i = r4
            r2.f9543h = r5
            return
    }

    public abstract java.lang.Object a(a5.a r1, int r2);

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
            int r0 = r2.f9545j
            int r1 = r2.f9543h
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
            int r0 = r1.f9545j
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
            r2 = this;
            int r0 = r2.f9545j
            int r1 = r2.f9543h
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.f9545j = r1
            a5.a r1 = r2.f9542g
            java.lang.Object r0 = r2.a(r1, r0)
            return r0
        L11:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f9545j
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r4 = this;
            int r0 = r4.f9545j
            int r0 = r0 + (-1)
            int r1 = r4.f9544i
            a5.a r2 = r4.f9542g
            r2.f56h = r1
            r1 = 0
            r4.f9545j = r1
        Ld:
            int r1 = r4.f9545j
            if (r1 >= r0) goto L19
            int r3 = r1 + 1
            r4.f9545j = r3
            r4.a(r2, r1)
            goto Ld
        L19:
            int r0 = r1 + 1
            r4.f9545j = r0
            java.lang.Object r0 = r4.a(r2, r1)
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f9545j
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
