package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4534 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14490;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14491;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14492;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14493;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14494;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14495;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14496;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f14497;

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۦ$ۥ, reason: contains not printable characters */
    public class C4535 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4534 f14498;

        public C4535(Yue.C4534 r1) {
                r0 = this;
                r0.f14498 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                java.lang.Object[] r2 = r2.args
                r0 = 1
                r2 = r2[r0]
                Yue.C0854.m4935(r2)
                return
        }
    }

    static {
            r0 = 65
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4534() {
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
