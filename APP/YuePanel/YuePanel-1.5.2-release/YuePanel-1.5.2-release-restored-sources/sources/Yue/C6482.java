package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6482 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2106;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2107;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16609;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16610;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16611;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16612;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16613;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16614;

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۥ$ۥ */
    public class C0999 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16615;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16616;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16617;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16618;

        public C0999() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f16615;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(5558787872483612906L);
                f16615 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f16616;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(1142288600546440901L);
                f16616 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f16617;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8559938542747540112L);
                f16617 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f16618;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(2579422654884036911L);
            f16618 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                Object obj = methodHookParam.args[0];
                String str = (String) XposedHelpers.callMethod(obj, yue_xin_awa(0), new Object[0]);
                int iIntValue = ((Integer) XposedHelpers.callMethod(obj, yue_xin_awa(1), new Object[0])).intValue();
                C7530.m23534(((Long) XposedHelpers.callMethod(obj, yue_xin_awa(2), new Object[0])).longValue());
                C6263.m19284(iIntValue);
                C6263.m19285(str);
            } catch (Throwable th) {
                C5863.m2535(yue_xin_awa(3) + th);
            }
        }
    }

    static {
        NativeUtil.classesInit0(94);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
