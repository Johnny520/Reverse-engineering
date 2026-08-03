package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class C2039<T> implements Yue.InterfaceC5609<T>, Yue.InterfaceC2041<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f6522;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f6523;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢۡ$ۥ, reason: contains not printable characters */
    public static final class C2040 implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Iterator<T> f6524;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6525;

        public C2040(Yue.C2039<T> r2) {
                r1 = this;
                r1.<init>()
                Yue.ۥۡۨۢ r0 = Yue.C2039.m9421(r2)
                java.util.Iterator r0 = r0.iterator()
                r1.f6524 = r0
                int r2 = Yue.C2039.m9420(r2)
                r1.f6525 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r1.m9424()
                java.util.Iterator<T> r0 = r1.f6524
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                r1.m9424()
                java.util.Iterator<T> r0 = r1.f6524
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

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m9424() {
                r1 = this;
            L0:
                int r0 = r1.f6525
                if (r0 <= 0) goto L18
                java.util.Iterator<T> r0 = r1.f6524
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L18
                java.util.Iterator<T> r0 = r1.f6524
                r0.next()
                int r0 = r1.f6525
                int r0 = r0 + (-1)
                r1.f6525 = r0
                goto L0
            L18:
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Iterator<T> m9425() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f6524
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m9426() {
                r1 = this;
                int r0 = r1.f6525
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m9427(int r1) {
                r0 = this;
                r0.f6525 = r1
                return
        }
    }

    public C2039(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f6522 = r2
            r1.f6523 = r3
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
    public static final /* synthetic */ int m9420(Yue.C2039 r0) {
            int r0 = r0.f6523
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC5609 m9421(Yue.C2039 r0) {
            Yue.ۥۡۨۢ<T> r0 = r0.f6522
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥ۠۠ۢۡ$ۥ r0 = new Yue.ۥ۠۠ۢۡ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC2041
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC5609<T> mo9422(int r4) {
            r3 = this;
            int r0 = r3.f6523
            int r1 = r0 + r4
            if (r1 >= 0) goto Lc
            Yue.ۥۢ۠ۨۢ r0 = new Yue.ۥۢ۠ۨۢ
            r0.<init>(r3, r4)
            goto L14
        Lc:
            Yue.ۥۣۢ۠ۦ r4 = new Yue.ۥۣۢ۠ۦ
            Yue.ۥۡۨۢ<T> r2 = r3.f6522
            r4.<init>(r2, r0, r1)
            r0 = r4
        L14:
            return r0
    }

    @Override // Yue.InterfaceC2041
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.InterfaceC5609<T> mo9423(int r3) {
            r2 = this;
            int r0 = r2.f6523
            int r0 = r0 + r3
            if (r0 >= 0) goto Lb
            Yue.ۥ۠۠ۢۡ r0 = new Yue.ۥ۠۠ۢۡ
            r0.<init>(r2, r3)
            goto L13
        Lb:
            Yue.ۥ۠۠ۢۡ r3 = new Yue.ۥ۠۠ۢۡ
            Yue.ۥۡۨۢ<T> r1 = r2.f6522
            r3.<init>(r1, r0)
            r0 = r3
        L13:
            return r0
    }
}
