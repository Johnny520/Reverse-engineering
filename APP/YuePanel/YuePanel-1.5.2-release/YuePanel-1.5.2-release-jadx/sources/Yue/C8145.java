package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8145 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3250;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3251;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24147;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24148;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24149;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24150;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24151;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24152;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24153;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24154;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24155;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24156;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24157;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24158;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24159;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24160;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24161;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24162;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24163;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24164;

    static {
        NativeUtil.classesInit0(927);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ Object m4169(CompletableFuture completableFuture, Object obj, Method method, Object[] objArr);

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object m4170() throws Exception {
        return XposedHelpers.callMethod(m26780(), yue_xin_awa(8), new Class[]{Integer.TYPE}, new Object[]{2});
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native Object m26780() throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native String m26781();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m26782() {
        try {
            Object objM26780 = m26780();
            return objM26780 == null ? yue_xin_awa(6) : (String) XposedHelpers.callMethod(objM26780, yue_xin_awa(9), new Object[0]);
        } catch (Exception unused) {
            return yue_xin_awa(6);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native String m26783();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native long m26784(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native String m26785(String str);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native String m26786(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static String m26787(String str) {
        try {
            return XposedHelpers.callMethod(m4170(), yue_xin_awa(7), new Class[]{String.class, String.class}, new Object[]{m26783(), str}).toString();
        } catch (Exception unused) {
            return yue_xin_awa(6);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native Object m26788(Class<?> cls);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Object m26789(Class<?> cls, String str) {
        try {
            return XposedHelpers.callMethod(m26780(), yue_xin_awa(4), new Class[]{Class.class, String.class}, new Object[]{cls, str});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static String m26790() {
        try {
            return XposedHelpers.callMethod(m4170(), yue_xin_awa(0), new Class[]{String.class}, new Object[]{m26783()}).toString();
        } catch (Exception e) {
            return e.toString();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static String m26791() {
        try {
            return XposedHelpers.callMethod(m4170(), yue_xin_awa(5), new Class[]{String.class}, new Object[]{m26783()}).toString();
        } catch (Exception unused) {
            return yue_xin_awa(6);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static String m26792(String str) {
        try {
            return (String) XposedHelpers.callMethod(m26788(C3270.m6707().loadClass(yue_xin_awa(11))), yue_xin_awa(12), new Object[]{str});
        } catch (ClassNotFoundException unused) {
            return yue_xin_awa(6);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static String m26793(String str) {
        try {
            return (String) XposedHelpers.callMethod(m26788(C3270.m6707().loadClass(yue_xin_awa(11))), yue_xin_awa(13), new Object[]{str});
        } catch (ClassNotFoundException unused) {
            return yue_xin_awa(6);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ Object m26794(CompletableFuture completableFuture, Object obj, Method method, Object[] objArr) throws Throwable;
}
