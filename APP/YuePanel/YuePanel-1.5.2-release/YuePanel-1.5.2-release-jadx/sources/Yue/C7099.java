package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۦۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7099 {

    /* JADX INFO: renamed from: ۥ */
    public static C3828 f2675;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object f2676;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21443;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21444;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21445;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21446;

    static {
        NativeUtil.classesInit0(1077);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native Object m3387();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native C3828 m3388();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m22143(Object obj) {
        char c;
        try {
            ClassLoader classLoaderM6707 = C3270.m6707();
            if (m3387() == null) {
                C6334.m19811(yue_xin_awa(0));
                return;
            }
            Class<?> clsLoadClass = classLoaderM6707.loadClass(obj.getClass().getName());
            Class<?> clsLoadClass2 = classLoaderM6707.loadClass(m3388().m879());
            Class cls = Void.TYPE;
            Class cls2 = Boolean.TYPE;
            List<Method> listM4543 = C8573.m4543(clsLoadClass2, cls, 2, new Class[]{clsLoadClass, cls2});
            if (listM4543.isEmpty()) {
                listM4543 = C8573.m4543(clsLoadClass2, cls, 3, new Class[]{clsLoadClass, String.class, cls2});
                c = 2;
            } else {
                c = 1;
            }
            if (listM4543.isEmpty()) {
                C6334.m19811(yue_xin_awa(1));
                return;
            }
            String name = listM4543.get(0).getName();
            Object objM21993 = C7070.m21993(clsLoadClass2, m3387());
            if (c == 1) {
                XposedHelpers.callMethod(objM21993, name, new Object[]{obj, Boolean.FALSE});
            } else {
                XposedHelpers.callMethod(objM21993, name, new Object[]{obj, yue_xin_awa(2), Boolean.FALSE});
            }
        } catch (Throwable th) {
            C6334.m19809(yue_xin_awa(3) + th);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m22144(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m22145(C3828 c3828);
}
