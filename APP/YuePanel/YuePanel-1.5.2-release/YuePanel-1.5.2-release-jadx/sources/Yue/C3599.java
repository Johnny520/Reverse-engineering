package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3599 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f405;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f406;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6190;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6191;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6192;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6193;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6194;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6195;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6196;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6197;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6198;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6199;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6200;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6201;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6202;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۧ$ۥ */
    public class C0191 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6203;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6204;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6205;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f6206;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f6207;

        public C0191(String str) {
            this.f6207 = str;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f6203;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-1726579758018437275L);
                f6203 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f6204;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-8808988684497526042L);
                f6204 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f6205;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(1093626223046491400L);
                f6205 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f6206;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(-1560321967978210952L);
            f6206 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Map map;
            try {
                if (!((Boolean) XposedHelpers.callMethod(methodHookParam.thisObject, yue_xin_awa(0), new Object[0])).booleanValue() || this.f6207 == null || (map = (Map) methodHookParam.getResult()) == null || !map.containsKey(yue_xin_awa(1))) {
                    return;
                }
                map.put(yue_xin_awa(1), yue_xin_awa(2) + this.f6207 + yue_xin_awa(3));
            } catch (Throwable unused) {
            }
        }
    }

    static {
        NativeUtil.classesInit0(525);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m647(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m648(InputDialog inputDialog, View view, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();
}
