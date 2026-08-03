package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3821 implements java.lang.Iterable<java.lang.Long>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3821.C3822 f12103 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f12104;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f12105;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final long f12106;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨ$ۥ, reason: contains not printable characters */
    public static final class C3822 {
        public C3822() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3822(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C3821 m15292(long r9, long r11, long r13) {
                r8 = this;
                Yue.ۥۣ۠ۨ r7 = new Yue.ۥۣ۠ۨ
                r0 = r7
                r1 = r9
                r3 = r11
                r5 = r13
                r0.<init>(r1, r3, r5)
                return r7
        }
    }

    static {
            Yue.ۥۣ۠ۨ$ۥ r0 = new Yue.ۥۣ۠ۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3821.f12103 = r0
            return
    }

    public C3821(long r3, long r5, long r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L22
            r0 = -9223372036854775808
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a
            r2.f12104 = r3
            long r3 = Yue.C4968.m19396(r3, r5, r7)
            r2.f12105 = r3
            r2.f12106 = r7
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

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.C3821
            if (r0 == 0) goto L2f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥۣ۠ۨ r0 = (Yue.C3821) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r4.f12104
            Yue.ۥۣ۠ۨ r5 = (Yue.C3821) r5
            long r2 = r5.f12104
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r0 = r4.f12105
            long r2 = r5.f12105
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r0 = r4.f12106
            long r2 = r5.f12106
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
            r9 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L21
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r9.f12104
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            long r2 = r2 * r0
            long r5 = r9.f12105
            long r7 = r5 >>> r4
            long r5 = r5 ^ r7
            long r2 = r2 + r5
            long r0 = r0 * r2
            long r2 = r9.f12106
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            long r0 = r0 + r2
            int r0 = (int) r0
        L21:
            return r0
    }

    public boolean isEmpty() {
            r7 = this;
            long r0 = r7.f12106
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            long r3 = r7.f12104
            long r5 = r7.f12105
            if (r0 <= 0) goto L14
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L19
        L12:
            r1 = r2
            goto L19
        L14:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L19
            goto L12
        L19:
            return r1
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Long> iterator() {
            r1 = this;
            Yue.ۥ۠ۨۢۨ r0 = r1.m15291()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r4 = this;
            long r0 = r4.f12106
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r4.f12104
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            long r2 = r4.f12105
            r0.append(r2)
            r0.append(r1)
            long r1 = r4.f12106
        L23:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L46
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r4.f12104
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            long r2 = r4.f12105
            r0.append(r2)
            r0.append(r1)
            long r1 = r4.f12106
            long r1 = -r1
            goto L23
        L46:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m15288() {
            r2 = this;
            long r0 = r2.f12104
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final long m15289() {
            r2 = this;
            long r0 = r2.f12105
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final long m15290() {
            r2 = this;
            long r0 = r2.f12106
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.AbstractC3820 m15291() {
            r8 = this;
            Yue.ۥۣ۠ۨ۟ r7 = new Yue.ۥۣ۠ۨ۟
            long r1 = r8.f12104
            long r3 = r8.f12105
            long r5 = r8.f12106
            r0 = r7
            r0.<init>(r1, r3, r5)
            return r7
    }
}
