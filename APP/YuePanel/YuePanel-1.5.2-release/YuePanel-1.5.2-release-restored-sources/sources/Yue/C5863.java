package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedBridge;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5863 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1744;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1745;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14534;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14535;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14536;

    static {
        NativeUtil.classesInit0(20);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static void m2535(String str) {
        if (C6337.m19825()) {
            XposedBridge.log(yue_xin_awa(0) + C3270.m6702() + yue_xin_awa(1) + str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static native void m2536(String str, String str2);
}
