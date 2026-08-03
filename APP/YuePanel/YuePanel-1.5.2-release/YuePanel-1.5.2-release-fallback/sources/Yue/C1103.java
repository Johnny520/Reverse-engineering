package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1103 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3272;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3273;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3274;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3275;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3276;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3277;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3278;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3279;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3280;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3281;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public long f3282;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۤ$ۥ, reason: contains not printable characters */
    public class C1104 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f3283;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f3284;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ClassLoader f3285;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1103 f3286;

        public C1104(Yue.C1103 r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.f3286 = r1
                r0.f3285 = r2
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L17
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                java.lang.String r2 = Yue.C1103.C1104.f3284
                if (r2 != 0) goto L16
                r0 = 2285824452577172922(0x1fb8e13a92c39dba, double:7.248516632059284E-156)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1103.C1104.f3284 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C1103.C1104.f3283
                if (r2 != 0) goto L26
                r0 = 7139754222167825334(0x631580a313e89bb6, double:2.0287395786440918E169)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1103.C1104.f3283 = r2
            L26:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                Yue.ۥ۟ۤۤۤ r2 = r4.f3286
                long r2 = Yue.C1103.m5896(r2)
                long r0 = r0 - r2
                r2 = 1000(0x3e8, double:4.94E-321)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 < 0) goto L12
                return
            L12:
                Yue.ۥ۟ۤۤۤ r0 = r4.f3286
                long r1 = java.lang.System.currentTimeMillis()
                Yue.C1103.m5897(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object[] r1 = r5.args
                r2 = 0
                r1 = r1[r2]
                r0.append(r1)
                java.lang.String r1 = yue_xin_awa(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                Yue.C4263.m16554(r0)
                r0 = 1
                java.lang.String r0 = yue_xin_awa(r0)
                Yue.C4263.m16555(r0)
                java.lang.Object r0 = r5.thisObject
                android.view.View r0 = (android.view.View) r0
                java.lang.String r1 = Yue.C4263.m16540()
                Yue.C3647.m14758(r1)
                Yue.ۥ۟ۤۤۤ r1 = r4.f3286
                Yue.C1103.m5898(r1, r5)
                Yue.ۥ۟ۤۤۤ r5 = r4.f3286
                java.lang.ClassLoader r1 = r4.f3285
                Yue.C1103.m5899(r5, r1, r0)
                return
        }
    }

    static {
            r0 = 1066(0x42a, float:1.494E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1103() {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r2.f3282 = r0
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m5894(android.widget.FrameLayout r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m5895(int r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ long m5896(Yue.C1103 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ long m5897(Yue.C1103 r0, long r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m5898(Yue.C1103 r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
            r0.m5903(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m5899(Yue.C1103 r0, java.lang.ClassLoader r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m5900(int r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m5901(android.widget.FrameLayout r0);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r3, java.lang.ClassLoader r4) {
            r2 = this;
            r3 = 2
            java.lang.String r3 = yue_xin_awa(r3)
            java.lang.Class r3 = de.robv.android.xposed.XposedHelpers.findClass(r3, r4)
            r0 = 3
            java.lang.String r0 = yue_xin_awa(r0)
            Yue.ۥ۟ۤۤۤ$ۥ r1 = new Yue.ۥ۟ۤۤۤ$ۥ
            r1.<init>(r2, r4)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            Yue.C3065.m12916(r3, r0, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m5902(java.lang.ClassLoader r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m5903(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            java.lang.Object r3 = r3.thisObject
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.Thread r0 = new java.lang.Thread
            Yue.ۥ۟ۤۤۢ r1 = new Yue.ۥ۟ۤۤۢ
            r1.<init>(r3)
            r0.<init>(r1)
            r0.start()
            return
    }
}
