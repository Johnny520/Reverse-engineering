package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8191 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f3302;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3303;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24394;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24395;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24396;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24397;

    static {
        NativeUtil.classesInit0(142);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static void m4216(XC_MethodHook.MethodHookParam methodHookParam, String str) {
        if (C4093.m11556(yue_xin_awa(0)) && C4728.m14229(EnumC4453.f9216.m12928())) {
            if (str.equals(yue_xin_awa(2))) {
                methodHookParam.setResult(Boolean.TRUE);
            } else {
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4217(XC_MethodHook.MethodHookParam methodHookParam) {
        C3840.m10633();
        if (C4093.m11556(yue_xin_awa(0)) && C4728.m14229(EnumC4453.f9215.m12928()) && !C4093.m11556(yue_xin_awa(1))) {
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m27150(XC_MethodHook.MethodHookParam methodHookParam, String str) {
        if (C4093.m11556(yue_xin_awa(3)) && C4093.m11556(yue_xin_awa(4))) {
            if (str.equals(yue_xin_awa(2))) {
                methodHookParam.setResult(Boolean.TRUE);
            } else {
                methodHookParam.setResult((Object) null);
            }
        }
    }
}
