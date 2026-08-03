package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2399<T> implements Yue.InterfaceC5609<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f7827;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean f7828;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, java.lang.Boolean> f7829;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۠$ۥ, reason: contains not printable characters */
    public static final class C2400 implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f7830;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f7831;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public T f7832;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2399<T> f7833;

        public C2400(Yue.C2399<T> r1) {
                r0 = this;
                r0.f7833 = r1
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C2399.m11087(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f7830 = r1
                r1 = -1
                r0.f7831 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f7831
                r1 = -1
                if (r0 != r1) goto L8
                r2.m11088()
            L8:
                int r0 = r2.f7831
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
                int r0 = r3.f7831
                r1 = -1
                if (r0 != r1) goto L8
                r3.m11088()
            L8:
                int r0 = r3.f7831
                if (r0 == 0) goto L14
                T r0 = r3.f7832
                r2 = 0
                r3.f7832 = r2
                r3.f7831 = r1
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

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m11088() {
                r3 = this;
            L0:
                java.util.Iterator<T> r0 = r3.f7830
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L2c
                java.util.Iterator<T> r0 = r3.f7830
                java.lang.Object r0 = r0.next()
                Yue.ۥ۠ۢ۠<T> r1 = r3.f7833
                Yue.ۥۣ۠ۡ۟ r1 = Yue.C2399.m11085(r1)
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                Yue.ۥ۠ۢ۠<T> r2 = r3.f7833
                boolean r2 = Yue.C2399.m11086(r2)
                if (r1 != r2) goto L0
                r3.f7832 = r0
                r0 = 1
                r3.f7831 = r0
                return
            L2c:
                r0 = 0
                r3.f7831 = r0
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Iterator<T> m11089() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f7830
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final T m11090() {
                r1 = this;
                T r0 = r1.f7832
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m11091() {
                r1 = this;
                int r0 = r1.f7831
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m11092(@Yue.InterfaceC4543 T r1) {
                r0 = this;
                r0.f7832 = r1
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m11093(int r1) {
                r0 = this;
                r0.f7831 = r1
                return
        }
    }

    public C2399(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, boolean r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f7827 = r2
            r1.f7828 = r3
            r1.f7829 = r4
            return
    }

    public /* synthetic */ C2399(Yue.InterfaceC5609 r1, boolean r2, Yue.InterfaceC2825 r3, int r4, Yue.C1769 r5) {
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r2 = 1
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m11085(Yue.C2399 r0) {
            Yue.ۥۣ۠ۡ۟<T, java.lang.Boolean> r0 = r0.f7829
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m11086(Yue.C2399 r0) {
            boolean r0 = r0.f7828
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m11087(Yue.C2399 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f7827
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥ۠ۢ۠$ۥ r0 = new Yue.ۥ۠ۢ۠$ۥ
            r0.<init>(r1)
            return r0
    }
}
