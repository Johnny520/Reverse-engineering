package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣۢۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8199 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3308;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3309;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24445;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24446;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24447;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24448;

    /* JADX INFO: renamed from: Yue.ۥۣۢۨ۠$ۥ */
    public class C1460 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24449;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24450;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24451;

        public C1460() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f24449;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-1465856209178381021L);
                f24449 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f24450;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-7320371385189138250L);
                f24450 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f24451;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-6332500139068547803L);
            f24451 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.setResult((Object) null);
                C6334.m19811(yue_xin_awa(1) + methodHookParam.args[0] + yue_xin_awa(2));
            }
        }
    }

    static {
        NativeUtil.classesInit0(104);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
