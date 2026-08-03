package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6701 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f23458;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23459;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23460;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23461;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23462;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23463;

    static {
            r0 = 142(0x8e, float:1.99E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6701() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m25903(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, java.lang.String r2) {
            r0 = 0
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r0 = Yue.C1465.m7161(r0)
            if (r0 == 0) goto L2c
            Yue.ۥ۠۟ۥ۠ r0 = Yue.EnumC1914.f5882
            java.lang.String r0 = r0.m8872()
            boolean r0 = Yue.C2253.m10423(r0)
            if (r0 == 0) goto L2c
            r0 = 2
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L28
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setResult(r2)
            goto L2c
        L28:
            r2 = 0
            r1.setResult(r2)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m25904(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
            Yue.C1161.m6084()
            r0 = 0
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r0 = Yue.C1465.m7161(r0)
            if (r0 == 0) goto L29
            Yue.ۥ۠۟ۥ۠ r0 = Yue.EnumC1914.f5881
            java.lang.String r0 = r0.m8872()
            boolean r0 = Yue.C2253.m10423(r0)
            if (r0 == 0) goto L29
            r0 = 1
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r0 = Yue.C1465.m7161(r0)
            if (r0 != 0) goto L29
            r0 = 0
            r1.setResult(r0)
        L29:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25905(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, java.lang.String r2) {
            r0 = 3
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r0 = Yue.C1465.m7161(r0)
            if (r0 == 0) goto L2b
            r0 = 4
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r0 = Yue.C1465.m7161(r0)
            if (r0 == 0) goto L2b
            r0 = 2
            java.lang.String r0 = yue_xin_awa(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L27
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setResult(r2)
            goto L2b
        L27:
            r2 = 0
            r1.setResult(r2)
        L2b:
            return
    }
}
