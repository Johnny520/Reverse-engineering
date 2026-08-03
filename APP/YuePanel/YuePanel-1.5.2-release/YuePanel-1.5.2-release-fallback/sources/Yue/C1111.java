package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1111 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3327;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3328;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3329;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3330;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3331;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3332;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3333;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3334;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3335;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3336;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3337;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3338;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ$ۥ, reason: contains not printable characters */
    public class C1112 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1111 f3339;

        public C1112(Yue.C1111 r1) {
                r0 = this;
                r0.f3339 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.setResult(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ$ۥ۟, reason: contains not printable characters */
    public class C1113 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f3340;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ClassLoader f3341;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1111 f3342;

        public C1113(Yue.C1111 r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.f3342 = r1
                r0.f3341 = r2
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C1111.C1113.f3340
                if (r2 != 0) goto L13
                r0 = 4394822394387967280(0x3cfd8baed46d2d30, double:6.560449170778516E-15)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1111.C1113.f3340 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                java.lang.Class<java.util.List> r0 = java.util.List.class
                r1 = 0
                java.lang.Object[] r5 = r5.args     // Catch: java.lang.Throwable -> L2f
                r5 = r5[r1]     // Catch: java.lang.Throwable -> L2f
                java.lang.ClassLoader r2 = r4.f3341     // Catch: java.lang.Throwable -> L2f
                java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Throwable -> L2f
                java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L2f
                java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.Throwable -> L2f
                r3 = 17
                java.util.List r2 = Yue.C2352.m10799(r2, r0, r3)     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L2f
                java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L2f
                java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r5 = Yue.C3846.m15400(r5, r2, r0)     // Catch: java.lang.Throwable -> L2f
                java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L2f
                r5.clear()     // Catch: java.lang.Throwable -> L2f
                goto L3b
            L2f:
                r5 = move-exception
                java.lang.String r0 = yue_xin_awa(r1)
                java.lang.String r5 = r5.getMessage()
                Yue.C1828.m8591(r0, r5)
            L3b:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۨ$ۥ۟۟, reason: contains not printable characters */
    public class C1114 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1111 f3343;

        public C1114(Yue.C1111 r1) {
                r0 = this;
                r0.f3343 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                java.lang.Object[] r2 = r2.args
                r0 = 2
                r2 = r2[r0]
                java.util.List r2 = (java.util.List) r2
                r2.clear()
                return
        }
    }

    static {
            r0 = 1060(0x424, float:1.485E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1111() {
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
