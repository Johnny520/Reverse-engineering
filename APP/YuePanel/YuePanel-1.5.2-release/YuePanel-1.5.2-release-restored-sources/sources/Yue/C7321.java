package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۡۨۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7321 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2804;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2805;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22099;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22100;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22101;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22102;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22103;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22104;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22105;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22106;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22107;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22108;

    static {
        NativeUtil.classesInit0(966);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native Object m3569(int i, String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object m3570(String str, long j) throws Exception {
        return XposedHelpers.callMethod(C8145.m26788(C3270.m6707().loadClass(yue_xin_awa(10))), yue_xin_awa(11), new Class[]{String.class, Integer.TYPE, ArrayList.class}, new Object[]{str, Integer.valueOf((int) j), new ArrayList(Arrays.asList((byte) 28, (byte) 26, (byte) 43, (byte) 29, (byte) 31, (byte) 61, (byte) 34, (byte) 49, (byte) 51, (byte) 56, (byte) 52, (byte) 74, (byte) 41, (byte) 62, (byte) 66, (byte) 46, (byte) 25, (byte) 57, (byte) 51, (byte) 70, (byte) 33, (byte) 45, (byte) 39, (byte) 27, (byte) 68, (byte) 58, (byte) 46, (byte) 59, (byte) 59, Byte.valueOf(C8149.f3255)))});
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m22856(Object obj, ArrayList<?> arrayList) throws Exception {
        XposedHelpers.callMethod(C3270.m6707().loadClass(yue_xin_awa(4)).getDeclaredConstructor(null).newInstance(null), yue_xin_awa(5), new Object[]{obj, arrayList, null});
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m22857(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m22858(String str, String str2);
}
