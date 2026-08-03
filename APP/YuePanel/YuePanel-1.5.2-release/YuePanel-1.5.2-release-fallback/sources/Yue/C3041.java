package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3041 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9782;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9783;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9784;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9785;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9786;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9787;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۤۨ$ۥ, reason: contains not printable characters */
    public class C3042 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f9788;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3041 f9789;

        public C3042(Yue.C3041 r1) {
                r0 = this;
                r0.f9789 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C3041.C3042.f9788
                if (r2 != 0) goto L13
                r0 = 7133833170646660864(0x63007778d74af700, double:7.768082550480084E168)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3041.C3042.f9788 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 == 0) goto Lf
                r0 = 0
                r2.setResult(r0)
            Lf:
                return
        }
    }

    static {
            r0 = 243(0xf3, float:3.4E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3041() {
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
