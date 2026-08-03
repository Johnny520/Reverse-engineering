package p2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.Collection, hg.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p2.b f10086i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f10087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10088h;

    static {
            p2.b r0 = new p2.b
            tf.t r1 = tf.t.f13167g
            r0.<init>(r1)
            p2.b.f10086i = r0
            return
    }

    public b(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f10087g = r1
            int r1 = r1.size()
            r0.f10088h = r1
            return
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p2.a
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            p2.a r2 = (p2.a) r2
            java.lang.Object r0 = r1.f10087g
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10087g
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof p2.b
            if (r0 != 0) goto L8
            goto L14
        L8:
            p2.b r2 = (p2.b) r2
            java.lang.Object r2 = r2.f10087g
            java.lang.Object r0 = r1.f10087g
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // java.util.Collection
    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f10087g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object r0 = r1.f10087g
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            java.lang.Object r0 = r1.f10087g
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f10088h
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LocaleList(localeList="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f10087g
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
