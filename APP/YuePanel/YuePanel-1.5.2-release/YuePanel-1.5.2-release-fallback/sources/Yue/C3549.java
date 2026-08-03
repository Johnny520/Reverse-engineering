package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3549 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f11326;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f11327;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f11328;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f11329;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f11330;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f11331;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f11332;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۢ$ۥ, reason: contains not printable characters */
    public class C3550 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f11333;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3549 f11334;

        public C3550(Yue.C3549 r1) {
                r0 = this;
                r0.f11334 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C3549.C3550.f11333
                if (r2 != 0) goto L13
                r0 = 8826573671144175597(0x7a7e49fd1c5d37ed, double:1.0996162725393049E282)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3549.C3550.f11333 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 == 0) goto L14
                r0 = 1000(0x3e8, float:1.401E-42)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.setResult(r0)
            L14:
                return
        }
    }

    static {
            r0 = 537(0x219, float:7.52E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3549() {
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
            Yue.ۥ۠ۦۧۢ$ۥ r0 = new Yue.ۥ۠ۦۧۢ$ۥ     // Catch: java.lang.Throwable -> L15
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
