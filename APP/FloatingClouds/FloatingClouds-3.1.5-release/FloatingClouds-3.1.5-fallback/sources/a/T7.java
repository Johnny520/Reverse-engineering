package a;

/* JADX INFO: loaded from: classes.dex */
public final class T7<T> implements a.Pd<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.A3 f273a;
    public final a.D7<T, T> b;

    public static final class a implements java.util.Iterator<T>, a.InterfaceC0336q9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f274a;
        public int b;
        public final /* synthetic */ a.T7<T> c;

        public a(a.T7<T> r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r1 = -2
                r0.b = r1
                return
        }

        public final void a() {
                r3 = this;
                int r0 = r3.b
                r1 = -2
                a.T7<T> r2 = r3.c
                if (r0 != r1) goto Le
                a.A3 r0 = r2.f273a
                java.lang.Object r0 = r0.b
                java.lang.Class r0 = (java.lang.Class) r0
                goto L19
            Le:
                a.D7<T, T> r0 = r2.b
                T r1 = r3.f274a
                a.C0193i9.b(r1)
                java.lang.Object r0 = r0.f(r1)
            L19:
                r3.f274a = r0
                if (r0 != 0) goto L1f
                r0 = 0
                goto L20
            L1f:
                r0 = 1
            L20:
                r3.b = r0
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                if (r0 >= 0) goto L7
                r2.a()
            L7:
                int r0 = r2.b
                r1 = 1
                if (r0 != r1) goto Ld
                return r1
            Ld:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final T next() {
                r2 = this;
                int r0 = r2.b
                if (r0 >= 0) goto L7
                r2.a()
            L7:
                int r0 = r2.b
                if (r0 == 0) goto L16
                T r0 = r2.f274a
                java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"
                a.C0193i9.c(r0, r1)
                r1 = -1
                r2.b = r1
                return r0
            L16:
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

    public T7(a.A3 r1, a.D7 r2) {
            r0 = this;
            r0.<init>()
            r0.f273a = r1
            r0.b = r2
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<T> iterator() {
            r1 = this;
            a.T7$a r0 = new a.T7$a
            r0.<init>(r1)
            return r0
    }
}
