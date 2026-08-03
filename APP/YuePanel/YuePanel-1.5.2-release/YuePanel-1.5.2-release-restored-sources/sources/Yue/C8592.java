package Yue;

import android.content.Context;
import android.os.Bundle;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2604;
import com.yuexin.panel.hook.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8592 {

    /* JADX INFO: renamed from: ۥ */
    public static final List<C8595> f3572;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3573;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25519;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25520;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25521;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25522;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۧ$ۥ */
    public class C1562 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25523;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25524;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25525;

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f25523;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-4622642403068451595L);
                f25523 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f25524;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-2013069114494367754L);
                f25524 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f25525;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-7310183677583565590L);
            f25525 = strM22673;
            return strM22673;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            List<C8595> list = C8592.f3572;
            if (!list.isEmpty()) {
                C5863.m2535(yue_xin_awa(0));
                return;
            }
            C5863.m2535(C3270.m6702() + yue_xin_awa(1));
            C8592.m4565();
            C6263.m19283(C8144.m26779());
            C6263.m19282(C8144.m4168());
            C6263.m19278(C8144.m4167());
            C4093.m11562(list);
            C4383.m12697(list);
            C2604.m31089(true);
            C6371.m19893();
            C3356.m436();
            C5863.m2535(yue_xin_awa(2));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۧ$ۥ۟ */
    public class C1563 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Context context = (Context) methodHookParam.getResult();
            if (context == null) {
                return;
            }
            if (C3270.m6705() != null) {
                C7139.m3427(context);
            } else {
                C8592.m4566(context);
                C8592.m28600();
            }
        }
    }

    static {
        NativeUtil.classesInit0(306);
        f3572 = new ArrayList();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4565();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m4566(Context context);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m28600();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m28601();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m28602() {
        try {
            C5309.m16279(XposedHelpers.findClass(yue_xin_awa(0), C3270.m6707()), yue_xin_awa(1), Bundle.class, new C1562());
        } catch (Exception e) {
            C5863.m2535(C3270.m6702() + yue_xin_awa(2) + e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m28603() {
        C3270.m6718(MainHook.f30776);
        C5309.m16279(XposedHelpers.findClass(yue_xin_awa(3), C3270.m6707()), yue_xin_awa(4), new C1563());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m28604(Context context);
}
