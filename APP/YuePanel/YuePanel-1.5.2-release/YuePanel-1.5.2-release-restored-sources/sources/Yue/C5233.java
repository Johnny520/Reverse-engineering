package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5233 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1356;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1357;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12461;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12462;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12463;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12464;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤ۠$ۥ */
    public class C0672 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12465;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12466;

        public C0672() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f12465;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-3209443734276815954L);
                f12465 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f12466;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-2267483290063835787L);
            f12466 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                try {
                    C6324 c6324M2696 = C6210.m2696(methodHookParam.args[0]);
                    C3491.m9275(c6324M2696);
                    C3497.m554(c6324M2696);
                } catch (Throwable th) {
                    C6334.m19808(yue_xin_awa(1) + th.getMessage(), 1);
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(515);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
