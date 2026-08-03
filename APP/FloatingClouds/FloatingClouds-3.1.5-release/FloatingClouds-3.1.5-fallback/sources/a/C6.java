package a;

/* JADX INFO: loaded from: classes.dex */
public final class C6<T, R, E> implements a.Pd<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Pd<T> f44a;
    public final a.C0232kd b;

    public static final class a implements java.util.Iterator<E>, a.InterfaceC0336q9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.Iterator<T> f45a;
        public java.util.Iterator<? extends E> b;
        public int c;
        public final /* synthetic */ a.C6<T, R, E> d;

        public a(a.C6<T, R, E> r1) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                a.Pd<T> r1 = r1.f44a
                java.util.Iterator r1 = r1.iterator()
                r0.f45a = r1
                return
        }

        public final boolean a() {
                r4 = this;
                java.util.Iterator<? extends E> r0 = r4.b
                r1 = 1
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Le
                r4.c = r1
                return r1
            Le:
                java.util.Iterator<T> r0 = r4.f45a
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L38
                java.lang.Object r0 = r0.next()
                a.C6<T, R, E> r2 = r4.d
                r2.getClass()
                a.Td r3 = a.Td.i
                a.kd r2 = r2.b
                java.lang.Object r0 = r2.f(r0)
                java.lang.Object r0 = r3.f(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto Le
                r4.b = r0
                r4.c = r1
                return r1
            L38:
                r0 = 2
                r4.c = r0
                r0 = 0
                r4.b = r0
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.c
                r1 = 1
                if (r0 != r1) goto L6
                return r1
            L6:
                r1 = 2
                if (r0 != r1) goto Lb
                r0 = 0
                return r0
            Lb:
                boolean r0 = r2.a()
                return r0
        }

        @Override // java.util.Iterator
        public final E next() {
                r2 = this;
                int r0 = r2.c
                r1 = 2
                if (r0 == r1) goto L21
                if (r0 != 0) goto L14
                boolean r0 = r2.a()
                if (r0 == 0) goto Le
                goto L14
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
            L14:
                r0 = 0
                r2.c = r0
                java.util.Iterator<? extends E> r0 = r2.b
                a.C0193i9.b(r0)
                java.lang.Object r0 = r0.next()
                return r0
            L21:
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

    public C6(a.Pd r2, a.C0232kd r3) {
            r1 = this;
            a.Td r0 = a.Td.i
            r1.<init>()
            r1.f44a = r2
            r1.b = r3
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<E> iterator() {
            r1 = this;
            a.C6$a r0 = new a.C6$a
            r0.<init>(r1)
            return r0
    }
}
