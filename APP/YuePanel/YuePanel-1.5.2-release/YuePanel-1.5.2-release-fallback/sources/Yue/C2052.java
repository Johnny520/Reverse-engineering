package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2052 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۠$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C2053 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f6553 = null;

        static {
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                Yue.C2052.C2053.f6553 = r0
                return
        }
    }

    public C2052() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final double m9656(double r6, @Yue.InterfaceC4418 Yue.EnumC2050 r8, @Yue.InterfaceC4418 Yue.EnumC2050 r9) {
            java.lang.String r0 = "sourceUnit"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "targetUnit"
            Yue.C3329.m13906(r9, r0)
            java.util.concurrent.TimeUnit r0 = r9.m9655()
            java.util.concurrent.TimeUnit r1 = r8.m9655()
            r2 = 1
            long r0 = r0.convert(r2, r1)
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L21
            double r8 = (double) r0
            double r6 = r6 * r8
            return r6
        L21:
            java.util.concurrent.TimeUnit r8 = r8.m9655()
            java.util.concurrent.TimeUnit r9 = r9.m9655()
            long r8 = r8.convert(r2, r9)
            double r8 = (double) r8
            double r6 = r6 / r8
            return r6
    }

    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m9657(long r1, @Yue.InterfaceC4418 Yue.EnumC2050 r3, @Yue.InterfaceC4418 Yue.EnumC2050 r4) {
            java.lang.String r0 = "sourceUnit"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "targetUnit"
            Yue.C3329.m13906(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.m9655()
            java.util.concurrent.TimeUnit r3 = r3.m9655()
            long r1 = r4.convert(r1, r3)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m9658(long r1, @Yue.InterfaceC4418 Yue.EnumC2050 r3, @Yue.InterfaceC4418 Yue.EnumC2050 r4) {
            java.lang.String r0 = "sourceUnit"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "targetUnit"
            Yue.C3329.m13906(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.m9655()
            java.util.concurrent.TimeUnit r3 = r3.m9655()
            long r1 = r4.convert(r1, r3)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2312.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.EnumC2050 m9659(@Yue.InterfaceC4418 java.util.concurrent.TimeUnit r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int[] r0 = Yue.C2052.C2053.f6553
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                default: goto L10;
            }
        L10:
            Yue.ۥۣۣۡۢ r1 = new Yue.ۥۣۣۡۢ
            r1.<init>()
            throw r1
        L16:
            Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6549
            goto L2a
        L19:
            Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6548
            goto L2a
        L1c:
            Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6547
            goto L2a
        L1f:
            Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6546
            goto L2a
        L22:
            Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6545
            goto L2a
        L25:
            Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6544
            goto L2a
        L28:
            Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6543
        L2a:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2312.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.util.concurrent.TimeUnit m9660(@Yue.InterfaceC4418 Yue.EnumC2050 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.concurrent.TimeUnit r1 = r1.m9655()
            return r1
    }
}
