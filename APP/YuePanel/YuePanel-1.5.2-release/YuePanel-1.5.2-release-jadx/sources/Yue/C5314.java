package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.net.URLDecoder;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5314 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1432;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1433;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12837;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12838;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12839;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12840;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12841;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۥ$ۥ */
    public class C0709 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12842;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12843;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12844;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12845;

        public C0709() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f12842;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-4201605389280940511L);
                f12842 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f12843;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(8757926205374768500L);
                f12843 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f12844;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-3041141429112269296L);
                f12844 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f12845;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(6491714968278625793L);
            f12845 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                for (Object obj : methodHookParam.args) {
                    if (obj instanceof String[]) {
                        String str = ((String[]) obj)[0];
                        String strM2096 = C5314.m2096(str, yue_xin_awa(0));
                        String strM20962 = C5314.m2096(str, yue_xin_awa(1));
                        if (strM2096 == null || strM20962 == null || !strM20962.startsWith(yue_xin_awa(2))) {
                            return;
                        }
                        C4116.f8222.put(strM2096, URLDecoder.decode(strM20962, yue_xin_awa(3)));
                        return;
                    }
                }
            } catch (Throwable th) {
                C6334.m19808(th.getMessage(), 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(292);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native String m2096(String str, String str2);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
