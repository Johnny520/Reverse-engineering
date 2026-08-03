package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import org.json.JSONObject;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6661 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2218;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2219;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17114;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17115;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17116;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17117;

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۦ$ۥ */
    public class C1050 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17118;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17119;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17120;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17121;

        public C1050() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17118;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(944139809090701262L);
                f17118 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17119;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-3711183183404264190L);
                f17119 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17120;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(2947681856558245437L);
                f17120 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f17121;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(-6088565731505428549L);
            f17121 = strM22674;
            return strM22674;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                JSONObject jSONObject = new JSONObject((String) methodHookParam.args[0]);
                if (jSONObject.isNull(yue_xin_awa(0))) {
                    return;
                }
                if (!jSONObject.isNull(yue_xin_awa(1))) {
                    jSONObject.put(yue_xin_awa(1), yue_xin_awa(2));
                }
                if (jSONObject.isNull(yue_xin_awa(3))) {
                    return;
                }
                jSONObject.put(yue_xin_awa(3), yue_xin_awa(2));
            } catch (Exception unused) {
            }
        }
    }

    static {
        NativeUtil.classesInit0(1080);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
