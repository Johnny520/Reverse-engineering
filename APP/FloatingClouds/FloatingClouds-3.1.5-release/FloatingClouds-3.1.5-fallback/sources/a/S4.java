package a;

/* JADX INFO: loaded from: classes.dex */
public final class S4 implements a.Pd<a.C0139f9> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f254a;
    public final a.C0184i0 b;

    public static final class a implements java.util.Iterator<a.C0139f9>, a.InterfaceC0336q9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f255a;
        public int b;
        public int c;
        public a.C0139f9 d;
        public int e;
        public final /* synthetic */ a.S4 f;

        public a(a.S4 r2) {
                r1 = this;
                r1.<init>()
                r1.f = r2
                r0 = -1
                r1.f255a = r0
                r2.getClass()
                java.lang.String r2 = r2.f254a
                int r2 = r2.length()
                r0 = 0
                int r2 = a.Oc.C(r0, r0, r2)
                r1.b = r2
                r1.c = r2
                return
        }

        public final void a() {
                r8 = this;
                int r0 = r8.c
                r1 = 0
                if (r0 >= 0) goto Lb
                r8.f255a = r1
                r0 = 0
                r8.d = r0
                return
            Lb:
                a.S4 r2 = r8.f
                r2.getClass()
                int r3 = r8.e
                r4 = 1
                int r3 = r3 + r4
                r8.e = r3
                java.lang.String r5 = r2.f254a
                r6 = 4
                r7 = -1
                if (r3 >= r6) goto L65
                int r3 = r5.length()
                if (r0 <= r3) goto L23
                goto L65
            L23:
                a.i0 r0 = r2.b
                int r2 = r8.c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r0 = r0.e(r5, r2)
                a.mc r0 = (a.C0267mc) r0
                if (r0 != 0) goto L43
                a.f9 r0 = new a.f9
                int r1 = r8.b
                int r2 = a.Be.K(r5)
                r0.<init>(r1, r2, r4)
                r8.d = r0
                r8.c = r7
                goto L74
            L43:
                A r2 = r0.f578a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r8.b
                a.f9 r3 = a.Oc.D(r3, r2)
                r8.d = r3
                int r2 = r2 + r0
                r8.b = r2
                if (r0 != 0) goto L61
                r1 = r4
            L61:
                int r2 = r2 + r1
                r8.c = r2
                goto L74
            L65:
                a.f9 r0 = new a.f9
                int r1 = r8.b
                int r2 = a.Be.K(r5)
                r0.<init>(r1, r2, r4)
                r8.d = r0
                r8.c = r7
            L74:
                r8.f255a = r4
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.f255a
                r1 = -1
                if (r0 != r1) goto L8
                r2.a()
            L8:
                int r0 = r2.f255a
                r1 = 1
                if (r0 != r1) goto Le
                return r1
            Le:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final a.C0139f9 next() {
                r3 = this;
                int r0 = r3.f255a
                r1 = -1
                if (r0 != r1) goto L8
                r3.a()
            L8:
                int r0 = r3.f255a
                if (r0 == 0) goto L19
                a.f9 r0 = r3.d
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.ranges.IntRange"
                a.C0193i9.c(r0, r2)
                r2 = 0
                r3.d = r2
                r3.f255a = r1
                return r0
            L19:
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

    public S4(java.lang.String r1, a.C0184i0 r2) {
            r0 = this;
            r0.<init>()
            r0.f254a = r1
            r0.b = r2
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<a.C0139f9> iterator() {
            r1 = this;
            a.S4$a r0 = new a.S4$a
            r0.<init>(r1)
            return r0
    }
}
