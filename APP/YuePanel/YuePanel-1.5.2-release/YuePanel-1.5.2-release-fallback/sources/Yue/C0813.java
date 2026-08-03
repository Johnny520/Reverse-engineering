package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0813 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String[] f2295 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2296;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2297;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2298;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2299;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2300;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2301;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2302;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2303;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2304;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2305;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2306;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2307;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2308;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2309;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2310;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2312;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ$ۥ, reason: contains not printable characters */
    public class C0814 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0813 f2313;

        public C0814(Yue.C0813 r1) {
                r0 = this;
                r0.f2313 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                r2.setResult(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ$ۥ۟, reason: contains not printable characters */
    public class C0815 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0813 f2314;

        public C0815(Yue.C0813 r1) {
                r0 = this;
                r0.f2314 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object[] r0 = r3.args
                r1 = 0
                r0 = r0[r1]
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1 = 8
                if (r0 == r1) goto L1a
                java.lang.Object r0 = r3.thisObject
                android.view.View r0 = (android.view.View) r0
                r0.setVisibility(r1)
                r0 = 0
                r3.setResult(r0)
            L1a:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ$ۥ۟۟, reason: contains not printable characters */
    public class C0816 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0813 f2315;

        public C0816(Yue.C0813 r1) {
                r0 = this;
                r0.f2315 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                java.lang.Object r2 = r2.thisObject
                android.view.View r2 = (android.view.View) r2
                r0 = 8
                r2.setVisibility(r0)
                return
        }
    }

    static {
            r0 = 497(0x1f1, float:6.96E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            r0 = 16
            java.lang.String r0 = yue_xin_awa(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            Yue.C0813.f2295 = r0
            return
    }

    public C0813() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m4751(java.lang.String[] r0, com.kongzue.dialogx.dialogs.BottomMenu r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m4752(java.lang.String[] r0, com.kongzue.dialogx.dialogs.BottomMenu r1, android.view.View r2);

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native java.lang.String[] getClickStrings();

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1146 r6, java.lang.ClassLoader r7) {
            r5 = this;
            r0 = 4
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r0 = Yue.C1465.m7161(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.util.Map r0 = r6.m6013()     // Catch: java.lang.Throwable -> L70
            r1 = 5
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L70
            Yue.ۥ۟ۤۧ۠ r0 = (Yue.C1145) r0     // Catch: java.lang.Throwable -> L70
            java.util.Map r6 = r6.m6013()     // Catch: java.lang.Throwable -> L70
            r1 = 6
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L70
            Yue.ۥ۟ۤۧ۠ r6 = (Yue.C1145) r6     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.m6002()     // Catch: java.lang.Throwable -> L70
            r1 = 7
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            Yue.ۥۣ۟ۡۢ$ۥ r3 = new Yue.ۥۣ۟ۡۢ$ۥ     // Catch: java.lang.Throwable -> L70
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L70
            Yue.C3065.m12917(r0, r7, r1, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r6.m6002()     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r6.m6001()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L70
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            Yue.ۥۣ۟ۡۢ$ۥ۟ r4 = new Yue.ۥۣ۟ۡۢ$ۥ۟     // Catch: java.lang.Throwable -> L70
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L70
            Yue.C3065.m12917(r0, r7, r1, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r6.m6002()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r6 = r7.loadClass(r6)     // Catch: java.lang.Throwable -> L70
            r7 = 8
            java.lang.String r7 = yue_xin_awa(r7)     // Catch: java.lang.Throwable -> L70
            Yue.ۥۣ۟ۡۢ$ۥ۟۟ r0 = new Yue.ۥۣ۟ۡۢ$ۥ۟۟     // Catch: java.lang.Throwable -> L70
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L70
            Yue.C3065.m12924(r6, r7, r0)     // Catch: java.lang.Throwable -> L70
            goto L7d
        L70:
            r6 = move-exception
            r7 = 0
            java.lang.String r7 = yue_xin_awa(r7)
            java.lang.String r6 = r6.getMessage()
            Yue.C1828.m8591(r7, r6)
        L7d:
            return
    }

    @Override // Yue.AbstractC3183
    public native void onClick();
}
