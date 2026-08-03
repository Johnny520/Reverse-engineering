package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends tf.h implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uf.i f13799h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uf.g f13800g;

    static {
            uf.i r0 = new uf.i
            uf.g r1 = uf.g.f13783t
            r0.<init>(r1)
            uf.i.f13799h = r0
            return
    }

    public i() {
            r1 = this;
            uf.g r0 = new uf.g
            r0.<init>()
            r1.<init>()
            r1.f13800g = r0
            return
    }

    public i(uf.g r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f13800g = r1
            return
    }

    @Override // tf.h
    public final int a() {
            r1 = this;
            uf.g r0 = r1.f13800g
            int r0 = r0.f13792o
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            uf.g r0 = r1.f13800g
            int r2 = r0.a(r2)
            if (r2 < 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            uf.g r0 = r1.f13800g
            r0.d()
            boolean r2 = super.addAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            uf.g r0 = r1.f13800g
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            uf.g r0 = r1.f13800g
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            uf.g r0 = r1.f13800g
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r3 = this;
            uf.g r0 = r3.f13800g
            r0.getClass()
            uf.e r1 = new uf.e
            r2 = 1
            r1.<init>(r0, r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            uf.g r0 = r1.f13800g
            r0.d()
            int r2 = r0.h(r2)
            if (r2 >= 0) goto Ld
            r2 = 0
            return r2
        Ld:
            r0.l(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            uf.g r0 = r1.f13800g
            r0.d()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            uf.g r0 = r1.f13800g
            r0.d()
            boolean r2 = super.retainAll(r2)
            return r2
    }
}
