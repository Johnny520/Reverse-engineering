package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0735 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2056;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2057;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2058;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2059;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2060;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۥۧ$ۥ, reason: contains not printable characters */
    public class C0736 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0735 f2061;

        public C0736(Yue.C0735 r1) {
                r0 = this;
                r0.f2061 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) throws java.lang.Throwable {
                r0 = this;
                return
        }
    }

    static {
            r0 = 814(0x32e, float:1.14E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C0735() {
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
            java.lang.String r2 = r2.m6002()     // Catch: java.lang.Throwable -> L16
            java.lang.Class r2 = r3.loadClass(r2)     // Catch: java.lang.Throwable -> L16
            r3 = 2
            java.lang.String r3 = yue_xin_awa(r3)     // Catch: java.lang.Throwable -> L16
            Yue.ۥ۟ۢۥۧ$ۥ r0 = new Yue.ۥ۟ۢۥۧ$ۥ     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            Yue.C3065.m12924(r2, r3, r0)     // Catch: java.lang.Throwable -> L16
            goto L23
        L16:
            r2 = move-exception
            r3 = 3
            java.lang.String r3 = yue_xin_awa(r3)
            java.lang.String r2 = r2.getMessage()
            Yue.C1828.m8591(r3, r2)
        L23:
            return
    }
}
