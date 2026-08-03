package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class C6034<T> implements Yue.InterfaceC5609<T>, Yue.InterfaceC2041<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f21824;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f21825;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f21826;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۦ$ۥ, reason: contains not printable characters */
    public static final class C6035 implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f21827;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f21828;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6034<T> f21829;

        public C6035(Yue.C6034<T> r1) {
                r0 = this;
                r0.f21829 = r1
                r0.<init>()
                Yue.ۥۡۨۢ r1 = Yue.C6034.m22708(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.f21827 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        private final void m22711() {
                r2 = this;
            L0:
                int r0 = r2.f21828
                Yue.ۥۣۢ۠ۦ<T> r1 = r2.f21829
                int r1 = Yue.C6034.m22709(r1)
                if (r0 >= r1) goto L1e
                java.util.Iterator<T> r0 = r2.f21827
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1e
                java.util.Iterator<T> r0 = r2.f21827
                r0.next()
                int r0 = r2.f21828
                int r0 = r0 + 1
                r2.f21828 = r0
                goto L0
            L1e:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                r2.m22711()
                int r0 = r2.f21828
                Yue.ۥۣۢ۠ۦ<T> r1 = r2.f21829
                int r1 = Yue.C6034.m22707(r1)
                if (r0 >= r1) goto L17
                java.util.Iterator<T> r0 = r2.f21827
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                r2.m22711()
                int r0 = r2.f21828
                Yue.ۥۣۢ۠ۦ<T> r1 = r2.f21829
                int r1 = Yue.C6034.m22707(r1)
                if (r0 >= r1) goto L1a
                int r0 = r2.f21828
                int r0 = r0 + 1
                r2.f21828 = r0
                java.util.Iterator<T> r0 = r2.f21827
                java.lang.Object r0 = r0.next()
                return r0
            L1a:
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
        public final java.util.Iterator<T> m22712() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f21827
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m22713() {
                r1 = this;
                int r0 = r1.f21828
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m22714(int r1) {
                r0 = this;
                r0.f21828 = r1
                return
        }
    }

    public C6034(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f21824 = r2
            r1.f21825 = r3
            r1.f21826 = r4
            if (r3 < 0) goto L53
            if (r4 < 0) goto L38
            if (r4 < r3) goto L15
            return
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "endIndex should be not less than startIndex, but was "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = " < "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "endIndex should be non-negative, but is "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "startIndex should be non-negative, but is "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m22707(Yue.C6034 r0) {
            int r0 = r0.f21826
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m22708(Yue.C6034 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f21824
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m22709(Yue.C6034 r0) {
            int r0 = r0.f21825
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥۣۢ۠ۦ$ۥ r0 = new Yue.ۥۣۢ۠ۦ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC2041
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC5609<T> mo9422(int r4) {
            r3 = this;
            int r0 = r3.m22710()
            if (r4 < r0) goto L8
            r0 = r3
            goto L12
        L8:
            Yue.ۥۣۢ۠ۦ r0 = new Yue.ۥۣۢ۠ۦ
            Yue.ۥۡۨۢ<T> r1 = r3.f21824
            int r2 = r3.f21825
            int r4 = r4 + r2
            r0.<init>(r1, r2, r4)
        L12:
            return r0
    }

    @Override // Yue.InterfaceC2041
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.InterfaceC5609<T> mo9423(int r4) {
            r3 = this;
            int r0 = r3.m22710()
            if (r4 < r0) goto Lb
            Yue.ۥۡۨۢ r4 = Yue.C5616.m20987()
            goto L18
        Lb:
            Yue.ۥۣۢ۠ۦ r0 = new Yue.ۥۣۢ۠ۦ
            Yue.ۥۡۨۢ<T> r1 = r3.f21824
            int r2 = r3.f21825
            int r2 = r2 + r4
            int r4 = r3.f21826
            r0.<init>(r1, r2, r4)
            r4 = r0
        L18:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m22710() {
            r2 = this;
            int r0 = r2.f21826
            int r1 = r2.f21825
            int r0 = r0 - r1
            return r0
    }
}
