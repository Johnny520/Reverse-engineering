package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3279 extends Yue.C3276 implements Yue.InterfaceC1179<java.lang.Integer>, Yue.InterfaceC4636<java.lang.Integer> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3279.C3280 f10706 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3279 f10707 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۨ$ۥ, reason: contains not printable characters */
    public static final class C3280 {
        public C3280() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3280(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C3279 m13749() {
                r1 = this;
                Yue.ۥ۠ۥۣۨ r0 = Yue.C3279.m13743()
                return r0
        }
    }

    static {
            Yue.ۥ۠ۥۣۨ$ۥ r0 = new Yue.ۥ۠ۥۣۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3279.f10706 = r0
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            Yue.C3279.f10707 = r0
            return
    }

    public C3279(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C3279 m13743() {
            Yue.ۥ۠ۥۣۨ r0 = Yue.C3279.f10707
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC1816(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m13744() {
            return
    }

    @Override // Yue.C3276
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C3279
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥ۠ۥۣۨ r0 = (Yue.C3279) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            int r0 = r2.m13737()
            Yue.ۥ۠ۥۣۨ r3 = (Yue.C3279) r3
            int r1 = r3.m13737()
            if (r0 != r1) goto L2b
            int r0 = r2.m13738()
            int r3 = r3.m13738()
            if (r0 != r3) goto L2b
        L29:
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            return r3
    }

    @Override // Yue.C3276
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L13
        L8:
            int r0 = r2.m13737()
            int r0 = r0 * 31
            int r1 = r2.m13738()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // Yue.C3276, Yue.InterfaceC1179, Yue.InterfaceC4636
    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.m13737()
            int r1 = r2.m13738()
            if (r0 <= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // Yue.C3276
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.m13737()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.m13738()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r1 = r0.m13745(r1)
            return r1
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r1 = this;
            java.lang.Integer r0 = r1.m13748()
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5770() {
            r1 = this;
            java.lang.Integer r0 = r1.m13746()
            return r0
    }

    @Override // Yue.InterfaceC1179
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5771() {
            r1 = this;
            java.lang.Integer r0 = r1.m13747()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m13745(int r2) {
            r1 = this;
            int r0 = r1.m13737()
            if (r0 > r2) goto Le
            int r0 = r1.m13738()
            if (r2 > r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.Integer m13746() {
            r2 = this;
            int r0 = r2.m13738()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L14
            int r0 = r2.m13738()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.lang.Integer m13747() {
            r1 = this;
            int r0 = r1.m13738()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.lang.Integer m13748() {
            r1 = this;
            int r0 = r1.m13737()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
