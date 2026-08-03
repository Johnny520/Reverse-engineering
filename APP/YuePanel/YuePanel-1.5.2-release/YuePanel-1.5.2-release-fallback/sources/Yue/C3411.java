package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3411 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10885;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10886;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10887;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10888;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10889;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10890;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10891;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۠ۢ$ۥ, reason: contains not printable characters */
    public class C3412 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f10892;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3411 f10893;

        public C3412(Yue.C3411 r1) {
                r0 = this;
                r0.f10893 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C3411.C3412.f10892
                if (r2 != 0) goto L13
                r0 = -8996217005321740683(0x8327044c33781e75, double:-1.801934286292142E-293)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3411.C3412.f10892 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 == 0) goto L10
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r2.setResult(r0)
            L10:
                return
        }
    }

    static {
            r0 = 416(0x1a0, float:5.83E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3411() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r2, java.lang.ClassLoader r3) {
            r1 = this;
            java.lang.String r0 = r2.m6002()     // Catch: java.lang.Throwable -> L15
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r2.m6001()     // Catch: java.lang.Throwable -> L15
            Yue.ۥ۠ۦ۠ۢ$ۥ r0 = new Yue.ۥ۠ۦ۠ۢ$ۥ     // Catch: java.lang.Throwable -> L15
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            Yue.C3065.m12924(r3, r2, r0)     // Catch: java.lang.Throwable -> L15
            goto L22
        L15:
            r2 = move-exception
            r3 = 4
            java.lang.String r3 = yue_xin_awa(r3)
            java.lang.String r2 = r2.getMessage()
            Yue.C1828.m8591(r3, r2)
        L22:
            return
    }
}
