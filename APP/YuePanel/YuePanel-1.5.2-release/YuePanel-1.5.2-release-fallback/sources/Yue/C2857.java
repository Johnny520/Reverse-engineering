package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2857<T> implements Yue.InterfaceC5609<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2823<T> f9210;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, T> f9211;

    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ$ۥ, reason: contains not printable characters */
    public static final class C2858 implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public T f9212;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f9213;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2857<T> f9214;

        public C2858(Yue.C2857<T> r1) {
                r0 = this;
                r0.f9214 = r1
                r0.<init>()
                r1 = -2
                r0.f9213 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        private final void m12303() {
                r2 = this;
                int r0 = r2.f9213
                r1 = -2
                if (r0 != r1) goto L10
                Yue.ۥۣۣ۠ۨ<T> r0 = r2.f9214
                Yue.ۥۣ۠۠ۨ r0 = Yue.C2857.m12301(r0)
                java.lang.Object r0 = r0.invoke()
                goto L1f
            L10:
                Yue.ۥۣۣ۠ۨ<T> r0 = r2.f9214
                Yue.ۥۣ۠ۡ۟ r0 = Yue.C2857.m12302(r0)
                T r1 = r2.f9212
                Yue.C3329.m13903(r1)
                java.lang.Object r0 = r0.invoke(r1)
            L1f:
                r2.f9212 = r0
                if (r0 != 0) goto L25
                r0 = 0
                goto L26
            L25:
                r0 = 1
            L26:
                r2.f9213 = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f9213
                if (r0 >= 0) goto L7
                r2.m12303()
            L7:
                int r0 = r2.f9213
                r1 = 1
                if (r0 != r1) goto Ld
                goto Le
            Ld:
                r1 = 0
            Le:
                return r1
        }

        @Override // java.util.Iterator
        @Yue.InterfaceC4418
        public T next() {
                r2 = this;
                int r0 = r2.f9213
                if (r0 >= 0) goto L7
                r2.m12303()
            L7:
                int r0 = r2.f9213
                if (r0 == 0) goto L16
                T r0 = r2.f9212
                java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"
                Yue.C3329.m13904(r0, r1)
                r1 = -1
                r2.f9213 = r1
                return r0
            L16:
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

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final T m12304() {
                r1 = this;
                T r0 = r1.f9212
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m12305() {
                r1 = this;
                int r0 = r1.f9213
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m12306(@Yue.InterfaceC4543 T r1) {
                r0 = this;
                r0.f9212 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m12307(int r1) {
                r0 = this;
                r0.f9213 = r1
                return
        }
    }

    public C2857(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "getInitialValue"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "getNextValue"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f9210 = r2
            r1.f9211 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2823 m12301(Yue.C2857 r0) {
            Yue.ۥۣ۠۠ۨ<T> r0 = r0.f9210
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m12302(Yue.C2857 r0) {
            Yue.ۥۣ۠ۡ۟<T, T> r0 = r0.f9211
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥۣۣ۠ۨ$ۥ r0 = new Yue.ۥۣۣ۠ۨ$ۥ
            r0.<init>(r1)
            return r0
    }
}
