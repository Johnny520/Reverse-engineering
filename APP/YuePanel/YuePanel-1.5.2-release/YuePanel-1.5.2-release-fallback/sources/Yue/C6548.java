package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
@Yue.InterfaceC5792(version = "1.5")
public final class C6548 extends Yue.C6545 implements Yue.InterfaceC1179<Yue.C6539>, Yue.InterfaceC4636<Yue.C6539> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6548.C6549 f22941 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6548 f22942 = null;

    /* JADX INFO: renamed from: Yue.ۥۢۢۧۥ$ۥ, reason: contains not printable characters */
    public static final class C6549 {
        public C6549() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6549(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C6548 m25132() {
                r1 = this;
                Yue.ۥۢۢۧۥ r0 = Yue.C6548.m25126()
                return r0
        }
    }

    static {
            Yue.ۥۢۢۧۥ$ۥ r0 = new Yue.ۥۢۢۧۥ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C6548.f22941 = r0
            Yue.ۥۢۢۧۥ r0 = new Yue.ۥۢۢۧۥ
            r5 = 0
            r7 = 0
            r3 = -1
            r2 = r0
            r2.<init>(r3, r5, r7)
            Yue.C6548.f22942 = r0
            return
    }

    public C6548(long r9, long r11) {
            r8 = this;
            r5 = 1
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.<init>(r1, r3, r5, r7)
            return
    }

    public /* synthetic */ C6548(long r1, long r3, Yue.C1769 r5) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C6548 m25126() {
            Yue.ۥۢۢۧۥ r0 = Yue.C6548.f22942
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC1816(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m25127() {
            return
    }

    @Override // Yue.C6545
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.C6548
            if (r0 == 0) goto L2f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥۢۢۧۥ r0 = (Yue.C6548) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r4.m25121()
            Yue.ۥۢۢۧۥ r5 = (Yue.C6548) r5
            long r2 = r5.m25121()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r0 = r4.m25122()
            long r2 = r5.m25122()
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

    @Override // Yue.C6545
    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L34
        L8:
            long r0 = r7.m25121()
            long r2 = r7.m25121()
            r4 = 32
            long r2 = r2 >>> r4
            long r2 = Yue.C6539.m25038(r2)
            long r0 = r0 ^ r2
            long r0 = Yue.C6539.m25038(r0)
            int r0 = (int) r0
            int r0 = r0 * 31
            long r1 = r7.m25122()
            long r5 = r7.m25122()
            long r3 = r5 >>> r4
            long r3 = Yue.C6539.m25038(r3)
            long r1 = r1 ^ r3
            long r1 = Yue.C6539.m25038(r1)
            int r1 = (int) r1
            int r0 = r0 + r1
        L34:
            return r0
    }

    @Override // Yue.C6545, Yue.InterfaceC1179, Yue.InterfaceC4636
    public boolean isEmpty() {
            r4 = this;
            long r0 = r4.m25121()
            long r2 = r4.m25122()
            int r0 = java.lang.Long.compareUnsigned(r0, r2)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // Yue.C6545
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.m25121()
            java.lang.String r1 = Yue.C6539.m25085(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.m25122()
            java.lang.String r1 = Yue.C6539.m25085(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r3) {
            r2 = this;
            Yue.ۥۢۢۧ۟ r3 = (Yue.C6539) r3
            long r0 = r3.m25092()
            boolean r3 = r2.m25128(r0)
            return r3
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r2 = this;
            long r0 = r2.m25131()
            Yue.ۥۢۢۧ۟ r0 = Yue.C6539.m25033(r0)
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5770() {
            r2 = this;
            long r0 = r2.m25129()
            Yue.ۥۢۢۧ۟ r0 = Yue.C6539.m25033(r0)
            return r0
    }

    @Override // Yue.InterfaceC1179
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5771() {
            r2 = this;
            long r0 = r2.m25130()
            Yue.ۥۢۢۧ۟ r0 = Yue.C6539.m25033(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m25128(long r3) {
            r2 = this;
            long r0 = r2.m25121()
            int r0 = java.lang.Long.compareUnsigned(r0, r3)
            if (r0 > 0) goto L16
            long r0 = r2.m25122()
            int r3 = java.lang.Long.compareUnsigned(r3, r0)
            if (r3 > 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public long m25129() {
            r6 = this;
            long r0 = r6.m25122()
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L20
            long r0 = r6.m25122()
            r2 = 1
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r2 = Yue.C6539.m25038(r2)
            long r0 = r0 + r2
            long r0 = Yue.C6539.m25038(r0)
            return r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public long m25130() {
            r2 = this;
            long r0 = r2.m25122()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public long m25131() {
            r2 = this;
            long r0 = r2.m25121()
            return r0
    }
}
