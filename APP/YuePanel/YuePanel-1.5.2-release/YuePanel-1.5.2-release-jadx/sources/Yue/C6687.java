package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥۣۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6687 {

    /* JADX INFO: renamed from: ۥ */
    public static String f2240;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2241;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17179;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17180;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17181;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17182;

    static {
        NativeUtil.classesInit0(470);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native Object m3171();

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0002 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m3172() {
        int iBooleanValue = 1;
        iBooleanValue = 1;
        try {
            Object objM3171 = m3171();
            if (objM3171 != null) {
                Object objCallMethod = XposedHelpers.callMethod(objM3171, yue_xin_awa(0), new Object[0]);
                try {
                    iBooleanValue = ((Boolean) XposedHelpers.callMethod(objCallMethod, yue_xin_awa(1), new Object[0])).booleanValue();
                    return iBooleanValue;
                } catch (Throwable unused) {
                    if (f2240 == null) {
                        ClassLoader classLoaderM6707 = C3270.m6707();
                        f2240 = C4806.m1710(classLoaderM6707.loadClass(objCallMethod.getClass().getName()), classLoaderM6707.loadClass(yue_xin_awa(2)), 1).get(0).getName();
                    }
                    return ((Boolean) XposedHelpers.callMethod(XposedHelpers.getObjectField(objCallMethod, f2240), yue_xin_awa(3), new Object[0])).booleanValue();
                }
            }
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(4) + th.getMessage(), iBooleanValue);
        }
        return false;
    }
}
