package Yue;

import android.view.View;
import android.view.ViewGroup;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3478 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f316;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f317;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5655;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5656;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5657;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5658;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5659;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5660;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5661;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5662;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5663;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5664;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5665;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5666;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5667;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5668;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5669;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5670;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5671;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5672;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5673;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5674;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5675;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5676;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5677;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5678;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5679;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5680;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5681;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5682;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5683;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5684;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5685;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۢۡ$ۥ */
    public class C0148 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5686;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5687;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5688;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5689;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5690;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5691;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5692;

        public C0148() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f5686;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-3667819278829427963L);
                    f5686 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f5687;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(2281856719879806458L);
                    f5687 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f5688;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(-1468168342858862382L);
                    f5688 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f5689;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(2231949455198436L);
                    f5689 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f5690;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(1820070810657842937L);
                    f5690 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f5691;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(2059392621364763862L);
                    f5691 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f5692;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-7467445012799597695L);
                    f5692 = strM22677;
                    return strM22677;
                default:
                    return null;
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                try {
                    try {
                        new C4805().m14538(new C4805().m14538(methodHookParam.args[0]).m14540(null).m1709(yue_xin_awa(2))).m14536(yue_xin_awa(3)).m14540(null).m14537(yue_xin_awa(4), 0);
                    } catch (Throwable th) {
                        C6334.m19808(yue_xin_awa(6) + th, 1);
                    }
                } catch (Throwable unused) {
                    new C4805().m14538(new C4805().m14538(methodHookParam.args[0]).m14540(null).m1709(yue_xin_awa(5))).m14540(null).m14537(yue_xin_awa(4), 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۢۡ$ۥ۟ */
    public class C0149 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5694;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f5695;

        public C0149(ClassLoader classLoader) {
            this.f5695 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f5694;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-3667819278829427963L);
            f5694 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                C3478.this.m9256(methodHookParam, this.f5695);
            }
        }
    }

    static {
        NativeUtil.classesInit0(1121);
        f316 = new String[]{yue_xin_awa(31)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m543(View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m544(MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m9238(C3478 c3478, ViewGroup viewGroup);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9239(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9240(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9241(C6335 c6335, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m9242(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m9243(C6335 c6335, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9244(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m9245(C3478 c3478, List list);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m9247(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9248(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9249(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m9250(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9251(MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9252(C6335 c6335, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m9253(C6335 c6335, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9254(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native void m9255(List<View> list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m9256(XC_MethodHook.MethodHookParam methodHookParam, ClassLoader classLoader) {
        try {
            Object obj = methodHookParam.args[0];
            if (obj instanceof View) {
                m9261((ViewGroup) obj);
                C8147.m4173(XposedHelpers.getObjectField(methodHookParam.thisObject, yue_xin_awa(9)));
            } else {
                m9261((ViewGroup) ((View) C5898.m18284(methodHookParam.thisObject, C4806.m1710(classLoader.loadClass(methodHookParam.thisObject.getClass().getName()), View.class, 17).get(0).getName(), View.class)));
                C8147.m4173(obj);
            }
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(10) + th, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final native void m9257(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final native void m9258(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native /* synthetic */ void m9259(List list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final native /* synthetic */ void m9260(ViewGroup viewGroup);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final native void m9261(ViewGroup viewGroup);
}
