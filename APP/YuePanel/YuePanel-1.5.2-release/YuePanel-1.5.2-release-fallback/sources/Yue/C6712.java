package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6712 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23525;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23526;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23527;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23528;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23529;

    /* JADX INFO: renamed from: Yue.ۥۣۢۨۡ$ۥ, reason: contains not printable characters */
    public class C6713 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1145 f23530;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6712 f23531;

        public C6713(Yue.C6712 r1, Yue.C1145 r2) {
                r0 = this;
                r0.f23531 = r1
                r0.f23530 = r2
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                Yue.ۥ۟ۤۧ۠ r0 = r1.f23530
                java.lang.String r0 = r0.m6006()
                Yue.C6701.m25905(r2, r0)
                return
        }
    }

    static {
            r0 = 106(0x6a, float:1.49E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6712() {
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
    public void load(Yue.C1146 r3, java.lang.ClassLoader r4) {
            r2 = this;
            java.util.Map r3 = r3.m6013()     // Catch: java.lang.Throwable -> L24
            r0 = 1
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L24
            Yue.ۥ۟ۤۧ۠ r3 = (Yue.C1145) r3     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r3.m6002()     // Catch: java.lang.Throwable -> L24
            java.lang.Class r4 = r4.loadClass(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r3.m6001()     // Catch: java.lang.Throwable -> L24
            Yue.ۥۣۢۨۡ$ۥ r1 = new Yue.ۥۣۢۨۡ$ۥ     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L24
            Yue.C3065.m12924(r4, r0, r1)     // Catch: java.lang.Throwable -> L24
            goto L31
        L24:
            r3 = move-exception
            r4 = 2
            java.lang.String r4 = yue_xin_awa(r4)
            java.lang.String r3 = r3.getMessage()
            Yue.C1828.m8591(r4, r3)
        L31:
            return
    }
}
