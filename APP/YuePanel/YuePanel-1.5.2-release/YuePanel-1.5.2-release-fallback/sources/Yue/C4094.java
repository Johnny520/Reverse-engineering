package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4094 extends Yue.C4093 {
    public C4094() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final double m15901(double r0, double r2) {
            double r0 = java.lang.Math.IEEEremainder(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final float m15902(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.IEEEremainder(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final double m15903(double r0) {
            double r0 = java.lang.Math.abs(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final float m15904(float r0) {
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m15905(int r0) {
            int r0 = java.lang.Math.abs(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long m15906(long r0) {
            long r0 = java.lang.Math.abs(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final double m15907(double r0) {
            double r0 = java.lang.Math.acos(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final float m15908(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.acos(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final double m15909(double r6) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L47
        L9:
            double r0 = Yue.C1505.f4710
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            double r6 = java.lang.Math.log(r6)
            double r0 = Yue.C1505.f4706
            double r6 = r6 + r0
            goto L47
        L17:
            r0 = 1
            double r0 = (double) r0
            double r2 = r6 - r0
            double r4 = Yue.C1505.f4709
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L2e
            double r2 = r6 * r6
            double r2 = r2 - r0
            double r0 = java.lang.Math.sqrt(r2)
            double r6 = r6 + r0
            double r6 = java.lang.Math.log(r6)
            goto L47
        L2e:
            double r6 = java.lang.Math.sqrt(r2)
            double r0 = Yue.C1505.f4708
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L40
            double r0 = r6 * r6
            double r0 = r0 * r6
            r2 = 12
            double r2 = (double) r2
            double r0 = r0 / r2
            double r6 = r6 - r0
        L40:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.sqrt(r0)
            double r6 = r6 * r0
        L47:
            return r6
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final float m15910(float r2) {
            double r0 = (double) r2
            double r0 = m15909(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final double m15911(double r0) {
            double r0 = java.lang.Math.asin(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final float m15912(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.asin(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final double m15913(double r4) {
            double r0 = Yue.C1505.f4709
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L34
            double r0 = Yue.C1505.f4711
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L26
            double r2 = Yue.C1505.f4710
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            double r4 = java.lang.Math.log(r4)
            double r0 = Yue.C1505.f4706
            double r4 = r4 + r0
            goto L51
        L1b:
            r0 = 2
            double r2 = (double) r0
            double r4 = r4 * r2
            double r0 = (double) r1
            double r0 = r0 / r4
            double r4 = r4 + r0
            double r4 = java.lang.Math.log(r4)
            goto L51
        L26:
            double r2 = r4 * r4
            double r0 = (double) r1
            double r2 = r2 + r0
            double r0 = java.lang.Math.sqrt(r2)
            double r4 = r4 + r0
            double r4 = java.lang.Math.log(r4)
            goto L51
        L34:
            double r0 = -r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L40
            double r4 = -r4
            double r4 = m15913(r4)
            double r4 = -r4
            goto L51
        L40:
            double r0 = java.lang.Math.abs(r4)
            double r2 = Yue.C1505.f4708
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L51
            double r0 = r4 * r4
            double r0 = r0 * r4
            r2 = 6
            double r2 = (double) r2
            double r0 = r0 / r2
            double r4 = r4 - r0
        L51:
            return r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final float m15914(float r2) {
            double r0 = (double) r2
            double r0 = m15913(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final double m15915(double r0) {
            double r0 = java.lang.Math.atan(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float m15916(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.atan(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final double m15917(double r0, double r2) {
            double r0 = java.lang.Math.atan2(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final float m15918(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.atan2(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final double m15919(double r4) {
            double r0 = java.lang.Math.abs(r4)
            double r2 = Yue.C1505.f4709
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1c
            double r0 = java.lang.Math.abs(r4)
            double r2 = Yue.C1505.f4708
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            double r0 = r4 * r4
            double r0 = r0 * r4
            r2 = 3
            double r2 = (double) r2
            double r0 = r0 / r2
            double r4 = r4 + r0
        L1b:
            return r4
        L1c:
            r0 = 1
            double r0 = (double) r0
            double r2 = r0 + r4
            double r0 = r0 - r4
            double r2 = r2 / r0
            double r4 = java.lang.Math.log(r2)
            r0 = 2
            double r0 = (double) r0
            double r4 = r4 / r0
            return r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final float m15920(float r2) {
            double r0 = (double) r2
            double r0 = m15919(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final double m15921(double r0) {
            double r0 = java.lang.Math.cbrt(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final float m15922(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.cbrt(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final double m15923(double r0) {
            double r0 = java.lang.Math.ceil(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final float m15924(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final double m15925(double r0) {
            double r0 = java.lang.Math.cos(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final float m15926(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.cos(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final double m15927(double r0) {
            double r0 = java.lang.Math.cosh(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final float m15928(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.cosh(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final double m15929(double r0) {
            double r0 = java.lang.Math.exp(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final float m15930(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.exp(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final double m15931(double r0) {
            double r0 = java.lang.Math.expm1(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final float m15932(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.expm1(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final double m15933(double r0) {
            double r0 = java.lang.Math.floor(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final float m15934(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.floor(r0)
            float r2 = (float) r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final double m15935(double r0) {
            double r0 = java.lang.Math.abs(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final float m15936(float r0) {
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m15937(int r0) {
            int r0 = java.lang.Math.abs(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final long m15938(long r0) {
            long r0 = java.lang.Math.abs(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ void m15939(double r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m15940(float r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m15941(int r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static /* synthetic */ void m15942(long r0) {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final double m15943(double r0) {
            double r0 = java.lang.Math.signum(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final float m15944(float r0) {
            float r0 = java.lang.Math.signum(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static int m15945(int r0) {
            if (r0 >= 0) goto L4
            r0 = -1
            goto L9
        L4:
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static int m15946(long r2) {
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r2 = -1
            goto Ld
        L8:
            if (r2 <= 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m15947(double r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m15948(float r0) {
            return
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m15949(int r0) {
            return
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m15950(long r0) {
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final double m15951(double r0) {
            double r0 = java.lang.Math.ulp(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final float m15952(float r0) {
            float r0 = java.lang.Math.ulp(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m15953(double r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m15954(float r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final double m15955(double r0, double r2) {
            double r0 = java.lang.Math.hypot(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final float m15956(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final double m15957(double r0) {
            double r0 = java.lang.Math.log(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final float m15958(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.log(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final double m15959(double r0) {
            double r0 = java.lang.Math.log1p(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final float m15960(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.log1p(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final double m15961(double r2, double r4) {
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            double r2 = java.lang.Math.log(r2)
            double r4 = java.lang.Math.log(r4)
            double r2 = r2 / r4
            return r2
        L17:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final float m15962(float r2, float r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L19
        Lc:
            double r0 = (double) r2
            double r0 = java.lang.Math.log(r0)
            double r2 = (double) r3
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r2 = (float) r0
            return r2
        L19:
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final double m15963(double r0) {
            double r0 = java.lang.Math.log10(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final float m15964(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.log10(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final double m15965(double r2) {
            double r2 = java.lang.Math.log(r2)
            double r0 = Yue.C1505.f4706
            double r2 = r2 / r0
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final float m15966(float r4) {
            double r0 = (double) r4
            double r0 = java.lang.Math.log(r0)
            double r2 = Yue.C1505.f4706
            double r0 = r0 / r2
            float r4 = (float) r0
            return r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final double m15967(double r0, double r2) {
            double r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final float m15968(float r0, float r1) {
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final int m15969(int r0, int r1) {
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final long m15970(long r0, long r2) {
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final double m15971(double r0, double r2) {
            double r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final float m15972(float r0, float r1) {
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final int m15973(int r0, int r1) {
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final long m15974(long r0, long r2) {
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final double m15975(double r2) {
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r2 = java.lang.Math.nextAfter(r2, r0)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final float m15976(float r2) {
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            float r2 = java.lang.Math.nextAfter(r2, r0)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final double m15977(double r0, double r2) {
            double r0 = java.lang.Math.nextAfter(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final float m15978(float r2, float r3) {
            double r0 = (double) r3
            float r2 = java.lang.Math.nextAfter(r2, r0)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final double m15979(double r0) {
            double r0 = java.lang.Math.nextUp(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final float m15980(float r0) {
            float r0 = java.lang.Math.nextUp(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final double m15981(double r0, double r2) {
            double r0 = java.lang.Math.pow(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final double m15982(double r2, int r4) {
            double r0 = (double) r4
            double r2 = java.lang.Math.pow(r2, r0)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final float m15983(float r2, float r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.pow(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final float m15984(float r2, int r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.pow(r0, r2)
            float r2 = (float) r2
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final double m15985(double r0) {
            double r0 = java.lang.Math.rint(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final float m15986(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.rint(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static int m15987(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L22
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L13
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L21
        L13:
            r0 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L21
        L1c:
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
        L21:
            return r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot round NaN value."
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final int m15988(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto Lb
            int r1 = java.lang.Math.round(r1)
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot round NaN value."
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static long m15989(double r1) {
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto Lb
            long r1 = java.lang.Math.round(r1)
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot round NaN value."
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final long m15990(float r2) {
            double r0 = (double) r2
            long r0 = m15989(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final double m15991(double r0) {
            double r0 = java.lang.Math.signum(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final float m15992(float r0) {
            float r0 = java.lang.Math.signum(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final double m15993(double r0) {
            double r0 = java.lang.Math.sin(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final float m15994(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.sin(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final double m15995(double r0) {
            double r0 = java.lang.Math.sinh(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final float m15996(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.sinh(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final double m15997(double r0) {
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final float m15998(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final double m15999(double r0) {
            double r0 = java.lang.Math.tan(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final float m16000(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.tan(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final double m16001(double r0) {
            double r0 = java.lang.Math.tanh(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final float m16002(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.tanh(r0)
            float r2 = (float) r0
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final double m16003(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L1c
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
            double r2 = java.lang.Math.floor(r2)
            goto L1c
        L18:
            double r2 = java.lang.Math.ceil(r2)
        L1c:
            return r2
    }

    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final float m16004(float r2) {
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L1f
            boolean r0 = java.lang.Float.isInfinite(r2)
            if (r0 == 0) goto Ld
            goto L1f
        Ld:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            double r0 = (double) r2
            double r0 = java.lang.Math.floor(r0)
        L17:
            float r2 = (float) r0
            goto L1f
        L19:
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            goto L17
        L1f:
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final double m16005(double r0, double r2) {
            double r0 = java.lang.Math.copySign(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final double m16006(double r2, int r4) {
            double r0 = (double) r4
            double r2 = java.lang.Math.copySign(r2, r0)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final float m16007(float r0, float r1) {
            float r0 = java.lang.Math.copySign(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final float m16008(float r0, int r1) {
            float r1 = (float) r1
            float r0 = java.lang.Math.copySign(r0, r1)
            return r0
    }
}
