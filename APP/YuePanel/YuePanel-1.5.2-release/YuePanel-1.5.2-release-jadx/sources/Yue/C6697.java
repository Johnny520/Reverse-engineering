package Yue;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.C2604;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6697 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static int f2247 = 5201314;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2248;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17235;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17236;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17237;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17238;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۦ$ۥ */
    public class C1062 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17239;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17240;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17241;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17242;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17243;

        public C1062() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17239;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(7218695438296788925L);
                f17239 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17240;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-7337554370287017970L);
                f17240 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17241;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-1277391733396650650L);
                f17241 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17242;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(7139754222167825334L);
                f17242 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f17243;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(-3482869566520061983L);
            f17243 = strM22675;
            return strM22675;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Exception {
            try {
                List list = (List) methodHookParam.args[1];
                Class<?> cls = list.get(0).getClass();
                Class cls2 = Integer.TYPE;
                Object objNewInstance = cls.getConstructor(cls2, String.class, String.class, cls2).newInstance(Integer.valueOf(C6697.m3175()), yue_xin_awa(0), yue_xin_awa(1), 3);
                C5898.m18291(objNewInstance, yue_xin_awa(2), C3270.m6705().getDrawable(C2597R.C9029.f30466));
                list.add(0, objNewInstance);
            } catch (Exception e) {
                C5863.m2535(e + yue_xin_awa(3));
                C6334.m19807(yue_xin_awa(4) + e, 1);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۦ$ۥ۟ */
    public class C1063 extends XC_MethodHook {
        public C1063() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Exception {
            if (((View) methodHookParam.args[0]).getId() == C6697.m3175()) {
                C2604.m31101();
            }
        }
    }

    static {
        NativeUtil.classesInit0(851);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ int m3175();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        Class clsFindClass = XposedHelpers.findClass(yue_xin_awa(2), classLoader);
        C5309.m16279(clsFindClass, yue_xin_awa(3), Activity.class, List.class, LinearLayout.class, Boolean.TYPE, new C1062());
        C5309.m16279(clsFindClass, yue_xin_awa(4), View.class, new C1063());
    }
}
