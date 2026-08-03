package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6393<T, R> implements Yue.InterfaceC5609<R> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f22622;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<java.lang.Integer, T, R> f22623;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۤ$ۥ, reason: contains not printable characters */
    public static final class C6394 implements java.util.Iterator<R>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f22624;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f22625;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6393<T, R> f22626;

        public C6394(Yue.C6393<T, R> r1) {
                r0 = this;
                r0.f22626 = r1
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C6393.m23614(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f22624 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f22624
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public R next() {
                r3 = this;
                Yue.ۥۢۢ۟ۤ<T, R> r0 = r3.f22626
                Yue.ۥۣ۠ۢۢ r0 = Yue.C6393.m23615(r0)
                int r1 = r3.f22625
                int r2 = r1 + 1
                r3.f22625 = r2
                if (r1 >= 0) goto L11
                Yue.C1208.m6228()
            L11:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.util.Iterator<T> r2 = r3.f22624
                java.lang.Object r2 = r2.next()
                java.lang.Object r0 = r0.invoke(r1, r2)
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

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int m23616() {
                r1 = this;
                int r0 = r1.f22625
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Iterator<T> m23617() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f22624
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m23618(int r1) {
                r0 = this;
                r0.f22625 = r1
                return
        }
    }

    public C6393(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super T, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transformer"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f22622 = r2
            r1.f22623 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m23614(Yue.C6393 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f22622
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2839 m23615(Yue.C6393 r0) {
            Yue.ۥۣ۠ۢۢ<java.lang.Integer, T, R> r0 = r0.f22623
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<R> iterator() {
            r1 = this;
            Yue.ۥۢۢ۟ۤ$ۥ r0 = new Yue.ۥۢۢ۟ۤ$ۥ
            r0.<init>(r1)
            return r0
    }
}
