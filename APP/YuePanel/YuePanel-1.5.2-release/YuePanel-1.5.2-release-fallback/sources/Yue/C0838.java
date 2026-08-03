package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0838 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2348;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2349;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2350;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2351;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2352;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f2353;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۥ$ۥ, reason: contains not printable characters */
    public class C0839 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f2354;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.drawable.Drawable f2355;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0838 f2356;

        public C0839(Yue.C0838 r1, android.graphics.drawable.Drawable r2) {
                r0 = this;
                r0.f2356 = r1
                r0.f2355 = r2
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C0838.C0839.f2354
                if (r2 != 0) goto L13
                r0 = 4756136231419570214(0x420130b41120e826, double:9.228943908113354E9)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C0838.C0839.f2354 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 == 0) goto L11
                java.lang.Object[] r3 = r3.args
                android.graphics.drawable.Drawable r1 = r2.f2355
                r3[r0] = r1
            L11:
                return
        }
    }

    static {
            r0 = 528(0x210, float:7.4E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C0838() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r3, java.lang.ClassLoader r4) {
            r2 = this;
            int r3 = com.yuexin.panel.R.C7877.f30270
            android.graphics.drawable.Drawable r3 = r2.m4797(r3)
            r0 = 4
            java.lang.String r0 = yue_xin_awa(r0)
            java.lang.Class r4 = de.robv.android.xposed.XposedHelpers.findClass(r0, r4)
            r0 = 5
            java.lang.String r0 = yue_xin_awa(r0)
            Yue.ۥۣ۟ۢۥ$ۥ r1 = new Yue.ۥۣ۟ۢۥ$ۥ
            r1.<init>(r2, r3)
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            Yue.C3065.m12916(r4, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public native android.graphics.drawable.Drawable m4797(int r1);
}
