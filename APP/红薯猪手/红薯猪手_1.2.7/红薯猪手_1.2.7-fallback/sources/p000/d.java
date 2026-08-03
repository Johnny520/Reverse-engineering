package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<E> extends p000.c<E> implements java.util.List<E> {

    public class a implements java.util.Iterator<E>, p000.n4 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f275;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ p000.d<E> f276;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(p000.d r1) {
                r0 = this;
                r0.f276 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.f275
                ۟.d<E> r1 = r2.f276
                int r1 = r1.mo86()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public final E next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L13
                ۟.d<E> r0 = r3.f276
                int r1 = r3.f275
                int r2 = r1 + 1
                r3.f275 = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public class b extends p000.d<E>.a implements java.util.ListIterator<E> {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ p000.d<E> f277;

        public b(p000.d r4, int r5) {
                r3 = this;
                r3.f277 = r4
                r3.<init>(r4)
                int r4 = r4.mo86()
                if (r5 < 0) goto L10
                if (r5 > r4) goto L10
                r3.f275 = r5
                return
            L10:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = ", size: "
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // java.util.ListIterator
        public final void add(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
                r1 = this;
                int r0 = r1.f275
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
                r1 = this;
                int r0 = r1.f275
                return r0
        }

        @Override // java.util.ListIterator
        public final E previous() {
                r2 = this;
                boolean r0 = r2.hasPrevious()
                if (r0 == 0) goto L13
                ۟.d<E> r0 = r2.f277
                int r1 = r2.f275
                int r1 = r1 + (-1)
                r2.f275 = r1
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
                r1 = this;
                int r0 = r1.f275
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator
        public final void set(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }
    }

    public static final class c<E> extends p000.d<E> implements java.util.RandomAccess {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.d<E> f278;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f279;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f280;

        public c(p000.d<? extends E> r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "list"
                p000.h4.m189(r0, r4)
                r3.<init>()
                r3.f278 = r4
                r3.f279 = r5
                int r4 = r4.mo86()
                java.lang.String r0 = "fromIndex: "
                if (r5 < 0) goto L39
                if (r6 > r4) goto L39
                if (r5 > r6) goto L1c
                int r6 = r6 - r5
                r3.f280 = r6
                return
            L1c:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r5)
                java.lang.String r5 = " > toIndex: "
                r1.append(r5)
                r1.append(r6)
                java.lang.String r5 = r1.toString()
                r4.<init>(r5)
                throw r4
            L39:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = ", toIndex: "
                r2.append(r5)
                r2.append(r6)
                java.lang.String r5 = ", size: "
                r2.append(r5)
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4)
                throw r1
        }

        @Override // p000.d, java.util.List
        public final E get(int r5) {
                r4 = this;
                int r0 = r4.f280
                if (r5 < 0) goto L10
                if (r5 >= r0) goto L10
                ۟.d<E> r0 = r4.f278
                int r1 = r4.f279
                int r1 = r1 + r5
                java.lang.Object r5 = r0.get(r1)
                return r5
            L10:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "index: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = ", size: "
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
        }

        @Override // p000.c
        /* JADX INFO: renamed from: ۥ */
        public final int mo86() {
                r1 = this;
                int r0 = r1.f280
                return r0
        }
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r1 = "other"
            p000.h4.m189(r1, r6)
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L1d
        L1b:
            r0 = r2
            goto L3a
        L1d:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r1 = r5.iterator()
        L25:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r6.next()
            boolean r3 = p000.h4.m185(r3, r4)
            if (r3 != 0) goto L25
            goto L1b
        L3a:
            return r0
    }

    @Override // java.util.List
    public abstract E get(int r1);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 1
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            int r1 = r1 * 31
            if (r2 == 0) goto L18
            int r2 = r2.hashCode()
            goto L19
        L18:
            r2 = 0
        L19:
            int r1 = r1 + r2
            goto L5
        L1b:
            return r1
    }

    @Override // java.util.List
    public int indexOf(E r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = p000.h4.m185(r2, r4)
            if (r2 == 0) goto L16
            goto L1a
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r1 = -1
        L1a:
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
            r1 = this;
            ۟.d$a r0 = new ۟.d$a
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(E r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = p000.h4.m185(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            goto L1e
        L1d:
            r3 = -1
        L1e:
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator() {
            r2 = this;
            ۟.d$b r0 = new ۟.d$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            ۟.d$b r0 = new ۟.d$b
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final E remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public final java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            ۟.d$c r0 = new ۟.d$c
            r0.<init>(r1, r2, r3)
            return r0
    }
}
