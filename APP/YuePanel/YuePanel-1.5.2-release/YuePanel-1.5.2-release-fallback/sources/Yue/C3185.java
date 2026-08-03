package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3185 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.Object f10530;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10531;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10532;

    static {
            r0 = 955(0x3bb, float:1.338E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3185() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native java.lang.Object m13588();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native boolean m13589();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m13590(java.lang.String r2) {
            boolean r0 = m13589()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L20
            java.lang.Object r0 = m13588()     // Catch: java.lang.Throwable -> L17
            r1 = 0
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L17
            de.robv.android.xposed.XposedHelpers.callMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L17
            goto L20
        L17:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r0 = 1
            Yue.C4350.m17146(r2, r0)
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m13591(java.lang.Object r0);
}
