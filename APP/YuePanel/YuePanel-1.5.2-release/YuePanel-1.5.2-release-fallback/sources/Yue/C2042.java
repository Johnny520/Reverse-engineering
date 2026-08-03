package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2042<T> implements Yue.InterfaceC5609<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f6526;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, java.lang.Boolean> f6527;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۢ$ۥ, reason: contains not printable characters */
    public static final class C2043 implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f6528;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6529;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public T f6530;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2042<T> f6531;

        public C2043(Yue.C2042<T> r1) {
                r0 = this;
                r0.f6531 = r1
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C2042.m9429(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f6528 = r1
                r1 = -1
                r0.f6529 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        private final void m9430() {
                r2 = this;
            L0:
                java.util.Iterator<T> r0 = r2.f6528
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L26
                java.util.Iterator<T> r0 = r2.f6528
                java.lang.Object r0 = r0.next()
                Yue.ۥۣ۠۠ۢ<T> r1 = r2.f6531
                Yue.ۥۣ۠ۡ۟ r1 = Yue.C2042.m9428(r1)
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L0
                r2.f6530 = r0
                r0 = 1
                r2.f6529 = r0
                return
            L26:
                r0 = 0
                r2.f6529 = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f6529
                r1 = -1
                if (r0 != r1) goto L8
                r2.m9430()
            L8:
                int r0 = r2.f6529
                r1 = 1
                if (r0 == r1) goto L17
                java.util.Iterator<T> r0 = r2.f6528
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L16
                goto L17
            L16:
                r1 = 0
            L17:
                return r1
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                int r0 = r2.f6529
                r1 = -1
                if (r0 != r1) goto L8
                r2.m9430()
            L8:
                int r0 = r2.f6529
                r1 = 1
                if (r0 != r1) goto L16
                T r0 = r2.f6530
                r1 = 0
                r2.f6530 = r1
                r1 = 0
                r2.f6529 = r1
                return r0
            L16:
                java.util.Iterator<T> r0 = r2.f6528
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m9431() {
                r1 = this;
                int r0 = r1.f6529
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.Iterator<T> m9432() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f6528
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final T m9433() {
                r1 = this;
                T r0 = r1.f6530
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m9434(int r1) {
                r0 = this;
                r0.f6529 = r1
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m9435(@Yue.InterfaceC4543 T r1) {
                r0 = this;
                r0.f6530 = r1
                return
        }
    }

    public C2042(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f6526 = r2
            r1.f6527 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m9428(Yue.C2042 r0) {
            Yue.ۥۣ۠ۡ۟<T, java.lang.Boolean> r0 = r0.f6527
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m9429(Yue.C2042 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f6526
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥۣ۠۠ۢ$ۥ r0 = new Yue.ۥۣ۠۠ۢ$ۥ
            r0.<init>(r1)
            return r0
    }
}
