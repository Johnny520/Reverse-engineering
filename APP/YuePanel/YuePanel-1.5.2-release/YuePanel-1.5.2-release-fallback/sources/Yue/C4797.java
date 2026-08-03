package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4797 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String f15181;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15182;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15183;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15184;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15185;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15186;

    static {
            r0 = 470(0x1d6, float:6.59E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4797() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native java.lang.Object m19060();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m19061() {
            r0 = 1
            r1 = 0
            java.lang.Object r2 = m19060()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L86
            java.lang.String r3 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.callMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.callMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L23
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            java.lang.String r3 = Yue.C4797.f15181     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L53
            java.lang.ClassLoader r3 = Yue.C0421.m1607()     // Catch: java.lang.Throwable -> L51
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L51
            java.lang.Class r4 = r3.loadClass(r4)     // Catch: java.lang.Throwable -> L51
            r5 = 2
            java.lang.String r5 = yue_xin_awa(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Class r3 = r3.loadClass(r5)     // Catch: java.lang.Throwable -> L51
            java.util.List r3 = Yue.C2352.m10799(r4, r3, r0)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L51
            Yue.C4797.f15181 = r3     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r2 = move-exception
            goto L6b
        L53:
            java.lang.String r3 = Yue.C4797.f15181     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.getObjectField(r2, r3)     // Catch: java.lang.Throwable -> L51
            r3 = 3
            java.lang.String r3 = yue_xin_awa(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.callMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L51
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Throwable -> L51
            return r0
        L6b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 4
            java.lang.String r4 = yue_xin_awa(r4)
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            Yue.C4350.m17147(r2, r0)
        L86:
            return r1
    }
}
