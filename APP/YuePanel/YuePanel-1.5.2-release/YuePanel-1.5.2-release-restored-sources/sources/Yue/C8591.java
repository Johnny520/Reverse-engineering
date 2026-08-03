package Yue;

import android.content.Context;
import android.os.Bundle;
import com.kongzue.dialogx.DialogX;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2604;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8591 {

    /* JADX INFO: renamed from: ۥ */
    public static AtomicBoolean f3570;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final List<C8595> f3571;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25509;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25510;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25511;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25512;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25513;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۦ$ۥ */
    public class C1560 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C3270.m6705() != null) {
                C7139.m3427((Context) methodHookParam.getResult());
                return;
            }
            Context context = (Context) methodHookParam.getResult();
            C3270.m6721(C3369.m456(context));
            C3270.m6722(C3369.m455(context));
            C3270.m6717(context);
            DialogX.init(C3270.m342());
            C3270.m6718(context.getClassLoader());
            C8591.m4563();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۦ$ۥ۟ */
    public class C1561 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25514;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25515;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25516;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25517;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25518;

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f25514;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-2013069114494367754L);
                f25514 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f25515;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(1145307338679917072L);
                f25515 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f25516;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(9205682656635316361L);
                f25516 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f25517;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(6441858931820984869L);
                f25517 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f25518;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(-8696379061888738709L);
            f25518 = strM22675;
            return strM22675;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                C5863.m2535(C3270.m6702() + yue_xin_awa(0));
                C6263.m19283(C8145.m26783());
                C6263.m19278(yue_xin_awa(1) + C8145.m26783() + yue_xin_awa(2));
                C2604.m31089(true);
                C4383.m12697(C8591.f3571);
                C3356.m436();
            } catch (Throwable th) {
                C5863.m2535(yue_xin_awa(3) + th);
                C6334.m19807(yue_xin_awa(4), 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(300);
        f3570 = new AtomicBoolean();
        f3571 = new ArrayList();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4563();

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4564() {
        try {
            C5309.m16279(XposedHelpers.findClass(yue_xin_awa(0), C3270.m6707()), yue_xin_awa(1), new C1560());
        } catch (Exception e) {
            C5863.m2535(C3270.m6702() + yue_xin_awa(2) + e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m28598() {
        C5309.m16279(XposedHelpers.findClass(yue_xin_awa(3), C3270.m6707()), yue_xin_awa(4), Bundle.class, new C1561());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m28599();
}
