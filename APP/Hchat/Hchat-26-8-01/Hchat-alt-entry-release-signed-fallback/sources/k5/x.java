package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends java.util.AbstractSequentialList {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f7296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k5.z f7297h;

    public x(k5.z r1, java.util.List r2) {
            r0 = this;
            r0.f7297h = r1
            r0.f7296g = r2
            r0.<init>()
            return
    }

    public final o5.q a(int r4) {
            r3 = this;
            if (r4 < 0) goto L15
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L7:
            if (r1 >= r4) goto L12
            r2 = r0
            o5.q r2 = (o5.q) r2
            r2.next()
            int r1 = r1 + 1
            goto L7
        L12:
            o5.q r0 = (o5.q) r0
            return r0
        L15:
            bsh.j.e()
            r4 = 0
            return r4
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r7 = this;
            o5.q r0 = new o5.q
            k5.z r1 = r7.f7297h
            k5.u r2 = r1.f7302j
            int r3 = r1.f7306n
            if (r3 <= 0) goto L17
            androidx.lifecycle.x r4 = r2.f7264b
            int r4 = r4.N(r3)
            k5.y r5 = new k5.y
            r6 = 3
            r5.<init>(r2, r3, r4, r6)
            goto L19
        L17:
            java.util.List r5 = java.util.Collections.EMPTY_LIST
        L19:
            ac.k r1 = r1.i1()
            if (r1 == 0) goto L28
            o5.j r1 = r1.n()
            java.util.Iterator r1 = r1.a()
            goto L2c
        L28:
            java.util.Iterator r1 = java.util.Collections.emptyIterator()
        L2c:
            java.util.List r2 = r7.f7296g
            r0.<init>(r2, r5, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            o5.q r0 = r2.a(r3)     // Catch: java.util.NoSuchElementException -> La
            d6.a r1 = new d6.a
            r1.<init>(r2, r3, r0)
            return r1
        La:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            java.util.List r0 = r1.f7296g
            int r0 = r0.size()
            return r0
    }
}
