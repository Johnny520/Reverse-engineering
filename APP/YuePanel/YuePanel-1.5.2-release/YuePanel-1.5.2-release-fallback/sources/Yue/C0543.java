package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0543 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1385;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1386;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1387;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1388;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1389;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1390;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1391;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1392;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1393;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۟$ۥ, reason: contains not printable characters */
    public class C0544 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0543 f1394;

        public C0544(Yue.C0543 r1) {
                r0 = this;
                r0.f1394 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object[] r0 = r3.args
                r1 = 1
                r0 = r0[r1]
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                java.lang.Object[] r3 = r3.args
                r1 = 0
                r3 = r3[r1]
                android.app.Activity r3 = (android.app.Activity) r3
                if (r0 == 0) goto L17
                Yue.C0525.m1865(r3)
            L17:
                Yue.C0525.m1863(r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۟$ۥ۟, reason: contains not printable characters */
    public class C0545 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0543 f1395;

        public C0545(Yue.C0543 r1) {
                r0 = this;
                r0.f1395 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object[] r0 = r3.args
                r1 = 1
                r0 = r0[r1]
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                java.lang.Object[] r3 = r3.args
                r1 = 0
                r3 = r3[r1]
                android.app.Activity r3 = (android.app.Activity) r3
                if (r0 == 0) goto L17
                Yue.C0525.m1866(r3)
            L17:
                Yue.C0525.m1864(r3)
                return
        }
    }

    static {
            r0 = 327(0x147, float:4.58E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C0543() {
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
