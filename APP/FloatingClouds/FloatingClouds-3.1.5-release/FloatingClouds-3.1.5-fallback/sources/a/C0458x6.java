package a;

/* JADX INFO: renamed from: a.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0458x6<T> implements a.Pd<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Bf f760a;
    public final a.C0232kd b;

    /* JADX INFO: renamed from: a.x6$a */
    public static final class a implements java.util.Iterator<T>, a.InterfaceC0336q9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.Iterator<T> f761a;
        public int b;
        public T c;
        public final /* synthetic */ a.C0458x6<T> d;

        public a(a.C0458x6<T> r2) {
                r1 = this;
                r1.<init>()
                r1.d = r2
                a.Bf r2 = r2.f760a
                a.Bf$a r0 = new a.Bf$a
                r0.<init>(r2)
                r1.f761a = r0
                r2 = -1
                r1.b = r2
                return
        }

        public final void a() {
                r2 = this;
            L0:
                java.util.Iterator<T> r0 = r2.f761a
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r0 = r0.next()
                a.x6<T> r1 = r2.d
                a.kd r1 = r1.b
                java.lang.Object r1 = r1.f(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L0
                r2.c = r0
                r0 = 1
                r2.b = r0
                return
            L22:
                r0 = 0
                r2.b = r0
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                r1 = -1
                if (r0 != r1) goto L8
                r2.a()
            L8:
                int r0 = r2.b
                r1 = 1
                if (r0 != r1) goto Le
                return r1
            Le:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final T next() {
                r3 = this;
                int r0 = r3.b
                r1 = -1
                if (r0 != r1) goto L8
                r3.a()
            L8:
                int r0 = r3.b
                if (r0 == 0) goto L14
                T r0 = r3.c
                r2 = 0
                r3.c = r2
                r3.b = r1
                return r0
            L14:
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

    public C0458x6(a.Bf r1, a.C0232kd r2) {
            r0 = this;
            r0.<init>()
            r0.f760a = r1
            r0.b = r2
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<T> iterator() {
            r1 = this;
            a.x6$a r0 = new a.x6$a
            r0.<init>(r1)
            return r0
    }
}
