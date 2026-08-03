package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5895 {

    /* JADX INFO: renamed from: ۥ */
    public static final HashMap<String, Class<?>> f1761;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1762;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14616;

    static {
        NativeUtil.classesInit0(409);
        f1761 = new HashMap<>();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native boolean m2562(Class<?> cls, Class<?> cls2);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native <T> T m2563(Class<?> cls, Class<?>[] clsArr, Object... objArr) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native <T> T m18271(Class<?> cls, Object... objArr) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native Constructor<?> m18272(Class<?> cls, Class<?>[] clsArr);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native Class<?> m18273(Class<?> cls);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Class<?> m18274(String str) {
        HashMap<String, Class<?>> map = f1761;
        Class<?> cls = map.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            Class<?> clsFindClass = str.equals(yue_xin_awa(0)) ? Void.TYPE : XposedHelpers.findClass(str, C3270.m6707());
            map.put(str, clsFindClass);
            return clsFindClass;
        } catch (Throwable unused) {
            return null;
        }
    }
}
