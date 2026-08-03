package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3824 extends Yue.C3821 implements Yue.InterfaceC1179<java.lang.Long>, Yue.InterfaceC4636<java.lang.Long> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3824.C3825 f12111 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3824 f12112 = null;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۠$ۥ, reason: contains not printable characters */
    public static final class C3825 {
        public C3825() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3825(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C3824 m15300() {
                r1 = this;
                Yue.ۥۣ۠ۨ۠ r0 = Yue.C3824.m15294()
                return r0
        }
    }

    static {
            Yue.ۥۣ۠ۨ۠$ۥ r0 = new Yue.ۥۣ۠ۨ۠$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3824.f12111 = r0
            Yue.ۥۣ۠ۨ۠ r0 = new Yue.ۥۣ۠ۨ۠
            r1 = 1
            r3 = 0
            r0.<init>(r1, r3)
            Yue.C3824.f12112 = r0
            return
    }

    public C3824(long r8, long r10) {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C3824 m15294() {
            Yue.ۥۣ۠ۨ۠ r0 = Yue.C3824.f12112
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC1816(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m15295() {
            return
    }

    @Override // Yue.C3821
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.C3824
            if (r0 == 0) goto L2f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥۣ۠ۨ۠ r0 = (Yue.C3824) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r4.m15288()
            Yue.ۥۣ۠ۨ۠ r5 = (Yue.C3824) r5
            long r2 = r5.m15288()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r0 = r4.m15289()
            long r2 = r5.m15289()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2f
        L2d:
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            return r5
    }

    @Override // Yue.C3821
    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L24
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r7.m15288()
            long r4 = r7.m15288()
            r6 = 32
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 * r2
            long r2 = r7.m15289()
            long r4 = r7.m15289()
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 + r2
            int r0 = (int) r0
        L24:
            return r0
    }

    @Override // Yue.C3821, Yue.InterfaceC1179, Yue.InterfaceC4636
    public boolean isEmpty() {
            r4 = this;
            long r0 = r4.m15288()
            long r2 = r4.m15289()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // Yue.C3821
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.m15288()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.m15289()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            boolean r3 = r2.m15296(r0)
            return r3
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r1 = this;
            java.lang.Long r0 = r1.m15299()
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5770() {
            r1 = this;
            java.lang.Long r0 = r1.m15297()
            return r0
    }

    @Override // Yue.InterfaceC1179
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5771() {
            r1 = this;
            java.lang.Long r0 = r1.m15298()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m15296(long r3) {
            r2 = this;
            long r0 = r2.m15288()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L12
            long r0 = r2.m15289()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.Long m15297() {
            r4 = this;
            long r0 = r4.m15289()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            long r0 = r4.m15289()
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.lang.Long m15298() {
            r2 = this;
            long r0 = r2.m15289()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.lang.Long m15299() {
            r2 = this;
            long r0 = r2.m15288()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }
}
