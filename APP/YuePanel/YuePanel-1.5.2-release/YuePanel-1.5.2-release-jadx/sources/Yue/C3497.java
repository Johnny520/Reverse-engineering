package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3497 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static HashMap<String, C6324> f334;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f335;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5789;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5790;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5791;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5792;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5793;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5794;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5795;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5796;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5797;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5798;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5799;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5800;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5801;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5802;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5803;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5804;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5805;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5806;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۨ$ۥ */
    public class C0154 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5807;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5808;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5809;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5810;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5811;

        public C0154() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f5807;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-8572644767823897225L);
                f5807 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f5808;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(2903352101700156603L);
                f5808 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f5809;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8386567211903866026L);
                f5809 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f5810;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-1684284501277671683L);
                f5810 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f5811;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(3030896519738004321L);
            f5811 = strM22675;
            return strM22675;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                if (C4093.m11556(yue_xin_awa(0))) {
                    String strM19269 = C6263.m19269();
                    C7320.m3568(strM19269, yue_xin_awa(2) + C7817.m24801(System.currentTimeMillis()) + yue_xin_awa(3) + (((JSONObject) methodHookParam.args[2]).getInt(yue_xin_awa(1)) / 100.0f) + yue_xin_awa(4));
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        NativeUtil.classesInit0(757);
        f334 = new LinkedHashMap();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native void m554(C6324 c6324);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
