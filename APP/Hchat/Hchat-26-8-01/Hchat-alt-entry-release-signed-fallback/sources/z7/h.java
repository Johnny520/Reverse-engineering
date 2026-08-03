package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements java.util.ListIterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z7.h f22606g = null;

    static {
            z7.h r0 = new z7.h
            r0.<init>()
            z7.h.f22606g = r0
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty iterator"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Empty iterator"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Empty iterator"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Empty iterator"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty iterator"
            r2.<init>(r0)
            throw r2
    }
}
