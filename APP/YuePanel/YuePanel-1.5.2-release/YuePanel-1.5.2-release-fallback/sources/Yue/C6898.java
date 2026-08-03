package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6898 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24128;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24129;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24130;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24131;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24132;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24133;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24134;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24135;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24136;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24137;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24138;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۣ$ۥ, reason: contains not printable characters */
    public class C6899 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ClassLoader f24139;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6898 f24140;

        public C6899(Yue.C6898 r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.f24140 = r1
                r0.f24139 = r2
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
                r4 = this;
                java.lang.Object[] r5 = r5.args     // Catch: java.lang.Throwable -> L3a
                r0 = 2
                r5 = r5[r0]     // Catch: java.lang.Throwable -> L3a
                boolean r0 = r5 instanceof android.view.View     // Catch: java.lang.Throwable -> L3a
                if (r0 == 0) goto Lc
                android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> L3a
                goto L35
            Lc:
                java.lang.ClassLoader r0 = r4.f24139     // Catch: java.lang.Throwable -> L3a
                java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L3a
                java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L3a
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L3a
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3a
                java.util.List r0 = Yue.C7176.m27635(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L3a
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L3a
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L3a
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r5 = de.robv.android.xposed.XposedHelpers.callMethod(r5, r0, r1)     // Catch: java.lang.Throwable -> L3a
                android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> L3a
            L35:
                Yue.ۥۢۤۦۣ r0 = r4.f24140     // Catch: java.lang.Throwable -> L3a
                Yue.C6898.m26687(r0, r5)     // Catch: java.lang.Throwable -> L3a
            L3a:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۣ$ۥ۟, reason: contains not printable characters */
    public class C6900 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6898 f24141;

        public C6900(Yue.C6898 r1) {
                r0 = this;
                r0.f24141 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                java.lang.Object[] r2 = r2.args
                r0 = 0
                r2 = r2[r0]
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                Yue.C1501.f4662 = r2
                return
        }
    }

    static {
            r0 = 379(0x17b, float:5.31E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6898() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m26687(Yue.C6898 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    private native void m26688(Yue.C1145 r1, java.lang.ClassLoader r2);

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1146 r1, java.lang.ClassLoader r2);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final native void m26689(java.lang.ClassLoader r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m26690(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native void m26691(android.view.View r1);
}
