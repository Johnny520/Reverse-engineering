package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6107<T> implements Yue.InterfaceC5609<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f22049;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, java.lang.Boolean> f22050;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ$ۥ, reason: contains not printable characters */
    public static final class C6108 implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f22051;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f22052;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public T f22053;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6107<T> f22054;

        public C6108(Yue.C6107<T> r1) {
                r0 = this;
                r0.f22054 = r1
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C6107.m22919(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f22051 = r1
                r1 = -1
                r0.f22052 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        private final void m22920() {
                r2 = this;
                java.util.Iterator<T> r0 = r2.f22051
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L26
                java.util.Iterator<T> r0 = r2.f22051
                java.lang.Object r0 = r0.next()
                Yue.ۥۣۢ۠ۨ<T> r1 = r2.f22054
                Yue.ۥۣ۠ۡ۟ r1 = Yue.C6107.m22918(r1)
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L26
                r1 = 1
                r2.f22052 = r1
                r2.f22053 = r0
                return
            L26:
                r0 = 0
                r2.f22052 = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f22052
                r1 = -1
                if (r0 != r1) goto L8
                r2.m22920()
            L8:
                int r0 = r2.f22052
                r1 = 1
                if (r0 != r1) goto Le
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.f22052
                r1 = -1
                if (r0 != r1) goto L8
                r3.m22920()
            L8:
                int r0 = r3.f22052
                if (r0 == 0) goto L14
                T r0 = r3.f22053
                r2 = 0
                r3.f22053 = r2
                r3.f22052 = r1
                return r0
            L14:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Iterator<T> m22921() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f22051
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final T m22922() {
                r1 = this;
                T r0 = r1.f22053
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m22923() {
                r1 = this;
                int r0 = r1.f22052
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m22924(@Yue.InterfaceC4543 T r1) {
                r0 = this;
                r0.f22053 = r1
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m22925(int r1) {
                r0 = this;
                r0.f22052 = r1
                return
        }
    }

    public C6107(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f22049 = r2
            r1.f22050 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m22918(Yue.C6107 r0) {
            Yue.ۥۣ۠ۡ۟<T, java.lang.Boolean> r0 = r0.f22050
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m22919(Yue.C6107 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f22049
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥۣۢ۠ۨ$ۥ r0 = new Yue.ۥۣۢ۠ۨ$ۥ
            r0.<init>(r1)
            return r0
    }
}
