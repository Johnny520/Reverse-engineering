package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3242<T> implements Yue.InterfaceC5609<Yue.C3239<? extends T>> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f10602;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۡۧ$ۥ, reason: contains not printable characters */
    public static final class C3243 implements java.util.Iterator<Yue.C3239<? extends T>>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f10603;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f10604;

        public C3243(Yue.C3242<T> r1) {
                r0 = this;
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C3242.m13665(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f10603 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f10603
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                Yue.ۥ۠ۥۡۤ r0 = r1.m13668()
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
        public final int m13666() {
                r1 = this;
                int r0 = r1.f10604
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Iterator<T> m13667() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f10603
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C3239<T> m13668() {
                r3 = this;
                Yue.ۥ۠ۥۡۤ r0 = new Yue.ۥ۠ۥۡۤ
                int r1 = r3.f10604
                int r2 = r1 + 1
                r3.f10604 = r2
                if (r1 >= 0) goto Ld
                Yue.C1208.m6228()
            Ld:
                java.util.Iterator<T> r2 = r3.f10603
                java.lang.Object r2 = r2.next()
                r0.<init>(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m13669(int r1) {
                r0 = this;
                r0.f10604 = r1
                return
        }
    }

    public C3242(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f10602 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m13665(Yue.C3242 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f10602
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C3239<T>> iterator() {
            r1 = this;
            Yue.ۥ۠ۥۡۧ$ۥ r0 = new Yue.ۥ۠ۥۡۧ$ۥ
            r0.<init>(r1)
            return r0
    }
}
