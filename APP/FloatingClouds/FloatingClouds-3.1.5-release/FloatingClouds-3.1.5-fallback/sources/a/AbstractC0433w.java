package a;

/* JADX INFO: renamed from: a.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0433w<E> extends a.AbstractC0397u<E> implements java.util.List<E> {

    /* JADX INFO: renamed from: a.w$a */
    public static final class a {
        public static void a(int r3, int r4, int r5) {
                java.lang.String r0 = "fromIndex: "
                if (r3 < 0) goto L23
                if (r4 > r5) goto L23
                if (r3 > r4) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                r1.append(r3)
                java.lang.String r3 = " > toIndex: "
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r5.<init>(r3)
                throw r5
            L23:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r0)
                r2.append(r3)
                java.lang.String r3 = ", toIndex: "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r3 = ", size: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r3 = r2.toString()
                r1.<init>(r3)
                throw r1
        }
    }

    /* JADX INFO: renamed from: a.w$b */
    public class b implements java.util.Iterator<E>, a.InterfaceC0336q9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f742a;
        public final /* synthetic */ a.AbstractC0433w<E> b;

        public b(a.AbstractC0433w r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.f742a
                a.w<E> r1 = r2.b
                int r1 = r1.a()
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final E next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L13
                int r0 = r2.f742a
                int r1 = r0 + 1
                r2.f742a = r1
                a.w<E> r1 = r2.b
                java.lang.Object r0 = r1.get(r0)
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

    /* JADX INFO: renamed from: a.w$c */
    public class c extends a.AbstractC0433w<E>.b implements java.util.ListIterator<E> {
        public final /* synthetic */ a.AbstractC0433w<E> c;

        public c(a.AbstractC0433w r4, int r5) {
                r3 = this;
                r3.c = r4
                r3.<init>(r4)
                int r4 = r4.a()
                if (r5 < 0) goto L10
                if (r5 > r4) goto L10
                r3.f742a = r5
                return
            L10:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "index: "
                r1.<init>(r2)
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
                int r0 = r1.f742a
                if (r0 <= 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
                r1 = this;
                int r0 = r1.f742a
                return r0
        }

        @Override // java.util.ListIterator
        public final E previous() {
                r2 = this;
                boolean r0 = r2.hasPrevious()
                if (r0 == 0) goto L13
                int r0 = r2.f742a
                int r0 = r0 + (-1)
                r2.f742a = r0
                a.w<E> r1 = r2.c
                java.lang.Object r0 = r1.get(r0)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
                r1 = this;
                int r0 = r1.f742a
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

    /* JADX INFO: renamed from: a.w$d */
    public static final class d<E> extends a.AbstractC0433w<E> implements java.util.RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.AbstractC0433w<E> f743a;
        public final int b;
        public final int c;

        public d(a.AbstractC0433w<? extends E> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f743a = r1
                r0.b = r2
                int r1 = r1.a()
                a.AbstractC0433w.a.a(r2, r3, r1)
                int r3 = r3 - r2
                r0.c = r3
                return
        }

        @Override // a.AbstractC0397u
        public final int a() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        @Override // java.util.List
        public final E get(int r5) {
                r4 = this;
                int r0 = r4.c
                if (r5 < 0) goto L10
                if (r5 >= r0) goto L10
                int r0 = r4.b
                int r0 = r0 + r5
                a.w<E> r5 = r4.f743a
                java.lang.Object r5 = r5.get(r0)
                return r5
            L10:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "index: "
                r2.<init>(r3)
                r2.append(r5)
                java.lang.String r5 = ", size: "
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
        }
    }

    public AbstractC0433w() {
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
            a.C0193i9.e(r6, r1)
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L1c
            goto L38
        L1c:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r1 = r5.iterator()
        L24:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r6.next()
            boolean r3 = a.C0193i9.a(r3, r4)
            if (r3 != 0) goto L24
        L38:
            return r2
        L39:
            return r0
    }

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

    public int indexOf(E r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = a.C0193i9.a(r2, r4)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r4 = -1
            return r4
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
            r1 = this;
            a.w$b r0 = new a.w$b
            r0.<init>(r1)
            return r0
    }

    public int lastIndexOf(E r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            return r3
        L1d:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator() {
            r2 = this;
            a.w$c r0 = new a.w$c
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            a.w$c r0 = new a.w$c
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
            a.w$d r0 = new a.w$d
            r0.<init>(r1, r2, r3)
            return r0
    }
}
