package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5908 implements Yue.InterfaceC2742 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final float f21546 = 10000.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final float f21547 = 1500.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final float f21548 = 200.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final float f21549 = 50.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final float f21550 = 0.2f;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final float f21551 = 0.5f;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final float f21552 = 0.75f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float f21553 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final double f21554 = 62.5d;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final double f21555 = Double.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public double f21556;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public double f21557;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f21558;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public double f21559;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double f21560;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public double f21561;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public double f21562;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public double f21563;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public double f21564;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.AbstractC2058.C2074 f21565;

    public C5908() {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.f21556 = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.f21557 = r0
            r0 = 0
            r2.f21558 = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.f21564 = r0
            Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r0 = new Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟
            r0.<init>()
            r2.f21565 = r0
            return
    }

    public C5908(float r3) {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.f21556 = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.f21557 = r0
            r0 = 0
            r2.f21558 = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.f21564 = r0
            Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r0 = new Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟
            r0.<init>()
            r2.f21565 = r0
            double r0 = (double) r3
            r2.f21564 = r0
            return
    }

    @Override // Yue.InterfaceC2742
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ */
    public boolean mo11411(float r5, float r6) {
            r4 = this;
            float r6 = java.lang.Math.abs(r6)
            double r0 = (double) r6
            double r2 = r4.f21560
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L1d
            float r6 = r4.m21935()
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            double r5 = (double) r5
            double r0 = r4.f21559
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1d
            r5 = 1
            return r5
        L1d:
            r5 = 0
            return r5
    }

    @Override // Yue.InterfaceC2742
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo11412(float r7, float r8) {
            r6 = this;
            float r0 = r6.m21935()
            float r7 = r7 - r0
            double r0 = r6.f21556
            double r2 = r0 * r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r4
            double r4 = r6.f21557
            double r0 = r0 * r4
            double r2 = -r2
            double r4 = (double) r7
            double r2 = r2 * r4
            double r7 = (double) r8
            double r0 = r0 * r7
            double r2 = r2 - r0
            float r7 = (float) r2
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m21934() {
            r2 = this;
            double r0 = r2.f21557
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m21935() {
            r2 = this;
            double r0 = r2.f21564
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m21936() {
            r2 = this;
            double r0 = r2.f21556
            double r0 = r0 * r0
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m21937() {
            r8 = this;
            boolean r0 = r8.f21558
            if (r0 == 0) goto L5
            return
        L5:
            double r0 = r8.f21564
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L50
            double r0 = r8.f21557
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L37
            double r4 = -r0
            double r6 = r8.f21556
            double r4 = r4 * r6
            double r0 = r0 * r0
            double r0 = r0 - r2
            double r0 = java.lang.Math.sqrt(r0)
            double r6 = r6 * r0
            double r4 = r4 + r6
            r8.f21561 = r4
            double r0 = r8.f21557
            double r4 = -r0
            double r6 = r8.f21556
            double r4 = r4 * r6
            double r0 = r0 * r0
            double r0 = r0 - r2
            double r0 = java.lang.Math.sqrt(r0)
            double r6 = r6 * r0
            double r4 = r4 - r6
            r8.f21562 = r4
            goto L4c
        L37:
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L4c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L4c
            double r4 = r8.f21556
            double r0 = r0 * r0
            double r2 = r2 - r0
            double r0 = java.lang.Math.sqrt(r2)
            double r4 = r4 * r0
            r8.f21563 = r4
        L4c:
            r0 = 1
            r8.f21558 = r0
            return
        L50:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Error: Final position of the spring must be set before the animation starts"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C5908 m21938(@Yue.InterfaceC2458(from = 0.0d) float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            double r0 = (double) r3
            r2.f21557 = r0
            r3 = 0
            r2.f21558 = r3
            return r2
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Damping ratio must be non-negative"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C5908 m21939(float r3) {
            r2 = this;
            double r0 = (double) r3
            r2.f21564 = r0
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.C5908 m21940(@Yue.InterfaceC2458(from = 0.0d, fromInclusive = false) float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L10
            double r0 = (double) r3
            double r0 = java.lang.Math.sqrt(r0)
            r2.f21556 = r0
            r3 = 0
            r2.f21558 = r3
            return r2
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Spring stiffness constant must be positive."
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m21941(double r3) {
            r2 = this;
            double r3 = java.lang.Math.abs(r3)
            r2.f21559 = r3
            r0 = 4633992910331707392(0x404f400000000000, double:62.5)
            double r3 = r3 * r0
            r2.f21560 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Yue.AbstractC2058.C2074 m21942(double r17, double r19, long r21) {
            r16 = this;
            r0 = r16
            r16.m21937()
            r1 = r21
            double r1 = (double) r1
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r3
            double r3 = r0.f21564
            double r3 = r17 - r3
            double r5 = r0.f21557
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            if (r9 <= 0) goto L56
            double r5 = r0.f21562
            double r7 = r5 * r3
            double r7 = r7 - r19
            double r12 = r0.f21561
            double r14 = r5 - r12
            double r7 = r7 / r14
            double r7 = r3 - r7
            double r3 = r3 * r5
            double r3 = r3 - r19
            double r12 = r5 - r12
            double r3 = r3 / r12
            double r5 = r5 * r1
            double r5 = java.lang.Math.pow(r10, r5)
            double r5 = r5 * r7
            double r12 = r0.f21561
            double r12 = r12 * r1
            double r12 = java.lang.Math.pow(r10, r12)
            double r12 = r12 * r3
            double r5 = r5 + r12
            double r12 = r0.f21562
            double r7 = r7 * r12
            double r12 = r12 * r1
            double r12 = java.lang.Math.pow(r10, r12)
            double r7 = r7 * r12
            double r12 = r0.f21561
            double r3 = r3 * r12
            double r12 = r12 * r1
            double r1 = java.lang.Math.pow(r10, r12)
            double r3 = r3 * r1
            double r7 = r7 + r3
            goto Ld2
        L56:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L80
            double r5 = r0.f21556
            double r7 = r5 * r3
            double r7 = r19 + r7
            double r12 = r7 * r1
            double r3 = r3 + r12
            double r5 = -r5
            double r5 = r5 * r1
            double r5 = java.lang.Math.pow(r10, r5)
            double r5 = r5 * r3
            double r12 = r0.f21556
            double r12 = -r12
            double r12 = r12 * r1
            double r12 = java.lang.Math.pow(r10, r12)
            double r3 = r3 * r12
            double r12 = r0.f21556
            double r14 = -r12
            double r3 = r3 * r14
            double r12 = -r12
            double r12 = r12 * r1
            double r1 = java.lang.Math.pow(r10, r12)
            double r7 = r7 * r1
            double r7 = r7 + r3
            goto Ld2
        L80:
            double r12 = r0.f21563
            double r7 = r7 / r12
            double r12 = r0.f21556
            double r14 = r5 * r12
            double r14 = r14 * r3
            double r14 = r14 + r19
            double r7 = r7 * r14
            double r5 = -r5
            double r5 = r5 * r12
            double r5 = r5 * r1
            double r5 = java.lang.Math.pow(r10, r5)
            double r12 = r0.f21563
            double r12 = r12 * r1
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r3
            double r14 = r0.f21563
            double r14 = r14 * r1
            double r14 = java.lang.Math.sin(r14)
            double r14 = r14 * r7
            double r12 = r12 + r14
            double r5 = r5 * r12
            double r12 = r0.f21556
            double r14 = -r12
            double r14 = r14 * r5
            double r10 = r0.f21557
            double r14 = r14 * r10
            double r9 = -r10
            double r9 = r9 * r12
            double r9 = r9 * r1
            r11 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            double r9 = java.lang.Math.pow(r11, r9)
            double r11 = r0.f21563
            r17 = r5
            double r5 = -r11
            double r5 = r5 * r3
            double r11 = r11 * r1
            double r3 = java.lang.Math.sin(r11)
            double r5 = r5 * r3
            double r3 = r0.f21563
            double r7 = r7 * r3
            double r3 = r3 * r1
            double r1 = java.lang.Math.cos(r3)
            double r7 = r7 * r1
            double r5 = r5 + r7
            double r9 = r9 * r5
            double r7 = r14 + r9
            r5 = r17
        Ld2:
            Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r1 = r0.f21565
            double r2 = r0.f21564
            double r5 = r5 + r2
            float r2 = (float) r5
            r1.f6596 = r2
            float r2 = (float) r7
            r1.f6597 = r2
            return r1
    }
}
