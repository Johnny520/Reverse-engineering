package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4388 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String f13937;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.Class<?> f13938;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.Class<?> f13939;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f13940;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.Object f13941;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13942;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13943;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13944;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13945;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13946;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13947;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13948;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13949;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f13950;

    static {
            r0 = 873(0x369, float:1.223E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4388() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native boolean m17257(java.lang.Object r0) throws java.lang.Throwable;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native java.lang.reflect.Method m17258();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.Class<?> m17259() {
            java.lang.Class<?> r0 = Yue.C4388.f13939
            if (r0 != 0) goto L15
            java.lang.String r0 = Yue.C4388.f13937     // Catch: java.lang.Exception -> L11
            java.lang.ClassLoader r1 = Yue.C0421.m1607()     // Catch: java.lang.Exception -> L11
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r0, r1)     // Catch: java.lang.Exception -> L11
            Yue.C4388.f13939 = r0     // Catch: java.lang.Exception -> L11
            goto L15
        L11:
            r0 = move-exception
            r0.printStackTrace()
        L15:
            java.lang.Class<?> r0 = Yue.C4388.f13939
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native boolean m17260();

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
