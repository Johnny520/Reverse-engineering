package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3889<V> extends Yue.AbstractC0068<V> implements java.util.Collection<V>, Yue.InterfaceC3444 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3880<?, V> f12425;

    public C3889(@Yue.InterfaceC4418 Yue.C3880<?, V> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f12425 = r2
            return
    }

    @Override // Yue.AbstractC0068, java.util.AbstractCollection, java.util.Collection
    public boolean add(V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@Yue.InterfaceC4418 java.util.Collection<? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<V> iterator() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۠ r0 = r0.m15679()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            boolean r2 = r0.m15677(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            r0.m15652()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            r0.m15652()
            boolean r2 = super.retainAll(r2)
            return r2
    }

    @Override // Yue.AbstractC0068
    /* JADX INFO: renamed from: ۥ */
    public int mo427() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C3880<?, V> m15696() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<?, V> r0 = r1.f12425
            return r0
    }
}
