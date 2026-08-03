package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2054 extends Yue.C2052 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C2055 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f6554 = null;

        static {
                Yue.ۥۣ۠۠[] r0 = Yue.EnumC2050.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6543     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6544     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6545     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6546     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6547     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6548     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                Yue.ۥۣ۠۠ r1 = Yue.EnumC2050.f6549     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                Yue.C2054.C2055.f6554 = r0
                return
        }
    }

    public C2054() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.EnumC2050 m9661(char r2, boolean r3) {
            if (r3 != 0) goto L20
            r3 = 68
            if (r2 != r3) goto L9
            Yue.ۥۣ۠۠ r2 = Yue.EnumC2050.f6549
            goto L34
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid or unsupported duration ISO non-time unit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L20:
            r3 = 72
            if (r2 != r3) goto L27
            Yue.ۥۣ۠۠ r2 = Yue.EnumC2050.f6548
            goto L34
        L27:
            r3 = 77
            if (r2 != r3) goto L2e
            Yue.ۥۣ۠۠ r2 = Yue.EnumC2050.f6547
            goto L34
        L2e:
            r3 = 83
            if (r2 != r3) goto L35
            Yue.ۥۣ۠۠ r2 = Yue.EnumC2050.f6546
        L34:
            return r2
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid duration ISO time unit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.EnumC2050 m9662(@Yue.InterfaceC4418 java.lang.String r3) {
            java.lang.String r0 = "shortName"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.hashCode()
            r1 = 100
            if (r0 == r1) goto L67
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L5c
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L51
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L46
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L3b
            r1 = 3525(0xdc5, float:4.94E-42)
            if (r0 == r1) goto L30
            r1 = 3742(0xe9e, float:5.244E-42)
            if (r0 != r1) goto L72
            java.lang.String r0 = "us"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            Yue.ۥۣ۠۠ r3 = Yue.EnumC2050.f6544
            goto L71
        L30:
            java.lang.String r0 = "ns"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            Yue.ۥۣ۠۠ r3 = Yue.EnumC2050.f6543
            goto L71
        L3b:
            java.lang.String r0 = "ms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            Yue.ۥۣ۠۠ r3 = Yue.EnumC2050.f6545
            goto L71
        L46:
            java.lang.String r0 = "s"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            Yue.ۥۣ۠۠ r3 = Yue.EnumC2050.f6546
            goto L71
        L51:
            java.lang.String r0 = "m"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            Yue.ۥۣ۠۠ r3 = Yue.EnumC2050.f6547
            goto L71
        L5c:
            java.lang.String r0 = "h"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            Yue.ۥۣ۠۠ r3 = Yue.EnumC2050.f6548
            goto L71
        L67:
            java.lang.String r0 = "d"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            Yue.ۥۣ۠۠ r3 = Yue.EnumC2050.f6549
        L71:
            return r3
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown duration unit short name: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String m9663(@Yue.InterfaceC4418 Yue.EnumC2050 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            int[] r0 = Yue.C2054.C2055.f6554
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L2e;
                case 7: goto L2b;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown unit: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            java.lang.String r3 = "d"
            goto L3f
        L2e:
            java.lang.String r3 = "h"
            goto L3f
        L31:
            java.lang.String r3 = "m"
            goto L3f
        L34:
            java.lang.String r3 = "s"
            goto L3f
        L37:
            java.lang.String r3 = "ms"
            goto L3f
        L3a:
            java.lang.String r3 = "us"
            goto L3f
        L3d:
            java.lang.String r3 = "ns"
        L3f:
            return r3
    }
}
