package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4252 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f756;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f757;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8733;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8734;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8735;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8736;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8737;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8738;

    static {
        NativeUtil.classesInit0(479);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native String m1214(String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object m1215(String str) {
        ClassLoader classLoaderM6707 = C3270.m6707();
        try {
            String strYue_xin_awa = yue_xin_awa(4);
            if (6698 >= C3270.m6712()) {
                strYue_xin_awa = yue_xin_awa(5);
            }
            Class<?> clsLoadClass = classLoaderM6707.loadClass(strYue_xin_awa);
            Object objNewInstance = clsLoadClass.newInstance();
            if (((Boolean) XposedHelpers.callMethod(objNewInstance, yue_xin_awa(6), new Class[]{String.class}, new Object[]{str})).booleanValue()) {
                return XposedHelpers.callMethod(C8145.m26788(classLoaderM6707.loadClass(yue_xin_awa(0))), yue_xin_awa(7), new Class[]{clsLoadClass}, new Object[]{objNewInstance});
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object m12269(String str, String str2, int i) {
        Object objM26788;
        try {
            objM26788 = C8145.m26788(C3270.m6707().loadClass(yue_xin_awa(0)));
        } catch (ClassNotFoundException unused) {
            objM26788 = null;
        }
        return XposedHelpers.callMethod(objM26788, yue_xin_awa(3), new Class[]{String.class, String.class, Integer.TYPE}, new Object[]{str, str2, Integer.valueOf(i)});
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Object m12270(String str) {
        Object objM26788;
        String strM1214 = m1214(str);
        try {
            objM26788 = C8145.m26788(C3270.m6707().loadClass(yue_xin_awa(0)));
        } catch (ClassNotFoundException unused) {
            objM26788 = null;
        }
        return XposedHelpers.callMethod(objM26788, yue_xin_awa(2), new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{strM1214, Boolean.TRUE, 1});
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Object m12271(String str) {
        Object objM26788;
        String strM1214 = m1214(str);
        try {
            objM26788 = C8145.m26788(C3270.m6707().loadClass(yue_xin_awa(0)));
        } catch (ClassNotFoundException unused) {
            objM26788 = null;
        }
        return XposedHelpers.callMethod(objM26788, yue_xin_awa(2), new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{strM1214, Boolean.TRUE, 0});
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Object m12272(String str) {
        Object objM26788;
        try {
            objM26788 = C8145.m26788(C3270.m6707().loadClass(yue_xin_awa(0)));
        } catch (ClassNotFoundException unused) {
            objM26788 = null;
        }
        return XposedHelpers.callMethod(objM26788, yue_xin_awa(1), new Class[]{String.class}, new Object[]{str});
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native long m12273(String str);
}
