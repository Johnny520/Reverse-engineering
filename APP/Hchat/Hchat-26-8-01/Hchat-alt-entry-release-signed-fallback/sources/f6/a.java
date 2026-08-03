package f6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends java.util.AbstractCollection implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.lang.Object[] f3304g = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            f6.a.f3304g = r0
            return
    }

    public abstract int a(java.lang.Object[] r1);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public abstract java.lang.Object[] b();

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract int d();

    public abstract boolean e();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
            r1 = this;
            r0 = 1296(0x510, float:1.816E-42)
            java.util.Spliterator r0 = java.util.Spliterators.spliterator(r1, r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = f6.a.f3304g
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.size()
            int r1 = r4.length
            if (r1 >= r0) goto L2f
            java.lang.Object[] r1 = r3.b()
            if (r1 == 0) goto L21
            int r0 = r3.d()
            int r2 = r3.c()
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r1, r0, r2, r4)
            return r4
        L21:
            int r1 = r4.length
            if (r1 != 0) goto L25
            goto L2a
        L25:
            r1 = 0
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
        L2a:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            goto L35
        L2f:
            int r1 = r4.length
            if (r1 <= r0) goto L35
            r1 = 0
            r4[r0] = r1
        L35:
            r3.a(r4)
            return r4
    }
}
