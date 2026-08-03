package Yue;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.C2604;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6694 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2245;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17204;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17205;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17206;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17207;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17208;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17209;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17210;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17211;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17212;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17213;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17214;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17215;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17216;

    /* JADX INFO: renamed from: ۥ */
    public SparseArray f2246;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۥ$ۥ */
    public class C1060 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17217;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f17218;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f17219;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int[] f17220;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ String f17221;

        /* JADX INFO: renamed from: Yue.ۥۣۡۤۥ$ۥ$ۥ, reason: contains not printable characters */
        public class C6695 extends XC_MethodHook {

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public static volatile /* synthetic */ String f17223;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public static volatile /* synthetic */ String f17224;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public static volatile /* synthetic */ String f17225;

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ XC_MethodHook.MethodHookParam f17226;

            public C6695(XC_MethodHook.MethodHookParam methodHookParam) {
                this.f17226 = methodHookParam;
            }

            private static /* synthetic */ String yue_xin_awa(int i) {
                if (i == 0) {
                    String str = f17223;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(5693251445327414995L);
                    f17223 = strM2267;
                    return strM2267;
                }
                if (i == 1) {
                    String str2 = f17224;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(7132580798994607611L);
                    f17224 = strM22672;
                    return strM22672;
                }
                if (i != 2) {
                    return null;
                }
                String str3 = f17225;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(7139754222167825334L);
                f17225 = strM22673;
                return strM22673;
            }

            public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                super.afterHookedMethod(methodHookParam);
                try {
                    C1060 c1060 = C1060.this;
                    if (c1060.f17220[0] != 0) {
                        return;
                    }
                    Object obj = this.f17226.args[0];
                    C6694.this.f2246 = (SparseArray) C5898.m18284(obj, yue_xin_awa(0), SparseArray.class);
                    Class<?> cls = C6694.this.f2246.get(0).getClass();
                    C1060 c10602 = C1060.this;
                    Class clsFindClass = XposedHelpers.findClass(c10602.f17221, c10602.f17219);
                    Class cls2 = Integer.TYPE;
                    Object objNewInstance = cls.getConstructor(clsFindClass).newInstance(clsFindClass.getConstructor(cls2, String.class, String.class, cls2, cls2).newInstance(999, yue_xin_awa(1), yue_xin_awa(2), Integer.valueOf(C2597R.C9029.f30466), 0));
                    SparseArray sparseArray = C6694.this.f2246;
                    sparseArray.append(sparseArray.size(), objNewInstance);
                    int[] iArr = C1060.this.f17220;
                    iArr[0] = iArr[0] + 1;
                } catch (Exception unused) {
                }
            }
        }

        public C1060(String str, ClassLoader classLoader, int[] iArr, String str2) {
            this.f17218 = str;
            this.f17219 = classLoader;
            this.f17220 = iArr;
            this.f17221 = str2;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f17217;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-1739446641683770833L);
            f17217 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C5309.m16280(this.f17218, this.f17219, yue_xin_awa(0), Integer.TYPE, View.class, ViewGroup.class, new C6695(methodHookParam));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۥ$ۥ۟ */
    public class C1061 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17228;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17229;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f17230;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f17231;

        public C1061(String str, ClassLoader classLoader) {
            this.f17230 = str;
            this.f17231 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17228;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(4057957205636760071L);
                f17228 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f17229;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-664608180635831153L);
            f17229 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            try {
                if (((Integer) C5898.m18284(C5898.m18284(C6694.this.f2246.get(((Integer) methodHookParam.args[2]).intValue()), yue_xin_awa(0), XposedHelpers.findClass(this.f17230, this.f17231)), yue_xin_awa(1), Integer.TYPE)).intValue() == 999) {
                    C2604.m31101();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۥ$ۥ۟۟, reason: contains not printable characters */
    public class C6696 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int[] f17233;

        public C6696(int[] iArr) {
            this.f17233 = iArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            int[] iArr = this.f17233;
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    static {
        NativeUtil.classesInit0(847);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
