package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class C6105<T> implements Yue.InterfaceC5609<T>, Yue.InterfaceC2041<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f22045;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f22046;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۨۢ$ۥ, reason: contains not printable characters */
    public static final class C6106 implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f22047;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f22048;

        public C6106(Yue.C6105<T> r2) {
                r1 = this;
                r1.<init>()
                int r0 = Yue.C6105.m22913(r2)
                r1.f22047 = r0
                Yue.ۥۡۨۢ r2 = Yue.C6105.m22914(r2)
                java.util.Iterator r2 = r2.iterator()
                r1.f22048 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.f22047
                if (r0 <= 0) goto Le
                java.util.Iterator<T> r0 = r1.f22048
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                int r0 = r1.f22047
                if (r0 == 0) goto Lf
                int r0 = r0 + (-1)
                r1.f22047 = r0
                java.util.Iterator<T> r0 = r1.f22048
                java.lang.Object r0 = r0.next()
                return r0
            Lf:
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
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.Iterator<T> m22915() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f22048
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m22916() {
                r1 = this;
                int r0 = r1.f22047
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m22917(int r1) {
                r0 = this;
                r0.f22047 = r1
                return
        }
    }

    public C6105(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f22045 = r2
            r1.f22046 = r3
            if (r3 < 0) goto Lf
            return
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "count must be non-negative, but was "
            r2.append(r0)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m22913(Yue.C6105 r0) {
            int r0 = r0.f22046
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m22914(Yue.C6105 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f22045
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥۢ۠ۨۢ$ۥ r0 = new Yue.ۥۢ۠ۨۢ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC2041
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC5609<T> mo9422(int r3) {
            r2 = this;
            int r0 = r2.f22046
            if (r3 < r0) goto L6
            r0 = r2
            goto Ld
        L6:
            Yue.ۥۢ۠ۨۢ r0 = new Yue.ۥۢ۠ۨۢ
            Yue.ۥۡۨۢ<T> r1 = r2.f22045
            r0.<init>(r1, r3)
        Ld:
            return r0
    }

    @Override // Yue.InterfaceC2041
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.InterfaceC5609<T> mo9423(int r4) {
            r3 = this;
            int r0 = r3.f22046
            if (r4 < r0) goto L9
            Yue.ۥۡۨۢ r4 = Yue.C5616.m20987()
            goto L11
        L9:
            Yue.ۥۣۢ۠ۦ r1 = new Yue.ۥۣۢ۠ۦ
            Yue.ۥۡۨۢ<T> r2 = r3.f22045
            r1.<init>(r2, r4, r0)
            r4 = r1
        L11:
            return r4
    }
}
