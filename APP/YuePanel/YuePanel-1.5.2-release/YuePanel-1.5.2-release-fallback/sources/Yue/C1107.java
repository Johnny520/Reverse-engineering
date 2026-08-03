package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1107 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3303;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3304;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3305;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3306;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public long f3307;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۦ$ۥ, reason: contains not printable characters */
    public class C1108 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f3308;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1107 f3309;

        public C1108(Yue.C1107 r1) {
                r0 = this;
                r0.f3309 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C1107.C1108.f3308
                if (r2 != 0) goto L13
                r0 = 2285824452577172922(0x1fb8e13a92c39dba, double:7.248516632059284E-156)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1107.C1108.f3308 = r2
            L13:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) throws java.lang.Throwable {
                r6 = this;
                super.afterHookedMethod(r7)
                long r0 = java.lang.System.currentTimeMillis()
                Yue.ۥ۟ۤۤۦ r2 = r6.f3309
                long r2 = Yue.C1107.m5908(r2)
                r4 = 500(0x1f4, double:2.47E-321)
                long r2 = r2 + r4
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 <= 0) goto L15
                return
            L15:
                Yue.ۥ۟ۤۤۦ r2 = r6.f3309
                Yue.C1107.m5909(r2, r0)
                java.lang.Object[] r7 = r7.args
                r0 = 0
                r7 = r7[r0]
                java.lang.String r7 = (java.lang.String) r7
                Yue.C4263.m16554(r7)
                java.lang.String r7 = yue_xin_awa(r0)
                Yue.C4263.m16555(r7)
                return
        }
    }

    static {
            r0 = 1064(0x428, float:1.491E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1107() {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r2.f3307 = r0
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ long m5908(Yue.C1107 r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ long m5909(Yue.C1107 r0, long r1);

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
