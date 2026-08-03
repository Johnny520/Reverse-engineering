package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;
import java.util.concurrent.Callable;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6201 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1892;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1893;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15242;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15243;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15244;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15245;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15246;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15247;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15248;

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠$ۥ */
    public class C0934 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15249;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15250;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15251;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15252;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class f15253;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f15254;

        public C0934(Class cls, ClassLoader classLoader) {
            this.f15253 = cls;
            this.f15254 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f15249;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(275438452824526250L);
                f15249 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f15250;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(513899995430996995L);
                f15250 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f15251;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(1659725657845714695L);
                f15251 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f15252;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(7139754222167825334L);
            f15252 = strM22674;
            return strM22674;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ String m19102(Object obj) throws Exception {
            C7231.m22634(C6849.m3296(obj, yue_xin_awa(2)), yue_xin_awa(3), EnumC7313.f22059.m22849());
            return yue_xin_awa(3);
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            List list = (List) XposedHelpers.findFirstFieldByExactType(methodHookParam.args[0].getClass(), List.class).get(methodHookParam.args[0]);
            Object obj = XposedHelpers.findFirstFieldByExactType(list.get(0).getClass(), this.f15253).get(list.get(0));
            final Object objInvoke = C6218.m19187(obj.getClass()).m19191(yue_xin_awa(0)).m19189(this.f15254).invoke(obj, null);
            Object objM1235 = C4267.m1235(obj, C2597R.C9029.f30466, yue_xin_awa(1), new Callable() { // from class: Yue.ۥۡۡ۟ۨ
                static {
                    NativeUtil.classesInit0(356);
                }

                @Override // java.util.concurrent.Callable
                public final native Object call();
            });
            list.add(0, objM1235);
            C5863.m2535(objM1235.getClass().getName());
        }
    }

    static {
        NativeUtil.classesInit0(560);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
