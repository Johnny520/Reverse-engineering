package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z9<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.Z9<K, V>.b f373a;
    public a.Z9<K, V>.c b;
    public a.Z9<K, V>.e c;

    public final class a<T> implements java.util.Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f374a;
        public int b;
        public int c;
        public boolean d;
        public final /* synthetic */ a.Z9 e;

        public a(a.Z9 r2, int r3) {
                r1 = this;
                r1.<init>()
                r1.e = r2
                r0 = 0
                r1.d = r0
                r1.f374a = r3
                int r2 = r2.d()
                r1.b = r2
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.c
                int r1 = r2.b
                if (r0 >= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                int r0 = r3.c
                int r1 = r3.f374a
                a.Z9 r2 = r3.e
                java.lang.Object r0 = r2.b(r0, r1)
                int r1 = r3.c
                r2 = 1
                int r1 = r1 + r2
                r3.c = r1
                r3.d = r2
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto L19
                int r0 = r2.c
                int r0 = r0 + (-1)
                r2.c = r0
                int r1 = r2.b
                int r1 = r1 + (-1)
                r2.b = r1
                r1 = 0
                r2.d = r1
                a.Z9 r1 = r2.e
                r1.h(r0)
                return
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    public final class b implements java.util.Set<java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Z9 f375a;

        public b(a.Z9 r1) {
                r0 = this;
                r0.<init>()
                r0.f375a = r1
                return
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
                r4 = this;
                a.Z9 r0 = r4.f375a
                int r1 = r0.d()
                java.util.Iterator r5 = r5.iterator()
            La:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L22
                java.lang.Object r2 = r5.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                r0.g(r3, r2)
                goto La
            L22:
                int r5 = r0.d()
                if (r1 == r5) goto L2a
                r5 = 1
                return r5
            L2a:
                r5 = 0
                return r5
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
                r1 = this;
                a.Z9 r0 = r1.f375a
                r0.a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                goto L14
            L6:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                a.Z9 r2 = r4.f375a
                int r0 = r2.e(r0)
                if (r0 >= 0) goto L15
            L14:
                return r1
            L15:
                r3 = 1
                java.lang.Object r0 = r2.b(r0, r3)
                java.lang.Object r5 = r5.getValue()
                if (r0 == r5) goto L2a
                if (r0 == 0) goto L29
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L29
                goto L2a
            L29:
                return r1
            L2a:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(java.util.Collection<?> r2) {
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
        public final boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = a.Z9.j(r1, r0)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
                r7 = this;
                a.Z9 r0 = r7.f375a
                int r1 = r0.d()
                r2 = 1
                int r1 = r1 - r2
                r3 = 0
                r4 = r3
            La:
                if (r1 < 0) goto L29
                java.lang.Object r5 = r0.b(r1, r3)
                java.lang.Object r6 = r0.b(r1, r2)
                if (r5 != 0) goto L18
                r5 = r3
                goto L1c
            L18:
                int r5 = r5.hashCode()
            L1c:
                if (r6 != 0) goto L20
                r6 = r3
                goto L24
            L20:
                int r6 = r6.hashCode()
            L24:
                r5 = r5 ^ r6
                int r4 = r4 + r5
                int r1 = r1 + (-1)
                goto La
            L29:
                return r4
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
                r1 = this;
                a.Z9 r0 = r1.f375a
                int r0 = r0.d()
                if (r0 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                a.Z9$d r0 = new a.Z9$d
                a.Z9 r1 = r2.f375a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
                r1 = this;
                a.Z9 r0 = r1.f375a
                int r0 = r0.d()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public final java.lang.Object[] toArray() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    public final class c implements java.util.Set<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Z9 f376a;

        public c(a.Z9 r1) {
                r0 = this;
                r0.<init>()
                r0.f376a = r1
                return
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
                r1 = this;
                a.Z9 r0 = r1.f376a
                r0.a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(java.lang.Object r2) {
                r1 = this;
                a.Z9 r0 = r1.f376a
                int r2 = r0.e(r2)
                if (r2 < 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(java.util.Collection<?> r3) {
                r2 = this;
                a.Z9 r0 = r2.f376a
                java.util.Map r0 = r0.c()
                java.util.Iterator r3 = r3.iterator()
            La:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r3.next()
                boolean r1 = r0.containsKey(r1)
                if (r1 != 0) goto La
                r3 = 0
                return r3
            L1c:
                r3 = 1
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = a.Z9.j(r1, r0)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
                r5 = this;
                a.Z9 r0 = r5.f376a
                int r1 = r0.d()
                int r1 = r1 + (-1)
                r2 = 0
                r3 = r2
            La:
                if (r1 < 0) goto L1c
                java.lang.Object r4 = r0.b(r1, r2)
                if (r4 != 0) goto L14
                r4 = r2
                goto L18
            L14:
                int r4 = r4.hashCode()
            L18:
                int r3 = r3 + r4
                int r1 = r1 + (-1)
                goto La
            L1c:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
                r1 = this;
                a.Z9 r0 = r1.f376a
                int r0 = r0.d()
                if (r0 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<K> iterator() {
                r3 = this;
                a.Z9$a r0 = new a.Z9$a
                a.Z9 r1 = r3.f376a
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(java.lang.Object r2) {
                r1 = this;
                a.Z9 r0 = r1.f376a
                int r2 = r0.e(r2)
                if (r2 < 0) goto Ld
                r0.h(r2)
                r2 = 1
                return r2
            Ld:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> r4) {
                r3 = this;
                a.Z9 r0 = r3.f376a
                java.util.Map r0 = r0.c()
                int r1 = r0.size()
                java.util.Iterator r4 = r4.iterator()
            Le:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L1c
                java.lang.Object r2 = r4.next()
                r0.remove(r2)
                goto Le
            L1c:
                int r4 = r0.size()
                if (r1 == r4) goto L24
                r4 = 1
                return r4
            L24:
                r4 = 0
                return r4
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                a.Z9 r0 = r4.f376a
                java.util.Map r0 = r0.c()
                int r1 = r0.size()
                java.util.Set r2 = r0.keySet()
                java.util.Iterator r2 = r2.iterator()
            L12:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L26
                java.lang.Object r3 = r2.next()
                boolean r3 = r5.contains(r3)
                if (r3 != 0) goto L12
                r2.remove()
                goto L12
            L26:
                int r5 = r0.size()
                if (r1 == r5) goto L2e
                r5 = 1
                return r5
            L2e:
                r5 = 0
                return r5
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
                r1 = this;
                a.Z9 r0 = r1.f376a
                int r0 = r0.d()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public final java.lang.Object[] toArray() {
                r6 = this;
                a.Z9 r0 = r6.f376a
                int r1 = r0.d()
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                r4 = r3
            La:
                if (r4 >= r1) goto L15
                java.lang.Object r5 = r0.b(r4, r3)
                r2[r4] = r5
                int r4 = r4 + 1
                goto La
            L15:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] r3) {
                r2 = this;
                a.Z9 r0 = r2.f376a
                r1 = 0
                java.lang.Object[] r3 = r0.k(r1, r3)
                return r3
        }
    }

    public final class d implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f377a;
        public int b;
        public boolean c;
        public final /* synthetic */ a.Z9 d;

        public d(a.Z9 r2) {
                r1 = this;
                r1.<init>()
                r1.d = r2
                r0 = 0
                r1.c = r0
                int r2 = r2.d()
                int r2 = r2 + (-1)
                r1.f377a = r2
                r2 = -1
                r1.b = r2
                return
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r4.c
                if (r0 == 0) goto L3c
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                int r2 = r4.b
                a.Z9 r3 = r4.d
                java.lang.Object r2 = r3.b(r2, r1)
                if (r0 == r2) goto L24
                if (r0 == 0) goto L23
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L23
                goto L24
            L23:
                return r1
            L24:
                java.lang.Object r5 = r5.getValue()
                int r0 = r4.b
                r2 = 1
                java.lang.Object r0 = r3.b(r0, r2)
                if (r5 == r0) goto L3b
                if (r5 == 0) goto L3a
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L3a
                goto L3b
            L3a:
                return r1
            L3b:
                return r2
            L3c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r5.<init>(r0)
                throw r5
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
                r3 = this;
                boolean r0 = r3.c
                if (r0 == 0) goto Le
                int r0 = r3.b
                a.Z9 r1 = r3.d
                r2 = 0
                java.lang.Object r0 = r1.b(r0, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
                r3 = this;
                boolean r0 = r3.c
                if (r0 == 0) goto Le
                int r0 = r3.b
                a.Z9 r1 = r3.d
                r2 = 1
                java.lang.Object r0 = r1.b(r0, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                int r1 = r2.f377a
                if (r0 >= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
                r5 = this;
                boolean r0 = r5.c
                if (r0 == 0) goto L25
                int r0 = r5.b
                a.Z9 r1 = r5.d
                r2 = 0
                java.lang.Object r0 = r1.b(r0, r2)
                int r3 = r5.b
                r4 = 1
                java.lang.Object r1 = r1.b(r3, r4)
                if (r0 != 0) goto L18
                r0 = r2
                goto L1c
            L18:
                int r0 = r0.hashCode()
            L1c:
                if (r1 != 0) goto L1f
                goto L23
            L1f:
                int r2 = r1.hashCode()
            L23:
                r0 = r0 ^ r2
                return r0
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public final java.lang.Object next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                int r0 = r2.b
                r1 = 1
                int r0 = r0 + r1
                r2.b = r0
                r2.c = r1
                return r2
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r2 = this;
                boolean r0 = r2.c
                if (r0 == 0) goto L1b
                a.Z9 r0 = r2.d
                int r1 = r2.b
                r0.h(r1)
                int r0 = r2.b
                int r0 = r0 + (-1)
                r2.b = r0
                int r0 = r2.f377a
                int r0 = r0 + (-1)
                r2.f377a = r0
                r0 = 0
                r2.c = r0
                return
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Map.Entry
        public final V setValue(V r3) {
                r2 = this;
                boolean r0 = r2.c
                if (r0 == 0) goto Ld
                a.Z9 r0 = r2.d
                int r1 = r2.b
                java.lang.Object r3 = r0.i(r1, r3)
                return r3
            Ld:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r3.<init>(r0)
                throw r3
        }

        public final java.lang.String toString() {
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
    }

    public final class e implements java.util.Collection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Z9 f378a;

        public e(a.Z9 r1) {
                r0 = this;
                r0.<init>()
                r0.f378a = r1
                return
        }

        @Override // java.util.Collection
        public final boolean add(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public final boolean addAll(java.util.Collection<? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public final void clear() {
                r1 = this;
                a.Z9 r0 = r1.f378a
                r0.a()
                return
        }

        @Override // java.util.Collection
        public final boolean contains(java.lang.Object r2) {
                r1 = this;
                a.Z9 r0 = r1.f378a
                int r2 = r0.f(r2)
                if (r2 < 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public final boolean containsAll(java.util.Collection<?> r2) {
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
        public final boolean isEmpty() {
                r1 = this;
                a.Z9 r0 = r1.f378a
                int r0 = r0.d()
                if (r0 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
                r3 = this;
                a.Z9$a r0 = new a.Z9$a
                a.Z9 r1 = r3.f378a
                r2 = 1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Collection
        public final boolean remove(java.lang.Object r2) {
                r1 = this;
                a.Z9 r0 = r1.f378a
                int r2 = r0.f(r2)
                if (r2 < 0) goto Ld
                r0.h(r2)
                r2 = 1
                return r2
            Ld:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public final boolean removeAll(java.util.Collection<?> r7) {
                r6 = this;
                a.Z9 r0 = r6.f378a
                int r1 = r0.d()
                r2 = 0
                r3 = r2
            L8:
                if (r2 >= r1) goto L1f
                r4 = 1
                java.lang.Object r5 = r0.b(r2, r4)
                boolean r5 = r7.contains(r5)
                if (r5 == 0) goto L1d
                r0.h(r2)
                int r2 = r2 + (-1)
                int r1 = r1 + (-1)
                r3 = r4
            L1d:
                int r2 = r2 + r4
                goto L8
            L1f:
                return r3
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection<?> r7) {
                r6 = this;
                a.Z9 r0 = r6.f378a
                int r1 = r0.d()
                r2 = 0
                r3 = r2
            L8:
                if (r2 >= r1) goto L1f
                r4 = 1
                java.lang.Object r5 = r0.b(r2, r4)
                boolean r5 = r7.contains(r5)
                if (r5 != 0) goto L1d
                r0.h(r2)
                int r2 = r2 + (-1)
                int r1 = r1 + (-1)
                r3 = r4
            L1d:
                int r2 = r2 + r4
                goto L8
            L1f:
                return r3
        }

        @Override // java.util.Collection
        public final int size() {
                r1 = this;
                a.Z9 r0 = r1.f378a
                int r0 = r0.d()
                return r0
        }

        @Override // java.util.Collection
        public final java.lang.Object[] toArray() {
                r5 = this;
                a.Z9 r0 = r5.f378a
                int r1 = r0.d()
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
            L9:
                if (r3 >= r1) goto L15
                r4 = 1
                java.lang.Object r4 = r0.b(r3, r4)
                r2[r3] = r4
                int r3 = r3 + 1
                goto L9
            L15:
                return r2
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] r3) {
                r2 = this;
                a.Z9 r0 = r2.f378a
                r1 = 1
                java.lang.Object[] r3 = r0.k(r1, r3)
                return r3
        }
    }

    public static boolean j(java.lang.Object r2, java.util.Set r3) {
            if (r3 != r2) goto L3
            goto L19
        L3:
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto L1b
            java.util.Set r2 = (java.util.Set) r2
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L1b
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L1b
            if (r0 != r1) goto L1b
            boolean r2 = r3.containsAll(r2)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
        L19:
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public abstract void a();

    public abstract java.lang.Object b(int r1, int r2);

    public abstract java.util.Map<K, V> c();

    public abstract int d();

    public abstract int e(java.lang.Object r1);

    public abstract int f(java.lang.Object r1);

    public abstract void g(K r1, V r2);

    public abstract void h(int r1);

    public abstract V i(int r1, V r2);

    public final java.lang.Object[] k(int r4, java.lang.Object[] r5) {
            r3 = this;
            int r0 = r3.d()
            int r1 = r5.length
            if (r1 >= r0) goto L15
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r5 = r5.getComponentType()
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L21
            java.lang.Object r2 = r3.b(r1, r4)
            r5[r1] = r2
            int r1 = r1 + 1
            goto L16
        L21:
            int r4 = r5.length
            if (r4 <= r0) goto L27
            r4 = 0
            r5[r0] = r4
        L27:
            return r5
    }
}
