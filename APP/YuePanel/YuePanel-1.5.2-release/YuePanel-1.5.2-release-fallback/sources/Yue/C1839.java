package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1839 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5663;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5664;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5665;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5666;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ, reason: contains not printable characters */
    public class C1840 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1839 f5667;

        public C1840(Yue.C1839 r1) {
                r0 = this;
                r0.f5667 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                java.lang.Object[] r2 = r2.args
                r0 = 0
                r2 = r2[r0]
                android.app.Dialog r2 = (android.app.Dialog) r2
                Yue.C1501.m7398(r2)
                return
        }
    }

    static {
            r0 = 931(0x3a3, float:1.305E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1839() {
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
