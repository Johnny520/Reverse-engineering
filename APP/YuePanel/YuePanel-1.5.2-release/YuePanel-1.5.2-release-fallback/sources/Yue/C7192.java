package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7192 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24807;

    static {
            r0 = 288(0x120, float:4.04E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C7192() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native java.lang.Object m27682(java.lang.Object r0, java.lang.String r1, java.lang.Class<?>[] r2, java.lang.Object... r3) throws java.lang.Exception;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.Class<?> m27683(java.lang.String r1) {
            java.lang.ClassLoader r0 = Yue.C7213.m27714()     // Catch: java.lang.Exception -> L20
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L20
            if (r0 != 0) goto L12
            java.lang.ClassLoader r0 = Yue.C7213.m27714()     // Catch: java.lang.Exception -> L20
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r1, r0)     // Catch: java.lang.Exception -> L20
        L12:
            if (r0 == 0) goto L15
            return r0
        L15:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L20
            r0 = 0
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Exception -> L20
            r1.<init>(r0)     // Catch: java.lang.Exception -> L20
            throw r1     // Catch: java.lang.Exception -> L20
        L20:
            r1 = 0
            return r1
    }
}
