package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2434<T, R, E> implements Yue.InterfaceC5609<E> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f8117;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, R> f8118;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<R, java.util.Iterator<E>> f8119;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۟$ۥ, reason: contains not printable characters */
    public static final class C2435 implements java.util.Iterator<E>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f8120;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public java.util.Iterator<? extends E> f8121;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2434<T, R, E> f8122;

        public C2435(Yue.C2434<T, R, E> r1) {
                r0 = this;
                r0.f8122 = r1
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C2434.m11268(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f8120 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.m11270()
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r1 = this;
                boolean r0 = r1.m11270()
                if (r0 == 0) goto L10
                java.util.Iterator<? extends E> r0 = r1.f8121
                Yue.C3329.m13903(r0)
                java.lang.Object r0 = r0.next()
                return r0
            L10:
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
        public final boolean m11270() {
                r4 = this;
                java.util.Iterator<? extends E> r0 = r4.f8121
                if (r0 == 0) goto Ld
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Ld
                r0 = 0
                r4.f8121 = r0
            Ld:
                java.util.Iterator<? extends E> r0 = r4.f8121
                r1 = 1
                if (r0 != 0) goto L40
                java.util.Iterator<T> r0 = r4.f8120
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L1c
                r0 = 0
                return r0
            L1c:
                java.util.Iterator<T> r0 = r4.f8120
                java.lang.Object r0 = r0.next()
                Yue.ۥ۠ۢۢ۟<T, R, E> r2 = r4.f8122
                Yue.ۥۣ۠ۡ۟ r2 = Yue.C2434.m11267(r2)
                Yue.ۥ۠ۢۢ۟<T, R, E> r3 = r4.f8122
                Yue.ۥۣ۠ۡ۟ r3 = Yue.C2434.m11269(r3)
                java.lang.Object r0 = r3.invoke(r0)
                java.lang.Object r0 = r2.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto Ld
                r4.f8121 = r0
            L40:
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Iterator<E> m11271() {
                r1 = this;
                java.util.Iterator<? extends E> r0 = r1.f8121
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.Iterator<T> m11272() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f8120
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m11273(@Yue.InterfaceC4543 java.util.Iterator<? extends E> r1) {
                r0 = this;
                r0.f8121 = r1
                return
        }
    }

    public C2434(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends R> r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super R, ? extends java.util.Iterator<? extends E>> r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transformer"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "iterator"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f8117 = r2
            r1.f8118 = r3
            r1.f8119 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m11267(Yue.C2434 r0) {
            Yue.ۥۣ۠ۡ۟<R, java.util.Iterator<E>> r0 = r0.f8119
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m11268(Yue.C2434 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f8117
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m11269(Yue.C2434 r0) {
            Yue.ۥۣ۠ۡ۟<T, R> r0 = r0.f8118
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<E> iterator() {
            r1 = this;
            Yue.ۥ۠ۢۢ۟$ۥ r0 = new Yue.ۥ۠ۢۢ۟$ۥ
            r0.<init>(r1)
            return r0
    }
}
