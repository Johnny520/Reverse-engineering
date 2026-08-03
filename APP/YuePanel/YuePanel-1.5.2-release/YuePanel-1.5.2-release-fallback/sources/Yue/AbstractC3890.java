package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3890<K, V> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public Yue.AbstractC3890<K, V>.C3892 f12426;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public Yue.AbstractC3890<K, V>.C3893 f12427;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public Yue.AbstractC3890<K, V>.C3895 f12428;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ, reason: contains not printable characters */
    public final class C3891<T> implements java.util.Iterator<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int f12429;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f12430;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f12431;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f12432;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC3890 f12433;

        public C3891(Yue.AbstractC3890 r2, int r3) {
                r1 = this;
                r1.f12433 = r2
                r1.<init>()
                r0 = 0
                r1.f12432 = r0
                r1.f12429 = r3
                int r2 = r2.mo2042()
                r1.f12430 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f12431
                int r1 = r2.f12430
                if (r0 >= r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                Yue.ۥ۠ۨۧۡ r0 = r3.f12433
                int r1 = r3.f12431
                int r2 = r3.f12429
                java.lang.Object r0 = r0.mo2040(r1, r2)
                int r1 = r3.f12431
                r2 = 1
                int r1 = r1 + r2
                r3.f12431 = r1
                r3.f12432 = r2
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.f12432
                if (r0 == 0) goto L19
                int r0 = r2.f12431
                int r0 = r0 + (-1)
                r2.f12431 = r0
                int r1 = r2.f12430
                int r1 = r1 + (-1)
                r2.f12430 = r1
                r1 = 0
                r2.f12432 = r1
                Yue.ۥ۠ۨۧۡ r1 = r2.f12433
                r1.mo2046(r0)
                return
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟, reason: contains not printable characters */
    public final class C3892 implements java.util.Set<java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC3890 f12434;

        public C3892(Yue.AbstractC3890 r1) {
                r0 = this;
                r0.f12434 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r1 = r0.m15706(r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
                r4 = this;
                Yue.ۥ۠ۨۧۡ r0 = r4.f12434
                int r0 = r0.mo2042()
                java.util.Iterator r5 = r5.iterator()
            La:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                Yue.ۥ۠ۨۧۡ r2 = r4.f12434
                java.lang.Object r3 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r2.mo2045(r3, r1)
                goto La
            L24:
                Yue.ۥ۠ۨۧۡ r5 = r4.f12434
                int r5 = r5.mo2042()
                if (r0 == r5) goto L2e
                r5 = 1
                goto L2f
            L2e:
                r5 = 0
            L2f:
                return r5
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12434
                r0.mo2039()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                Yue.ۥ۠ۨۧۡ r0 = r3.f12434
                java.lang.Object r2 = r4.getKey()
                int r0 = r0.mo2043(r2)
                if (r0 >= 0) goto L15
                return r1
            L15:
                Yue.ۥ۠ۨۧۡ r1 = r3.f12434
                r2 = 1
                java.lang.Object r0 = r1.mo2040(r0, r2)
                java.lang.Object r4 = r4.getValue()
                boolean r4 = Yue.C1537.m7667(r0, r4)
                return r4
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = Yue.AbstractC3890.m15698(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r6 = this;
                Yue.ۥ۠ۨۧۡ r0 = r6.f12434
                int r0 = r0.mo2042()
                r1 = 1
                int r0 = r0 - r1
                r2 = 0
                r3 = r2
            La:
                if (r0 < 0) goto L2d
                Yue.ۥ۠ۨۧۡ r4 = r6.f12434
                java.lang.Object r4 = r4.mo2040(r0, r2)
                Yue.ۥ۠ۨۧۡ r5 = r6.f12434
                java.lang.Object r5 = r5.mo2040(r0, r1)
                if (r4 != 0) goto L1c
                r4 = r2
                goto L20
            L1c:
                int r4 = r4.hashCode()
            L20:
                if (r5 != 0) goto L24
                r5 = r2
                goto L28
            L24:
                int r5 = r5.hashCode()
            L28:
                r4 = r4 ^ r5
                int r3 = r3 + r4
                int r0 = r0 + (-1)
                goto La
            L2d:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12434
                int r0 = r0.mo2042()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                Yue.ۥ۠ۨۧۡ$ۥ۟۟۟ r0 = new Yue.ۥ۠ۨۧۡ$ۥ۟۟۟
                Yue.ۥ۠ۨۧۡ r1 = r2.f12434
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12434
                int r0 = r0.mo2042()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m15706(java.util.Map.Entry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟۟, reason: contains not printable characters */
    public final class C3893 implements java.util.Set<K> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC3890 f12435;

        public C3893(Yue.AbstractC3890 r1) {
                r0 = this;
                r0.f12435 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                r0.mo2039()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                int r2 = r0.mo2043(r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                java.util.Map r0 = r0.mo2041()
                boolean r2 = Yue.AbstractC3890.m15697(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = Yue.AbstractC3890.m15698(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                Yue.ۥ۠ۨۧۡ r0 = r4.f12435
                int r0 = r0.mo2042()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = r1
            La:
                if (r0 < 0) goto L1e
                Yue.ۥ۠ۨۧۡ r3 = r4.f12435
                java.lang.Object r3 = r3.mo2040(r0, r1)
                if (r3 != 0) goto L16
                r3 = r1
                goto L1a
            L16:
                int r3 = r3.hashCode()
            L1a:
                int r2 = r2 + r3
                int r0 = r0 + (-1)
                goto La
            L1e:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                int r0 = r0.mo2042()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r3 = this;
                Yue.ۥ۠ۨۧۡ$ۥ r0 = new Yue.ۥ۠ۨۧۡ$ۥ
                Yue.ۥ۠ۨۧۡ r1 = r3.f12435
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                int r2 = r0.mo2043(r2)
                if (r2 < 0) goto Lf
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                r0.mo2046(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                java.util.Map r0 = r0.mo2041()
                boolean r2 = Yue.AbstractC3890.m15699(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                java.util.Map r0 = r0.mo2041()
                boolean r2 = Yue.AbstractC3890.m15700(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12435
                int r0 = r0.mo2042()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                Yue.ۥ۠ۨۧۡ r0 = r2.f12435
                r1 = 0
                java.lang.Object[] r0 = r0.m15704(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                Yue.ۥ۠ۨۧۡ r0 = r2.f12435
                r1 = 0
                java.lang.Object[] r3 = r0.m15705(r3, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C3894 implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f12436;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f12437;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f12438;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC3890 f12439;

        public C3894(Yue.AbstractC3890 r2) {
                r1 = this;
                r1.f12439 = r2
                r1.<init>()
                r0 = 0
                r1.f12438 = r0
                int r2 = r2.mo2042()
                int r2 = r2 + (-1)
                r1.f12436 = r2
                r2 = -1
                r1.f12437 = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r4.f12438
                if (r0 == 0) goto L33
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                Yue.ۥ۠ۨۧۡ r2 = r4.f12439
                int r3 = r4.f12437
                java.lang.Object r2 = r2.mo2040(r3, r1)
                boolean r0 = Yue.C1537.m7667(r0, r2)
                if (r0 == 0) goto L32
                java.lang.Object r5 = r5.getValue()
                Yue.ۥ۠ۨۧۡ r0 = r4.f12439
                int r2 = r4.f12437
                r3 = 1
                java.lang.Object r0 = r0.mo2040(r2, r3)
                boolean r5 = Yue.C1537.m7667(r5, r0)
                if (r5 == 0) goto L32
                r1 = r3
            L32:
                return r1
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r5.<init>(r0)
                throw r5
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r3 = this;
                boolean r0 = r3.f12438
                if (r0 == 0) goto Le
                Yue.ۥ۠ۨۧۡ r0 = r3.f12439
                int r1 = r3.f12437
                r2 = 0
                java.lang.Object r0 = r0.mo2040(r1, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r3 = this;
                boolean r0 = r3.f12438
                if (r0 == 0) goto Le
                Yue.ۥ۠ۨۧۡ r0 = r3.f12439
                int r1 = r3.f12437
                r2 = 1
                java.lang.Object r0 = r0.mo2040(r1, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f12437
                int r1 = r2.f12436
                if (r0 >= r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r5 = this;
                boolean r0 = r5.f12438
                if (r0 == 0) goto L27
                Yue.ۥ۠ۨۧۡ r0 = r5.f12439
                int r1 = r5.f12437
                r2 = 0
                java.lang.Object r0 = r0.mo2040(r1, r2)
                Yue.ۥ۠ۨۧۡ r1 = r5.f12439
                int r3 = r5.f12437
                r4 = 1
                java.lang.Object r1 = r1.mo2040(r3, r4)
                if (r0 != 0) goto L1a
                r0 = r2
                goto L1e
            L1a:
                int r0 = r0.hashCode()
            L1e:
                if (r1 != 0) goto L21
                goto L25
            L21:
                int r2 = r1.hashCode()
            L25:
                r0 = r0 ^ r2
                return r0
            L27:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.m15707()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.f12438
                if (r0 == 0) goto L1b
                Yue.ۥ۠ۨۧۡ r0 = r2.f12439
                int r1 = r2.f12437
                r0.mo2046(r1)
                int r0 = r2.f12437
                int r0 = r0 + (-1)
                r2.f12437 = r0
                int r0 = r2.f12436
                int r0 = r0 + (-1)
                r2.f12436 = r0
                r0 = 0
                r2.f12438 = r0
                return
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                boolean r0 = r2.f12438
                if (r0 == 0) goto Ld
                Yue.ۥ۠ۨۧۡ r0 = r2.f12439
                int r1 = r2.f12437
                java.lang.Object r3 = r0.mo2047(r1, r3)
                return r3
            Ld:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r3.<init>(r0)
                throw r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.util.Map.Entry<K, V> m15707() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                int r0 = r2.f12437
                r1 = 1
                int r0 = r0 + r1
                r2.f12437 = r0
                r2.f12438 = r1
                return r2
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public final class C3895 implements java.util.Collection<V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC3890 f12440;

        public C3895(Yue.AbstractC3890 r1) {
                r0 = this;
                r0.f12440 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public boolean add(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public void clear() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12440
                r0.mo2039()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12440
                int r2 = r0.mo2044(r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12440
                int r0 = r0.mo2042()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r3 = this;
                Yue.ۥ۠ۨۧۡ$ۥ r0 = new Yue.ۥ۠ۨۧۡ$ۥ
                Yue.ۥ۠ۨۧۡ r1 = r3.f12440
                r2 = 1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12440
                int r2 = r0.mo2044(r2)
                if (r2 < 0) goto Lf
                Yue.ۥ۠ۨۧۡ r0 = r1.f12440
                r0.mo2046(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r6) {
                r5 = this;
                Yue.ۥ۠ۨۧۡ r0 = r5.f12440
                int r0 = r0.mo2042()
                r1 = 0
                r2 = r1
            L8:
                if (r1 >= r0) goto L23
                Yue.ۥ۠ۨۧۡ r3 = r5.f12440
                r4 = 1
                java.lang.Object r3 = r3.mo2040(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 == 0) goto L21
                Yue.ۥ۠ۨۧۡ r2 = r5.f12440
                r2.mo2046(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = r4
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r6) {
                r5 = this;
                Yue.ۥ۠ۨۧۡ r0 = r5.f12440
                int r0 = r0.mo2042()
                r1 = 0
                r2 = r1
            L8:
                if (r1 >= r0) goto L23
                Yue.ۥ۠ۨۧۡ r3 = r5.f12440
                r4 = 1
                java.lang.Object r3 = r3.mo2040(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 != 0) goto L21
                Yue.ۥ۠ۨۧۡ r2 = r5.f12440
                r2.mo2046(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = r4
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public int size() {
                r1 = this;
                Yue.ۥ۠ۨۧۡ r0 = r1.f12440
                int r0 = r0.mo2042()
                return r0
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                Yue.ۥ۠ۨۧۡ r0 = r2.f12440
                r1 = 1
                java.lang.Object[] r0 = r0.m15704(r1)
                return r0
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                Yue.ۥ۠ۨۧۡ r0 = r2.f12440
                r1 = 1
                java.lang.Object[] r3 = r0.m15705(r3, r1)
                return r3
        }
    }

    public AbstractC3890() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static <K, V> boolean m15697(java.util.Map<K, V> r1, java.util.Collection<?> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> boolean m15698(java.util.Set<T> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1e
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        L1e:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static <K, V> boolean m15699(java.util.Map<K, V> r2, java.util.Collection<?> r3) {
            int r0 = r2.size()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L8
        L16:
            int r2 = r2.size()
            if (r0 == r2) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static <K, V> boolean m15700(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            int r0 = r3.size()
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto Lc
            r1.remove()
            goto Lc
        L20:
            int r3 = r3.size()
            if (r0 == r3) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            return r3
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo2039();

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract java.lang.Object mo2040(int r1, int r2);

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract java.util.Map<K, V> mo2041();

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public abstract int mo2042();

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract int mo2043(java.lang.Object r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract int mo2044(java.lang.Object r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public abstract void mo2045(K r1, V r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public abstract void mo2046(int r1);

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public abstract V mo2047(int r1, V r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.util.Set<java.util.Map.Entry<K, V>> m15701() {
            r1 = this;
            Yue.ۥ۠ۨۧۡ<K, V>$ۥ۟ r0 = r1.f12426
            if (r0 != 0) goto Lb
            Yue.ۥ۠ۨۧۡ$ۥ۟ r0 = new Yue.ۥ۠ۨۧۡ$ۥ۟
            r0.<init>(r1)
            r1.f12426 = r0
        Lb:
            Yue.ۥ۠ۨۧۡ<K, V>$ۥ۟ r0 = r1.f12426
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.util.Set<K> m15702() {
            r1 = this;
            Yue.ۥ۠ۨۧۡ<K, V>$ۥ۟۟ r0 = r1.f12427
            if (r0 != 0) goto Lb
            Yue.ۥ۠ۨۧۡ$ۥ۟۟ r0 = new Yue.ۥ۠ۨۧۡ$ۥ۟۟
            r0.<init>(r1)
            r1.f12427 = r0
        Lb:
            Yue.ۥ۠ۨۧۡ<K, V>$ۥ۟۟ r0 = r1.f12427
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public java.util.Collection<V> m15703() {
            r1 = this;
            Yue.ۥ۠ۨۧۡ<K, V>$ۥ۟۟۟۟ r0 = r1.f12428
            if (r0 != 0) goto Lb
            Yue.ۥ۠ۨۧۡ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۨۧۡ$ۥ۟۟۟۟
            r0.<init>(r1)
            r1.f12428 = r0
        Lb:
            Yue.ۥ۠ۨۧۡ<K, V>$ۥ۟۟۟۟ r0 = r1.f12428
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public java.lang.Object[] m15704(int r5) {
            r4 = this;
            int r0 = r4.mo2042()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r4.mo2040(r2, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public <T> T[] m15705(T[] r4, int r5) {
            r3 = this;
            int r0 = r3.mo2042()
            int r1 = r4.length
            if (r1 >= r0) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L21
            java.lang.Object r2 = r3.mo2040(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L16
        L21:
            int r5 = r4.length
            if (r5 <= r0) goto L27
            r5 = 0
            r4[r0] = r5
        L27:
            return r4
    }
}
