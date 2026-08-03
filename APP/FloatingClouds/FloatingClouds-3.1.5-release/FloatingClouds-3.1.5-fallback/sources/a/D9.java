package a;

/* JADX INFO: loaded from: classes.dex */
public final class D9 implements a.Pd<java.lang.String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.BufferedReader f57a;

    public static final class a implements java.util.Iterator<java.lang.String>, a.InterfaceC0336q9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f58a;
        public boolean b;
        public final /* synthetic */ a.D9 c;

        public a(a.D9 r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                java.lang.String r0 = r2.f58a
                r1 = 1
                if (r0 != 0) goto L17
                boolean r0 = r2.b
                if (r0 != 0) goto L17
                a.D9 r0 = r2.c
                java.io.BufferedReader r0 = r0.f57a
                java.lang.String r0 = r0.readLine()
                r2.f58a = r0
                if (r0 != 0) goto L17
                r2.b = r1
            L17:
                java.lang.String r0 = r2.f58a
                if (r0 == 0) goto L1c
                return r1
            L1c:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final java.lang.String next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                java.lang.String r0 = r2.f58a
                r1 = 0
                r2.f58a = r1
                a.C0193i9.b(r0)
                return r0
            Lf:
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

    public D9(java.io.BufferedReader r1) {
            r0 = this;
            r0.<init>()
            r0.f57a = r1
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            a.D9$a r0 = new a.D9$a
            r0.<init>(r1)
            return r0
    }
}
