package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
@Yue.InterfaceC5792(version = "1.5")
public final class C6537 extends Yue.C6534 implements Yue.InterfaceC1179<Yue.C6528>, Yue.InterfaceC4636<Yue.C6528> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6537.C6538 f22922 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6537 f22923 = null;

    /* JADX INFO: renamed from: Yue.ۥۢۢۧ$ۥ, reason: contains not printable characters */
    public static final class C6538 {
        public C6538() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6538(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C6537 m25031() {
                r1 = this;
                Yue.ۥۢۢۧ r0 = Yue.C6537.m25025()
                return r0
        }
    }

    static {
            Yue.ۥۢۢۧ$ۥ r0 = new Yue.ۥۢۢۧ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C6537.f22922 = r0
            Yue.ۥۢۢۧ r0 = new Yue.ۥۢۢۧ
            r2 = -1
            r3 = 0
            r0.<init>(r2, r3, r1)
            Yue.C6537.f22923 = r0
            return
    }

    public C6537(int r3, int r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public /* synthetic */ C6537(int r1, int r2, Yue.C1769 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C6537 m25025() {
            Yue.ۥۢۢۧ r0 = Yue.C6537.f22923
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC1816(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m25026() {
            return
    }

    @Override // Yue.C6534
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C6537
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥۢۢۧ r0 = (Yue.C6537) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            int r0 = r2.m25020()
            Yue.ۥۢۢۧ r3 = (Yue.C6537) r3
            int r1 = r3.m25020()
            if (r0 != r1) goto L2b
            int r0 = r2.m25021()
            int r3 = r3.m25021()
            if (r0 != r3) goto L2b
        L29:
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            return r3
    }

    @Override // Yue.C6534
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L13
        L8:
            int r0 = r2.m25020()
            int r0 = r0 * 31
            int r1 = r2.m25021()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // Yue.C6534, Yue.InterfaceC1179, Yue.InterfaceC4636
    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.m25020()
            int r1 = r2.m25021()
            int r0 = java.lang.Integer.compareUnsigned(r0, r1)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // Yue.C6534
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.m25020()
            java.lang.String r1 = Yue.C6528.m24984(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.m25021()
            java.lang.String r1 = Yue.C6528.m24984(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r1) {
            r0 = this;
            Yue.ۥۢۢۦۣ r1 = (Yue.C6528) r1
            int r1 = r1.m24991()
            boolean r1 = r0.m25027(r1)
            return r1
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r1 = this;
            int r0 = r1.m25030()
            Yue.ۥۢۢۦۣ r0 = Yue.C6528.m24932(r0)
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5770() {
            r1 = this;
            int r0 = r1.m25028()
            Yue.ۥۢۢۦۣ r0 = Yue.C6528.m24932(r0)
            return r0
    }

    @Override // Yue.InterfaceC1179
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5771() {
            r1 = this;
            int r0 = r1.m25029()
            Yue.ۥۢۢۦۣ r0 = Yue.C6528.m24932(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m25027(int r2) {
            r1 = this;
            int r0 = r1.m25020()
            int r0 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r0 > 0) goto L16
            int r0 = r1.m25021()
            int r2 = java.lang.Integer.compareUnsigned(r2, r0)
            if (r2 > 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m25028() {
            r2 = this;
            int r0 = r2.m25021()
            r1 = -1
            if (r0 == r1) goto L12
            int r0 = r2.m25021()
            int r0 = r0 + 1
            int r0 = Yue.C6528.m24937(r0)
            return r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m25029() {
            r1 = this;
            int r0 = r1.m25021()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m25030() {
            r1 = this;
            int r0 = r1.m25020()
            return r0
    }
}
