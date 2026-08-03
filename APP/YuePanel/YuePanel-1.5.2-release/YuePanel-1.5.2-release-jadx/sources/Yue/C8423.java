package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8423 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3484;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3485;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25224;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25225;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25226;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25227;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25228;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25229;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25230;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f25231;

    /* JADX INFO: renamed from: Yue.ۥۢۥۢۢ$ۥ */
    public class C1526 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25232;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25233;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f25234;

        public C1526() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f25232;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-3906573062637605534L);
                f25232 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f25233;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(2705002902339315003L);
                f25233 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f25234;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-4899288645838242015L);
            f25234 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                String strDecode = URLDecoder.decode((String) methodHookParam.args[0], StandardCharsets.UTF_8.name());
                String strM4401 = C8423.this.m4401(strDecode);
                if (!strDecode.startsWith(yue_xin_awa(1)) || strM4401 == null) {
                    return;
                }
                methodHookParam.args[0] = strM4401;
                C6334.m19807(yue_xin_awa(2), 2);
            }
        }
    }

    static {
        NativeUtil.classesInit0(839);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ */
    public native String m4401(String str);
}
