package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z7.c {
    @Override // z7.c, java.util.List
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Empty ArrayCollection!"
            r1.<init>(r2)
            throw r1
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty ArrayCollection!"
            r2.<init>(r0)
            throw r2
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty ArrayCollection!"
            r2.<init>(r0)
            throw r2
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            return
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // z7.c
    public final void d(int r1) {
            r0 = this;
            return
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L12
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            if (r4 != 0) goto L12
            return r0
        L12:
            return r2
    }

    @Override // z7.c
    public final void h(int r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            z7.h r0 = z7.h.f22606g
            return r0
    }

    @Override // z7.c
    public final void m() {
            r0 = this;
            return
    }

    @Override // z7.c, java.util.List
    public final java.lang.Object remove(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // z7.c, java.util.List
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Empty ArrayCollection!"
            r1.<init>(r2)
            throw r1
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // z7.c, java.util.List
    public final void sort(java.util.Comparator r1) {
            r0 = this;
            return
    }

    @Override // z7.c, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            z7.c r1 = r0.l(r1, r2)
            return r1
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = z7.c.f22582n
            return r0
    }
}
