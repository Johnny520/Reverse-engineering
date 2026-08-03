package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6710 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23515;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23516;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23517;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23518;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23519;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23520;

    /* JADX INFO: renamed from: Yue.ۥۣۢۨ۠$ۥ, reason: contains not printable characters */
    public class C6711 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f23521;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f23522;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f23523;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6710 f23524;

        public C6711(Yue.C6710 r1) {
                r0 = this;
                r0.f23524 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L2a
                r0 = 1
                if (r2 == r0) goto L1a
                r0 = 2
                if (r2 == r0) goto La
                r2 = 0
                return r2
            La:
                java.lang.String r2 = Yue.C6710.C6711.f23523
                if (r2 != 0) goto L19
                r0 = -6332500139068547803(0xa81e70acaeb51d25, double:-1.931382298998347E-115)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C6710.C6711.f23523 = r2
            L19:
                return r2
            L1a:
                java.lang.String r2 = Yue.C6710.C6711.f23522
                if (r2 != 0) goto L29
                r0 = -7320371385189138250(0x9a68d10299de00b6, double:-1.8689264390347648E-181)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C6710.C6711.f23522 = r2
            L29:
                return r2
            L2a:
                java.lang.String r2 = Yue.C6710.C6711.f23521
                if (r2 != 0) goto L39
                r0 = -1465856209178381021(0xeba83b8b501f3523, double:-3.9833356344688293E210)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C6710.C6711.f23521 = r2
            L39:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
                r3 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 != 0) goto Lc
                return
            Lc:
                r1 = 0
                r4.setResult(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 1
                java.lang.String r2 = yue_xin_awa(r2)
                r1.append(r2)
                java.lang.Object[] r4 = r4.args
                r4 = r4[r0]
                r1.append(r4)
                r4 = 2
                java.lang.String r4 = yue_xin_awa(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                Yue.C4350.m17150(r4)
                return
        }
    }

    static {
            r0 = 104(0x68, float:1.46E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6710() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1146 r1, java.lang.ClassLoader r2);
}
