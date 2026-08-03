package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3946 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f578;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f579;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7609;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7610;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7611;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7612;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7613;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7614;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۦ$ۥ */
    public class C0296 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7615;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7616;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7617;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7618;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7619;

        public C0296() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7615;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(3793679953108881806L);
                f7615 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f7616;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(6061926134023091160L);
                f7616 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f7617;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(7139754222167825334L);
                f7617 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f7618;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(3928598853215788754L);
                f7618 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f7619;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(-2412751436139704553L);
            f7619 = strM22675;
            return strM22675;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4093.m11556(yue_xin_awa(0))) {
                try {
                    String str = (String) methodHookParam.getResult();
                    C6322 c6322M11329 = C4017.m11329();
                    if (c6322M11329.m19718() != null) {
                        methodHookParam.setResult(c6322M11329.m19718());
                    } else {
                        methodHookParam.setResult(str.replaceFirst(yue_xin_awa(1), yue_xin_awa(2)));
                    }
                    C6334.m19807(yue_xin_awa(3), 2);
                } catch (Throwable th) {
                    C6334.m19807(yue_xin_awa(4) + th, 1);
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(673);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
