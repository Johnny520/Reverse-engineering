package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1810 implements Yue.InterfaceC5609<Yue.C3279> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.CharSequence f5539;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f5540;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f5541;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<java.lang.CharSequence, java.lang.Integer, Yue.C4677<java.lang.Integer, java.lang.Integer>> f5542;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨۢ$ۥ, reason: contains not printable characters */
    public static final class C1811 implements java.util.Iterator<Yue.C3279>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f5543;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f5544;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f5545;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public Yue.C3279 f5546;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f5547;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1810 f5548;

        public C1811(Yue.C1810 r3) {
                r2 = this;
                r2.f5548 = r3
                r2.<init>()
                r0 = -1
                r2.f5543 = r0
                int r0 = Yue.C1810.m8502(r3)
                java.lang.CharSequence r3 = Yue.C1810.m8500(r3)
                int r3 = r3.length()
                r1 = 0
                int r3 = Yue.C5196.m19528(r0, r1, r3)
                r2.f5544 = r3
                r2.f5545 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        private final void m8503() {
                r6 = this;
                int r0 = r6.f5545
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f5543 = r1
                r0 = 0
                r6.f5546 = r0
                goto L9e
            Lc:
                Yue.ۥ۟ۨۨۢ r0 = r6.f5548
                int r0 = Yue.C1810.m8501(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f5547
                int r0 = r0 + r3
                r6.f5547 = r0
                Yue.ۥ۟ۨۨۢ r4 = r6.f5548
                int r4 = Yue.C1810.m8501(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f5545
                Yue.ۥ۟ۨۨۢ r4 = r6.f5548
                java.lang.CharSequence r4 = Yue.C1810.m8500(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
                int r1 = r6.f5544
                Yue.ۥ۟ۨۨۢ r4 = r6.f5548
                java.lang.CharSequence r4 = Yue.C1810.m8500(r4)
                int r4 = Yue.C5989.m22355(r4)
                r0.<init>(r1, r4)
                r6.f5546 = r0
                r6.f5545 = r2
                goto L9c
            L47:
                Yue.ۥ۟ۨۨۢ r0 = r6.f5548
                Yue.ۥۣ۠ۢۢ r0 = Yue.C1810.m8499(r0)
                Yue.ۥ۟ۨۨۢ r4 = r6.f5548
                java.lang.CharSequence r4 = Yue.C1810.m8500(r4)
                int r5 = r6.f5545
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                Yue.ۥۣۡۦ۠ r0 = (Yue.C4677) r0
                if (r0 != 0) goto L77
                Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
                int r1 = r6.f5544
                Yue.ۥ۟ۨۨۢ r4 = r6.f5548
                java.lang.CharSequence r4 = Yue.C1810.m8500(r4)
                int r4 = Yue.C5989.m22355(r4)
                r0.<init>(r1, r4)
                r6.f5546 = r0
                r6.f5545 = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m18537()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m18538()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f5544
                Yue.ۥ۠ۥۣۨ r4 = Yue.C5196.m19646(r4, r2)
                r6.f5546 = r4
                int r2 = r2 + r0
                r6.f5544 = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f5545 = r2
            L9c:
                r6.f5543 = r3
            L9e:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f5543
                r1 = -1
                if (r0 != r1) goto L8
                r2.m8503()
            L8:
                int r0 = r2.f5543
                r1 = 1
                if (r0 != r1) goto Le
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Yue.C3279 next() {
                r1 = this;
                Yue.ۥ۠ۥۣۨ r0 = r1.m8509()
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

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m8504() {
                r1 = this;
                int r0 = r1.f5547
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m8505() {
                r1 = this;
                int r0 = r1.f5544
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C3279 m8506() {
                r1 = this;
                Yue.ۥ۠ۥۣۨ r0 = r1.f5546
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m8507() {
                r1 = this;
                int r0 = r1.f5545
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int m8508() {
                r1 = this;
                int r0 = r1.f5543
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Yue.C3279 m8509() {
                r3 = this;
                int r0 = r3.f5543
                r1 = -1
                if (r0 != r1) goto L8
                r3.m8503()
            L8:
                int r0 = r3.f5543
                if (r0 == 0) goto L19
                Yue.ۥ۠ۥۣۨ r0 = r3.f5546
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.ranges.IntRange"
                Yue.C3329.m13904(r0, r2)
                r2 = 0
                r3.f5546 = r2
                r3.f5543 = r1
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m8510(int r1) {
                r0 = this;
                r0.f5547 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m8511(int r1) {
                r0 = this;
                r0.f5544 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m8512(@Yue.InterfaceC4543 Yue.C3279 r1) {
                r0 = this;
                r0.f5546 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m8513(int r1) {
                r0 = this;
                r0.f5545 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m8514(int r1) {
                r0 = this;
                r0.f5543 = r1
                return
        }
    }

    public C1810(@Yue.InterfaceC4418 java.lang.CharSequence r2, int r3, int r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.CharSequence, ? super java.lang.Integer, Yue.C4677<java.lang.Integer, java.lang.Integer>> r5) {
            r1 = this;
            java.lang.String r0 = "input"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "getNextMatch"
            Yue.C3329.m13906(r5, r0)
            r1.<init>()
            r1.f5539 = r2
            r1.f5540 = r3
            r1.f5541 = r4
            r1.f5542 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2839 m8499(Yue.C1810 r0) {
            Yue.ۥۣ۠ۢۢ<java.lang.CharSequence, java.lang.Integer, Yue.ۥۣۡۦ۠<java.lang.Integer, java.lang.Integer>> r0 = r0.f5542
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.CharSequence m8500(Yue.C1810 r0) {
            java.lang.CharSequence r0 = r0.f5539
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m8501(Yue.C1810 r0) {
            int r0 = r0.f5541
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ int m8502(Yue.C1810 r0) {
            int r0 = r0.f5540
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C3279> iterator() {
            r1 = this;
            Yue.ۥ۟ۨۨۢ$ۥ r0 = new Yue.ۥ۟ۨۨۢ$ۥ
            r0.<init>(r1)
            return r0
    }
}
