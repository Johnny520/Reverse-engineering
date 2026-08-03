package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8585 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3565;

    static {
        NativeUtil.classesInit0(288);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native Object m4556(Object obj, String str, Class<?>[] clsArr, Object... objArr) throws Exception;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Class<?> m4557(String str) {
        try {
            Class<?> clsLoadClass = C8597.m28605().loadClass(str);
            if (clsLoadClass == null) {
                clsLoadClass = XposedHelpers.findClass(str, C8597.m28605());
            }
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
            throw new Exception(yue_xin_awa(0));
        } catch (Exception unused) {
            return null;
        }
    }
}
