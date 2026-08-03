package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4146<T1, T2, V> implements Yue.InterfaceC5609<V> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T1> f12713;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T2> f12714;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<T1, T2, V> f12715;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۧۡ$ۥ, reason: contains not printable characters */
    public static final class C4147 implements java.util.Iterator<V>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T1> f12716;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T2> f12717;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4146<T1, T2, V> f12718;

        public C4147(Yue.C4146<T1, T2, V> r2) {
                r1 = this;
                r1.f12718 = r2
                r1.<init>()
                Yue.ۥۡۨۢ r0 = Yue.C4146.m16249(r2)
                java.util.Iterator r0 = r0.iterator()
                r1.f12716 = r0
                Yue.ۥۡۨۢ r2 = Yue.C4146.m16250(r2)
                java.util.Iterator r2 = r2.iterator()
                r1.f12717 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T1> r0 = r1.f12716
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L12
                java.util.Iterator<T2> r0 = r1.f12717
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // java.util.Iterator
        public V next() {
                r3 = this;
                Yue.ۥۡ۠ۧۡ<T1, T2, V> r0 = r3.f12718
                Yue.ۥۣ۠ۢۢ r0 = Yue.C4146.m16251(r0)
                java.util.Iterator<T1> r1 = r3.f12716
                java.lang.Object r1 = r1.next()
                java.util.Iterator<T2> r2 = r3.f12717
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

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.Iterator<T1> m16252() {
                r1 = this;
                java.util.Iterator<T1> r0 = r1.f12716
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Iterator<T2> m16253() {
                r1 = this;
                java.util.Iterator<T2> r0 = r1.f12717
                return r0
        }
    }

    public C4146(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T1> r2, @Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T2> r3, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super T1, ? super T2, ? extends V> r4) {
            r1 = this;
            java.lang.String r0 = "sequence1"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "sequence2"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f12713 = r2
            r1.f12714 = r3
            r1.f12715 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m16249(Yue.C4146 r0) {
            Yue.ۥۡۨۢ<T1> r0 = r0.f12713
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m16250(Yue.C4146 r0) {
            Yue.ۥۡۨۢ<T2> r0 = r0.f12714
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2839 m16251(Yue.C4146 r0) {
            Yue.ۥۣ۠ۢۢ<T1, T2, V> r0 = r0.f12715
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<V> iterator() {
            r1 = this;
            Yue.ۥۡ۠ۧۡ$ۥ r0 = new Yue.ۥۡ۠ۧۡ$ۥ
            r0.<init>(r1)
            return r0
    }
}
