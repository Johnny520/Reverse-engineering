package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7000 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24470;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24471;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24472;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24473;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24474;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24475;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24476;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24477;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24478;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24479;

    /* JADX INFO: renamed from: Yue.ۥۢۥۢۢ$ۥ, reason: contains not printable characters */
    public class C7001 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24480;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24481;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24482;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C7000 f24483;

        public C7001(Yue.C7000 r1) {
                r0 = this;
                r0.f24483 = r1
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
                java.lang.String r2 = Yue.C7000.C7001.f24482
                if (r2 != 0) goto L19
                r0 = -4899288645838242015(0xbc023aef24b4ff21, double:-1.2353271846816417E-19)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7000.C7001.f24482 = r2
            L19:
                return r2
            L1a:
                java.lang.String r2 = Yue.C7000.C7001.f24481
                if (r2 != 0) goto L29
                r0 = 2705002902339315003(0x258a19ced655e53b, double:7.530882568892865E-128)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7000.C7001.f24481 = r2
            L29:
                return r2
            L2a:
                java.lang.String r2 = Yue.C7000.C7001.f24480
                if (r2 != 0) goto L39
                r0 = -3906573062637605534(0xc9c9107f58602d62, double:-2.8618534905355126E47)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7000.C7001.f24480 = r2
            L39:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 != 0) goto Lc
                return
            Lc:
                java.lang.Object[] r1 = r5.args
                r1 = r1[r0]
                java.lang.String r1 = (java.lang.String) r1
                java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
                java.lang.String r2 = r2.name()
                java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)
                Yue.ۥۢۥۢۢ r2 = r4.f24483
                java.lang.String r2 = r2.m27119(r1)
                r3 = 1
                java.lang.String r3 = yue_xin_awa(r3)
                boolean r1 = r1.startsWith(r3)
                if (r1 == 0) goto L3b
                if (r2 == 0) goto L3b
                java.lang.Object[] r5 = r5.args
                r5[r0] = r2
                r5 = 2
                java.lang.String r0 = yue_xin_awa(r5)
                Yue.C4350.m17146(r0, r5)
            L3b:
                return
        }
    }

    static {
            r0 = 839(0x347, float:1.176E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C7000() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public native java.lang.String m27119(java.lang.String r1);
}
