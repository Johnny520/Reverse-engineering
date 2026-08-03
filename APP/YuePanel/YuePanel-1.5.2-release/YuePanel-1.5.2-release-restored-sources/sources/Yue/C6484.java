package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6484 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static Object f2110;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f2111;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16627;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16628;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16629;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16630;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16631;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16632;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16633;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16634;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16635;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16636;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16637;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16638;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16639;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16640;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16641;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16642;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16643;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16644;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16645;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16646;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16647;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16648;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16649;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16650;

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۧ$ۥ */
    public class C1001 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16651;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16652;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16653;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16654;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ List f16655;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ String f16656;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f16657;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Class f16658;

        public C1001(List list, String str, ClassLoader classLoader, Class cls) {
            this.f16655 = list;
            this.f16656 = str;
            this.f16657 = classLoader;
            this.f16658 = cls;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f16651;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(8194040188979296332L);
                f16651 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f16652;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(5808537213120803919L);
                f16652 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f16653;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(5454225123609805796L);
                f16653 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f16654;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(8373697578989228714L);
            f16654 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj;
            List list;
            Object objectField;
            try {
                if ((C3270.m6701().equals(yue_xin_awa(0)) || C3270.m6701().equals(yue_xin_awa(1))) && C6484.m2986() != (obj = methodHookParam.thisObject)) {
                    C6484.m2987(obj);
                    if (C6484.m20474() == null) {
                        Iterator it = this.f16655.iterator();
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String name = ((Field) it.next()).getName();
                            List list2 = (List) XposedHelpers.getObjectField(obj, name);
                            if (list2 != null) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().getClass().getName().equals(this.f16656)) {
                                        C6484.m20475(name);
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                    if (C6484.m20474() == null || (list = (List) XposedHelpers.getObjectField(obj, C6484.m20474())) == null) {
                        return;
                    }
                    Object obj2 = list.get(0);
                    List<Field> listM1710 = C4806.m1710(this.f16657.loadClass(obj2.getClass().getName()), this.f16658, 1);
                    if (listM1710.isEmpty() || (objectField = XposedHelpers.getObjectField(obj2, listM1710.get(0).getName())) == null) {
                        return;
                    }
                    C8269.m27271(C3613.m658(objectField));
                    C4116.f8220 = yue_xin_awa(2);
                }
            } catch (Throwable th) {
                C6334.m19808(yue_xin_awa(3) + th.getMessage(), 1);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۧ$ۥ۟ */
    public class C1002 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16660;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16661;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16662;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16663;

        public C1002() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f16660;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-3255728611688020880L);
                f16660 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f16661;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(3880233047804477251L);
                f16661 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f16662;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(270425201820978637L);
                f16662 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f16663;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(8694345685972245385L);
            f16663 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C8229.f3336 = ((Integer) methodHookParam.args[0]).intValue();
            try {
                Object objM659 = C3613.m659(methodHookParam.thisObject);
                if (objM659 != null) {
                    Object objCallMethod = XposedHelpers.callMethod(XposedHelpers.callMethod(objM659, yue_xin_awa(0), new Object[0]), yue_xin_awa(1), new Object[0]);
                    if (C6484.this.m20476(objCallMethod)) {
                        return;
                    }
                    C4116.f8220 = yue_xin_awa(2);
                    C8229.m27217(objCallMethod);
                }
            } catch (Throwable th) {
                C6334.m19808(yue_xin_awa(3) + th, 3);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۧ$ۥ۟۟, reason: contains not printable characters */
    public class C6485 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16665;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16666;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16667;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16668;

        public C6485() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f16665;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(3578923540482094965L);
                f16665 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f16666;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-7808176874560645431L);
                f16666 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f16667;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(9162767680270404815L);
                f16667 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f16668;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(6369101757813197335L);
            f16668 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                Object obj = methodHookParam.thisObject;
                Integer num = (Integer) methodHookParam.args[0];
                num.intValue();
                Object objCallMethod = XposedHelpers.callMethod(XposedHelpers.callMethod(obj, yue_xin_awa(0), new Object[0]), yue_xin_awa(1), new Object[]{num});
                if (C6484.this.m20476(objCallMethod)) {
                    return;
                }
                C8229.m27217(objCallMethod);
                C4116.f8220 = yue_xin_awa(2);
            } catch (Throwable th) {
                C6334.m19808(yue_xin_awa(3) + th.getMessage(), 1);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۧ$ۥ۟۟۟, reason: contains not printable characters */
    public class C6486 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16670;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16671;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ List f16672;

        public C6486(List list) {
            this.f16672 = list;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f16670;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(9157051099773808716L);
                f16670 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f16671;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(848215431158953173L);
            f16671 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.thisObject, ((Method) this.f16672.get(0)).getName(), new Object[0]);
                if (C6484.this.m20476(objCallMethod)) {
                    return;
                }
                C4116.f8220 = yue_xin_awa(0);
                C8229.m27217(objCallMethod);
            } catch (Throwable th) {
                C6334.m19808(th.getMessage() + yue_xin_awa(1), 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(67);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ Object m2986();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ Object m2987(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m20474();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m20475(String str);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public native boolean m20476(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final native void m20477(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m20478(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final native void m20479(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final native void m20480(C3828 c3828, ClassLoader classLoader);
}
