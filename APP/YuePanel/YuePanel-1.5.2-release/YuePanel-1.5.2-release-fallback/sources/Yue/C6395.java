package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6395<T, R> implements Yue.InterfaceC5609<R> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f22627;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, R> f22628;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۥ$ۥ, reason: contains not printable characters */
    public static final class C6396 implements java.util.Iterator<R>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f22629;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6395<T, R> f22630;

        public C6396(Yue.C6395<T, R> r1) {
                r0 = this;
                r0.f22630 = r1
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C6395.m23619(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f22629 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f22629
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public R next() {
                r2 = this;
                Yue.ۥۢۢ۟ۥ<T, R> r0 = r2.f22630
                Yue.ۥۣ۠ۡ۟ r0 = Yue.C6395.m23620(r0)
                java.util.Iterator<T> r1 = r2.f22629
                java.lang.Object r1 = r1.next()
                java.lang.Object r0 = r0.invoke(r1)
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

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.Iterator<T> m23622() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f22629
                return r0
        }
    }

    public C6395(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transformer"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f22627 = r2
            r1.f22628 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m23619(Yue.C6395 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f22627
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m23620(Yue.C6395 r0) {
            Yue.ۥۣ۠ۡ۟<T, R> r0 = r0.f22628
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<R> iterator() {
            r1 = this;
            Yue.ۥۢۢ۟ۥ$ۥ r0 = new Yue.ۥۢۢ۟ۥ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final <E> Yue.InterfaceC5609<E> m23621(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super R, ? extends java.util.Iterator<? extends E>> r4) {
            r3 = this;
            java.lang.String r0 = "iterator"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۢۢ۟ r0 = new Yue.ۥ۠ۢۢ۟
            Yue.ۥۡۨۢ<T> r1 = r3.f22627
            Yue.ۥۣ۠ۡ۟<T, R> r2 = r3.f22628
            r0.<init>(r1, r2, r4)
            return r0
    }
}
