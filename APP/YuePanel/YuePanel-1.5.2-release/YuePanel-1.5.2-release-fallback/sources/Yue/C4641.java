package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4641 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14789;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14790;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14791;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14792;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14793;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14794;

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۨ$ۥ, reason: contains not printable characters */
    public class C4642 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f14795;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4641 f14796;

        public C4642(Yue.C4641 r1) {
                r0 = this;
                r0.f14796 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C4641.C4642.f14795
                if (r2 != 0) goto L13
                r0 = -8392893560746592369(0x8b8673c62209378f, double:-3.8280127024126366E-253)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4641.C4642.f14795 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                Yue.C3801.m15237(r0)
                r0 = 0
                r2.setResult(r0)
                return
        }
    }

    static {
            r0 = 352(0x160, float:4.93E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4641() {
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
            r3 = 4
            java.lang.String r3 = yue_xin_awa(r3)
            java.lang.Class r3 = de.robv.android.xposed.XposedHelpers.findClass(r3, r4)
            r4 = 5
            java.lang.String r4 = yue_xin_awa(r4)
            Yue.ۥۣۣۡۨ$ۥ r0 = new Yue.ۥۣۣۡۨ$ۥ
            r0.<init>(r2)
            java.lang.Class<android.view.WindowManager$LayoutParams> r1 = android.view.WindowManager.LayoutParams.class
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            Yue.C3065.m12916(r3, r4, r0)
            return
    }
}
