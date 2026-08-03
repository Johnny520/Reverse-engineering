package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5248 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19696;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19697;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19698;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19699;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19700;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19701;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۡ$ۥ, reason: contains not printable characters */
    public class C5249 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f19702;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5248 f19703;

        public C5249(Yue.C5248 r1) {
                r0 = this;
                r0.f19703 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C5248.C5249.f19702
                if (r2 != 0) goto L13
                r0 = -5306838179063688394(0xb65a52cb006d9336, double:-7.204483221179493E-47)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C5248.C5249.f19702 = r2
            L13:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
                r2 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 == 0) goto L12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.setResult(r0)
            L12:
                return
        }
    }

    static {
            r0 = 1049(0x419, float:1.47E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C5248() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
