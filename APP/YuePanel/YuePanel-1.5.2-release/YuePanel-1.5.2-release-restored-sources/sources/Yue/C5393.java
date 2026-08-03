package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5393 {

    /* JADX INFO: renamed from: ۥ */
    public static Object f1486;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1487;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13282;

    static {
        NativeUtil.classesInit0(955);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native Object m2165();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native boolean m2166();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m16876(String str) {
        try {
            if (m2166()) {
                XposedHelpers.callMethod(m2165(), yue_xin_awa(0), new Object[]{str});
            }
        } catch (Throwable th) {
            C6334.m19807(th.getMessage(), 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m16877(Object obj);
}
