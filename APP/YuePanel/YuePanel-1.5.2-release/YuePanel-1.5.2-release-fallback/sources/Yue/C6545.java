package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
@Yue.InterfaceC5792(version = "1.5")
public class C6545 implements java.lang.Iterable<Yue.C6539>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6545.C6546 f22933 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f22934;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f22935;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final long f22936;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۧ$ۥ, reason: contains not printable characters */
    public static final class C6546 {
        public C6546() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6546(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C6545 m25124(long r10, long r12, long r14) {
                r9 = this;
                Yue.ۥۣۢۢۧ r8 = new Yue.ۥۣۢۢۧ
                r7 = 0
                r0 = r8
                r1 = r10
                r3 = r12
                r5 = r14
                r0.<init>(r1, r3, r5, r7)
                return r8
        }
    }

    static {
            Yue.ۥۣۢۢۧ$ۥ r0 = new Yue.ۥۣۢۢۧ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C6545.f22933 = r0
            return
    }

    public C6545(long r3, long r5, long r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L22
            r0 = -9223372036854775808
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a
            r2.f22934 = r3
            long r3 = Yue.C6553.m25167(r3, r5, r7)
            r2.f22935 = r3
            r2.f22936 = r7
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."
            r3.<init>(r4)
            throw r3
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be non-zero."
            r3.<init>(r4)
            throw r3
    }

    public /* synthetic */ C6545(long r1, long r3, long r5, Yue.C1769 r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.C6545
            if (r0 == 0) goto L2f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥۣۢۢۧ r0 = (Yue.C6545) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r4.f22934
            Yue.ۥۣۢۢۧ r5 = (Yue.C6545) r5
            long r2 = r5.f22934
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r0 = r4.f22935
            long r2 = r5.f22935
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r0 = r4.f22936
            long r2 = r5.f22936
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

    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L32
        L8:
            long r0 = r7.f22934
            r2 = 32
            long r3 = r0 >>> r2
            long r3 = Yue.C6539.m25038(r3)
            long r0 = r0 ^ r3
            long r0 = Yue.C6539.m25038(r0)
            int r0 = (int) r0
            int r0 = r0 * 31
            long r3 = r7.f22935
            long r5 = r3 >>> r2
            long r5 = Yue.C6539.m25038(r5)
            long r3 = r3 ^ r5
            long r3 = Yue.C6539.m25038(r3)
            int r1 = (int) r3
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r3 = r7.f22936
            long r1 = r3 >>> r2
            long r1 = r1 ^ r3
            int r1 = (int) r1
            int r0 = r0 + r1
        L32:
            return r0
    }

    public boolean isEmpty() {
            r7 = this;
            long r0 = r7.f22936
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            long r3 = r7.f22934
            long r5 = r7.f22935
            if (r0 <= 0) goto L16
            int r0 = java.lang.Long.compareUnsigned(r3, r5)
            if (r0 <= 0) goto L1d
        L14:
            r1 = r2
            goto L1d
        L16:
            int r0 = java.lang.Long.compareUnsigned(r3, r5)
            if (r0 >= 0) goto L1d
            goto L14
        L1d:
            return r1
    }

    @Override // java.lang.Iterable
    @Yue.InterfaceC4418
    public final java.util.Iterator<Yue.C6539> iterator() {
            r9 = this;
            Yue.ۥۢۢۧۤ r8 = new Yue.ۥۢۢۧۤ
            long r1 = r9.f22934
            long r3 = r9.f22935
            long r5 = r9.f22936
            r7 = 0
            r0 = r8
            r0.<init>(r1, r3, r5, r7)
            return r8
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r4 = this;
            long r0 = r4.f22936
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r4.f22934
            java.lang.String r2 = Yue.C6539.m25085(r2)
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            long r2 = r4.f22935
            java.lang.String r2 = Yue.C6539.m25085(r2)
            r0.append(r2)
            r0.append(r1)
            long r1 = r4.f22936
        L2b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L56
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r4.f22934
            java.lang.String r2 = Yue.C6539.m25085(r2)
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            long r2 = r4.f22935
            java.lang.String r2 = Yue.C6539.m25085(r2)
            r0.append(r2)
            r0.append(r1)
            long r1 = r4.f22936
            long r1 = -r1
            goto L2b
        L56:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m25121() {
            r2 = this;
            long r0 = r2.f22934
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final long m25122() {
            r2 = this;
            long r0 = r2.f22935
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final long m25123() {
            r2 = this;
            long r0 = r2.f22936
            return r0
    }
}
