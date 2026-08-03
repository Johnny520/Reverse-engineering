package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0573<K, V> extends Yue.C5787<K, V> implements java.util.Map<K, V> {

    @Yue.InterfaceC4544
    Yue.AbstractC3890<K, V> mCollections;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۨۡ$ۥ, reason: contains not printable characters */
    public class C0574 extends Yue.AbstractC3890<K, V> {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0573 f1496;

        public C0574(Yue.C0573 r1) {
                r0 = this;
                r0.f1496 = r1
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo2039() {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                r0.clear()
                return
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.Object mo2040(int r2, int r3) {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                java.lang.Object[] r0 = r0.mArray
                int r2 = r2 << 1
                int r2 = r2 + r3
                r2 = r0[r2]
                return r2
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.util.Map<K, V> mo2041() {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                return r0
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int mo2042() {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                int r0 = r0.mSize
                return r0
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int mo2043(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                int r2 = r0.indexOfKey(r2)
                return r2
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int mo2044(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                int r2 = r0.indexOfValue(r2)
                return r2
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo2045(K r2, V r3) {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                r0.put(r2, r3)
                return
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo2046(int r2) {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                r0.removeAt(r2)
                return
        }

        @Override // Yue.AbstractC3890
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public V mo2047(int r2, V r3) {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f1496
                java.lang.Object r2 = r0.setValueAt(r2, r3)
                return r2
        }
    }

    public C0573() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0573(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C0573(Yue.C5787 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean containsAll(@Yue.InterfaceC4410 java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = Yue.AbstractC3890.m15697(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            Yue.ۥ۠ۨۧۡ r0 = r1.m2038()
            java.util.Set r0 = r0.m15701()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            Yue.ۥ۠ۨۧۡ r0 = r1.m2038()
            java.util.Set r0 = r0.m15702()
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r2.mSize
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    public boolean removeAll(@Yue.InterfaceC4410 java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = Yue.AbstractC3890.m15699(r0, r1)
            return r1
    }

    public boolean retainAll(@Yue.InterfaceC4410 java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = Yue.AbstractC3890.m15700(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            Yue.ۥ۠ۨۧۡ r0 = r1.m2038()
            java.util.Collection r0 = r0.m15703()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC3890<K, V> m2038() {
            r1 = this;
            Yue.ۥ۠ۨۧۡ<K, V> r0 = r1.mCollections
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۡۨۡ$ۥ r0 = new Yue.ۥ۟ۡۨۡ$ۥ
            r0.<init>(r1)
            r1.mCollections = r0
        Lb:
            Yue.ۥ۠ۨۧۡ<K, V> r0 = r1.mCollections
            return r0
    }
}
