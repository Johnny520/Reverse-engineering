package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4805 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final char f10812 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final ConcurrentHashMap<String, String> f10813;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10814;

    /* JADX INFO: renamed from: ۥ */
    public Object f1124;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f1125;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Class<?> f10815;

    static {
        NativeUtil.classesInit0(91);
        f10813 = new ConcurrentHashMap<>();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public final native boolean m1708();

    /* JADX INFO: renamed from: ۥ۟ */
    public <T> T m1709(String str) {
        String strM14534;
        try {
            if (m1708() || (strM14534 = m14534(str, null, -1)) == null) {
                return null;
            }
            return (T) XposedHelpers.getObjectField(this.f1124, strM14534);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public <T> T m14532(String str, Class<?> cls, int i) {
        String strM14534;
        try {
            if (m1708() || cls == null || (strM14534 = m14534(str, cls.getName(), i)) == null) {
                return null;
            }
            return (T) XposedHelpers.getObjectField(this.f1124, strM14534);
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m14533();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native String m14534(String str, String str2, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native C4805 m14535(Class<?> cls);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public native C4805 m14536(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m14537(String str, Object obj) throws Throwable {
        if (m1708()) {
            return;
        }
        String strM14534 = m14534(str, null, -1);
        if (strM14534 == null) {
            throw new Throwable(yue_xin_awa(0));
        }
        XposedHelpers.setObjectField(this.f1124, strM14534, obj);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native C4805 m14538(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public native C4805 m14539(Object obj, Class<?> cls);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native C4805 m14540(Class<?> cls);
}
