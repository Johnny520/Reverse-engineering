package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3888<E> extends Yue.AbstractC0071<E> implements java.util.Set<E>, Yue.InterfaceC3459 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3880<E, ?> f12424;

    public C3888(@Yue.InterfaceC4418 Yue.C3880<E, ?> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f12424 = r2
            return
    }

    @Override // Yue.AbstractC0071, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@Yue.InterfaceC4418 java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @Yue.InterfaceC4418
    public java.util.Iterator<E> iterator() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۟ r0 = r0.m15668()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            int r2 = r0.m15675(r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            r0.m15652()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            r0.m15652()
            boolean r2 = super.retainAll(r2)
            return r2
    }

    @Override // Yue.AbstractC0071
    /* JADX INFO: renamed from: ۥ */
    public int mo434() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f12424
            int r0 = r0.size()
            return r0
    }
}
