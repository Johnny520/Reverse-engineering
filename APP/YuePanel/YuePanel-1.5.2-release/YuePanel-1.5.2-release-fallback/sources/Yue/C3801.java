package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3801 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12040;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12041;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12042;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12043;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12044;

    static {
            r0 = 20
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3801() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m15237(java.lang.String r2) {
            boolean r0 = Yue.C4353.m17168()
            if (r0 == 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r1 = yue_xin_awa(r1)
            r0.append(r1)
            java.lang.String r1 = Yue.C0421.m1602()
            r0.append(r1)
            r1 = 1
            java.lang.String r1 = yue_xin_awa(r1)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            de.robv.android.xposed.XposedBridge.log(r2)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native void m15238(java.lang.String r0, java.lang.String r1);
}
