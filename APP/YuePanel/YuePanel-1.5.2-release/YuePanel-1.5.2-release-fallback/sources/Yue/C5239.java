package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5239 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19677;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19678;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19679;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19680;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19681;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19682;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19683;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19684;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19685;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19686;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19687;

    /* JADX INFO: renamed from: Yue.ۥۡۦۡ۟$ۥ, reason: contains not printable characters */
    public class C5240 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f19688;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5239 f19689;

        public C5240(Yue.C5239 r1) {
                r0 = this;
                r0.f19689 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C5239.C5240.f19688
                if (r2 != 0) goto L13
                r0 = -2915350560155443292(0xd78a981c9a32dfa4, double:-5.116524896390971E113)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C5239.C5240.f19688 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                r0 = 0
                r2.setResult(r0)
                return
        }
    }

    static {
            r0 = 1045(0x415, float:1.464E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C5239() {
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
    public void load(Yue.C1146 r2, java.lang.ClassLoader r3) {
            r1 = this;
            java.util.Map r2 = r2.m6013()     // Catch: java.lang.Throwable -> L24
            r0 = 3
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L24
            Yue.ۥ۟ۤۧ۠ r2 = (Yue.C1145) r2     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r2.m6002()     // Catch: java.lang.Throwable -> L24
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.m6001()     // Catch: java.lang.Throwable -> L24
            Yue.ۥۡۦۡ۟$ۥ r0 = new Yue.ۥۡۦۡ۟$ۥ     // Catch: java.lang.Throwable -> L24
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L24
            Yue.C3065.m12924(r3, r2, r0)     // Catch: java.lang.Throwable -> L24
            goto L31
        L24:
            r2 = move-exception
            r3 = 4
            java.lang.String r3 = yue_xin_awa(r3)
            java.lang.String r2 = r2.getMessage()
            Yue.C1828.m8591(r3, r2)
        L31:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final native java.lang.Object m19798(java.lang.String r1, java.lang.String r2) throws java.lang.Throwable;
}
