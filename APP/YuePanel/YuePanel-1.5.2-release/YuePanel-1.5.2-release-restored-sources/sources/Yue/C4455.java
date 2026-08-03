package Yue;

import com.kongzue.dialogx.dialogs.MessageMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4455 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static String f906;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f907;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9293;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9294;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9295;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9296;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9297;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9298;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9299;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9300;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9301;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9302;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9303;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9304;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9305;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9306;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9307;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۥۢ$ۥ */
    public class C0410 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f9308;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f9309;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f9310;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f9311;

        public C0410(ClassLoader classLoader) {
            this.f9311 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f9308;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(2163256943879163366L);
                f9308 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f9309;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-8644711627300456006L);
                f9309 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f9310;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(2136584563996136094L);
            f9310 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                if (C4093.m11556(yue_xin_awa(0))) {
                    float fM11557 = C4093.m11557(yue_xin_awa(1));
                    if (fM11557 == 0.0f) {
                        return;
                    }
                    if (C4455.m1397() == null) {
                        C4455.m12930(C4806.m1710(this.f9311.loadClass(methodHookParam.args[0].getClass().getName()), Float.TYPE, 1).get(0).getName());
                    }
                    XposedHelpers.setObjectField(methodHookParam.args[0], C4455.m1397(), Float.valueOf(fM11557));
                }
            } catch (Throwable th) {
                C6334.m19808(yue_xin_awa(2) + th.getMessage(), 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(138);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m1396(String[] strArr, float[] fArr, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ String m1397();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m12930(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m12931(String[] strArr, float[] fArr, MessageMenu messageMenu, CharSequence charSequence, int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();
}
