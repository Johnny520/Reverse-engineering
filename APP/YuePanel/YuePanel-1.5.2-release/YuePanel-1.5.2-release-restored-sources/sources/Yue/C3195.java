package Yue;

import android.content.Context;
import android.os.Bundle;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3195 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f122;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f123;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4803;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4804;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4805;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4806;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4807;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4808;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4809;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4810;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4811;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4812;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4813;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4814;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4815;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4816;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4817;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4818;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4819;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4820;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4821;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4822;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠ۦ$ۥ */
    public class C0075 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4823;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4824;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4825;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f4826;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Class f4827;

        public C0075(ClassLoader classLoader, Class cls) {
            this.f4826 = classLoader;
            this.f4827 = cls;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f4823;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(5376787676133889757L);
                f4823 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f4824;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(5582385876569046852L);
                f4824 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f4825;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(9051253652208750481L);
            f4825 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4093.m11556(yue_xin_awa(0))) {
                try {
                    Object obj = methodHookParam.args[1];
                    int iIntValue = ((Integer) XposedHelpers.callMethod(obj, yue_xin_awa(1), new Object[0])).intValue();
                    if (iIntValue != 77 && iIntValue != 7 && iIntValue != 8 && iIntValue != 5 && iIntValue != 27 && iIntValue != 136) {
                        Object obj2 = methodHookParam.args[2];
                        Object objM267 = C3195.m267(C3195.this, this.f4826);
                        if (objM267 == null) {
                            return;
                        }
                        Class cls = this.f4827;
                        Boolean bool = Boolean.FALSE;
                        methodHookParam.setResult(C7070.m21993(cls, obj, obj2, objM267, bool, null, bool));
                    }
                } catch (Throwable th) {
                    C6334.m19808(yue_xin_awa(2) + th.getMessage(), 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠ۦ$ۥ۟ */
    public class C0076 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4829;

        public C0076() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f4829;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(5376787676133889757L);
            f4829 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.setResult(Boolean.TRUE);
            }
        }
    }

    static {
        NativeUtil.classesInit0(889);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ Object m267(C3195 c3195, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
        try {
            C3828 c3828 = c3829.m880().get(yue_xin_awa(4));
            Class<?> clsLoadClass = classLoader.loadClass(c3829.m880().get(yue_xin_awa(5)).m879());
            Class<?> clsLoadClass2 = classLoader.loadClass(yue_xin_awa(6));
            Class<?> clsLoadClass3 = classLoader.loadClass(yue_xin_awa(7));
            C3828 c38282 = c3829.m880().get(yue_xin_awa(8));
            C5309.m16280(c38282.m879(), classLoader, c38282.m878(), Context.class, clsLoadClass2, clsLoadClass3, String.class, new C0075(classLoader, clsLoadClass));
            C5309.m16287(classLoader.loadClass(c3828.m879()), C8573.m28557(classLoader.loadClass(c3828.m879()), Boolean.TYPE).get(0).getName(), new C0076());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(9), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final Object m268(ClassLoader classLoader) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass(yue_xin_awa(10));
            Class<?> clsLoadClass2 = classLoader.loadClass(yue_xin_awa(11));
            Object objNewInstance = clsLoadClass.newInstance();
            XposedHelpers.callMethod(objNewInstance, yue_xin_awa(12), new Object[]{yue_xin_awa(13)});
            Object objNewInstance2 = clsLoadClass2.getConstructor(clsLoadClass).newInstance(objNewInstance);
            ((Bundle) XposedHelpers.callMethod(objNewInstance2, yue_xin_awa(14), new Object[0])).putString(yue_xin_awa(15), yue_xin_awa(13));
            return objNewInstance2;
        } catch (Throwable th) {
            C6334.m19807(th.getMessage(), 1);
            return null;
        }
    }
}
