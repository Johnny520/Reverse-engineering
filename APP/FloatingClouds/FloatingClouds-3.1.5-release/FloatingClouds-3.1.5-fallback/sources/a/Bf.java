package a;

/* JADX INFO: loaded from: classes.dex */
public final class Bf<T, R> implements a.Pd<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.M1 f33a;
    public final a.D7<T, R> b;

    public static final class a implements java.util.Iterator<R>, a.InterfaceC0336q9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.Iterator<T> f34a;
        public final /* synthetic */ a.Bf<T, R> b;

        public a(a.Bf<T, R> r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                a.M1 r1 = r1.f33a
                java.lang.Object r1 = r1.b
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
                r0.f34a = r1
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f34a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public final R next() {
                r2 = this;
                a.Bf<T, R> r0 = r2.b
                a.D7<T, R> r0 = r0.b
                java.util.Iterator<T> r1 = r2.f34a
                java.lang.Object r1 = r1.next()
                java.lang.Object r0 = r0.f(r1)
                return r0
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

    public Bf(a.M1 r1, a.D7 r2) {
            r0 = this;
            r0.<init>()
            r0.f33a = r1
            r0.b = r2
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<R> iterator() {
            r1 = this;
            a.Bf$a r0 = new a.Bf$a
            r0.<init>(r1)
            return r0
    }
}
