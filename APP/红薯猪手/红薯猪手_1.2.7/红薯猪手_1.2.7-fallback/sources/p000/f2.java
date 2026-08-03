package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements java.util.Set, java.io.Serializable, p000.n4 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.f2 f335 = null;

    static {
            ۟.f2 r0 = new ۟.f2
            r0.<init>()
            p000.f2.f335 = r0
            return
    }

    public f2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Void
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Void r3 = (java.lang.Void) r3
            java.lang.String r0 = "element"
            p000.h4.m189(r0, r3)
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            p000.h4.m189(r0, r2)
            boolean r2 = r2.isEmpty()
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Le
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            ۟.c2 r0 = p000.c2.f238
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = p000.jb.m220(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            p000.h4.m189(r0, r2)
            java.lang.Object[] r2 = p000.jb.m221(r1, r2)
            return r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[]"
            return r0
    }
}
