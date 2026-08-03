package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2295 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f7554;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f7555;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f7556;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f7557;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f7558;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f7559;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ$ۥ, reason: contains not printable characters */
    public class C2296 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f7560;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2295 f7561;

        public C2296(Yue.C2295 r1) {
                r0 = this;
                r0.f7561 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C2295.C2296.f7560
                if (r2 != 0) goto L13
                r0 = -1501663667051944761(0xeb2904d9d94224c7, double:-1.6064828175765757E208)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C2295.C2296.f7560 = r2
            L13:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
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
            r0 = 879(0x36f, float:1.232E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C2295() {
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
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
