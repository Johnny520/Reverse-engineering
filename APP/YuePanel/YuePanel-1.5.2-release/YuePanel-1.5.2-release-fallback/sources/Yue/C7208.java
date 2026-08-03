package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7208 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.List<Yue.C7211> f24862 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24863;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24864;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۨ$ۥ, reason: contains not printable characters */
    public class C7209 extends de.robv.android.xposed.XC_MethodHook {
        public C7209() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object r3 = r3.thisObject
                android.app.Activity r3 = (android.app.Activity) r3
                Yue.C0421.m1613(r3)
                android.content.Context r0 = r3.getApplicationContext()
                Yue.C0421.m1617(r0)
                java.lang.ClassLoader r3 = r3.getClassLoader()
                Yue.C0421.m1618(r3)
                android.content.Context r3 = Yue.C0421.m1605()
                java.lang.String r3 = Yue.C0542.m1914(r3)
                Yue.C0421.m1621(r3)
                android.content.Context r3 = Yue.C0421.m1605()
                long r0 = Yue.C0542.m1913(r3)
                Yue.C0421.m1622(r0)
                android.content.Context r3 = Yue.C0421.m1605()
                Yue.C5375.m20256(r3)
                android.app.Activity r3 = Yue.C0421.m1599()
                com.kongzue.dialogx.DialogX.init(r3)
                Yue.C7208.m27709()
                return
        }
    }

    static {
            r0 = 304(0x130, float:4.26E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.C7208.f24862 = r0
            return
    }

    public C7208() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native void m27709();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native void m27710();
}
