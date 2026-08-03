package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3887<K, V> extends Yue.AbstractC0067<java.util.Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3880<K, V> f12423;

    public C3887(@Yue.InterfaceC4418 Yue.C3880<K, V> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f12423 = r2
            return
    }

    @Override // Yue.AbstractC0071, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = r0.m15694(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.util.Map.Entry<K, V>> r2) {
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
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            boolean r2 = r0.m15654(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @Yue.InterfaceC4418
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            Yue.ۥ۠ۨۦۨ$ۥ۟ r0 = r0.m15657()
            return r0
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            r0.m15652()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            r0.m15652()
            boolean r2 = super.retainAll(r2)
            return r2
    }

    @Override // Yue.AbstractC0071
    /* JADX INFO: renamed from: ۥ */
    public int mo434() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            int r0 = r0.size()
            return r0
    }

    @Override // Yue.AbstractC0067
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo425(@Yue.InterfaceC4418 java.util.Map.Entry<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            boolean r2 = r0.m15655(r2)
            return r2
    }

    @Override // Yue.AbstractC0067
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo426(@Yue.InterfaceC4418 java.util.Map.Entry r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            boolean r2 = r0.m15673(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m15694(@Yue.InterfaceC4418 java.util.Map.Entry<K, V> r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C3880<K, V> m15695() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<K, V> r0 = r1.f12423
            return r0
    }
}
